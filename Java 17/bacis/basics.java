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

    }
}