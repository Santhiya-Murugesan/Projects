import java.util.*;
class Student
{
		int rollno,m1,m2,m3;
		String name,grade,res;
		double total,avg;

		void getData(int r,String na,int mm1,int mm2,int mm3)
		{
			rollno = r;
			name = na;
			m1 = mm1;
			m2 = mm2;
			m3 = mm3;
		}
		void processData()
		{
							
				displayData();
				calc();
				

				
		}
		void calc()
		{
				total = m1+m2+m3;
				avg = total/3;
				System.out.println("Total: "+total);
				System.out.println("Average: "+avg);
				grade();
				result();

		}
		void displayData()
		{

				System.out.println("------------------------------------------------------------");
				System.out.println("\t\t MARK STATEMENT");
				System.out.println("------------------------------------------------------------");


			System.out.println("Roll number: "+rollno);
			System.out.println("Student Name:"+name);
			System.out.println("Mark1:"+m1);
			System.out.println("Mark2:"+m2);
			System.out.println("Mark3:"+m3);
			
		}
		void grade()
		{
				if(avg >=80)
				{
					System.out.println("First Class with Distinction");
				}
				else if((avg>=60) && (avg<80))
				{
					System.out.println("First Class");
				}
				else if((avg>=50) && (avg<60))
				{
					System.out.println("Second Class");
				}
				else if((avg>=40) && (avg<50))
				{
					System.out.println("Third Class");
				}
				else
				{
					System.out.println("Re-Attempt");
				}

		}
		void result()
		{
				if((m1>=40) &&(m2>=40) &&(m3>=40))
				{
					System.out.println("Pass");
				}
				else
				{
					System.out.println("Fail");
				}


		}
		

}
class mainStudent
{
		public static void main(String arg[])
		{

			Scanner sc = new Scanner(System.in);
			Student ob = new Student();

			int r1,m1,m2,m3;
			String nam;
		
			System.out.println("------------------------------------------------------------");
			System.out.println("\t\t MARK STATEMENT");

			System.out.println("------------------------------------------------------------");


			System.out.println("Enter the Roll number:");
			r1 = sc.nextInt();
			System.out.println("Enter the Name:");
			nam = sc.next();
			System.out.println("Enter the Mark1:");
			m1 = sc.nextInt();
			System.out.println("Enter the Mark2:");
			m2 = sc.nextInt();
			System.out.println("Enter the Mark3:");
			m3 = sc.nextInt();

			ob.getData(r1,nam,m1,m2,m3);
			ob.processData();
	}
}	