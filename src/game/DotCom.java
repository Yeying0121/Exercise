package game;
import java.util.ArrayList;
public class DotCom {
	private ArrayList<String>locationcells;
	private String name;
	public void setlocationcells(ArrayList<String>locs) {
		locationcells=locs;
	}
	public void setname(String n) {
		name=n;
	}
	public String checkyourself(String userInput) {
		String result="miss";
		int index=locationcells.indexOf(userInput);
		if(index>=0) {
			locationcells.remove(index);
			if(locationcells.isEmpty()) {
				result="kill";
				System.out.println("you sunk "+name+" :");
			}else {result="hit";}
		}
		return result;
	}

}
