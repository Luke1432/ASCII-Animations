package jeuInteractif;
import java.util.Scanner;
/*
 * Lukas Fenkam
 * 27 Octobre 2020
 * Jeu Questionnaire
 * Ce programme effectue une commande de pizza
 */
//RECETTE de design

//Jeu Questionaire: Commande de nourriture
//contrat: void
//Definition: Ce programme effectue une commande de pizza � partir de valeurs entr�es par l'utilisateur
/*
 * Test #1: Pizza avec Pepperoni
 * R�sultat attendu: Quelles garnitures voulez-vous? --> Entr�e: "du Pepperoni" --> Vous avez command� une pizza au Pepperoni. Votre pizza arrivera dans 30 minutes. Votre co�t total est de: 20.34$ Merci d'avoir command� la nourriture!!!
 * R�sultat re�u: Quelles garnitures voulez-vous? --> Entr�e: "du Pepperoni" --> Vous avez command� une pizza au Pepperoni. Votre pizza arrivera dans 30 minutes. Votre co�t total est de: 20.34$ Merci d'avoir command� la nourriture!!!
 * 
 * Test #2: Burger avec Mayonnaise
 * R�sultat attendu:  Quelles garnitures voulez-vous? --> Entr�e: "de la Mayonnaise" --> Vous avez command� un burger avec de la Mayonnaise. Votre burger arrivera dans 40 minutes. Votre co�t total est de: 28.25$ Merci d'avoir command� la nourriture!!!
 * Resultat re�u:  Quelles garnitures voulez-vous? --> Entr�e: "de la Mayonnaise" --> Vous avez command� un burger avec de la Mayonnaise. Votre burger arrivera dans 40 minutes. Votre co�t total est de: 28.25$ Merci d'avoir command� la nourriture!!!
 * 
 * Test #3: Salade au poulet
 * R�sultat attendu: Quel type de salade voulez-vous? --> Entr�e: " au poulet" --> Vous avez command� une salade au poulet. Votre salade arrivera dans 10 minutes. Votre co�t total est de: 12.43$ Merci d'avoir command� la nourriture!!!
 * R�sultat re�u: Quel type de salade voulez-vous? --> Entr�e: " au poulet" --> Vous avez command� une salade au poulet. Votre salade arrivera dans 10 minutes. Votre co�t total est de: 12.43$ Merci d'avoir command� la nourriture!!!
 * 
 * Test #4: Cr�me glac�e � la vanille
 * R�sultat attendu: Quel saveur de cr�me glac�e voulez-vous? --> Entr�e: " vanille" --> "Combien de boules voulez-vous? " --> Entr�e: " 3" --> Vous avez command� une cr�me glac�e avec une saveur de vanille, avec 3 boules.  Votre co�t total est de: 7.35$. Vous pouvez venir chercher votre cr�me glac�e. Merci d'avoir command� la nourriture!!!
 * R�sultat re�u: Quel saveur de cr�me glac�e voulez-vous? --> Entr�e: " vanille" --> "Combien de boules voulez-vous? " --> Entr�e: " 3" --> Vous avez command� une cr�me glac�e avec une saveur de vanille, avec 3 boules.  Votre co�t total est de: 7.35$. Vous pouvez venir chercher votre cr�me glac�e. Merci d'avoir command� la nourriture!!!
 * 
 */



