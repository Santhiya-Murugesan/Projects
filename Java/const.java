class Student
{
		String roll,name;	
		int m1,m2,m3;
		long mb;
		double total,avg;
		Student(String b1,String n) // parameterised constructor
		{
			bill = b1;
			name=	n;
			System.out.println("Billno :"+bill);
			System.out.println("Name :"+name);
		}
		Student(int mm1,int mm2,int mm3)
		{
			m1 = mm1;
			m2 = mm2;
			m3 = mm3;

			total = m1+m2+m3;
			avg = total/3;
			System.out.println("Total :"+total);
			System.out.println("Avg :"+avg);
		}

		Student(long mb1)
		{
			mb = mb1;
			System.out.println("Mobile Number :"+mb);
		}
		
}
class Const
{
		public static void main(String[] a)
		{
			Student obj = new Student("RSP1002","Sakthiprakash");
			Student obj1 = new Student(50,58,65);
			Student obj2 = new Student(8952371231L);
		}
}