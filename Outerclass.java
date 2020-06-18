import sun.net.www.content.text.plain;

public class Outerclass {

    // //create an inner class
    // private class InnerClass{
    //     //create a method outside to display a message
    //     public void display()
    //     {
    //         System.out.println("Inner class here");
    //     }
    // }

    // public void inner()
    // {
    //     InnerClass inner = new InnerClass();
    //     inner.display();
    // }

    

    //inner classes inside methods

    public class OuterClass
    {
    
       public void inner() {
           class Inside {
               public void display() {
                   System.out.println("Inner class inside a method");
               }
           }
    
           //create an instance of the class
           Inside inn = new Inside();
           inn.display();
       }
    }
    
    


}
