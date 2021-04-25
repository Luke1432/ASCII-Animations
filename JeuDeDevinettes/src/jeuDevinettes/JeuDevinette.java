package jeuDevinettes;
import java.util.Scanner;//importe le scanner
/*
 * Lukas Fenkam
 * Le 6 Octobre 2020
 * Jeu de devinettes de 1 � 100
 * Ce programme cr�e un jeu qui permet � l'utilisateur de deviner un nombre entre une valeur minimum et une valeur maximum
 */
public class JeuDevinette {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);//cr�e un nouveau Scanner nomm� in
		int nombreDeDevinettes=7;//cr�e une variable qui contient le nombre maximum de variables
		int nombreDevine=0;//cr�e une variable qui contient le nombre devin� par l'utilisateur
		int nombre=randomNumberGenerator(0,100);//g�n�re un nombre al�atoire entre 0 et 100
		do {//faise ce qui est dans cette boucle
			System.out.print("Devinez le nombre: ");//demande � l'utilisateur de deviner le nombre
			 nombreDevine=in.nextInt();//prend la valeur entr�e par l'utilisateur
		if(nombreDevine>nombre) {//si le nombre qui est devin� est plus grand que la r�ponse
			System.out.println("Le nombre entr� est trop grand. ");//dit � l'utilisateur que le nombre est trop grand
		}else if(nombreDevine<nombre) {//si le nombre qui est devin� est plus petit que la r�ponse
			System.out.println("Le nombre entr� est trop petit. ");//dit � l'utilisateur que le nombre est trop petit
		}else if(nombreDevine==nombre){//si le nombre qui est devin� est �gal � la r�ponse
			System.out.println("Vous avez devin� le nombre!!");//dit � l'utilisateur que le nombre devin� est correct
		}
		if((nombre>nombreDevine-5&&nombre<nombreDevine+5)&& nombreDevine!=nombre) {//si le nombre devin� par l'utilisateur est dans une zone de 5 de plus ou de moins que le nombre qui est correct
			System.out.println("Vous �tes tr�s proches du nombre. ");//dit � l'utilisateur qu'il est proche � la r�ponse
		}
	}while(nombreDevine!=nombre);//pendant que le nombre devin� n'est pas �gal au nombre correct
		System.out.println("Vous avez bien devin�!!! Bravo!!!");//dis � l'utilisateur qu'il a eu la bonne r�ponse
	}public static int randomNumberGenerator(int min, int max) {//cr�e une m�thode qui prend le minimum et le maximum des valeurs possibles
		int randomNumber;//cr�e le nombre al�atoire
		//associe une valeur � la variable randomNumber entre 0 et 100
		do { 
		 randomNumber = 1 + (int) (Math.random() * 100);
		}while(randomNumber>max||randomNumber<min);
		return randomNumber;	//retourne la valeur al�atoire � la m�thode main
		
	}
	
	

}
