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

      //CONDITIONS AND BOOLEAN

        //Comparison operator
        int a_ = 10;
        int b_ = 5;
        int c_ = 15;

        //less than
        boolean Compare = a_ < b_;
        System.out.println(Compare); //False

        //greater than
        boolean compare1 = a_ > b_ ;
        System.out.println(compare1); // True

        //equal
        boolean compare2 = a_ == b_;
        System.out.print(compare2);  //False

        //not equal
        boolean compare3 = a_ != b_;
        System.out.println(compare3); // True

        //Compare String
        Scanner scanner_ = new Scanner(System.in);
        String name = scanner_.nextLine();
        boolean name1 = name.equals("Owen");
        System.out.println(name1); // return T/F according to your input


        //COMPARISON WITH (AND,NOR,OR) operators
        // ("||") rep OR operator
        // ("&&") rep   AND operator
        //("!()") NOT operator

        //T || F = F
        //F || T = T
        //T || T = T
        //F || F = F
        //F && F = F
        //F && T = F
        //T && F = F
        //T && T = T
        // (!()) reverses the final result.

        int ab_ = 10;
        int bc_ = 20;
        int cd_ = 30;

        boolean comapre001 = ab_<bc_ && bc_<cd_;
        System.out.println(comapre001); //True

        boolean comapre002 = ab_>bc_ || bc_<cd_;
        System.out.println(comapre002); //True

        boolean comapre003 = !(ab_>bc_ || bc_<cd_);
        System.out.println(comapre003); //False

        boolean comapre004 = !(ab_<bc_ && cd_>ab_ + 2) || (cd_==20 || cd_<ab_);
        System.out.println(comapre004); //False

        boolean comapre005 = (ab_<bc_ && cd_>ab_ + 2) || (cd_==20 || cd_<ab_);
        System.out.println(comapre005); //True


        //IF ELSE ,ELSE IF STATEMENTS
        Scanner scanner_1 = new Scanner(System.in);
        String name_owen = scanner_1.nextLine();
        if(name_owen.equals("Timz_Owen"))
        {
            System.out.println("Yes you typed Timz's Owen's Name");
        } //if name typed the output is given as in the String

        //Else If
        if(name_owen.equals("Kabarak"))
        {
            System.out.println("Studies there");
        }
        else
        {
            System.out.println("That's not His university");
        }

        //If Else, Else If
        if(name_owen.equals("Kabarak"))
        {
            System.out.println("Studies there");
        }
        else if(name_owen.equals("UoN"))
        {
            System.out.println("Did masters there");
        }
        else if(name_owen.equals("GuternBerg"))
        {
            System.out.println("Did phd there");
        }
        else
        {
            System.out.println("I don't understand your input");
        }


        //NESTED STATEMENTS & MINI-SUMMARY
        System.out.println("Input Your Age");
        Scanner scan_1 = new Scanner(System.in);
        String your_age = scan_1.nextLine();
        int age_int = Integer.parseInt(your_age);
        if((age_int > 18) && (age_int<100))
        {
            System.out.println("You can drive");
        }
        else if((age_int<18) && (age_int>0))
        {
            System.out.println("You cannot drive,young man");
        }
        else
        {
            System.out.println("Invalid input");
        }

       // Nested loops inside loops
        System.out.println("Input Your Job salary");
        final Scanner sc_salary = new Scanner(System.in);
        final String your_pay = sc_salary.nextLine();
        final int pay_int = Integer.parseInt(your_pay);
        if ((pay_int > 18000) && (pay_int < 30000)) {
            System.out.println("Entry Level Developer");
        } else if ((pay_int > 80000) && (pay_int < 30000)) {
            System.out.println("Junior Developer");
        } else if (pay_int > 81000) {
            System.out.println("You are a Senior Engineer, Would you join Andela?");
            final String new_company = sc_salary.nextLine();
            if (new_company.equals("Yes"))
            {
                System.out.println("New salary is ksh:350,000");
            } else if (new_company.equals("No"))
            {
                System.out.println("What offer would you want?");
                final String sc_offer = sc_salary.nextLine();
                final int pass_int = Integer.parseInt(sc_offer);
                if (pass_int > 500000)
                {
                    System.out.println("We can't pay more than this");
                } else if ((pass_int > 300000) && (pass_int < 498000)) {
                    System.out.print("You are in for full stack payroll");
                } else
                 {
                    System.out.println("Invalid/low payroll");
                }
            }

        } else {
            System.out.println("Invalid input");
        }

        // UP-NEXT ON ARRAYS

        // Holds data of the same type. uses the opening and closing square brackets.
        final int[] new_array_numbers = new int[10]; // 10 is the number of elements in the array.
        final String[] names = new String[20];
        // Indexing arrays starts with 0 and not 1
        // Accessing elements in an array
        final String[] name_students = new String[5];
        name_students[0] = "Joy";
        name_students[1] = "Shem";
        name_students[2] = "Timz";
        name_students[3] = "Juma";
        name_students[4] = "Stacy";

        System.out.println(name_students[2]); // Timz

        // Declaration and initialization of arrays method 2
        final int[] numbers_array = { 2, 4, 5, 6, 7, 8, 9, 5, 6, 5 };
        System.out.println(numbers_array[2]); // 5

        // UP-NEXT ON FOR LOOPS:
        // doing some task based on certain iterations

        // looping integers using conditions
        int x_i;
        for (x_i = 0; x_i <= 10; x_i++)
         {
            System.out.println(x_i);
        }

        // increment with intervals
        int j;
        for (j = 0; j <= 20; j += 5) {
            System.out.println(j); // 0, 5, 10, 15,20
        }

        // variables in for loop
        final int a_a = 5;
        int w;
        for (w = 0; w <= a_a; w += 2)
         {
            System.out.println(w); // 0,2,4
        }

        // for loops and arrays
        final int[] arr = { 2, 4, 6, 8, 10, 2, 14, 16, 18, 2 };
        for (int i=0; i<arr.length; i++)
        {
            if(arr[0] == 2)
            {
                System.out.println("Found 2 at index: " + i);
            }
            // else
            // {
            //     System.out.println("At index 0 is not 2 but: " + arr[0]);
            // }
        }

