package com.elena.arraystrings;

public class ArrayLevel1 {
    //problem 1
    public static boolean verifyFirstAndLastElement(int[] array, int element){
        for(int i = 0; i <= array.length-1; i++) {
            if (array[0] == element || array[array.length - 1] == element) {
                return true;
            }
        }

        return false;
    }


    //problem 2
 public static boolean verifyFirstEqualsLast(int[] array){
        if(array.length >= 1 && array[0] == array[array.length-1]){
            return true;
        }
        return false;

 }

   //problem 3
    public static int[] getRotatedLeft(int[] array) {
        int aux = array[0];
        for (int i = 1; i < array.length; i++) {
         array[i-1] = array[i];
        }
        array[array.length-1]=aux;
        return array;

    }
    public static void main(String[] args) {
     int[] array1 = new int[]{1, 2, 6}; //problem 1
     boolean result = verifyFirstAndLastElement(array1, 6);
        System.out.println("Problem 1: ");
        System.out.println(result);
        int[] array2 = new int[]{6, 1, 2, 3};
         result = verifyFirstAndLastElement(array2, 6);
        System.out.println(result);
        int[] array3 = new int[]{13, 6, 1, 2, 3};
        result = verifyFirstAndLastElement(array3, 6);
        System.out.println(result);

        System.out.println("Problem 2: "); //problem 2
        int[] array4 = new int[]{1, 2, 3};
        result = verifyFirstEqualsLast(array4);
        System.out.println(result);
        int[] array5 = new int[]{1, 2, 3, 1};
        result = verifyFirstEqualsLast(array5);
        System.out.println(result);
        int[] array6 = new int[]{1, 2, 1};
        result = verifyFirstEqualsLast(array6);
        System.out.println(result);

        System.out.println("Problem 3:");
        int[] array7 = new int[]{1, 2, 3};//problem 3
        int[] result2 = getRotatedLeft(array7);
        printList(result2);
        int[] array8 = new int[]{11, 9, 5};
        int[] result3 = getRotatedLeft(array8);
        printList(result3);
        int[] array9 = new int[]{7, 0, 0};
        int[] result4 = getRotatedLeft(array9);
        printList(result4);

    }

    public static void printList(int[] array) {
        for(int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
