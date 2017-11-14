

public class PigLatinConverter 
{

	private String[] words;
	
	public PigLatinConverter(String sentence)
	{
		this.words = sentence.split(" ");
	}
	
	public void setWord(String sentence)
	{
		this.words = sentence.split(" ");
	}
	
	public String[] getWord()
	{
		return words;
	}
	
	public String changeWord()
	{
		   String latinString = "";
		   
		   for (String word : words) 
		   {
               if (word.toLowerCase().startsWith("a") || word.toLowerCase().startsWith("e") || word.toLowerCase().startsWith("i") 
            		   || word.toLowerCase().startsWith("o") || word.toLowerCase().startsWith("u"))
               {
            	   latinString += (word + "way ");
               }
               else 
               {
            	   char[] letters = word.toCharArray();
            	   int position = 0;
            	   for(int i = 0; i<letters.length; i++)
            	   {
            		   if(letters[i]=='a'|| letters[i]=='e' || letters[i]=='i' 
            				   || letters[i]=='o' || letters[i]=='u')
            		   {
            			  position = i;
            			  break;
            		   }
            	   }
            	   latinString+=(word.substring(position)+word.substring(0,position)+"ay ");
               }
           }
		   
		   if(latinString!=" ")
		   {
			   return latinString;
		   }
		   else
           {
			   String error = "Could not be done";
			   return error;
           }
	}
}
