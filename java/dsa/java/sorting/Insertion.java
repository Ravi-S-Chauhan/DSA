package dsa.java.sorting;

import java.util.logging.Logger;

import static dsa.java.Dsautils.swap;

public class Insertion {
    private static final Logger logger = Logger.getLogger(Insertion.class.getName());

    private static void InsertionSort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                swap(arr,j-1,j);
                j--;
            }
        }
    }

    public static void printArray(int[] arr){
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {1,3,7,0,4,2,8,5};
        InsertionSort(arr);
        printArray(arr);
    }
}
