package Maths;

public class reverseNumber {

    static int rev(int num) {
        int rev = 0;
        while(num!=0) {
            rev = rev*10 + num%10;
            num/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int num = 123456;

        System.out.println(rev(num));
    }
}
