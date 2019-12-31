import java.util.*;

 // Compiler version JDK 11.0.2

 class Account
 {
   float bal=0; 
   int accno,phno;
   String name;
   Scanner sc = new Scanner(System.in);
   void getInput()
   {
     System.out.println("Enter the Account No");
     accno=sc.nextInt();
     System.out.println("Enter the Phone No");
     phno=sc.nextInt();
     System.out.println("Enter the Name");
     name=sc.next();
     
   }
   void deposit()
   {
     float dep=0;
     System.out.println("Enter the Amount to be deposited");
     dep=sc.nextFloat();
     bal=bal+dep;
     System.out.println(bal);
   }
   void withdraw()
   {
     float with=0;
     System.out.println("Enter the Amount to be Withdrawm");
     with=sc.nextInt();
     bal=bal-with;
     System.out.println(bal);
   }
   public static void main(String args[])
   {
     int n=1; 
        Scanner s = new Scanner(System.in);
     while(n!=0)
     {           
     System.out.println("Choose a number\n1.Add Account\n2.Deposit\n3.Withdraw\n4.Exit\n");
     Account a=new Account();
     int x=s.nextInt();
     switch(x)
     {
       case 1:
         a.getInput();
         break;
       case 2:
         a.deposit();
         break;
       case 3:
         a.withdraw();
         break;
       case 4:
         System.exit(0);
       default:
         System.out.println("Wrong number");
         break;
     }
    }
   }
 
 }