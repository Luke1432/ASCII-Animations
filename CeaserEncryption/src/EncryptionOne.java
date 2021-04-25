import java.util.Scanner;

/* 
 * Lukas Fenkam
 * ICS3U
 * 24 Septembre 2020
 * Projet Encryption
 * Ce programme prend un mot entre par l'utilisateur et le converti en utilisant le code cesar. 
 */
public class EncryptionOne {//créé une classe nommée EncryptionOne
	public static void main(String[] args) {//crée une méthode publique nommée main qui prend des 
		Scanner in = new Scanner(System.in);//crée un nouveau scanner nommé in
		System.out.println("Voulez-vous jouer?(1=oui, 0=non)");//demande à l'utilisateur s'il veut jouer
		int choice=in.nextInt();//prend le choix de l'utilisateur et l'enregistre dans une variable nommée choice
		do {
		in=new Scanner(System.in);
		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r','s', 't', 'u', 'v', 'w', 'x', 'y', 'z' };//crée un array de type char qui contient les lettres de l'alphabet
		System.out.println("Inserez le mot a convertir: ");//dit à l'utilisateur d'insérer le mot qu'il veut convertir
		String motAConvertir = in.nextLine();//associe la valeur entrée par l'utilisateur à la ligne précédente à la variable motAConvertir
		char[] motEnChar = motAConvertir.toCharArray();//convertit le mot entré par l'utilisateur en array char
		String motConverti = " ";//crée un String qui va contenir le mot converti
		System.out.println("Inserez le nombres de lettres par lequel vous voulez convertir votre mot(entre 0 et 25): ");//demande à l'utilisateur par combien de lettres il veut convertir le mot
		int nombreDeLettres = in.nextInt();//prend la valeur entrée par l'utilisateur à la ligne précédente et l'associe à la variabble nombreDeLettres
		do {//fais ce qui est dans cette boucle
			if (nombreDeLettres > 25) {
				System.out.println("Entrez un nombre entre 0 et 25");//demande à l'utilisateur d'entrer un nombre entre 0 et 25
				nombreDeLettres = in.nextInt();//prend la valeur entrée par l'utilisateur
			}
		} while (nombreDeLettres > 25);//pendant que le nombre de lettres est plus grand que 25
		if (nombreDeLettres > 25) {//si la valeur entrée par l'utilisateur est plus grande que 25
			nombreDeLettres = in.nextInt();//associe la valeur à une variable
		} else {//sinon
			if (motAConvertir.contains(" ")) {//si le mot contient des espaces
				motAConvertir.replace(" ", "");//enlève les espaces
			}
			for (int i = 0; i < motAConvertir.length(); i++) {//pendant que i est plus petit que la longueur du motAConvertir, fais l'action dans la boucle et ensuite incrémente i
				for (int j = 0; j < alphabet.length; j++) {//pendant que j est plus petit que la longueur du motAConvertir, fais l'action dans la boucle et ensuite incrémente j
					if ((motAConvertir.charAt(i)) == (alphabet[j])) {//si le charactère à la position i du mot à convertir est égal au charactère à la position j de l'alphabet
						if (nombreDeLettres < 25) {//si le nombre de lettres est plus petit ou égal à 25
							motConverti = motConverti + (alphabet[(j + (nombreDeLettres)) % 25]);//ajoute la lettre au mot final converti
						}
					}
				}
			}
			System.out.println("Le mot converti est: " + motConverti);//imprime le mot converti à l'utilisateur
		}
		System.out.println("Voulez-vous encore jouer?(1=oui, 0=non)");//demande à l'utilisateur s'il veut encore exécuter le programme
		choice=in.nextInt();//enregistre la réponse de l'utilisateur
		}while(choice!=0);//exécute la boucle for pendant que la variable choix n'est pas égale à 0
		if(choice==0) {//si la variable choix est égale à 0
			System.out.println("Merci d'avoir essayé");//imprime un message d'au revoir
			System.out.println("---------------------------------------------------------------------FIN------------------------------------------------------------------");
			System.exit(0);//quitte le programme
		}
	}
}
