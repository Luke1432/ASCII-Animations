package pratiqueÉvaluation;
/*
 * Lukas Fenkam 
 * 08 Mars 2021
 * Conversion Décimal --> Binaire
 * Ce programme convertit le nombre décimal entré par l'utilisateur en nombre binaire
 */
import java.util.ArrayList;//importe la fonctionnalité ArrayList
import java.util.Scanner;//importe le Scanner

public class Exercise1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);//crée un nouveau Scanner nommé in
		int decimalNumber=in.nextInt();//demande à l'utilisateur d'entrer un nombre décimal, met cette valeur dans la variable decimalNumber
		ArrayList binaryNumber=new ArrayList<Integer>();//crée une nouvelle liste qui contient les caractères dans le nombre binaire converti
		
		
		while(decimalNumber!=0) {//pendant que le nombre décimal n'est pas égal à 0
			binaryNumber.add(decimalNumber%2);//ajoute le reste de la division du nombre décimal par 2 à la liste qui contient les caractères dans le nombre binaire
			decimalNumber=decimalNumber/2;//divise le nombre décimal par 2
		}
		
		//imprime le nombre binaire
		for(int j=binaryNumber.size()-1; j>=0; j--) {
			System.out.print(binaryNumber.get(j));
		}
	}

}
