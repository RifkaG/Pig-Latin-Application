
import java.util.Scanner;

public class UseConverter {
		
	public static void main(String[] args) 
	{
			Scanner input = new Scanner(System.in);

			System.out.println("Please enter the word/s you would like to convert to pig latin");
			String word = input.nextLine();
			
			PigLatinConverter pig = new PigLatinConverter(word);
			
			String newWord = pig.changeWord();
			System.out.println(newWord);
	}

}

