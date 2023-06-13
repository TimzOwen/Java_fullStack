import java.util.Scanner;

public class basics {
    public static void main(String[] args){
        
    }

    // Functions for basic test
     public void basicCode(){
        // Hello world
        System.out.println("Hello world version 17");

        //Data types
        int studentAge = 15; 
        double studentGPA = 3.4; 
        char studentGrade = 'B';
        String studentName = "John";
        boolean isPresent = false;
        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentName);
        System.out.println(studentGrade);
        System.out.println(isPresent);

        // Indexing 
        String name = "Timz";
        System.out.println(name.charAt(0));  // access index at specific location

        // String concatenation
        String name1 = "Timz";
        int grade = 30; 
        System.out.println(name1 + " has a score of: " + grade);

        // input and output
        Scanner scanner = new Scanner(System.in);
        int score = 20;
        System.out.println("Enter new score: ");
        score=scanner.nextInt();
        System.out.println("New score: " + score);

        //CONTROL STATEMENT

        // If else statement
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number...");
        int age = scanner.nextInt();
        if (age > 8) {
            System.out.println("you are an Adult");
        }else {
            System.out.println("you are not an adult");
        }

        // Loops

        // While loops
         // While loops
        Scanner scanner = new Scanner(System.in);
        boolean isOnRepeat = true;
        while (isOnRepeat){
            System.out.println("Playing current song");
            System.out.println("play new song?....");
            String newSong = scanner.next();
            if ("yes".equals(newSong)){ // String comparison
                isOnRepeat = false;
            }
        }
        System.out.println("playing next song....");


         // Multiple choice question
        String choiceOne = "Pep";
        String choiceTwo = "Klop";
        String choiceThree = "Arteta";
        String question = " Who is the manager for Arsenal";

        System.out.println(question);
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (input.equals(choiceThree)){
            System.out.println("Congratulation you win");
        }else {
            System.out.println("you lost");
        }

        // soln 2 
        Scanner scanner = new Scanner(System.in);
        String question = "Capital city of Kenya";
        String choiceOne = "Kisumu";
        String choiceTwo = "Nakuru";
        String choiceThree = "nairobi";

        System.out.println(question);
        System.out.println("choose from " + choiceOne + " " + choiceTwo + " " + choiceThree);
        String attemptedAns = scanner.next();
        if (choiceThree.equals(attemptedAns.toLowerCase())){
            System.out.println("You win....");
        }else {
            System.out.println(" You lost \n Correct answer is: " + choiceThree);
        }

        // For loop
        for (int a = 0; a <= 10; a++) {
            System.out.println(a);
        }

         // Area of a Triangle
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base of the Triangle");
        double base = scanner.nextDouble();
        while (base<=0){
            System.out.println("cannot be less than  " + base);
            base=scanner.nextDouble();
        }
        System.out.println("Enter Height of the Triangle");
        double height = scanner.nextDouble();
        while (height<=0){
            System.out.println("Cannot be less than " + height);
            height=scanner.nextDouble();
        }
        System.out.println((base * height)/2);

        
        // create and calling functions
         public static void main(String[] args) {
        announceTeaTime();
            }
        public static void announceTeaTime(){
            System.out.println("Waiting for tea time.......");
            System.out.println("Enter anyword to ring the bell ");
            Scanner scanner = new Scanner(System.in);
            scanner.next();
            System.out.println("Yes!....its tea time");
           }

        // Functions... inputs
        public static void main(String[] args) {
                calculateTotalMeal(100,20,5);
             }
        public static void calculateTotalMeal(double tipRate, double taxRate, double listedPrice){
            double tip = tipRate + listedPrice;
            double tax = taxRate + listedPrice;
            double result = listedPrice + tip + tax;
            System.out.println(result);
            }
            
        // Function Return types.
        public static void main(String[] args) {
            double total = calculateTotalMeal(100,20,5);
            double pricePerPerson = total/5;
            System.out.println(pricePerPerson);
            }
        public static double calculateTotalMeal(double tipRate, double taxRate, double listedPrice){
            double tip = tipRate + listedPrice;
            double tax = taxRate + listedPrice;
            return  listedPrice + tip + tax;
            }

        // Functions - Inbuilt Functions  
        System.out.println(Math.pow(2,5));   

        // Employee salary per hour rate calculation
        public static void main(String[] args) {
            System.out.println(employeeSalary(500,8));
            }
        public static double employeeSalary(double hourlyRate, double hours){
            return hourlyRate * hours;
            }

        // option 2
        public static void main(String[] args) {
            System.out.println(employeeSalary(1,8));
             }
        public static double employeeSalary(double hourlyRate, double hours){
            if (hours<0){
                return 0;
            }
            if (hourlyRate<0){
                return 0;
            }
            double dailyPaycheck= hourlyRate * hours;
            return dailyPaycheck * 28;
        }   
        
        // option 3
            public static void main(String[] args) {
            System.out.println(employeeSalary(100,8,2));
            }
        public static double employeeSalary(double hourlyRate, double hours, double lunchHours){
            if (hours<0 || hourlyRate <0){
                return 0;
            }
            double dailyPaycheck= hourlyRate * hours;
            double unpaidTime = lunchHours * hourlyRate * 28;
            return dailyPaycheck * 28 - unpaidTime;
        }

        // option 4

        public static void main(String[] args) {
            System.out.println(employeeSalary(100,8,2));
            }
        public static double employeeSalary(double hourlyRate, double hours, double lunchHours){
            if (hours<0 || hourlyRate <0){
                return 0;
            }
            double dailyPaycheck= hourlyRate * hours;
            double unpaidTime = lunchHours * hourlyRate * 28;
            return dailyPaycheck * 28 - unpaidTime;
        }

    }
}