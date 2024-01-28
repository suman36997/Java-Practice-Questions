import java.util.*;


 // Compiler version JDK 11.0.2
//we make a class extending Thread
 public class ThreadSample3 extends Thread
 {
   String name; 
   //constructor taking name of the object 
   public ThreadSample3(String givenName)
   {
     name = givenName; 
   }
   //when the run method is called 
   //the thread is run
   public void run() 
   {
     int i; 
     try
     {
     for(i=1; i<=30;i++)
     {//printing the name of the object 
       System.out.println(i);
       //invoking the static sleep method 
       //will make the thread sleep 
       //for the specified milliseconds 
       Thread.sleep(500);
     }
     }
     //if the sleep condition is interrupted 
     //it will be caught here
     catch(InterruptedException ie)
     {
       //print the error stack
       ie.printStackTrace();
     }
   }
   public static void main(String args[])
   { 
    //As before we create two objects
    //and assign them to two threads
    ThreadSample3 tOne = new ThreadSample3("1");
    Thread one = new Thread(tOne);
    ThreadSample3 tTwo = new ThreadSample3("2");
    Thread two = new Thread(tTwo);
    //we start the two threads
    //although the threads start
    // one after another we will see alternating 
    //output. because, after each printing 
    //the thread goes to sleep,  so
    //the thread scheduler calls the other thread
    System.out.println("demonstrating thread scheduling");
    one. start();
    two. start();
   }
 }