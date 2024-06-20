public class class7AC {
 public static void main (String[] args){
 account s1 =new account();
 s1.name="sufyaan ahmad";
 s1.mail="x9x";
 //s1.passworrd="abcd";
   s1.set("abcd");
   System.out.println(s1.get());
 }
}
class account{
    public String name;
 protected String mail; //sub classs bhi access kar pai gi
private String passworrd; 
// getteres and setters : private chiss ki informationn yapass dadijya : 
//privatte chesss ki value set kardijya  
public String get(){
return this.passworrd;
}
public void set(String pass){
    this.passworrd=pass;
}
}