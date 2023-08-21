package Recursion;

public class revArr {

    static void rev(int[] a, int start, int end) {
        if (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            rev(a, start+1, end-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,14,11,20,19,17};
        int n = arr.length;
        rev(arr, 0, n-1);

        for(int i = 0;i<n;i++) {
            System.out.println(arr[i]);
        }
    }
}
