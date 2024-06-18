import java.util.Scanner;

public class EXCEPTIONclass11 {
    
    public static void main(String[] args)

{
    
     Scanner sc=new Scanner(System.in);
    
     int[] arr=new int[]{23,45,8,54,23,56};
    
     int i,a,ans=0;
    
 System.out.println("Enter Index:");
    
     try{
    
     i=sc.nextInt();
    
   System.out.println("Enter a Value:");
     a=sc.nextInt();
    
     ans=arr[i]/a;
    
     }catch(Exception e)
    
     {
    
     System.out.println("“Some Error Occurred");
     }
    
 System.out.println("Ans="+ans);
    
     }
    
     }
    
