/**
 * prime_number
 */
public class prime_number {

    static boolean checkPrime(int n) {
        int m = (int)Math.pow((double)n, 0.5);
        for(int i=2;i<m;i++) {
            if(n%i == 0) return false;
        } 
        return true;
    }

    public static void main(String[] args) {
        int num = 28;

        System.out.println(checkPrime(num));
    }
}