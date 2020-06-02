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
        
              //BASIC OPERATION

        //addition
        int x=10,y=5,z=2;
        int sum = (x+y+z);
        System.out.println(sum); //17

        //subtraction
        int a=10,d=5,c=2;
        int diff = (a-d-c);
        System.out.println(diff); //3

        //Division;
        int one=20,two=5,three=2;
        int division_result = (one/two/three);
        System.out.println(division_result); //2

        //multiplication
        int e=2,f=4,g=6;
        int mult = (e*f*g);
        System.out.println(mult);

        //Division(double values)
        double english = 57;
        double maths = 7;
        double results_ = english/maths;
        System.out.println(results_); //8.142857142857142

        //power of using math.pow(value_a, value_b) value_a - base, value_b - raised to;
        int ab = 5;
        int bc = 2;
        double xy = Math.pow(ab, bc);
        System.out.println(xy); //25.0

        //type-casting
        int ba = 5;
        int cb = 2;
        double output = ba/(double)cb;
        System.out.println(output); //2.5

        //Modulus (prints the remainder)
        int abc = 50;
        int cba = 9;
        int rem = abc % cba;
        System.out.println(rem); //5

        //INPUT AND SCANNERS

        //strings
        Scanner sc = new Scanner(System.in);
        String user_name1 = sc.next();
        System.out.println(user_name1); // prints user input

        //integers
        Scanner scanner = new Scanner(System.in);
        int nu1 = scanner.nextInt();
        System.out.println(nu1); //print integers alone

        //Boolean
        Scanner scanner2 = new Scanner(System.in);
        Boolean nu12 = scanner2.nextBoolean();
        System.out.println(nu12); //print boolean alone

        //Double
        Scanner scanner3 = new Scanner(System.in);
        double nu13 = scanner3.nextDouble();
        System.out.println(nu13); //print doubles alone

        // parsing an integer
        Scanner scanner4 = new Scanner(System.in);
        String num5 = scanner4.next();
        int new_num = Integer.parseInt(num5);
        System.out.println(new_num); //outputs the user string input 


