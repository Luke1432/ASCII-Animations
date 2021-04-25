package pratiqueArrays;
//importe le Scanner de la bibliotheque
import java.util.Scanner;
/*
 * Lukas Fenkam
 * ICS3U
 * 28/09/2020
 * ArrayDemo1
 * Ce programme prend des valeurs entrees par l'utilisateur, les place dans un array, et les imprime.
 */
public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ELEVES=10;//cree une variable int qui ne changera pas, contient le nom des eleves
		int[] heures= new int [ELEVES];//cree un nouveau array int qui contient le nombre d'heures de travail de chaque eleve
		Scanner in=new Scanner(System.in);//cree un nouveau scanner nomme in, permet de prendre les valeurs de l'utilisateur
		System.out.println("Heures de travail: ");//demande le nombre d'heures de travail		
		
		/*for(int i=0;i<heures.length;i++) {
			System.out.println("Eleve "+(i+1)+": ");
			heures[i]=in.nextInt();
		}*/
		String[] compter= {"premier","deuxieme","troisieme","quatrieme","cinquieme","sixieme","septieme","huitieme","neuvieme","dixieme"};
		//imprime le nombre d'heures de travail de chaque eleve
		System.out.println("Heures ");
		//demande le nombre d'heures de chaque eleve a l'utilisateur
		for(int i=0; i<ELEVES;i++) {
			System.out.println("Eleve "+(i+1)+": ");
			heures[i]=in.nextInt();
		}//cree deux variables qui vont contenir le maximum et le minimum d'heures de tous les eleves
		int maxValue = heures[0];
	    int min = heures[0];
	    
	    //cree une variable qui va servir de compteur pour la boucle for et qui permettra de determiner le nombre le plus grand
	    int i=0;
	    //cree une variable qui contient l'emplacement du plus grand nombre d'heures
	    int maxLocation = 0;
	    
	    //determine l'eleve qui a le plus d'heures de travail, imprime le resultat
	    for(i = 0; i < heures.length; i++){
	    	
	      if(maxValue < heures[i]){
	        maxValue = heures[i];
	        maxLocation=i;
	      }else if(min > heures[i]){
	        min = heures[i];
	      }		
	    }
		System.out.println("Le "+compter[maxLocation]+" eleve a plus d'heures que tous les autres. ");
	}

}
