import java.util.ArrayList;

public class Lambdas {
    public static void main(String[] args){
       // lambda expression for fetching and iteration of values;
        ArrayList<String> names = new ArrayList<>();
        names.add("Timz");
        names.add("Owen");
        names.add("James");
        names.add("Ayuen");
        names.add("Kemboi");

        names.forEach((n) -> {
            System.out.println(n);
        });

        System.out.println(names);
    }
}



// Interfaces vs lambda expressions

interface Shape{
    void draw();
}

class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle class just got printed");
    }
}

class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle shape just got printed");
    }
}

class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square Just got printed");
    }
}

public class lambdas {

    public static void main(String[] args) {

        Shape square = () -> System.out.println("Square class method");
        square.draw();

        Shape circle = () -> System.out.println("Circle just got printed");
        circle.draw();

        Shape rectangle = () -> System.out.println("Rectangle got printed out");
        rectangle.draw();
    }
}
