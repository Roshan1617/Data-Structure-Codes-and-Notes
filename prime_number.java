/**
 * prime_number
 */
public class prime_number {

    static boolean checkPrime(int n) {
        int m = (int)Math.pow((double)n, 0.5);
        for(int i=2;i<=m;i++) {
            if(n%i == 0) return false;
        } 
        return true;
    }

    static void printPrime(int n) {
        for(int i=2;i<n;i++) {
            if(checkPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        int num = 30;
        System.out.println();
        printPrime(num);
    }
}