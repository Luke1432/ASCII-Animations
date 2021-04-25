package pratiqueÉvaluation;
import java.util.Scanner;//importe le Scanner
/*
 * Lukas Fenkam
 * 08 Mars 2021
 * Conversion Binaire --> Décimal
 * Ce programme convertit un nombre binaire entré par l'utilisateur en nombre décimal. 
 */
public class Exercise2 {

	public static void main(String[] args) throws InterruptedException {
		Scanner in=new Scanner(System.in);//crée un nouveau Scanner nommé in
		int binaryNumber=in.nextInt();//prend l'entrée de l'utilisateur, le met dans une variable nommée binaryNumber
		 int decimal = 0;//cette variable contiendra le nombre décimal
		    int i = 0;//cette variable est un compteur
		    while(true){//pendant un temps illimité, sauf s'il y a un break; dans la boucle, exécute ce qui est dans la boucle
		      if(binaryNumber == 0){//si le nombre binaire est égal à 0
		        break;//sors de la boucle while
		      } else {//sinon
		          int temp = binaryNumber%10;//crée une variable temporaire qui contient le reste de la division du nombre binaire par 10
		          decimal += temp*Math.pow(2, i);//multiplie la valeur dans la variable temporaire par sa puissance correspondante pour avoir sa valeur décimale. 
		          binaryNumber = binaryNumber/10;//divise le nombre binaire par 10
		          i++;//incrémente i
		       }
		      
		    }
		    System.out.println(decimal);//imprime la valeur du nombre décimal
	}

}
