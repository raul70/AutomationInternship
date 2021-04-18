package com.elena.arraystrings;

import java.util.Scanner;

public class FirstExercises {



    /* problem 1 - Odd or Even */
    public static int isOddOrEven() {
        System.out.println("Problem 1: Enter a number to very if it`s odd or even.");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 1){
            System.out.println("The number " +  num + " is odd.");
        }
        else {
            System.out.println("The number " + num + " is even.");
        }
        return num;
    }


    /*problem 2 - Compare two numbers */
    public static void compareTwoNumbers(){
        int num1 = 25;
        int num2 = 39;
        System.out.println("Problem 2: ");
        if (num1 != num2){
            System.out.println(num1 + " != " + num2);
        }
        if (num1 < num2){
            System.out.println(num1 + " < " + num2);
        }
        if (num1 <= num2){
            System.out.println(num1 + " <= " + num2);
        }

    }

    /*problem 3 - Check the number */

    public static int checkNumber(){
        int number = 20;
        if (number % 2 == 0){
            System.out.println("Problem 3: 1 - the number is even");
        }
        else
        {System.out.println("Problem 3: 0 - the number is odd");}
        return number;

    }
    /* problem 4 - Sum of two numbers equal with third number */
    public static int verifySum(){
        int num1 = 5;
        int num2 = 10;
        int num3 = 15;
        int sum = num1 + num2;

        if(sum == num3){
            System.out.println("Problem 4: true");
        }
        else {
            System.out.println("Problem 4: false");
        }
        return sum;
    }

    /* problem 5 - Positive or negative number */
    public static int positiveOrNegative(int x){
        if (x < 0){
            System.out.println("Problem 5: The number is negative.");
        }
        else if ( x > 0){
            System.out.println("Problem 5: The number is positive.");
        }
        else {
            System.out.println("Problem 5: The number is 0.");
        }
        return x;
    }

    /* problem 6 - Greatest number */
    public static void greatestNumber(){
        int num1 = 25;
        int num2 = 78;
        int num3 = 87;
        if(num1 < num2 && num2 < num3){
            System.out.println("Problem 6: The greatest number is " + num3);
        }
        else if(num3 < num1 & num2 < num1){
            System.out.println("Problem 6: The greatest number is " + num1);
        }
        else
            System.out.println("Problem 6: The greatest number is " + num2);
    }

    /* problem 7 - Week Day */
    public static void weekDay(){
        System.out.println("Problem 7: Enter the day number (1-7):");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int i = day;
        if (i<=7)
        {
            if ( day ==1)

                System.out.println("Monday");

            else if (day == 2)
                System.out.println("Tursday");

            else if (day == 3)
                System.out.println("Wednesday");

            else if (day == 4)
                System.out.println("Thusday");

            else if (day == 5)
                System.out.println("Friday");

            else if (day == 6)
                System.out.println("Saturday");

            else if (day == 7)
                System.out.println("Problem 7: Sunday");


        }

        else System.out.println("Error");

    }

    public static void main(String[] args) {

        int result = isOddOrEven(); //problem 1
        compareTwoNumbers(); //problem 2
        int result1 = checkNumber(); //problem 3
        int result2 = verifySum(); //problem 4
        int result3 = positiveOrNegative(35); //problem 5
        greatestNumber(); //problem 6
        weekDay();

    }


}
