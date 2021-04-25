package ProjectEuler;
/*
 * Lukas Fenkam
 * 29 octobre 2020
 * Project Euler 5
 * Ce programme d�termine le plus petit nombre qui est divisible par tous les nombres de 1 � 20
 * Test #1: Plus petit multiple commun de tous les nombres de 1 � 10
 * R�sultat attendu: 2520
 * R�sultat obtenu: 2520
 * 
 * Test #2: Plus petit multiple commun de tous les nombres de 1 � 20
 * R�sultat obtenu: 232792560
 */
public class ExerciseFive {

	public static void main(String[] args) {
		boolean numberDivisible=false;//cette variable contient le r�sultat, donc si le nombre est divisible ou pas
		int number=0;//cette variable contient le nombre � v�rifier
		do {//fais ce qui est dans cette boucle
		number++;//incr�mente le nombre
		 numberDivisible=verifyDivisibility(number);//applique la m�thode verifyDvisibility
		 
		}while(!numberDivisible);//pendant que numberDivisible est faux, donc pendant que le nombre n'est pas divisible par les nombres de 1 � 20
		System.out.println(number);//imprime le nombre trouv� � la console
	}
	/*
	 * Cette m�thode prend le nombre comme argument et v�rifie s'il est divisible par tous les nombres de 1 � 20
	 */
	public static boolean verifyDivisibility(int number) {
		for(int i=1; i<=20; i++) {//pour chaque valeur de i de 1 � 20
			if(!(number%i==0)) {//si le nombre n'est divisible par i
				return false; //retourne la valeur "false" � la m�thode main
			}
		}
		return true;//retourne la valeur "true" � la m�thode main
	}
}
