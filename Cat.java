
public class Cat extends Dog{

    //add additional values to string
    public int food;

    //Generated a sub class constructor to inherit from the super class Dog class
    public Cat(String name, int age, int food) {
        super(name, age);
        this.food = food;
    }

    //multiple constructors
    //used if a developer only wants one/two features defined by the user apart from the default constructor
    public Cat(String name, int age)
    {
        super(name,age);
        this.food = 200;
    }
    public Cat(String name)
    {
        super(name,0);
        this.food = 500;
    }
}
