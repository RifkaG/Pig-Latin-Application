
import java.util.Random;
import javax.swing.JOptionPane;

public class UseConverter {
		
	public static void main(String[] args) 
	{
		
		JOptionPane.showMessageDialog(null, "Welcome to your Pig Latin Converter!"
				+ "\nClick OK to get started.");
		int choice=0;
		
		do {
		try {
		choice = menu();
		switch(choice)
		{
			case 1:
			{
				String word = JOptionPane.showInputDialog("Please enter the word/s you would like to convert to pig latin");
				PigLatinConverter pig = new PigLatinConverter(word);

				String newWord = pig.changeWord();
				JOptionPane.showMessageDialog(null, "\"" + word + "\"" + " in Pig Latin:\n " + newWord);
				break;
			}
			case 2:
			{
				String word = JOptionPane.showInputDialog("Please enter the word/s in pig latin you would like to convert to english");
				
				try {
				ReverseConverter reverse = new ReverseConverter(word);
				JOptionPane.showMessageDialog(null, "\"" + word + "\" in English:\n" + reverse.revertWords());
				}
				catch(InvalidEntryException e)
				{
					JOptionPane.showMessageDialog(null, e);
				}
				break;
			}
			case 3:
			{
				JOptionPane.showMessageDialog(null, "Rules for game: "
						+ "\n1. read English word given"
						+ "\n2. move all the consonant letters until the first vowel in the word to the end of the word"
						+ "\n3. add 'ay' to the end of the new word"
						+ "\n4. enter answer.");
			
				double score = 0;
				int rounds = 10;
				for(int i = 0; i < rounds; i++)
				{
					String word;
					GenerateRandomWord generator = new 	GenerateRandomWord();
					word = generator.getRandomWord();
					
					
					PigLatinConverter pig = new PigLatinConverter(word);
						
					int tries = 3;
					
					for(int j = 0; j<tries; j++)
					{
						
						String input = JOptionPane.showInputDialog("Round " + (i+1) + ", try " + (j+1) +":\nConvert \"" + word + "\" to Pig Latin" );
						String w = input.toLowerCase() + " ";
						String newword = pig.changeWord();
						
						if(w.equals(newword))
						{
							if(j==0)
							{
								score+=1;
							}
							else if(j==1)
							{
								score+=.75;
							}
							else
							{
								score+=.50;
							}
							JOptionPane.showMessageDialog(null, "\nCorrect. Congratulations! You just wrote a word in Pig Latin!\nCurrent score: " + score);
							break;
						}
						else
						{
							if(j==2)
							{
								JOptionPane.showMessageDialog(null, "\nWrong conversion :(  Try again next time!"
									+ "\nCorrect conversion is \"" + newword + "\"");
							}
							else
							{
								JOptionPane.showMessageDialog(null,  "\nWrong conversion. Try again.");
							}
						}
					}
				}
				if(score<4)
				{
					JOptionPane.showMessageDialog(null, "Game Over. Your total score is " + score + ".\nKeep Practicing Pig Latin!");
				}
				else if(score>=4 && score<8)
				{
					JOptionPane.showMessageDialog(null, "Game Over. Your total score is " + score + ".\nGood Job! Practice Pig Latin some more.");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Game Over. Your total score is " + score + ".\nGreat Job!! You are a Pig Latin expert :)");
				}
				break;
			}
			case 4:
			{
				JOptionPane.showMessageDialog(null,"Thanks for playing!");
				System.exit(0);
			}
		}
		} 
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null, "Please enter a number.");
		}
		catch(NullPointerException f)
		{
			JOptionPane.showMessageDialog(null, "Please choose an option from the menu.");
		}
		
	}while(choice!=4);
	}
	public static int menu()
	{
		int choice;
		do {
		String input = JOptionPane.showInputDialog("Menu\n1. Convert English word/s to Pig Latin"
				+ "\n2. Convert Pig Latin word/s to English"
				+ "\n3. Try it yourself"
				+ "\n4. Exit"
				+ "\nPlease enter your menu choice: ");
		choice = Integer.parseInt(input);
		}while(choice!=1 && choice!=2 && choice!=3 && choice!=4);
		return choice;
	}
	

	}
