package �valuationSommativeICS4U;

/*
 * Lukas Fenkam
 * 1 Avril 2021
 * �valuation Sommative 2: Partie C
 * Ce programme d�termine toues les multiples de 7 qui se trouvent entre 1 et 100
 */
public class PartieC2 {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {//pour chaque valeur de i de 1 jusqu'� 100, fais ce qui est dans la boucle, et incr�mente i � la fin
			if(i%7==0) {//si i est divisible par 7
				System.out.println(i); //affiche le nombre � l'�cran
			}
		}
	}

}
