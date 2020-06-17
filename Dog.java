public class Dog{

    //create variable names to hold the for description
    private String mName;
    private int mAge;

    //create a constructor to the class
    public Dog(String name, int age)
    {
        this.mName = name;
        this.mAge = age;
    }
    //create a public function(method)
    public void startBarking()
    {
        System.out.println("my name is " + this.mName + "and I am " + this.mAge + " years old!! ");

    }
    //create setter method
    public int getmAge()
    {
        return this.mAge;
    }
    //create a setter method incase the values change
    public void setAge(int age)
    {
        this.mAge = age;
    }
    


    // UP-NEXT ON INHERITANCE ()Create a new class called cat that inherits from the Dog class behavior;

}
