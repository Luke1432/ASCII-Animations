package pratique�valuation;
import java.util.Scanner;
/*
 * Lukas Fenkam
 * 08 Mars 2021
 * Conversion CAD-USD et USD-CAD
 * Ce programme convertit la monnaie canadienne en monnaie am�ricaine, et la monnaie am�ricane en monnaie canadienne. 
 */
public class Exercise3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);//cr�e un nouveau Scanner nomm� in
		
		System.out.println("Voulez-vous convertir de CAD � USD (1) ou de USD � CAD (2)");//demande � l'utilisateur s'il veut convertir de CAD � USD ou de USD � CAD
		int choice=in.nextInt();//garde la valeur entr�e dans la variable choice
		
		if(choice==1) {//si le choix est 1 (CAD � USD)
			double cadvalue=in.nextDouble();//l'utilisateur entre la valeur en dollars canadiens
			double conversionValue=0.79;//la valeur par laquelle on doit multiplier les dollars canadiens
			
			double usdvalue=cadvalue*conversionValue;//convertit la valeur CAD en USD
			//3 prochaines lignes arrondissent la valeur au centi�me pr�s
			usdvalue=usdvalue*100;
			usdvalue=Math.round(usdvalue);
			usdvalue=usdvalue/100;
			
			System.out.println(cadvalue+"$ en CAD est "+usdvalue+"$ en USD. ");//affiche la valeur en USD et en CAD
		}
		else {//si le choix n'est pas 1
			double usdvalue=in.nextDouble();//l'utilisateur entre la valeur en dollars am�ricains
			double conversionValue=1.27;//la valeur par laquelle on doit multiplier les dollars am�ricains
			
			
			double cadvalue=usdvalue*conversionValue;//convertit la valeur USD en CAD 
			//3 prochaines lignes arrondissent la valeur au centi�me pr�s
			cadvalue=cadvalue*100;
			cadvalue=Math.round(cadvalue);
			cadvalue=cadvalue/100;
			System.out.println(usdvalue+"$ en USD est de "+cadvalue+"$ en CAD.");//affiche la valeur en CAD et en USD
		}
	}

}
