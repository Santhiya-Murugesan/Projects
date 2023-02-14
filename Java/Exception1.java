import java.io.*;
public class Exception1
{
public static void main(String args[]){
try{
int numeric;
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your number:");
numeric =  Integer.parseInt(in.readLine());
}catch(Exception e){
e.printStackTrace();
System.out.println("Exception:"+e);
}finally{
System.exit(0);
}
}
}