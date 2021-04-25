package HangmanPackage;

import java.util.Scanner; //importation de Scanner

public class Hangman {
    
    //Variables globales:
    
    //Array de String de taille 6, avec les mots
	private static String[] words = {"chocolat", "avocat", "pomme", "riviere", "automobile", "montagne" };
	
	//Prendre un mot de ton Array de String ( words)
	private static String word = words[(int) (Math.random() * words.length)]; 
	
	//un String d'ast�rix ***-->*o* 
	private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
	private static int count = 0;

	public static void main(String[] args) {
	    
	    //d�claration du Scanner
		Scanner sc = new Scanner(System.in);

        //v�rifie si nbs de devinette est moins que 7
        //v�rifie si string d'ast�rix a tjrs des *
		while (count < 7 && asterisk.contains("*")) {
			System.out.println("Guess any letter in the word");
			System.out.println(asterisk);
			String guess = sc.next();
			hang(guess); // Va a la m�thode hang
		}
		sc.close();
	}
//m�thode qui v�rifie et dit a l'utilisateur si il/elle a entr� une bonne lettre
	public static void hang(String guess) {
		String newasterisk = "";//va contenir les lettres correctes et les asterixs
		for (int i = 0; i < word.length(); i++) {//pour chaque lettre dans le mot
			if (word.charAt(i) == guess.charAt(0)) {//si la lettre � la position i du mot est �gale � la lettre devin�e
				newasterisk += guess.charAt(0);//ajoute la lettre au String asterix
			} else if (asterisk.charAt(i) != '*') {//si la lettre � la position i n'est pas un asterix
				newasterisk += word.charAt(i);//ajoute un asterix
			} else {
				newasterisk += "*";//ajoute un asterix
			}
		}
		//ajoute un �l�ment � l'image de hangman
		if (asterisk.equals(newasterisk)) {//si le mot est le m�me
			count++;//ajoute un a count	
			hangmanImage();//appelle la methode hangmanImage
		} else {
			asterisk = newasterisk;
		}
		//si le mot est devin� correctement
		if (asterisk.equals(word)) {
			System.out.println("Correct! You win! The word was " + word);
		}
	}

	public static void hangmanImage() {
		//si la lettre devin�e est fausse, imprimer la base
		if (count == 1) {
			System.out.println("Wrong guess, try again");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("___|___");
			System.out.println();
		}
		//Si la lettre devin�e est fausse, imprimez le poteau
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
		//Si la lettre devin�e est fausse, imprimez la barre
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
		//Si la lettre devin�e est fausse, imprimez une tete
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
		//Si la lettre devin�e est fausse, imprimez un cou
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
		//Si la lettre devin�e est fausse, imprimez des pieds
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
		//Cela ne sera imprim� que lors de leur derni�re tentative
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