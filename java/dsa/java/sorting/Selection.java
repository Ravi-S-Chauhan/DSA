package dsa.java.sorting;

import java.util.logging.Logger;

import static dsa.java.Dsautils.swap;

public class Selection {
    private static final Logger logger = Logger.getLogger(Selection.class.getName());

    private static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i=0;i<n;i++){
            int mn = i;
            for(int j=i;j<n;j++){
                if (arr[mn]>arr[j]) mn = j;
            }
            swap(arr[i],arr[mn]);
        }
    }

    private static void printArray(int[] arr){
        logger.info("Array \n");
        for(int ar:arr){
            logger.info(ar+" ");
        }
    }
    public static void main(String[] args){
        logger.info("Selection Sort");
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        printArray(arr);
    }
}
