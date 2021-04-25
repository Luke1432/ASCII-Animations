package HangmanPackage;

import java.util.Scanner; //importation de Scanner

public class Hangman {
    
    //Variables globales:
    
    //Array de String de taille 6, avec les mots
	private static String[] words = {"chocolat", "avocat", "pomme", "riviere", "automobile", "montagne" };
	
	//Prendre un mot de ton Array de String ( words)
	private static String word = words[(int) (Math.random() * words.length)]; 
	
	//un String d'astérix ***-->*o* 
	private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
	private static int count = 0;

	public static void main(String[] args) {
	    
	    //déclaration du Scanner
		Scanner sc = new Scanner(System.in);

        //vérifie si nbs de devinette est moins que 7
        //vérifie si string d'astérix a tjrs des *
		while (count < 7 && asterisk.contains("*")) {
			System.out.println("Guess any letter in the word");
			System.out.println(asterisk);
			String guess = sc.next();
			hang(guess); // Va a la méthode hang
		}
		sc.close();
	}
//méthode qui vérifie et dit a l'utilisateur si il/elle a entré une bonne lettre
	public static void hang(String guess) {
		String newasterisk = "";//va contenir les lettres correctes et les asterixs
		for (int i = 0; i < word.length(); i++) {//pour chaque lettre dans le mot
			if (word.charAt(i) == guess.charAt(0)) {//si la lettre à la position i du mot est égale à la lettre devinée
				newasterisk += guess.charAt(0);//ajoute la lettre au String asterix
			} else if (asterisk.charAt(i) != '*') {//si la lettre à la position i n'est pas un asterix
				newasterisk += word.charAt(i);//ajoute un asterix
			} else {
				newasterisk += "*";//ajoute un asterix
			}
		}
		//ajoute un élément à l'image de hangman
		if (asterisk.equals(newasterisk)) {//si le mot est le même
			count++;//ajoute un a count	
			hangmanImage();//appelle la methode hangmanImage
		} else {
			asterisk = newasterisk;
		}
		//si le mot est deviné correctement
		if (asterisk.equals(word)) {
			System.out.println("Correct! You win! The word was " + word);
		}
	}

	public static void hangmanImage() {
		//si la lettre devinée est fausse, imprimer la base
		if (count == 1) {
			System.out.println("Wrong guess, try again");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("___|___");
			System.out.println();
		}
		//Si la lettre devinée est fausse, imprimez le poteau
		if (count == 2) {
			System.out.println("Wrong guess, try again");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		//Si la lettre devinée est fausse, imprimez la barre
		if (count == 3) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
		}
		//Si la lettre devinée est fausse, imprimez une tete
		if (count == 4) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		//Si la lettre devinée est fausse, imprimez un cou
		if (count == 5) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		//Si la lettre devinée est fausse, imprimez des pieds
		if (count == 6) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
		}
		//Cela ne sera imprimé que lors de leur dernière tentative
		if (count == 7) {
			System.out.println("GAME OVER!");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			System.out.println("GAME OVER! The word was " + word);
		}
	}
}