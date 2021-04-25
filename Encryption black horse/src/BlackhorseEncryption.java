import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
 * Prend le nombre entré par l'utilisateur
 * Divise le nombre en chiffres
 * Trouve chaque chiffre dans un "array" de chiffres
 * trouve la valeur de la position du chiffre
 * trouve la lettre dans la même position que ce chiffre dans le "array" de lettres
 * place la lettre dans un nouveau array qui va contenir les lettres du mot
 * imprime le mot
 * 
 */

public class BlackhorseEncryption {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Insert a number: ");
		String numberEntered=in.nextLine();
		System.out.println("Number entered: "+numberEntered);
		char[] numberEnteredArray=numberEntered.toCharArray();
		String blackHorse="BLACKHORSE";
		char[] blackHorseLetterArray=blackHorse.toCharArray();
		int[] numbersToCompareWith= {0,1,2,3,4,5,6,7,8,9};
		String word="";
		for(int i=0; i<String.valueOf(numberEnteredArray).length(); i++) {
			for(int j=0; j<String.valueOf(numbersToCompareWith).length();j++) {
				if(String.valueOf(numberEnteredArray[i]).equals(String.valueOf(j))) {
					
					char letterInPosition=blackHorseLetterArray[numbersToCompareWith[j]];
					word=word.concat(String.valueOf(letterInPosition));
				}
				
			}
		}		
		System.out.println("The word is: "+word);
	}
}
