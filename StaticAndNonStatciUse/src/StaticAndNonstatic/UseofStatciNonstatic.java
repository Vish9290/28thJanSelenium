package StaticAndNonstatic;

public class UseofStatciNonstatic
{
	
	// What is use of static variable and non-static variable?
	// When we create the object of the class every time memory gets allocated and we can pass different values to  on non static variables by creating the object.
	// But if we want to keep some value  of the variables same in all the objects we  need to crate the variable as static. 
	// Static variable do not get memory while object is create they get memory in the heap. 
	
	
	
	String studname;
	int Studid;
	static String Principlename;
	
	public void Studinfo()
	{
		System.out.println(studname +" "+ Studid +" "+ Principlename);
	}
}
