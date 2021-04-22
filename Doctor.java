
public class Doctor 
{
	private String name; 	// the name of the doctor
	private String specialisation; 	// the specialisation of the doctor (it can be â€œdogâ€ or â€œcatâ€)

	// set a doctors name
	public void setName(String name)
	{
		this.name = name;
	}
	// return a doctors name
	public String getName()
	{
		
		return name;
	}
	// Method to set a doctor's specialisation
	public void setSpecial(String specialisation)
	{
	    this.specialisation = specialisation;
	}
	// Returning a doctors specialisation
	public String getSpecial()
	{
	    return specialisation;
	}
	public void removeDoc()
	{
		name = null;
		specialisation = null;
	}

}
