// <Interfaces>
public class class9 {
    public static void main(String[] args) {
    Horse s3 = new  Horse();
    s3.walk();
    }
}
/**
 * Innerclass9>
 */
interface Animal { // not use class constructer

    
   public void walk();
}


class Horse implements Animal { // not use extend key word eirther implement key word use  
   public void walk() {
       System.out.println("Horse walks on 4 legs");
   }
}


class Chicken implements Animal {
   public void walk() {
       System.out.println("Chicken walks on 2 legs");
   }
}