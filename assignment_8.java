public class assignment_8 {

	public static void main(String[] args) 
	{
		Class_Pieces pieces = new Class_Pieces();
		System.out.println("Characteristics of Pieces :\n");
		pieces.characters1();
		pieces.characters2();
		pieces.characters3();   
		pieces.characters4();
		System.out.println("----------------------------\n\n");
		
		Class_Amphibia amphibia = new Class_Amphibia();
		System.out.println("Characteristics of Amphibia :\n");
		amphibia.characters1();
		amphibia.characters2();
		amphibia.characters3();
		amphibia.characters4();
		System.out.println("----------------------------\n\n");
		
		Class_reptiles reptiles = new Class_reptiles();
		System.out.println("Characteristics of Reptiles :\n");
		reptiles.characters1();
		reptiles.characters2();
		reptiles.characters3();
		reptiles.characters4();
		System.out.println("----------------------------\n\n");
		
		Class_Alves alves = new Class_Alves();
		System.out.println("Characteristics of Alves :\n");
		alves.characters1();
		alves.characters2();
		alves.characters3();   
		alves.characters4();
		System.out.println("----------------------------\n\n");
		
		Class_Mammalia mammal = new Class_Mammalia();
		System.out.println("Characteristics of Mammals :\n");
		mammal.characters1();
		mammal.characters2();
		mammal.characters3();
		mammal.characters4();
		System.out.println("----------------------------\n\n");	
	}
}
//Super Class Animal
class Kingdom_Animalia
{
	static void characters1()
	{
		System.out.println("- Animals are multicellular.");
	}
}
//Single Inheritance
class Phylum_Chordata extends Kingdom_Animalia
{
	static void characters2()
	{
		System.out.println("- They hold a post-anal tail.");
	}
}
//Multilevel Inheritance
class SubPhylum_Vertebrate extends Phylum_Chordata
{
	static void characters3()
	{
		System.out.println("- Vertebrates are the only chordates to possess a brain.");
	}
}
//Multilevel Inheritance
class Class_Mammalia extends SubPhylum_Vertebrate
{
	static void characters4()
	{
		System.out.println("- Skin is covered by hairs.\n");
	}
}
//Hierarchical Inheritance
class Class_Pieces extends SubPhylum_Vertebrate
{
	static void characters4()
	{
		System.out.println("- They live in water.\n");
	}
}
//Hierarchical Inheritance
class Class_Amphibia extends SubPhylum_Vertebrate
{
	static void characters4()
	{
		System.out.println("- They live in both water and land.\n");
	}
}
//Hierarchical Inheritance
class Class_reptiles extends SubPhylum_Vertebrate
{
	static void characters4()
	{
		System.out.println("- They are cold-blooded animals.\n");
	}
}
//Hierarchical Inheritance
class Class_Alves extends SubPhylum_Vertebrate
{
	static void characters4()
	{
		System.out.println("- They have feathers to fly.\n");
	}
}