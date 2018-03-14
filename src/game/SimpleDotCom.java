package game;

public class SimpleDotCom {
	int []locationsCells;
	int numofhit=0;
	public void setLocationCells(int [] locs) {
		locationsCells=locs;
	}
	public String checkyourself(String stringGuess) {
		int guess=Integer.parseInt(stringGuess);
		String result="miss";
		for(int cell:locationsCells) {
			if(guess==cell) {
				result="hit";
				numofhit++;
				break;
			}
		}
		if(numofhit==locationsCells.length) {
			result="kill";
		}
		System.out.println(result);
		return result;
	}

}
