package Maths;

public class fibonacci {

    static void printFibb(int n) {
        int a = 1, b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        int c;
        while (n-2 != 0) {
            n--;
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        int num = 10;

        printFibb(num);
    }
}
