package testsBouclesFor;
/*
 * Lukas Fenkam
 * ICS3U
 * 13 octobre 2020
 * Ce programme imprime les valeurs d'un array avec une boucle for
 */
public class PremierTest {

	public static void main(String[] args) {
		int[] nombres= {3,6,9,123,31,655,1234};//cr�e un array qui contient les nombres � imprimer
		for(int val:nombres) {//pour chaque �l�ment dans nombres 
			//imprime la valeur
			System.out.print("Valeur = ");
			System.out.println(val);
		}
	}

}