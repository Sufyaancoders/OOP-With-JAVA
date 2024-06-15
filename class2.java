public class class2 {
    //class is name of group of  propertey
//you creat on data type on class
/**
 * class
 */
    public static void main (String[] args){
       student2[] students=new student2[5];// new data type student
       student2 sufyaan =new student2();//object
//        sufyaan.name="sufaan ahmad";
//        sufyaan.roll=222;
//    sufyaan.maks=23.3f;
   System.out.println(sufyaan.roll);
   System.out.println(sufyaan.maks);
   System.out.println(sufyaan.name);
   sufyaan.func();
   student2 rendom =new student2(sufyaan);
   System.out.println(rendom.name);
    }
   }
   class student2{//student2 is a class
       int roll;
       float maks;
       String name;
       void func(){
        System.out.println("my name is "+this.name);
       }
       student2(student2 other){
        this.name=other.name;
        this.maks=other.maks;
        this.roll=other.roll;
       }
       student2(){
       this.maks=3333.4f; // this >is a keyword chang the object
       this.name="mohan";
       this.roll=233;}
   
   }
