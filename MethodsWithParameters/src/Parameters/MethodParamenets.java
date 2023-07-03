package Parameters;

public class MethodParamenets 
{
	public static void main(String[] args) 
	{
		
		String Studname = "Vishal";
		int Rollno = 101;
		char Grade = 'A';
		float Percentage = 65.25f;
		
		
		StudInfo(Studname, Rollno, Grade, Percentage);
		
		MethodParamenets Nonstatic1= new MethodParamenets();
		
		Nonstatic1.Studinfo1(Studname, Rollno, Grade, Percentage);
		
		Otherclass.StudInfo(Studname, Rollno, Grade, Percentage);
		
		Otherclass Obj = new Otherclass();
		Obj.Studinfo1(Studname, Rollno, Grade, Percentage);
		
	}
	
	public static void StudInfo(String Name1,int num,char grade1, float Percentage1)
	{
		System.out.println("Informatioon of student is "+ Name1 +" "+ num +" "+ grade1 +" "+ Percentage1);
	}
	
	public void Studinfo1(String Name1,int num,char grade1, float Percentage1)
	{
		System.out.println("Informatioon of student is "+ Name1 +" "+ num +" "+ grade1 +" "+ Percentage1);
	}

}
