package chapter10.Exercise2;

public class StaticSuper {

    static  {
        System.out.println("Super static block");
    }

    StaticSuper() {
        System.out.println(
                "super consructor");
    }
}
