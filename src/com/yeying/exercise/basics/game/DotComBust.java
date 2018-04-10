package com.yeying.exercise.basics.game;
import java.util.*;
public class DotComBust {
	private GameHelper helper=new GameHelper();
	private ArrayList<DotCom>dotComList=new ArrayList<DotCom>();
	private int numofguesses=0;//��������ʼ������
	private void setupgame() {
		DotCom one=new DotCom();
		one.setname("Pets.com");
		DotCom two=new DotCom();
		two.setname("eToys.com");
		DotCom three=new DotCom();
		three.setname("Go2.com");
		dotComList.add(one);
		dotComList.add(two);
		dotComList.add(three);//����3��DotCom����ָ�����Ʋ�����ArrayList
		System.out.println("your goal is to sink three dot coms.");
		System.out.println("Pets.com,eToys.com,Go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses");
		for(DotCom dotcomtoset:dotComList) {//��list�е�ÿ��DotCom�ظ�һ��
			ArrayList<String>newLocation=helper.placeDotCom(3);//Ҫ��DotCom��λ��
			dotcomtoset.setlocationcells(newLocation);//�������DotCom��setter������ָ�ɸ�ȡ�õ�λ��
		}
	}
	private void startPlaying() {
		while(!dotComList.isEmpty()) {//�ж�DotCom��List�Ƿ�Ϊ��
			String userguess=helper.getUserInput("enter a guess");//ȡ���������
			checkUserGuess(userguess);//����checkUserGuess����
		}
		finishGame();//����finshGame����
	}
	private void checkUserGuess(String userGuess) {
		numofguesses++;//������Ҳ²�����ļ���
		String result="miss";//�ȼ���û������
		for(DotCom dotComtotest:dotComList) {//��list�����е�DotCom�ظ�
			result=dotComtotest.checkyourself(userGuess);
			if(result.equals("hit")) {
				break;//��ǰ����ѭ��
			}
			if(result.equals("kill")) {
				dotComList.remove(dotComtotest);//��һﱻ�ҵ���
				break;
			}
		}
		System.out.println(result);//�г����
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

	}//�г���ҳɼ�
	public static void main(String[]args) {
		DotComBust game=new DotComBust();//������Ϸ����
		game.setupgame();//Ҫ����Ϸ��������
		game.startPlaying();//Ҫ����Ϸ����������Ϸ����Ҫѭ��
	}

}
