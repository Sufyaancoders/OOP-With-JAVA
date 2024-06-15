public class Sclass10 {
    public static void main(String[] args) {
        
    
    Student.school = "JMV";
       Student s1 = new Student();
       Student s2 = new Student();


       s1.name = "Meena";
       s2.name = "Beena";


       System.out.println(s1.school);
       System.out.println(s2.school);
       System.out.println(s2.name);
       System.out.println(s1.name);
   }
}

class Student {
    static String school;
    String name;   
 }
 