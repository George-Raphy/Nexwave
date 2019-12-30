import java.util.*;

 // Compiler version JDK 11.0.2

 class Pattern
 {
   public static void part1()
   {
     
   int i,j;
     for(i=0;i<6;i++)
     {
       for(j=0;j<i;j++)
       {
         if(i%2!=0)
         {
       
           System.out.print("*");
         
         }
         else
         {
           
           System.out.print("+");
         
         }
       }
      System.out.println(""); 
     }
     
   }

   public static void main(String args[])
   {
     part1();     
     
   }
 }