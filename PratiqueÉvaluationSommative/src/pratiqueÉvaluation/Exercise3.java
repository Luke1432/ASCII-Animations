package pratiqueÉvaluation;
import java.util.Scanner;
/*
 * Lukas Fenkam
 * 08 Mars 2021
 * Conversion CAD-USD et USD-CAD
 * Ce programme convertit la monnaie canadienne en monnaie américaine, et la monnaie américane en monnaie canadienne. 
 */
public class Exercise3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);//crée un nouveau Scanner nommé in
		
		System.out.println("Voulez-vous convertir de CAD à USD (1) ou de USD à CAD (2)");//demande à l'utilisateur s'il veut convertir de CAD à USD ou de USD à CAD
		int choice=in.nextInt();//garde la valeur entrée dans la variable choice
		
		if(choice==1) {//si le choix est 1 (CAD à USD)
			double cadvalue=in.nextDouble();//l'utilisateur entre la valeur en dollars canadiens
			double conversionValue=0.79;//la valeur par laquelle on doit multiplier les dollars canadiens
			
			double usdvalue=cadvalue*conversionValue;//convertit la valeur CAD en USD
			//3 prochaines lignes arrondissent la valeur au centième près
			usdvalue=usdvalue*100;
			usdvalue=Math.round(usdvalue);
			usdvalue=usdvalue/100;
			
			System.out.println(cadvalue+"$ en CAD est "+usdvalue+"$ en USD. ");//affiche la valeur en USD et en CAD
		}
		else {//si le choix n'est pas 1
			double usdvalue=in.nextDouble();//l'utilisateur entre la valeur en dollars américains
			double conversionValue=1.27;//la valeur par laquelle on doit multiplier les dollars américains
			
			
			double cadvalue=usdvalue*conversionValue;//convertit la valeur USD en CAD 
			//3 prochaines lignes arrondissent la valeur au centième près
			cadvalue=cadvalue*100;
			cadvalue=Math.round(cadvalue);
			cadvalue=cadvalue/100;
			System.out.println(usdvalue+"$ en USD est de "+cadvalue+"$ en CAD.");//affiche la valeur en CAD et en USD
		}
	}

}
