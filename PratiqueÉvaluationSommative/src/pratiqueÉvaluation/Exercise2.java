package pratique�valuation;
import java.util.Scanner;//importe le Scanner
/*
 * Lukas Fenkam
 * 08 Mars 2021
 * Conversion Binaire --> D�cimal
 * Ce programme convertit un nombre binaire entr� par l'utilisateur en nombre d�cimal. 
 */
public class Exercise2 {

	public static void main(String[] args) throws InterruptedException {
		Scanner in=new Scanner(System.in);//cr�e un nouveau Scanner nomm� in
		int binaryNumber=in.nextInt();//prend l'entr�e de l'utilisateur, le met dans une variable nomm�e binaryNumber
		 int decimal = 0;//cette variable contiendra le nombre d�cimal
		    int i = 0;//cette variable est un compteur
		    while(true){//pendant un temps illimit�, sauf s'il y a un break; dans la boucle, ex�cute ce qui est dans la boucle
		      if(binaryNumber == 0){//si le nombre binaire est �gal � 0
		        break;//sors de la boucle while
		      } else {//sinon
		          int temp = binaryNumber%10;//cr�e une variable temporaire qui contient le reste de la division du nombre binaire par 10
		          decimal += temp*Math.pow(2, i);//multiplie la valeur dans la variable temporaire par sa puissance correspondante pour avoir sa valeur d�cimale. 
		          binaryNumber = binaryNumber/10;//divise le nombre binaire par 10
		          i++;//incr�mente i
		       }
		      
		    }
		    System.out.println(decimal);//imprime la valeur du nombre d�cimal
	}

}
