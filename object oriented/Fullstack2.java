public class java_fullStack2 {
 public static void main(String[] args) {

        //create a new object call to the class
    Dog myNewDog = new Dog("Simba", 8);
    myNewDog.startBarking();

    Dog myNewDog1 = new Dog("Timz", 18);
    myNewDog1.startBarking();

    Dog myNewDog2 = new Dog("Lion", 28);
    myNewDog2.startBarking();

    //get a particular age
    System.out.println(myNewDog1.getmAge()); // 18

    Cat cat = new Cat("Meow", 52);
    cat.startBarking();

    Cat bill = new Cat("Bill", 5);
    bill.startBarking();

    Cat junior = new Cat("Junior");
    junior.startBarking();

    }
}


     //Static variables;
     //changes from different classes;

     Dog newDog = new Dog("bill ",10);
     Dod newDog2 = new Dog("Joe", 15);

        System.out.println(Dog.counter); // 2


        //UP-NEXT
        // OVERLOADING METHODS AND OBJECTS COMPARISON
    }

    //static methods can be called within same class

    protected static void display()
    {
       System.out.println("User dairy farm is :::");
    }



    //UP-NEXT ON OVERLOADING METHODS & OBJECT COMPARISON
    //CREATE A CLASS STUDENTS AND do the comparisons

    Student tim = new Student("Tim");
    Student owen = new Student("owen");
    Student code = new Student("ninja");
    Student ninja = new Student("ninja");

    //check for equality btw names
    System.out.println(tim == owen); //gives false in all occasion as it only compares the string values and not Objects

    //now check with the method from the student class

    System.out.println(tim.equalsChecker(owen));//false
    System.out.println(code.equalsChecker(ninja)); //True



    //COMPARING USING COMPARABLE IN OBJECTS
    public static void main(String[] args) {

        Student tim = new Student("Tim");
        Student owen = new Student("owen");
        Student code = new Student("ninja");
        Student ninja = new Student("ninja");
        Student alpha = new Student("Alpha");
        Student beta = new Student("Beta");

        //compares the alphabetical oder difference
        System.out.println(owen.compareTo(tim)); // 27
        System.out.println(code.compareTo(ninja)); //0
        System.out.println(alpha.compareTo(beta)); //-1
        System.out.println(alpha.compareTo(beta) >0); //false


    }



    //UP-NEXT ON INNER CLASSES
    //accesing inner classes in outer classes
    public class java_fullStack {

      public static void main(String[] args) {

          //create an instance of the outer class

          OuterClass out = new OuterClass();
          out.inner();

      }
  }

  //classes inside methods
  import java.util.*;

  public class java_fullStack {

      public static void main(String[] args) {

          //create an instance of the outer class

          OuterClass out = new OuterClass();
          out.inner();

      }
  }




//UP-NEXT ON INTERFACES
//super inheritance and almost like classes
//Its abstract and no definition in between
//create a car class and a vehicle interface

public class java_fullStack {

   public static void main(String[] args) {

      Car bmw = new Car();
      bmw.changeGears(5);
      bmw.speedUp(280);
      bmw.display();

   }
}


   //UP NEXT ON ENUMS
   //This are collection of constants that make your code more readable
   //create an enum just like classes and interfaces are created
   //IN our case level has been done

   public class java_fullStack {

      public static void main(String[] args) {


          Level level = Level.LOW;

          if (level == Level.MEDIUM)
          {
              System.out.println(level);
          }
          else if(level == Level.LOW)
          {
              System.out.println(level);
          }
          else
          {
              System.out.println(level);
          }

      }
  }

  //you can also check on all the elements in an enum using arrays.
  public class java_fullStack {

   public static void main(String[] args) {
       //get all values
       //stored in arrays to avoid displaying memory allocations in the computer's Ram
       Level [] arrays = Level.values();

       //loop through each element
       for (Level e : arrays)
       {
           System.out.println(e);
       }


   }

