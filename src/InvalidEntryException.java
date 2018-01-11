
public class InvalidEntryException extends Exception
{
	public InvalidEntryException()
	{
		super("Invalid Entry Exception");
	}
	
	public InvalidEntryException(String string)
	{
		super(string);
	}
}
