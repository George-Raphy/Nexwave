import java.util.*;

 // Compiler version JDK 11.0.2

 class countobj
 {
   static int a=0;
   countobj()
   {
     a++;
   }
  
   public static void display()
   {
     System.out.println(a);
   }
   public static void main(String args[])
   { 
    countobj c=new countobj();
    countobj d=new countobj();
    countobj f=new countobj();
    display();
   }
 }