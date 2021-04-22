
public class Pet 
{
	private String type; 	// the type of the pet. It can be only â€œcatâ€ or â€œdogâ€.
	private String size; 	// the size of the pet. It can be only â€œsmallâ€, â€œmediumâ€ or â€œlargeâ€.
	private String name; 	// the name of the pet. 
	private double weight; 	//the weight of the pet.
	private int age; 		//the age of the pet.
	private String doctor;  // the doctor of the pet.
	
	// add comments
	public void setType(String type)
	{
		this.type = type;
	}
	// add comments
	public String getType()
	{
		return type;
	}
	// complete all other methods from here.
	public void setSize(String size)
	{
		this.size = size;
	}
	public String getSize()
	{
		return size;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setDoctor(String doctor)
	{
		this.doctor = doctor;
	}
	public String getDoctor()
	{
		return doctor;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	public double getWeight()
	{
		return weight;
	}
}
