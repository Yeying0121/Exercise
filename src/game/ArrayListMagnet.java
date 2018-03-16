package game;
import java.util.*;
public class ArrayListMagnet {
	
	public void printAL(ArrayList<String>al) {
		for(String element :al) {
			System.out.print(element+" ");
		}
		System.out.print(" ");
	}

	public static void main(String[] args) {

		ArrayListMagnet arrayList = new ArrayListMagnet();
		ArrayList<String> a=new ArrayList<String>();
		a.add(0,"zero");
		a.add(1,"one");
		a.add(2,"two");
		a.add(3,"three");
		arrayList.printAL(a);
		if(a.contains("three")) {
			a.add("four");
			a.remove(2);
			arrayList.printAL(a);
			if(a.indexOf("four")!=4) {
				a.add(4,"4.2");
			}
			if(a.contains("two")) {
				a.add("2.2");
			}
		}
	// TODO Auto-generated method stub
	}

}
