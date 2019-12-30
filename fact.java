import java.util.*;

 // Compiler version JDK 11.0.2

 class fact
 {
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    int f,r,fact=1;
    f=sc.nextInt();
    for(r=1;r<=f;r++)
    {
      fact=fact*r;
    }
    
    System.out.println(fact);
   }
 }