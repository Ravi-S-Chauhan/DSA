package dsa.java.sorting;

import static dsa.java.Dsautils.printArray;

public class MergeSort {
    private static void merge(int[] arr, int low, int mid, int high){
        int i = low;
        int j = mid+1;
        int n = high;
        int[] temp = new int[high-low+1];
        int k = 0;
        while(i<=mid && j<=high){
            if (arr[i]<=arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                k++;
                j++;
            }
        }

        while(i<=mid){
            temp[k] = arr[i];
            k++;
            i++;
        }

        while(j<=high){
            temp[k] = arr[j];
            k++;
            j++;
        }

        for(int l=low; l<=high ; l++){
            arr[l] = temp[l-low];
        }
    }

    private static void mergeSort(int[] arr, int low, int high){
        if (low>=high) return ;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args){
        int[] arr = {1,3,5,2,4,0,9,7};
        mergeSort(arr,0,arr.length-1);
        printArray(arr);
    }
}
