package ProjectEuler;
import java.util.Arrays;
import java.util.Scanner;



public class ExerciseFour {
	static String NUMBER_IS_PALINDROME="Numbers give a product that is a palindrome.";
	static String NUMBER_IS_NOT_PALINDROME="Numbers do not give a product that is a palindrome";
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first number");
		int numberEntered=in.nextInt();
		int[] palindromes= new int[100];
		String resultVariable = "";
		
		do {
			numberEntered=0;
			System.out.println("Number must be in between 100 and 999");
			
			System.out.println("Enter a new number");
			 numberEntered=in.nextInt();
			 
		}while(numberEntered<100 || numberEntered>999 );
		System.out.println("Enter second number");
		int secondNumberEntered=in.nextInt();
		do {
			secondNumberEntered=0;

			System.out.println("Number must be in between 100 and 999");
			
			System.out.println("Enter a new number");
			 secondNumberEntered=in.nextInt();
		}while(secondNumberEntered<100 || secondNumberEntered>999);
		int multiple=numberEntered*secondNumberEntered;
		char[] multipleCharacters=String.valueOf(multiple).toCharArray();
		char[] invertedCharacters= new char[multipleCharacters.length];
		for(int i=0; i<multipleCharacters.length; i++) {
			invertedCharacters[i]=multipleCharacters[multipleCharacters.length-(i+1)];
			if(multipleCharacters[i]==invertedCharacters[i]) {
				resultVariable=(NUMBER_IS_PALINDROME);
				palindromes[i]=multiple;
			}else {
				resultVariable=(NUMBER_IS_NOT_PALINDROME);
			}
		}
		Arrays.sort(palindromes);
		int largestPalindrome=palindromes[palindromes.length-1];
		System.out.println(resultVariable);
		System.out.println(multipleCharacters);
		System.out.println(invertedCharacters);
		System.out.println("Largest palindrome product of three-digit numbers is "+largestPalindrome);

	}
}
