//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.elena.arraystrings;

public class StringsExercises {
    public StringsExercises() {
    }

    public static String frontThree(String name) {
        String word;
        if (name.length() >= 3) {
            word = name.substring(0, 2);
        } else {
            word = name;
        }

        word = word.concat(word).concat(word);
        return word;
    }

    public static String comboString(String a, String b) {
        String result;
        if (a.length() < b.length()) {
            result = b + a + b;
        } else {
            result = a + b + a;
        }

        return result;
    }

    public static String concatElements(String x, String y) {
        String result = "";
        if (x.length() > 1) {
            result = result + x.substring(1);
        }

        if (y.length() > 1) {
            result = result + y.substring(1);
        }

        return result;
    }

    public static String lastLetter(String a) {
        char oh = a.charAt(a.length() - 1);
        String result = oh + a + oh;
        return result;
    }

    public static String last3Letters(String a) {
        String result = "";
        String demo = "";
        String initialWord = "";
        if (a.length() > 3) {
            demo = a.substring(a.length() - 3);
            demo = demo.toLowerCase();
        } else {
            demo = a.toLowerCase();
        }

        initialWord = a.substring(0, a.length() - 3);
        return result + initialWord;
    }

    public static String returnGreeting(String name) {
        String hello = "Hello, ";
        String stopGreeting = "!";
        String greeting = hello + name + stopGreeting;
        return greeting;
    }

    public static String putResultTogether(String a, String b) {
        String resultTogether = a + b + b + a;
        return resultTogether;
    }

    public static String getHTMLtags(String type, String text) {
        String start = "<" + type + ">";
        String stop = "</" + type + ">";
        String htmlTag = start + text + stop;
        return htmlTag;
    }

    public static void main(String[] args) {
        String result = frontThree("ab");
        System.out.println("Problem 1: " + result);
        String result1 = comboString("hello", "ab");
        String result4 = concatElements("Hello", "There");
        System.out.println("Problem 2: ");
        System.out.println(result4);
        String result5 = concatElements("java", "code");
        System.out.println(result5);
        String result6 = lastLetter("random");
        System.out.println("Problem 3: " + result6);
        String result7 = last3Letters("nuascuoansco");
        System.out.println("Problem 4: " + result7);
        System.out.println("Level 1");
        System.out.println("Problem 1:");
        String greeting = returnGreeting("Bob");
        System.out.println(greeting);
        String greeting1 = returnGreeting("Alice");
        System.out.println(greeting1);
        String greeting2 = returnGreeting("X");
        System.out.println(greeting2);
        System.out.println("Problem 2:");
        String result8 = putResultTogether("Hi", "Bye");
        System.out.println(result8);
        String result9 = putResultTogether("Yo", "Alice");
        System.out.println(result9);
        String result10 = putResultTogether("What", "Up");
        System.out.println(result10);
        System.out.println("Problem 3:");
        String result11 = getHTMLtags("i", "Yay");
        System.out.println(result11);
        String result12 = getHTMLtags("i", "Hello");
        System.out.println(result12);
        String result13 = getHTMLtags("cite", "Yay");
        System.out.println(result13);
    }
}
