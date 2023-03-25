package Assignment_2;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5,2,9,3,7,6,1,8,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void sort(int[] arr) {
        for (int i=0;i<arr.length-1;i++) {
            int minIndex = i;
            for (int j=i+1;j<arr.length;j++) {
                if (arr[j]<arr[minIndex]) {
                    minIndex=j;
                }
            }
            if (minIndex!=i) {
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
    }
}
