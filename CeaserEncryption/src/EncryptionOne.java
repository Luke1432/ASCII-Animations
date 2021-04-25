import java.util.Scanner;

/* 
 * Lukas Fenkam
 * ICS3U
 * 24 Septembre 2020
 * Projet Encryption
 * Ce programme prend un mot entre par l'utilisateur et le converti en utilisant le code cesar. 
 */
public class EncryptionOne {//cr�� une classe nomm�e EncryptionOne
	public static void main(String[] args) {//cr�e une m�thode publique nomm�e main qui prend des 
		Scanner in = new Scanner(System.in);//cr�e un nouveau scanner nomm� in
		System.out.println("Voulez-vous jouer?(1=oui, 0=non)");//demande � l'utilisateur s'il veut jouer
		int choice=in.nextInt();//prend le choix de l'utilisateur et l'enregistre dans une variable nomm�e choice
		do {
		in=new Scanner(System.in);
		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r','s', 't', 'u', 'v', 'w', 'x', 'y', 'z' };//cr�e un array de type char qui contient les lettres de l'alphabet
		System.out.println("Inserez le mot a convertir: ");//dit � l'utilisateur d'ins�rer le mot qu'il veut convertir
		String motAConvertir = in.nextLine();//associe la valeur entr�e par l'utilisateur � la ligne pr�c�dente � la variable motAConvertir
		char[] motEnChar = motAConvertir.toCharArray();//convertit le mot entr� par l'utilisateur en array char
		String motConverti = " ";//cr�e un String qui va contenir le mot converti
		System.out.println("Inserez le nombres de lettres par lequel vous voulez convertir votre mot(entre 0 et 25): ");//demande � l'utilisateur par combien de lettres il veut convertir le mot
		int nombreDeLettres = in.nextInt();//prend la valeur entr�e par l'utilisateur � la ligne pr�c�dente et l'associe � la variabble nombreDeLettres
		do {//fais ce qui est dans cette boucle
			if (nombreDeLettres > 25) {
				System.out.println("Entrez un nombre entre 0 et 25");//demande � l'utilisateur d'entrer un nombre entre 0 et 25
				nombreDeLettres = in.nextInt();//prend la valeur entr�e par l'utilisateur
			}
		} while (nombreDeLettres > 25);//pendant que le nombre de lettres est plus grand que 25
		if (nombreDeLettres > 25) {//si la valeur entr�e par l'utilisateur est plus grande que 25
			nombreDeLettres = in.nextInt();//associe la valeur � une variable
		} else {//sinon
			if (motAConvertir.contains(" ")) {//si le mot contient des espaces
				motAConvertir.replace(" ", "");//enl�ve les espaces
			}
			for (int i = 0; i < motAConvertir.length(); i++) {//pendant que i est plus petit que la longueur du motAConvertir, fais l'action dans la boucle et ensuite incr�mente i
				for (int j = 0; j < alphabet.length; j++) {//pendant que j est plus petit que la longueur du motAConvertir, fais l'action dans la boucle et ensuite incr�mente j
					if ((motAConvertir.charAt(i)) == (alphabet[j])) {//si le charact�re � la position i du mot � convertir est �gal au charact�re � la position j de l'alphabet
						if (nombreDeLettres < 25) {//si le nombre de lettres est plus petit ou �gal � 25
							motConverti = motConverti + (alphabet[(j + (nombreDeLettres)) % 25]);//ajoute la lettre au mot final converti
						}
					}
				}
			}
			System.out.println("Le mot converti est: " + motConverti);//imprime le mot converti � l'utilisateur
		}
		System.out.println("Voulez-vous encore jouer?(1=oui, 0=non)");//demande � l'utilisateur s'il veut encore ex�cuter le programme
		choice=in.nextInt();//enregistre la r�ponse de l'utilisateur
		}while(choice!=0);//ex�cute la boucle for pendant que la variable choix n'est pas �gale � 0
		if(choice==0) {//si la variable choix est �gale � 0
			System.out.println("Merci d'avoir essay�");//imprime un message d'au revoir
			System.out.println("---------------------------------------------------------------------FIN------------------------------------------------------------------");
			System.exit(0);//quitte le programme
		}
	}
}
