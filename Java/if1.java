import java.util.*;
class if1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
boolean greaterThanEqualToHundred = number >=100;
if(!greaterThanEqualToHundred){
System.out.println("Small");
}
else
{
System.out.println("Large");
}
}
}