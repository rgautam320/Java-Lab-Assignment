public class assignment_10 
{
	public static void main(String[] args) 
	{
		SBI sbi = new SBI();
		HDFC hdfc = new HDFC();
		ICICI icici = new ICICI();
		System.out.println("Interest rate of SBI : " + sbi.getInterest() + "%");
		System.out.println("Interest rate of HDFC : " + hdfc.getInterest() + "%");
		System.out.println("Interest rate of ICICI : " + icici.getInterest() + "%");
	}
}
class Bank
{
	//getInterest method's defined here first
	int getInterest()
	{
		return 0;
	}
}
class SBI extends Bank
{
	//getInterest has been overridden here
	int getInterest()
	{
		return 6;
	}
}
class HDFC extends Bank
{
	//getInterest has been overridden here
	int getInterest()
	{
		return 8;
	}
}
class ICICI extends Bank 
{
	//getInterest has been overridden here
	int getInterest()
	{
		return 7;
	}
}
