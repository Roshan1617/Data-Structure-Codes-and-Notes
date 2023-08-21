package Maths;

public class countDigits {
    static int digits(int n) {
        int count = 0;
        while(n!=0) {
            n/=10;
            count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        int num = 234589600;

        System.out.println(digits(num));
    }
}
