package com.JavaUnit5.Unit5;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static com.JavaUnit5.Unit5.MissingNumber.missingNumber;

public class Main {
    public static void main(String[] args) {

//        int[] intArray = new int[7];
//
//        intArray[0] = 20;
//        intArray[1] = 35;
//        intArray[2] = -15;
//        intArray[3] = 7;
//        intArray[4] = 55;
//        intArray[5] = 1;
//        intArray[6] = -22;
//
//        for (int i = 0; i < intArray.length; i++) {
//            System.out.println(intArray[i]);
//        }


        int[] intArray = new int[7];

        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;
        intArray[5] = 6;
        intArray[6] = 8;

System.out.println(missingNumber(intArray, 8));



    }



}