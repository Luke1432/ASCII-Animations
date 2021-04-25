package ProjectEuler;
/*
 * Lukas Fenkam
 * 29 octobre 2020
 * Project Euler 5
 * Ce programme détermine le plus petit nombre qui est divisible par tous les nombres de 1 à 20
 * Test #1: Plus petit multiple commun de tous les nombres de 1 à 10
 * Résultat attendu: 2520
 * Résultat obtenu: 2520
 * 
 * Test #2: Plus petit multiple commun de tous les nombres de 1 à 20
 * Résultat obtenu: 232792560
 */
public class ExerciseFive {

	public static void main(String[] args) {
		boolean numberDivisible=false;//cette variable contient le résultat, donc si le nombre est divisible ou pas
		int number=0;//cette variable contient le nombre à vérifier
		do {//fais ce qui est dans cette boucle
		number++;//incrémente le nombre
		 numberDivisible=verifyDivisibility(number);//applique la méthode verifyDvisibility
		 
		}while(!numberDivisible);//pendant que numberDivisible est faux, donc pendant que le nombre n'est pas divisible par les nombres de 1 à 20
		System.out.println(number);//imprime le nombre trouvé à la console
	}
	/*
	 * Cette méthode prend le nombre comme argument et vérifie s'il est divisible par tous les nombres de 1 à 20
	 */
	public static boolean verifyDivisibility(int number) {
		for(int i=1; i<=20; i++) {//pour chaque valeur de i de 1 à 20
			if(!(number%i==0)) {//si le nombre n'est divisible par i
				return false; //retourne la valeur "false" à la méthode main
			}
		}
		return true;//retourne la valeur "true" à la méthode main
	}
}