public class JeuNumberoUn {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);//cr�e un nouveau scanner nomm� in
		String garnitures;//ce string va contenir les garnitures entrees par l'utilisateur
		double coutTotal=0;//cette variable va contenir le cout total de la pizza et des garnitures sans les taxes
		double coutGarnitures=0;//cette variable va contenir le cout total des garnitures pour la pizza
		double coutDeBase=0;//cette variable va contenir le cout de la pizza sans les garnitures
		System.out.println("Quelle nourriture voulez-vous commander? \n Pizza \n Burger \n Salade \n Creme Glacee");//demande a l'utilisateur quelle nourriture il veut commander
		String choix=in.nextLine();//prend le mot entre par l'utilisateur et le met dans la variable choix
		if(choix.equalsIgnoreCase("Pizza")){//si le choix est egal � Pizza
			coutDeBase=15;//le cout de base est �gal � 15($)
			System.out.println("Quelles garnitures voulez-vous sur votre pizza? (des Tomates, du Pepperoni, des Poivrons, du Fromage)");//demande � l'utilisateur quelles garnitures l'utilisateur veut
			 garnitures=in.nextLine();//met la valeur entr�e par l'utilisateur dans la variable garnitures
			if(garnitures.equalsIgnoreCase("des Tomates")||garnitures.equalsIgnoreCase("du Pepperoni")||garnitures.equalsIgnoreCase("des Poivrons")||garnitures.equalsIgnoreCase("du Fromage")) {//si le mot entr� par l'utilisateur est l'un des mots i�i
				System.out.println("Vous avez command� une pizza avec "+garnitures);//dit � l'utilisateur les garnitures qu'il a command�
				coutGarnitures=3;//le cout des garnitures est de 3($)
			}else {//sinon
				System.out.println("Vous avez command� une pizza sans garnitures. ");//dit � l'utilisateur qu'il a command� une pizza sans garnitures
			}
			System.out.println("Votre pizza arrivera dans 30 minutes. ");//dit � l'utilisateur quand sa pizza va arriver
		}else if(choix.equalsIgnoreCase("Burger")) {//si le choix est �gal � Burger
			coutDeBase=20;//le cout de base est �gal � 20($)
			System.out.println("Quelles garnitures voulez-vous sur votre burger? (des Tomates, du Ketchup, de la Mayonnaise, de la Moutarde, de la Salade)");//demande � l'utilisateur quelles garnitures l'utilisateur veut
			 garnitures=in.nextLine();//met la valeur entr�e par l'utilisateur dans la variable garnitures
			if(garnitures.equalsIgnoreCase("des Tomates")||garnitures.equalsIgnoreCase("du Ketchup")||garnitures.equalsIgnoreCase("de la Mayonnaise")||garnitures.equalsIgnoreCase("de la Moutarde")||garnitures.equalsIgnoreCase("de la Salade")) {//si le mot entr� par l'utilisateur est l'un des mots i�i
				System.out.println("Vous avez command� un burger avec "+garnitures);//dit � l'utilisateur quelles garnitures il a command�
				coutGarnitures=5;//le cout des garnitures est de 5($)
			}else {
				System.out.println("Vous avez command� un burger sans garnitures. ");//dit � l'utilisateur qu'il a command� un burger sans garnitures
			}
			System.out.println("Votre burger arrivera dans 40 minutes. ");//dit � l'utilisateur quand son burger va arriver
		}else if(choix.equalsIgnoreCase("Salade")) {//si le choix est �gal a Salade
			coutDeBase=10;//le cout de base est �gal � 10($)
			System.out.println("Quel type de salade voulez-vous?");//demande � l'utilisateur quel type de salade il veut
			garnitures=in.nextLine();//met la valeur entr�e par l'utilisateur dans la variable garnitures
			System.out.println("Vous avez command� une salade "+garnitures);//dit � l'utilisateur quel type de salade il a command�
			coutGarnitures=1;//cout du type de pizza est de 1$
			System.out.println("Votre salade arrivera dans 10 minutes. ");//dit � l'utilisateur quand sa salade arrivera
		}else if(choix.equalsIgnoreCase("Creme Glacee")) {//si le choix est �gal � Creme Glacee
			double coutPourBoule=0.50;//le cout pour chaque boule est de 0.50$
			coutDeBase=5;//le cout de base est �gal � 5($)
			System.out.println("Quelle saveur de cr�me glac�e voulez-vous? (chocolat, vanille, fraises, caramel)");//demande � l'utilisateur quelle saveur de cr�me glac�e il veut
			garnitures=in.nextLine();//met la valeur entr�e par l'utilisateur dans la variable garnitures
			System.out.println("Combien de boules voulez vous?");//demande � l'utilisateur combien de boules il veut
			int nombreDeBoules=in.nextInt();//met la valeur entr�e dans la variable nombreDeBoules
			System.out.println("Vous avez command� une cr�me glac�e avec une saveur de "+garnitures+" avec "+nombreDeBoules+" boules. ");//dit � l'utilisateur quel type de cr�me glac�e il a command� et avec combien de boules
			System.out.println("Vous pouvez venir chercher votre creme glacee. ");//dit � l'utilisateur qu'il peut venir chercher sa cr�me glac�e
			coutGarnitures=(nombreDeBoules*coutPourBoule);//calcule le cout pour les garnitures
		}
		coutTotal=coutDeBase+coutGarnitures;//calcule le co�t total
		double coutAvecTaxes=coutTotal+(coutTotal*0.13);//calcule le co�t avec les taxes
		/*
		 * arrondit la valeur du cout avec taxes � 2 decimales
		 */
		coutAvecTaxes=coutAvecTaxes*100;
		coutAvecTaxes=Math.round(coutAvecTaxes);
		coutAvecTaxes=coutAvecTaxes/100;
		
		System.out.println("Votre co�t total est de "+coutAvecTaxes+"$.");//dit � l'utilisateur le co�t total pour sa nourriture
		System.out.println("(: Merci d'avoir command� la nourriture!! :)");//dit merci � l'utilisateur
		
		
	}
}