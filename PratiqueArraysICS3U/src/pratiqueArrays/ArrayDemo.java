package pratiqueArrays;
import java.util.Scanner;//importe le Scanner qui permet à l'utilisateur d'entrer une valeur
import java.util.ArrayList;
import java.util.Arrays;
/*
 * Lukas Fenkam
 * 22 Septembre 2020
 * ICS3U
 * ArrayDemo
 * Ce programme demande à l'utilisateur d'entrer un mot/une phrase/une lettre. L'inverse de ce nombre/cette phrase/cette lettre sera imprime
 */
public class ArrayDemo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);//initialise un Scanner de nom in
		ArrayList inverseDuNom=new ArrayList<String>();
		
		//change la valeur du chiffre à la position 2 dans le Array de 0 au chiffre que l'utilisateur entre. 
		System.out.print("Inserez un nom à convertir: ");
		String nomDeLaPersonne=in.nextLine();
		String[] lettresDuNomDeLaPersonne=nomDeLaPersonne.split( "");
		//ajoute toutes les lettres du mot entre a un arraylist
		for(int i=lettresDuNomDeLaPersonne.length-1; i>=0; i--) {
			inverseDuNom.add(String.valueOf((lettresDuNomDeLaPersonne[i]).replaceAll("[\\[\\]]", "")));
			
		}
		//convertit le arraylist en string
		String inverseDuNom2=inverseDuNom.toString();
		
		//imprime l'inverse du mot/de la phrase/du nom
		for(int i=0; i<inverseDuNom.size();i++) {
			System.out.print(inverseDuNom.get(i));
		}
	}
}
