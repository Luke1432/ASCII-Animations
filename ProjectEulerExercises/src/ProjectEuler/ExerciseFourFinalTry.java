package ProjectEuler;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
/*
 * Lukas Fenkam
 * 19 Octobre 2020
 * V�rification de palindromes
 * Ce programme determine le plus grand multiple de nombres � trois chiffres qui est un palindrome
 */
public class ExerciseFourFinalTry {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int min=100;//valeur � trois chiffres minimale
		int max=999;//valeur � trois chiffres maximale
		int minimum=min*min;//multiple de nombres � trois chiffres minimal
		int maximum=max*max;//multiple de nombres � trois chiffres maximal
		ArrayList<Integer> palindromes=findsPalindromes(minimum, maximum);//applique la m�thode findsPalindromes, trouve tous les palindromes entre le chiffre minimal et le chiffre maximal
		ArrayList<Integer> palindromeMultiples=new ArrayList<Integer>();//cr�e un nouveau arraylist qui va contenir tous les palindromes qui sont des multiples de nombres � trois chiffres
		for(int i=0; i<palindromes.size();i++) {//pour chaque valeur de i de 0 au nombre de valeurs de la liste palindromes
			if(verifiesIfNumberIsAMultiple((palindromes.get(i)))) {//si le palindrome est un multiple de 2 nombres � trois chiffres
				palindromeMultiples.add(palindromes.get(i));//ajoute le nombre � la liste palindromeMultiples
			}
		}
		int largestPalindromeMultiple=maxFinder(palindromeMultiples);//trouve la valeur maximale des palindromes qui est multiple de 2 nombres � 3 chiffres
		
		System.out.println("The largest palindrome that is a multiple of numbers between "+minimum+" and "+maximum+" is "+largestPalindromeMultiple);//imprime le plus grand palindrome qui est multiple de deux nombres � trois chiffres
		
	}//cette m�thode v�rifie si le nombre est un palindrome, prend le nombre comme argument
	public static boolean verifiesPalindromes(int number) {
		String numberString=String.valueOf(number);//convertit le nombre en String
		char elementOne;//contiendra le premier chiffre du nombre � v�rifier
		char elementTwo;//contiendra le dernier chiffre du nombre � v�rifier
		boolean result=false;//contiendra le r�sultat(si le nombre est un palindrome ou pas)
		for(int i=numberString.length()-1; i>0; i--) {//pour chaque valeur de i du dernier �l�ment au premier du nombre
			elementOne=numberString.charAt(numberString.length()-(i+1));//elementOne est �gal au prochain chiffre du nombre commencant au dernier et en descendant
			elementTwo=numberString.charAt(i);//elementTwo est �gal au prochain chiffre du nombre en commencant au premier et en montant
			if(elementOne==elementTwo) {//si le premier �l�ment est �gal au deuxi�me
				result=true;//le r�sultat est vrai
			}else {//sinon
				result=false;//le r�sultat est faux
				break;//sort de cette boucle
			}
		}
		
		return result;//retourne le r�sultat
	
		
	}//cette m�thode trouve les palindromes entre la valeur minimale et la valeur maximale, retourne la liste de tous les palindromes, prend la valeur minimale et la valeur maximale comme argument
	public static ArrayList<Integer> findsPalindromes(int min, int max) {
		ArrayList<Integer> palindromes=new ArrayList<Integer>();//cr�e une nouvelle liste nomm�e palindromes qui va contenir tous les palindromes
		boolean result=false;//le r�sultat, donc si le nombre est un palindrome, est faux
		for(int i=min;i<=max; i++) {//pour chaque valeur de i de la valeur minimale � la valeur maximale, fais ce qui est dans la boucle, ensuite incr�mente i
			result=verifiesPalindromes(i);//v�rifie si le nombre est un palindrome
			if(result==true) {//si le nombre est un palindrome
				palindromes.add(i);//ajoute le nombre � la liste des palindromes
			}
		}
		
		
		return palindromes;//retourne la liste des palindromes
	}//cette m�thode d�termine la valeur maximale dans la liste palindromes(donc des palindromes trouv�s)
	public static int maxFinder(ArrayList<Integer> palindromes) {
		int max=0; //la valeur maximale est 0
		for(int i=0; i<palindromes.size(); i++) {//pour chaque valeur de i dans la liste de palindromes, fais ce qui est dans cette boucle, et ensuite incr�mente i
			if(palindromes.get(i)>max) {//si le palindrome � la position i est plus grand que la valeur maximale
				max=palindromes.get(i);//remplace la valeur maximale par le palindrome � la position i
			}
		}
		return max;//retourne le plus grand palindrome
		
	}//cette m�thode v�rifie si le palindrome est un multiple de de nombres entre 100 et 999
	public static boolean verifiesIfNumberIsAMultiple(int palindrome) {
		for(int i=100; i<=999; i++) {//pour chaque valeur de i de 100 � 999, fais ce qui est dans cette boucle, et ensuite incr�mente i
			for(int j=100; j<=999; j++) {//pour chaque valeur de j de 100 � 999, fais ce qui est dans cette boucle, et ensuite incr�mente j
				if(palindrome==i*j) {//si le palindrome est �gal aux deux valeurs multipli�es par elles-m�mes
					return true;//retourne la valeur "vrai" � la m�thode main
				}
			}
		}
		return false;//retourne "faux"
	}

}
