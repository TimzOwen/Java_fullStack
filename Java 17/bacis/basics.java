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

        

    }
}