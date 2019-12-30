import java.util.*;

 // Compiler version JDK 11.0.2

 class Smallest
 {
   public static void main(String args[])
   { 
    Scanner sc= new Scanner(System.in);
    int a,b,c,d;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = (a<b)?((a<c)?a:c):((b<c)?b:c);
    System.out.println(d);
   }
 }