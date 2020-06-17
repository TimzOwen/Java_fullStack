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
