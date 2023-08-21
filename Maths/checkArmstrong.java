package Maths;

/**
 * checkArmstrong
 */
public class checkArmstrong {

    static boolean checkArm(int n) {
        int num = n, ncount = n;
        double count = 0;
        while(ncount!=0) {
            count++;
            ncount/=10;
        }
        int sum = 0;
        while(n!=0) {
            sum += Math.pow(n%10, count);
            n/=10;
        }
        if(num == sum) return true;
        return false;
    }

    public static void main(String[] args) {
        int num = 371;

        System.out.println(checkArm(num));
    }
}