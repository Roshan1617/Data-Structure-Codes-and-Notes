package Maths;

public class gcdTwoNum {

    static int gcd(int n1, int n2) {
        int ans = 1;
        for(int i=1;i<Math.min(n1, n2);i++) {
            if(n1%i == 0 && n2%i == 0) {
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int num1 = 24, num2 = 30;

        System.out.println(gcd(num1, num2));
    }
}
