// Java is an OOP programming language
 import java.util.Scanner;

 public class java_fullStack {

    public static void main(final String[] args) {

        // Hello world
        System.out.println("Welcome to java programing");
        System.out.println("Hello world in a string");

        // DATA TYPES AND VARIABLES
        // variables are things that hold data

        // Var initialization and declaration

        // declare
        int b;
        // initialize
        b = 50;
        System.out.println(b); //50

        // primitive data types(they are unchangeable)
        final int var_name = 10;
        final double marks = 50.6;
        final boolean score = true;
        final boolean score_failure = false;
        final char o_letter = 'O';

        // not primitive, can change its value
        final String user_name = "Timz Owen Developer @254_Kenya";

        System.out.println(var_name); // 10
        System.out.println(marks); // 50.6
        System.out.println(score); // true
        System.out.println(score_failure); // false
        System.out.println(o_letter); // O
        System.out.println(user_name); // Timz Owen Developer @254_Kenya

        // re-assign variable values
        final double new_marks = marks;

        final int score_1 = 50;
        final int new_score = score;
        System.out.println(new_score); //50
        System.out.println("copied score is: " + score_1); //copied score is 50

