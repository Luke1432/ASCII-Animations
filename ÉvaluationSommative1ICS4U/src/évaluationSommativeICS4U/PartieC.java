package évaluationSommativeICS4U;//déclare le package
import java.util.Scanner;//importe le Scanner
/*
 * Lukas Fenkam
 * ICS4U
 * 03 Mars 2021
 * Évaluation Sommative: Partie C
 * Ce programme prend l'entrée de la longueur, la largeur, et la hauteur d'un solide de l'utilisateur, et détermine s'il sagit d'un cube, d'un prisme à base carrée ou d'un prisme à base rectangulaire. Il détermine ensuite le volume de ce solide. 
 */
public class PartieC {

	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);//crée un nouveau Scanner nommé in
		int longueur=in.nextInt();//prend l'entrée de l'utilisateur pour la première fois, le met dans la variable longueur
		int largeur=in.nextInt();//prend l'entrée de l'utilisateur pour la deuxième fois, le met dans la variable largeur
		int hauteur=in.nextInt();//prend l'entrée de l'utilisateur pour la troisième fois, le met dans la variable hauteur
		
		if(longueur==largeur && longueur==hauteur) {//si la longueur est égale à la largeur
				System.out.println("Cube");//affiche à la console que le solide est un cube
				

		}else if(longueur==largeur && longueur !=hauteur){//sinon (si la longueur est égale à la largeur mais n'est pas égale à la hauteur
			System.out.println("Prisme à base carrée");//affiche à la console que c'est un prisme à base carrée
		}else {//sinon
			System.out.println("Prisme à base rectangulaire");//affiche à la console que c'est un prisme à base rectangulaire
		}
		int volume=longueur*largeur*hauteur;//calcule le volume du prisme/cube
		System.out.println("Volume = "+volume+" cm^3");//affiche le volume à l'écran
		
		in.close();//ferme le Scanner
	}

} 
