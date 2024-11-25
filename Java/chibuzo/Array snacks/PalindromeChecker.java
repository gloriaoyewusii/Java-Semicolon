public class PalindromeChecker{
	public static void main(String[] gloria){
		String potentialPalindrome = "Hello";
		checkPalindromeIn(potentialPalindrome);

	}
	
	public static String[] checkPalindromeIn(String[] word){
		String wordBank = "";
		for (char character = 'A'; character < word.length; character++){
			if (word[character] == word[word.length]-character-1)
				wordBank += character;
		System.out.print(word+" is a palindrome");
		}
		return wordBank;
	}
	




}