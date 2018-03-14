package game;

public class SimpleDotComTestDrive {

	public static void main(String[] args) {
		int numofguesses=0;
		GameHelper helper=new GameHelper();
		SimpleDotCom thedotcom=new SimpleDotCom();
		int randomNum=(int)(Math.random()*5);
		int [] locations= {randomNum,randomNum+1,randomNum+2};
		thedotcom.setLocationCells(locations);
		boolean isAlive=true;
		while(isAlive=true) {
			String guess=helper.getUserInput("enter a number");
			String result=thedotcom.checkyourself(guess);
			numofguesses++;
			if(result.equals("kill")) {
				isAlive=false;
				System.out.println("You took "+numofguesses+" guesses");
				break;// TODO Auto-generated method stub
			}
		}

	}

}
