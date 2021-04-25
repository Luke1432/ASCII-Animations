package jeuDevinettes;
import java.util.Scanner;//importe le scanner
/*
 * Lukas Fenkam
 * Le 6 Octobre 2020
 * Jeu de devinettes de 1 à 100
 * Ce programme crée un jeu qui permet à l'utilisateur de deviner un nombre entre une valeur minimum et une valeur maximum
 */
public class JeuDevinette {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);//crée un nouveau Scanner nommé in
		int nombreDeDevinettes=7;//crée une variable qui contient le nombre maximum de variables
		int nombreDevine=0;//crée une variable qui contient le nombre deviné par l'utilisateur
		int nombre=randomNumberGenerator(0,100);//génère un nombre aléatoire entre 0 et 100
		do {//faise ce qui est dans cette boucle
			System.out.print("Devinez le nombre: ");//demande à l'utilisateur de deviner le nombre
			 nombreDevine=in.nextInt();//prend la valeur entrée par l'utilisateur
		if(nombreDevine>nombre) {//si le nombre qui est deviné est plus grand que la réponse
			System.out.println("Le nombre entré est trop grand. ");//dit à l'utilisateur que le nombre est trop grand
		}else if(nombreDevine<nombre) {//si le nombre qui est deviné est plus petit que la réponse
			System.out.println("Le nombre entré est trop petit. ");//dit à l'utilisateur que le nombre est trop petit
		}else if(nombreDevine==nombre){//si le nombre qui est deviné est égal à la réponse
			System.out.println("Vous avez deviné le nombre!!");//dit à l'utilisateur que le nombre deviné est correct
		}
		if((nombre>nombreDevine-5&&nombre<nombreDevine+5)&& nombreDevine!=nombre) {//si le nombre deviné par l'utilisateur est dans une zone de 5 de plus ou de moins que le nombre qui est correct
			System.out.println("Vous êtes très proches du nombre. ");//dit à l'utilisateur qu'il est proche à la réponse
		}
	}while(nombreDevine!=nombre);//pendant que le nombre deviné n'est pas égal au nombre correct
		System.out.println("Vous avez bien deviné!!! Bravo!!!");//dis à l'utilisateur qu'il a eu la bonne réponse
	}public static int randomNumberGenerator(int min, int max) {//crée une méthode qui prend le minimum et le maximum des valeurs possibles
		int randomNumber;//crée le nombre aléatoire
		//associe une valeur à la variable randomNumber entre 0 et 100
		do { 
		 randomNumber = 1 + (int) (Math.random() * 100);
		}while(randomNumber>max||randomNumber<min);
		return randomNumber;	//retourne la valeur aléatoire à la méthode main
		
	}
	
	

}
