//polymorphic
//Method Overloading
//The polymorphism which is implemented at
// the compile time is known as compile-time polymorphism. Example - Method Overloading 


public class ACclass5{
    public static void main(String[] args) {
        student a1=new student();
        a1.name="sufyaan";
        a1.clas=22;
        a1.Pris(a1.clas);
    }
}
class student{
    String name;
    int clas;
   public  void Pris(String name){
System.out.println(name);
   }
   public  void Pris(int clas){
System.out.println(clas);
   }
}