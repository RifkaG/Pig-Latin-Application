import static org.junit.Assert.*;
import org.junit.*;

public class PigLatinConverter_TEST {

	PigLatinConverter test;
	ReverseConverter rTest;

	//Test regular Conversion
	@Test
	public void TestSplittingString() {

		test = new PigLatinConverter("this is a word");

		String[] expectedArray = { "this", "is", "a", "word" };

		String[] resultArray = test.getWord();

		assertArrayEquals(expectedArray, resultArray);

	}

	@Test
	public void ConvertingFromEnglishToPigLatinWord() {
		test = new PigLatinConverter("purse");
		assertEquals("ursepay ", test.changeWord());
	}

	@Test
	public void ConvertingFromEnglishToPigLatinVowelInFront() {
		test = new PigLatinConverter("umbrella");
		assertEquals("umbrellaway ", test.changeWord());
	}
	
	@Test
	public void ConvertingFromEnglishToPigLatinWithQU() {
		test = new PigLatinConverter("quiz");
		assertEquals("izquay ", test.changeWord());
	}
	
	@Test
	public void ConvertingFromEnglishToPigLatinWithCapitalLetter() {
		test = new PigLatinConverter("Slippers");
		assertEquals("ippersSlay ", test.changeWord());
	}
	@Test
	public void ConvertingFromEnglishToPigLatinWithY() {
		test = new PigLatinConverter("yellow");
		assertEquals("ellowyay ", test.changeWord());
	}
	@Test
	public void ConvertingFromEnglishToPigLatinWithVowelAtTheEnd() {
		test = new PigLatinConverter("style");
		assertEquals("estylay ", test.changeWord());
	}
	
	
	@Test
	public void ConvertingFromEnglishToPigLatinSentance() {
		test = new PigLatinConverter("Testing the application");
		assertEquals("estingTay ethay applicationway ", test.changeWord());
	}
	
	//Test Reverse Conversion
	@Test
	public void TestSplittingStringReverse() {

		rTest = new ReverseConverter("this is a word");

		String[] expectedArray = { "this", "is", "a", "word" };

		String[] resultArray = rTest.getWord();

		assertArrayEquals(expectedArray, resultArray);

	}
	
	@Test 
	public void TestMoveFirstMethod()
	{
		rTest = new ReverseConverter("ootsbay");
		assertEquals("boots ", rTest.moveFirst("ootsb"));
		
	}
	
	@Test
	public void ConvertingFromPigLatinToEnglishWord() throws InvalidEntryException {
		rTest = new ReverseConverter("eaterhay");
		assertEquals("heater ", rTest.revertWords());
	}
	
	@Test
	public void ConvertingFromPigLatinToEnglishSentance() throws InvalidEntryException {
		rTest = new ReverseConverter("omecay otay ymay ousehay ");
		assertEquals("come to my house ", rTest.revertWords());
	}
	
	@Test(expected = InvalidEntryException.class) 
	public void CheckForWordWithoutAy() throws InvalidEntryException
	{
		rTest = new ReverseConverter("machine");
		assertEquals("machine ", rTest.revertWords());
	}
	
	@Test(expected = InvalidEntryException.class) 
	public void CheckForWordWithIncorrectAy() throws InvalidEntryException
	{
		rTest = new ReverseConverter("brayush");
		assertEquals("machine ", rTest.revertWords());
	}

	public void CheckForReverseConversionWithVowel() throws InvalidEntryException
	{
		rTest = new ReverseConverter("appleway");
		assertEquals("apple ", rTest.revertWords());
	}
	
	@Test 
	public void TestRandomWord()
	{
		GenerateRandomWord word = new GenerateRandomWord();
		word.setRandomWord("house");
		assertEquals("house", word.getRandomWord());
	}
	
	
}
