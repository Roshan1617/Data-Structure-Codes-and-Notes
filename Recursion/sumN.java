package Recursion;

public class sumN {
    static int sum(int n) {
        if(n==0) return 0;
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        int num = 10;
        System.out.println(sum(num));
    }
}
