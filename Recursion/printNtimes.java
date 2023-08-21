package Recursion;

public class printNtimes {

    static void Ntimes(int n, int t) {
        if(t==0) return;

        System.out.println(n);
        
        Ntimes(n, t-1);
    }

    public static void main(String[] args) {
        int num = 10;
        int times = 5;

        Ntimes(num, times);
    }
}
