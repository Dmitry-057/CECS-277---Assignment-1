
public class Radio 
{
	private String radioName;
	public Radio()
	{
		radioName = "Original";
	}
	public Radio(String name)
	{
		radioName = name;
	}
	public Radio(Radio r)
	{
		radioName = r.radioName;
	}

}
