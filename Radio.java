//Dmitry Merezhko	ID: 025-947-712
//Charyl Enriquez   ID: 015392154
//Britney Khuu		ID: 018577765
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

	@Override
	public String toString()
	{
		return "Radio: " + radioName;
	}
}
