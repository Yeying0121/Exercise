package newchapter4.Exercise2;

public class Tree {
    public static void main(String[] args) {
        int h = 5;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h - i; j++) {
                System.out.print(" ");
            }
            for (int k=0; k<2*i+1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<2;i++) {
            for(int j=0; j<h;j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
