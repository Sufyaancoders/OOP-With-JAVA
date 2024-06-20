import java.io.FileInputStream;

public class class16 {
    public static void main(String[] args) {
try{
FileInputStream fin=new FileInputStream("d:/a1.txt");
int a1=fin.read();
int a2=fin.read();
int a3=fin.read();
fin.skip(5);
byte[] b=new byte[4];
fin.read(b);
System.out.println(a1);
System.out.println(a2);
System.out.println(a3);
System.out.println(b[0]);
System.out.println(b[1]);
System.out.println(b[2]);
System.out.println(b[3]);
int a4=fin.available();
System.out.println("Remaining:"+a4);
fin.close();
}catch(Exception ee)
{
System.out.println(ee);
}
}
}
    
