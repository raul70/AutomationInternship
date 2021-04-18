package com.elena.arraystrings;

public class ArrayExercises {

    /*------------Basic problems-----------*/
    //Array - Problem 1

    public static boolean checkFirstAndLastNumber(int[] array, int number) {
        boolean result = false;
        if (array.length >= 2) {
            if (number == array[array.length - 1] || number == array[0]) {
                result = true;
            }

        }
        return result;
    }


    // Array = Problem2
    public static boolean checkFirstEqualsLast(int[] array) {
        boolean result = false;
        if (array.length >= 2) {
            if (array[0]  == array[array.length - 1]) {
                result = true;
            }

        }
        return result;
    }

//problem 3
    public static boolean checkArrayContainsNumbers(int[] array, int number1, int number2){

        for(int i = 0; i <= array.length-1; i++) {
            if (array[i] == number1 || array[i] == number2) {
                return true;
            }
        }
        return false;
    }

    //problem 4

    public static int getMaxBetweenFirstLast(int[] array){
        return Math.max(array[0], array[array.length - 1]);
    }

    //problem 5
    public static void countEvenNumbersAndOddNumbers(int[] array){
        int oddNumbers = 0;
        int evenNumbers = 0;
        for(int i = 0; i <= array.length-1; i++) {
            if(array[i] % 2 == 0){
                evenNumbers++;
            }
           else {
               oddNumbers++;
            }
        }
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }


    //problem 6
    public static int verifyNumberPosition(int[] array, int number){
        for(int i = 0; i <= array.length-1; i++){
            if(array[i] == number){
                return i;
            }

        }

        return -1; //pentru ca pozitia -1 nu exista
    }
    //problem 7
    public static int sumArrayNumbers(int[] array){
        int sumNumbers = 0;
        for(int i = 0; i < array.length; i++){
            sumNumbers = sumNumbers + array[i];
        }
        return sumNumbers;
    }
    //problem 8
    public static double averageArrayNumbers(double[] array){
        double averageNumbers = 0;
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
            averageNumbers = sum / array.length;

        }
        return averageNumbers;
    }

    //problem 9
    public static boolean checkSpecificNumber(int[] array, int number){

        for(int i = 0; i <= array.length-1; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
   // problem 10

    public static int checkIndexNumber(int[] array, int number){

        for(int i = 0; i <= array.length-1; i++) {
            if(array[i] == number){
                return i;
            }
        }
        return -1;
    }


    //problem 12
    public static int[] getReverseArray(int[] array){
        int start = 0;
        int end = array.length - 1;
        while(start < end){
            int aux = array[start];
            array[start] = array[end];
            array[end] = aux;
            end--;
            start++;
        }
        return array;
    }


    public static void main(String[] args) {
        int[] array = new int[]{10, -20, 0, 30, 40, 60, 10}; //problem 1
        boolean result = checkFirstAndLastNumber(array, 10);
        System.out.println("Problem 1 " + result);

        array = new int[]{50, -20, 0, 30, 40, 60, 10}; //problem 2
        result = checkFirstEqualsLast(array);
        System.out.println("Problem 2 " + result);

        array = new int[]{5, 7}; // problem 3
        result = checkArrayContainsNumbers(array, 4, 7);
        System.out.println("Problem 3 " + result);

        array = new int[]{20, 30, 40}; // problem 4
        int max = getMaxBetweenFirstLast(array);
        System.out.println("Problem 4: Larger value between first and last element: " + max);

        System.out.println("Problem 5");  // problem 5
        array = new int[]{50, 20, 1, 30, 40, 60, 10};
        countEvenNumbersAndOddNumbers(array);

        array = new int[]{50, -20, 0, 30, 40, 60, 10}; //problem 6
        int position = verifyNumberPosition(array, 10);
        if(position == -1){
            System.out.println("Problem 6: The number could not be found");
        }
        else{
            System.out.println("Problem 6: The number is at position: " + position);
        }


        array = new int[]{50, 20, 1, 30, 40, 60, 10};// problem 7
        System.out.println("Problem 7: " + sumArrayNumbers(array));

        double[] array1= new double[]{8,5,6,3,2}; //problem 8
        System.out.println("Problem 8: " + averageArrayNumbers(array1));

        array = new int[]{2, 5, 8, 9, 115 }; // problem 9
        System.out.println("Problem 9: " + checkSpecificNumber(array, 4));

        array = new int[]{50, -20, 0, 30, 40, 60, 10}; //problem 12
        int[] result5 = getReverseArray(array);
        System.out.println("Problem 12: ");
        for (int j : result5) {
            System.out.print(j + " ");

        }
        System.out.println("");



    }

}
