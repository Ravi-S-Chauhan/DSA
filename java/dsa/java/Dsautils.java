package dsa.java;

import java.util.logging.Logger;

public final class Dsautils {
    private static final Logger logger = Logger.getLogger(Dsautils.class.getName());
    private Dsautils(){
        logger.info("Using Utils from DSA Utils");
    }

    public static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        logger.info("Swapped values");
    }

    public static void printArray(int[] arr){
        for(int ar:arr){
            System.out.print(ar+" ");
        }
        System.out.println();
    }
}
