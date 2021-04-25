package �valuationSommativeICS4U;//d�clare le package
import java.util.Scanner;//importe le Scanner
/*
 * Lukas Fenkam
 * ICS4U
 * 03 Mars 2021
 * �valuation Sommative: Partie C
 * Ce programme prend l'entr�e de la longueur, la largeur, et la hauteur d'un solide de l'utilisateur, et d�termine s'il sagit d'un cube, d'un prisme � base carr�e ou d'un prisme � base rectangulaire. Il d�termine ensuite le volume de ce solide. 
 */
public class PartieC {

	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);//cr�e un nouveau Scanner nomm� in
		int longueur=in.nextInt();//prend l'entr�e de l'utilisateur pour la premi�re fois, le met dans la variable longueur
		int largeur=in.nextInt();//prend l'entr�e de l'utilisateur pour la deuxi�me fois, le met dans la variable largeur
		int hauteur=in.nextInt();//prend l'entr�e de l'utilisateur pour la troisi�me fois, le met dans la variable hauteur
		
		if(longueur==largeur && longueur==hauteur) {//si la longueur est �gale � la largeur
				System.out.println("Cube");//affiche � la console que le solide est un cube
				

		}else if(longueur==largeur && longueur !=hauteur){//sinon (si la longueur est �gale � la largeur mais n'est pas �gale � la hauteur
			System.out.println("Prisme � base carr�e");//affiche � la console que c'est un prisme � base carr�e
		}else {//sinon
			System.out.println("Prisme � base rectangulaire");//affiche � la console que c'est un prisme � base rectangulaire
		}
		int volume=longueur*largeur*hauteur;//calcule le volume du prisme/cube
		System.out.println("Volume = "+volume+" cm^3");//affiche le volume � l'�cran
		
		in.close();//ferme le Scanner
	}

} 
