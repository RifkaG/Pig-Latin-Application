import java.util.Random;

public class GenerateRandomWord {

	String randomWord;
	
	public GenerateRandomWord() {
		this.randomWord = setRandomWord();
	}



	public String getRandomWord() {
		return randomWord;
	}



	public void setRandomWord(String randomWord) {
		this.randomWord = randomWord;
	}



	public String setRandomWord()
	{
		Random rand = new Random();
		int num = rand.nextInt(20)+1;
		
		switch(num)
		{
		case 1:
			randomWord = "street";
			break;
		case 2:
			randomWord = "dog";
			break;
		case 3:
			randomWord = "shoe";
			break;
		case 4:
			randomWord = "friend";
			break;
		case 5:
			randomWord = "zebra";
			break;
		case 6:
			randomWord = "kitchen";
			break;
		case 7:
			randomWord = "monkey";
			break;
		case 8:
			randomWord = "taxi";
			break;
		case 9:
			randomWord = "glue";
			break;
		case 10:
			randomWord = "juice";
			break;
		case 11:
			randomWord = "factory";
			break;
		case 12:
			randomWord = "candy";
			break;
		case 13:
			randomWord = "cupcake";
			break;
		case 14:
			randomWord = "triangle";
			break;
		case 15:
			randomWord = "yellow";
			break;
		case 16:
			randomWord = "green";
			break;
		case 17:
			randomWord = "daffodil";
			break;
		case 18:
			randomWord = "pillow";
			break;
		case 19:
			randomWord = "arm";
			break;
		case 20:
			randomWord = "closet";
			break;
		}
		
		return randomWord;
	}
}
