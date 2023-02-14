import java.io.*;
import java.lang.*;
public class Throw1{
public static void validate(int age){
if(age<18){
throw new ArithmeticException("Poi padikura velaya paarunga ji!");
}else{
System.out.println("Vandhutaya Vandhutaya");
}
}
public static void main(String args[])
{
validate(18);
System.out.println("Varata Maamae Drr!");
}
}









