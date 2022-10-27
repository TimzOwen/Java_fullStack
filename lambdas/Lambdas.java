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