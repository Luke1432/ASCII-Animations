package ProjectEuler;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
/*
 * Lukas Fenkam
 * 19 Octobre 2020
 * Vérification de palindromes
 * Ce programme determine le plus grand multiple de nombres à trois chiffres qui est un palindrome
 */
public class ExerciseFourFinalTry {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int min=100;//valeur à trois chiffres minimale
		int max=999;//valeur à trois chiffres maximale
		int minimum=min*min;//multiple de nombres à trois chiffres minimal
		int maximum=max*max;//multiple de nombres à trois chiffres maximal
		ArrayList<Integer> palindromes=findsPalindromes(minimum, maximum);//applique la méthode findsPalindromes, trouve tous les palindromes entre le chiffre minimal et le chiffre maximal
		ArrayList<Integer> palindromeMultiples=new ArrayList<Integer>();//crée un nouveau arraylist qui va contenir tous les palindromes qui sont des multiples de nombres à trois chiffres
		for(int i=0; i<palindromes.size();i++) {//pour chaque valeur de i de 0 au nombre de valeurs de la liste palindromes
			if(verifiesIfNumberIsAMultiple((palindromes.get(i)))) {//si le palindrome est un multiple de 2 nombres à trois chiffres
				palindromeMultiples.add(palindromes.get(i));//ajoute le nombre à la liste palindromeMultiples
			}
		}
		int largestPalindromeMultiple=maxFinder(palindromeMultiples);//trouve la valeur maximale des palindromes qui est multiple de 2 nombres à 3 chiffres
		
		System.out.println("The largest palindrome that is a multiple of numbers between "+minimum+" and "+maximum+" is "+largestPalindromeMultiple);//imprime le plus grand palindrome qui est multiple de deux nombres à trois chiffres
		
	}//cette méthode vérifie si le nombre est un palindrome, prend le nombre comme argument
	public static boolean verifiesPalindromes(int number) {
		String numberString=String.valueOf(number);//convertit le nombre en String
		char elementOne;//contiendra le premier chiffre du nombre à vérifier
		char elementTwo;//contiendra le dernier chiffre du nombre à vérifier
		boolean result=false;//contiendra le résultat(si le nombre est un palindrome ou pas)
		for(int i=numberString.length()-1; i>0; i--) {//pour chaque valeur de i du dernier élément au premier du nombre
			elementOne=numberString.charAt(numberString.length()-(i+1));//elementOne est égal au prochain chiffre du nombre commencant au dernier et en descendant
			elementTwo=numberString.charAt(i);//elementTwo est égal au prochain chiffre du nombre en commencant au premier et en montant
			if(elementOne==elementTwo) {//si le premier élément est égal au deuxième
				result=true;//le résultat est vrai
			}else {//sinon
				result=false;//le résultat est faux
				break;//sort de cette boucle
			}
		}
		
		return result;//retourne le résultat
	
		
	}//cette méthode trouve les palindromes entre la valeur minimale et la valeur maximale, retourne la liste de tous les palindromes, prend la valeur minimale et la valeur maximale comme argument
	public static ArrayList<Integer> findsPalindromes(int min, int max) {
		ArrayList<Integer> palindromes=new ArrayList<Integer>();//crée une nouvelle liste nommée palindromes qui va contenir tous les palindromes
		boolean result=false;//le résultat, donc si le nombre est un palindrome, est faux
		for(int i=min;i<=max; i++) {//pour chaque valeur de i de la valeur minimale à la valeur maximale, fais ce qui est dans la boucle, ensuite incrémente i
			result=verifiesPalindromes(i);//vérifie si le nombre est un palindrome
			if(result==true) {//si le nombre est un palindrome
				palindromes.add(i);//ajoute le nombre à la liste des palindromes
			}
		}
		
		
		return palindromes;//retourne la liste des palindromes
	}//cette méthode détermine la valeur maximale dans la liste palindromes(donc des palindromes trouvés)
	public static int maxFinder(ArrayList<Integer> palindromes) {
		int max=0; //la valeur maximale est 0
		for(int i=0; i<palindromes.size(); i++) {//pour chaque valeur de i dans la liste de palindromes, fais ce qui est dans cette boucle, et ensuite incrémente i
			if(palindromes.get(i)>max) {//si le palindrome à la position i est plus grand que la valeur maximale
				max=palindromes.get(i);//remplace la valeur maximale par le palindrome à la position i
			}
		}
		return max;//retourne le plus grand palindrome
		
	}//cette méthode vérifie si le palindrome est un multiple de de nombres entre 100 et 999
	public static boolean verifiesIfNumberIsAMultiple(int palindrome) {
		for(int i=100; i<=999; i++) {//pour chaque valeur de i de 100 à 999, fais ce qui est dans cette boucle, et ensuite incrémente i
			for(int j=100; j<=999; j++) {//pour chaque valeur de j de 100 à 999, fais ce qui est dans cette boucle, et ensuite incrémente j
				if(palindrome==i*j) {//si le palindrome est égal aux deux valeurs multipliées par elles-mêmes
					return true;//retourne la valeur "vrai" à la méthode main
				}
			}
		}
		return false;//retourne "faux"
	}

}
