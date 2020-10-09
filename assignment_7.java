public class assignment_7 {

	public static void main(String[] args) 
	{
		//For Stu Class
		Stu s1 = new Stu(001, "Rajan Gautam");
		Stu s2 = new Stu(002, "Bhuwan KC");
		Stu s3 = new Stu(003, "Yubraaj Bhattarai");
		s1.display();
		s2.display();
		s3.display();
		
		System.out.println("---------------------------------------\n");
		
		//For StaticMethod Class
		StaticMethod.change();
		StaticMethod s01 = new StaticMethod(010, "Nanda Kumar Wanem");
		StaticMethod s02 = new StaticMethod(011, "Sanam Sunuwar");
		StaticMethod s03 = new StaticMethod(012, "Iksen Limbu");
		s01.display();
		s02.display();
		s03.display();
	}
}
//Stu Class
class Stu
{
	String name;
	int rollnumber;
	
	static String university = "PDPU";
	//Constructor to initialize the variable 
	Stu(int rollno, String std_name)
	{
		name = std_name;
		rollnumber = rollno;
	}
	//Static Method to print
	void display()
	{
		System.out.println("University : " +  university);
		System.out.println("Roll Number : " + rollnumber);
		System.out.println("Name : " + name + "\n");
	}
}
//StaticMethod Class
class StaticMethod
{
	int rollnumber;
	String name;
	static String university = "PDPU";
	//Static Method to change the value of static method
	static void change()
	{
		university = "Stanford";
	}
	//constructor to initialize the variable  
    StaticMethod(int rollno, String std_name)
    {  
    	rollnumber = rollno;  
    	name = std_name;  
    }
    //Non-Static Method to print
    public void display()
	{
		System.out.println("University : " +  university);
		System.out.println("Roll Number : " + rollnumber);
		System.out.println("Name : " + name + "\n");
	}
}
