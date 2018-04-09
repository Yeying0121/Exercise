package newchapter4.Exercise2;

public class Diamond {
    public static void main(String[] args) {
        int h = 4;
        for(int i=0; i<h; i++){
            for(int j=0; j<h-i;j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<h; i++) {
            for(int j=0;j<=i+1; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<(h-1)*2-2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
