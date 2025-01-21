package com.github.sogandjavaheri.concat;
import java.util.Arrays;

public class Concat {

        public static void main(String[] args) {

            int[] arr1 = {8,3,10,4};
            int[] arr2 = {1,3,5};

            System.out.println("The first array is:\n"+arr1);
            System.out.println("The second array is:\n"+arr2);


            //int[] ConArray = new int [arr1.length + arr2.length];
            concatenateArrays(arr1, arr2);

        }

        public static void concatenateArrays(int[] array1, int[] array2 ) {

            int length = array1.length + array2.length;

            int[] result = new int[length];
            int index = 0;
            System.out.println("The concat result is: ");
            System.out.print("{\t");

            for (int i=0; i<array1.length; i++) {
                result[index] = array1[i];
                index++;
                System.out.print(result[index-1]+"\t");

            }

            for (int j=0; j<array2.length; j++) {
                result[index] = array2[j];
                index++;
                System.out.print(result[index-1]+"\t");
            }
            System.out.print("}");
        }
    }
