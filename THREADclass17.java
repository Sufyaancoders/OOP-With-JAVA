import java.util.Scanner;

public class THREADclass17 {
 // two way to creat threads ....
 //   by extending thread class 
 // by implementing  runable interfranc
 public static void main(String[] args) {
    System.out.println("enter a number ");
    Scanner sc= new Scanner (System.in);
    int a= sc.nextInt();
    //Let's see how we can create a thread by extending the thread class.
//Extending Thread Class :
MyThread1 t1 = new MyThread1();
    t1.start();
    MyThread2 t2 = new MyThread2();
    t2.start();

 }
}
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<700){
            System.out.println("My Cooking Thread is stop");
            System.out.println("I am sad!");
            i++;
        }
                          //code that we want to get executed on running the thread
        }
    }

    class MyThread2 extends Thread{
        @Override
        public void run(){
            int i =0;
            while(i<700){
                System.out.println("My Cooking Thread is Running");
                System.out.println("I am happy!");
                i++;
            }
        }
    }