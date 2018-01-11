
public class ReverseConverter {
	
	private String[] words;
	
	public ReverseConverter(String sentence)
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
	
	public String revertWords() throws InvalidEntryException	
	{
		
		String englishString = "";
		   
		   for (int i = 0; i< words.length; i++) 
		   {
			   
	           if (words[i].toLowerCase().endsWith("ay"))
	           { //get rid of 'ay' at end of each word
	                englishString = englishString + (words[i].substring(0, (words[i].length() - 2)) + " ");
	           }
	           else 
	           { //if no 'ay', throw exception
	            	throw new InvalidEntryException("Word " + words[i] + 
	            			" is missing 'ay' at the end.");
	           }
		   }//end loop
           String newString = moveFirst(englishString); //call moveFirst method to finish up job
           return newString;
	}//end method
         	 
	public String moveFirst(String englishString)
	{
		
		String newString = "";
		String[] words2;
		words2 = englishString.split(" ");
		
		for (int i = 0; i< words2.length; i++) 
		{
			char last = words2[i].charAt(words2[i].length()-1);
			words2[i] = last + words2[i];
			words2[i] = words2[i].substring(0, words2[i].length()-1);
			newString = newString + words2[i] + " ";
		}
		return (newString);
	}
	
}



