//<Encapsulation> 
//:Encapsulation is the process of combining data and functions into a single unit called class. 
//Thus, encapsulation makes the concept of data hiding possible.(Data hiding: a language feature to restrict access to members of an object, reducing the negative effect due to dependencies. 
//e.g. "protected", "private" feature in Java). 
//<Abstraction >
//In simple terms, it is hiding the unnecessary details & showing only the essential parts/functionalities to the user.

public class class8i {
    public static void main(String[] args) {
        Horse h1= new Horse();
        
    }
}
abstract class Animal{ // object is not creat of animal by using abstrac ''
   abstract void walk (); { //walk  is also not creat obj in main classs

   }
   Animal()
   // constracter 
   {
       System.out.println("You are about to create an Animal.");
   }
}



class Horse extends Animal {
    Horse() {
        System.out.println("Wow, you have created a Horse!");
    }
 
public void walk() {
    System.out.println("Horse walks on 4 legs");
}
}


class Chicken extends Animal {

public void walk() {
    System.out.println("Chicken walks on 2 legs");
}
}
