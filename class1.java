//class is name of group of  propertey
//you creat on data type on class
/**
 * class
 */
public class class1 {
 public static void main (String[] args){
    student[] students=new student[5];// new data type student
    student sufyaan =new student();//object
    sufyaan.name="sufaan ahmad";
    sufyaan.roll=222;
sufyaan.maks=23.3f;
System.out.println(sufyaan.roll);
System.out.println(sufyaan.maks);
System.out.print(sufyaan.name);

 }
}
class student{
    int roll;
    float maks;
    String name;

}