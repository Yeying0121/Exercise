package newchapter4.Exercise2;

public class Triangle {
    public static void main(String[] args) {
        String[] letters = new String[]{"A", "B", "C", "D", "E", "F", "G"};
        for(int i=0; i< letters.length; i++){
            for(int j=0; j<letters.length-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++){
                System.out.print(letters[i]);
            }
            System.out.println();
        }
    }
}