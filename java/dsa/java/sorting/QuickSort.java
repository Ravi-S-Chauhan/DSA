package dsa.java.sorting;

import static dsa.java.Dsautils.printArray;
import static dsa.java.Dsautils.swap;

public class QuickSort {
    public static void quick(int[] arr, int low, int high){
        if (low<high){
            int p = partition(arr, low, high);
            quick(arr,low,p-1);
            quick(arr,p+1,high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int i = low;
        int j = high;
        int pivot = arr[low];

        while(i<j){
            while(i<high && arr[i]<=pivot) i++;
            while(j>low && arr[j]>=pivot) j--;
            if (i<j) swap(arr,i,j);
        }
        swap(arr,low,j);
        return j;
    }
    public static void main(String[] args){
        int[] arr = {2,5,0,9,0,3,4,6,7};
        quick(arr,0,arr.length-1);
        printArray(arr);
    }
}
