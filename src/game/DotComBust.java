package game;
import java.util.*;
public class DotComBust {
	private GameHelper helper=new GameHelper();
	private ArrayList<DotCom>dotComList=new ArrayList<DotCom>();
	private int numofguesses=0;//声明并初始化变量
	private void setupgame() {
		DotCom one=new DotCom();
		one.setname("Pets.com");
		DotCom two=new DotCom();
		two.setname("eToys.com");
		DotCom three=new DotCom();
		three.setname("Go2.com");
		dotComList.add(one);
		dotComList.add(two);
		dotComList.add(three);//创建3个DotCom对象并指派名称并置入ArrayList
		System.out.println("your goal is to sink three dot coms.");
		System.out.println("Pets.com,eToys.com,Go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses");
		for(DotCom dotcomtoset:dotComList) {//对list中的每个DotCom重复一次
			ArrayList<String>newLocation=helper.placeDotCom(3);//要求DotCom的位置
			dotcomtoset.setlocationcells(newLocation);//调用这个DotCom的setter方法来指派刚取得的位置
		}
	}
	private void startPlaying() {
		while(!dotComList.isEmpty()) {//判断DotCom的List是否为空
			String userguess=helper.getUserInput("enter a guess");//取得玩家输入
			checkUserGuess(userguess);//调用checkUserGuess方法
		}
		finishGame();//调用finshGame方法
	}
	private void checkUserGuess(String userGuess) {
		numofguesses++;//递增玩家猜测次数的计数
		String result="miss";//先假设没有命中
		for(DotCom dotComtotest:dotComList) {//对list中所有的DotCom重复
			result=dotComtotest.checkyourself(userGuess);
			if(result.equals("hit")) {
				break;//提前跳出循环
			}
			if(result.equals("kill")) {
				dotComList.remove(dotComtotest);//这家伙被挂掉了
				break;
			}
		}
		System.out.println(result);//列出结果
	}
	private void finishGame() {
		System.out.println("All dot coms are dead!your stock is now worthless.");
		if(numofguesses<=18) {
			System.out.println("It only took you"+numofguesses+"guesses.");
			System.out.println("you got out before your options sank.");
		}else {
			System.out.println(" took you long enough."+numofguesses+" guesses.");
			System.out.println("fish are dancing with your options.");
		}

	}//列出玩家成绩
	public static void main(String[]args) {
		DotComBust game=new DotComBust();//创建游戏对象
		game.setupgame();//要求游戏对象启动
		game.startPlaying();//要求游戏对象启动游戏的主要循环
	}

}
