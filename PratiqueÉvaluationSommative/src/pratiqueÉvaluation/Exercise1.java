package pratique�valuation;
/*
 * Lukas Fenkam 
 * 08 Mars 2021
 * Conversion D�cimal --> Binaire
 * Ce programme convertit le nombre d�cimal entr� par l'utilisateur en nombre binaire
 */
import java.util.ArrayList;//importe la fonctionnalit� ArrayList
import java.util.Scanner;//importe le Scanner

public class Exercise1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);//cr�e un nouveau Scanner nomm� in
		int decimalNumber=in.nextInt();//demande � l'utilisateur d'entrer un nombre d�cimal, met cette valeur dans la variable decimalNumber
		ArrayList binaryNumber=new ArrayList<Integer>();//cr�e une nouvelle liste qui contient les caract�res dans le nombre binaire converti
		
		
		while(decimalNumber!=0) {//pendant que le nombre d�cimal n'est pas �gal � 0
			binaryNumber.add(decimalNumber%2);//ajoute le reste de la division du nombre d�cimal par 2 � la liste qui contient les caract�res dans le nombre binaire
			decimalNumber=decimalNumber/2;//divise le nombre d�cimal par 2
		}
		
		//imprime le nombre binaire
		for(int j=binaryNumber.size()-1; j>=0; j--) {
			System.out.print(binaryNumber.get(j));
		}
	}

}
