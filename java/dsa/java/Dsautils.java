package dsa.java;

import java.util.logging.Logger;

public final class Dsautils {
    private static final Logger logger = Logger.getLogger(Dsautils.class.getName());
    private Dsautils(){
        logger.info("Using Utils from DSA Utils");
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        logger.info("Swapped values");
    }
}
