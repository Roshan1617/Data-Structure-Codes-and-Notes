package Maths;

public class checkPalindrome {

    static boolean check(int n) {
        if(n<10) return true;

        int rev = 0, num = n;
        while(num!=0) {
            rev = rev*10 + num%10;
            num/=10;
        }

        if(rev == n) return true;
        return false;
    }
    public static void main(String[] args) {
        int num = 1234331;

        System.out.println(check(num));
    }
}
