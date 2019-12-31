import java.util.*;

 // Compiler version JDK 11.0.2
class Parent
{
  int a=10;
}
 
 class Child extends Parent
 {
   
   public static void main(String args[])
   { 
    Child c = new Child();
    System.out.println(c.a);
   }
 }