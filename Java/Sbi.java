import java.util.*;
class Banking
{
public String name;
public long mob;
public String pwd;
public String add;

public void kyc()
{
System.out.println("Enter customer name:");
Scanner sc=new Scanner(System.in);
name=sc.nextLine();
System.out.println("Enter the mobile number:");
mob=sc.nextLong();
}

public void creatAccount()
{
String unname;
String pwd;
System.out.println("Enter Username name:");
Scanner sc=new Scanner(System.in);
unname=sc.nextLine();
System.out.println("Enter password:");
pwd=sc.nextLine();
}
}
class Sbi extends Banking
{
public static void main(String args[])
{
Sbi s=new Sbi();
s.kyc();
s.creatAccount();
}
}
