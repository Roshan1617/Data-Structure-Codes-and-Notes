package Recursion;

public class print1toN {
    static void print(int n) {
        if(n==0) return;
        print(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        int N = 10;
        print(N);
    }
}
