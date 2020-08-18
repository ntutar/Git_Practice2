package Day06;

public class swap1 {
    public static void main(String[] args) {
        int a = 30;
        int b = 10;

        a = a + b;   // a=40
        b = a - b;   // b=30
        a = a - b;

        System.out.println("a = "+a);
        System.out.println("b = "+b);


    }

}
