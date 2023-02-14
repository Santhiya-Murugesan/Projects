/*import java.util.*;
class Student
{
int
void getData();
{

}
display();
{

}

}
class MainMarks
{
System.out.println
}*/


class Marksheet
{
    public static void main(String[] args)
    {
        int n,rollno, total = 0, percentage;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Student roll number : ");
        rollno = scn.nextInt();
        System.out.println("Enter the Student name : ");
        String name = scn.next();
       
        System.out.println("Enter no. of subject : ");
        n = scn.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter marks out of 100 :");
        for(int i = 0; i < n; i++)
        {
            marks[i] = scn.nextInt();
            total = total + marks[i];
        }
        percentage = total / n;
        System.out.println("The total mark :"+total);
        System.out.println("The percentage :"+percentage);
       
        if(percentage > 80)
{  
            System.out.println("Grade: First Class With Distinction");  
        }  
        else if(percentage>=60)
{  
            System.out.println("Grade: First Class");  
        }  
        else if(percentage>=45)
{  
            System.out.println("Grade: Second Class");  
        }  
        else if(percentage>=35)
{  
            System.out.println("Grade: Third Class");  
        }
        else {
            System.out.println("Grade: Fail");
        }
    }
}
