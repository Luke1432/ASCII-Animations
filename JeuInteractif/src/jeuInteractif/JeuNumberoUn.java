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
//Definition: Ce programme effectue une commande de pizza à partir de valeurs entrées par l'utilisateur
/*
 * Test #1: Pizza avec Pepperoni
 * Résultat attendu: Quelles garnitures voulez-vous? --> Entrée: "du Pepperoni" --> Vous avez commandé une pizza au Pepperoni. Votre pizza arrivera dans 30 minutes. Votre coût total est de: 20.34$ Merci d'avoir commandé la nourriture!!!
 * Résultat reçu: Quelles garnitures voulez-vous? --> Entrée: "du Pepperoni" --> Vous avez commandé une pizza au Pepperoni. Votre pizza arrivera dans 30 minutes. Votre coût total est de: 20.34$ Merci d'avoir commandé la nourriture!!!
 * 
 * Test #2: Burger avec Mayonnaise
 * Résultat attendu:  Quelles garnitures voulez-vous? --> Entrée: "de la Mayonnaise" --> Vous avez commandé un burger avec de la Mayonnaise. Votre burger arrivera dans 40 minutes. Votre coût total est de: 28.25$ Merci d'avoir commandé la nourriture!!!
 * Resultat reçu:  Quelles garnitures voulez-vous? --> Entrée: "de la Mayonnaise" --> Vous avez commandé un burger avec de la Mayonnaise. Votre burger arrivera dans 40 minutes. Votre coût total est de: 28.25$ Merci d'avoir commandé la nourriture!!!
 * 
 * Test #3: Salade au poulet
 * Résultat attendu: Quel type de salade voulez-vous? --> Entrée: " au poulet" --> Vous avez commandé une salade au poulet. Votre salade arrivera dans 10 minutes. Votre coût total est de: 12.43$ Merci d'avoir commandé la nourriture!!!
 * Résultat reçu: Quel type de salade voulez-vous? --> Entrée: " au poulet" --> Vous avez commandé une salade au poulet. Votre salade arrivera dans 10 minutes. Votre coût total est de: 12.43$ Merci d'avoir commandé la nourriture!!!
 * 
 * Test #4: Crème glacée à la vanille
 * Résultat attendu: Quel saveur de crème glacée voulez-vous? --> Entrée: " vanille" --> "Combien de boules voulez-vous? " --> Entrée: " 3" --> Vous avez commandé une crème glacée avec une saveur de vanille, avec 3 boules.  Votre coût total est de: 7.35$. Vous pouvez venir chercher votre crème glacée. Merci d'avoir commandé la nourriture!!!
 * Résultat reçu: Quel saveur de crème glacée voulez-vous? --> Entrée: " vanille" --> "Combien de boules voulez-vous? " --> Entrée: " 3" --> Vous avez commandé une crème glacée avec une saveur de vanille, avec 3 boules.  Votre coût total est de: 7.35$. Vous pouvez venir chercher votre crème glacée. Merci d'avoir commandé la nourriture!!!
 * 
 */



public class JeuNumberoUn {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);//crée un nouveau scanner nommé in
		String garnitures;//ce string va contenir les garnitures entrees par l'utilisateur
		double coutTotal=0;//cette variable va contenir le cout total de la pizza et des garnitures sans les taxes
		double coutGarnitures=0;//cette variable va contenir le cout total des garnitures pour la pizza
		double coutDeBase=0;//cette variable va contenir le cout de la pizza sans les garnitures
		System.out.println("Quelle nourriture voulez-vous commander? \n Pizza \n Burger \n Salade \n Creme Glacee");//demande a l'utilisateur quelle nourriture il veut commander
		String choix=in.nextLine();//prend le mot entre par l'utilisateur et le met dans la variable choix
		if(choix.equalsIgnoreCase("Pizza")){//si le choix est egal à Pizza
			coutDeBase=15;//le cout de base est égal à 15($)
			System.out.println("Quelles garnitures voulez-vous sur votre pizza? (des Tomates, du Pepperoni, des Poivrons, du Fromage)");//demande à l'utilisateur quelles garnitures l'utilisateur veut
			 garnitures=in.nextLine();//met la valeur entrée par l'utilisateur dans la variable garnitures
			if(garnitures.equalsIgnoreCase("des Tomates")||garnitures.equalsIgnoreCase("du Pepperoni")||garnitures.equalsIgnoreCase("des Poivrons")||garnitures.equalsIgnoreCase("du Fromage")) {//si le mot entré par l'utilisateur est l'un des mots içi
				System.out.println("Vous avez commandé une pizza avec "+garnitures);//dit à l'utilisateur les garnitures qu'il a commandé
				coutGarnitures=3;//le cout des garnitures est de 3($)
			}else {//sinon
				System.out.println("Vous avez commandé une pizza sans garnitures. ");//dit à l'utilisateur qu'il a commandé une pizza sans garnitures
			}
			System.out.println("Votre pizza arrivera dans 30 minutes. ");//dit à l'utilisateur quand sa pizza va arriver
		}else if(choix.equalsIgnoreCase("Burger")) {//si le choix est égal à Burger
			coutDeBase=20;//le cout de base est égal à 20($)
			System.out.println("Quelles garnitures voulez-vous sur votre burger? (des Tomates, du Ketchup, de la Mayonnaise, de la Moutarde, de la Salade)");//demande à l'utilisateur quelles garnitures l'utilisateur veut
			 garnitures=in.nextLine();//met la valeur entrée par l'utilisateur dans la variable garnitures
			if(garnitures.equalsIgnoreCase("des Tomates")||garnitures.equalsIgnoreCase("du Ketchup")||garnitures.equalsIgnoreCase("de la Mayonnaise")||garnitures.equalsIgnoreCase("de la Moutarde")||garnitures.equalsIgnoreCase("de la Salade")) {//si le mot entré par l'utilisateur est l'un des mots içi
				System.out.println("Vous avez commandé un burger avec "+garnitures);//dit à l'utilisateur quelles garnitures il a commandé
				coutGarnitures=5;//le cout des garnitures est de 5($)
			}else {
				System.out.println("Vous avez commandé un burger sans garnitures. ");//dit à l'utilisateur qu'il a commandé un burger sans garnitures
			}
			System.out.println("Votre burger arrivera dans 40 minutes. ");//dit à l'utilisateur quand son burger va arriver
		}else if(choix.equalsIgnoreCase("Salade")) {//si le choix est égal a Salade
			coutDeBase=10;//le cout de base est égal à 10($)
			System.out.println("Quel type de salade voulez-vous?");//demande à l'utilisateur quel type de salade il veut
			garnitures=in.nextLine();//met la valeur entrée par l'utilisateur dans la variable garnitures
			System.out.println("Vous avez commandé une salade "+garnitures);//dit à l'utilisateur quel type de salade il a commandé
			coutGarnitures=1;//cout du type de pizza est de 1$
			System.out.println("Votre salade arrivera dans 10 minutes. ");//dit à l'utilisateur quand sa salade arrivera
		}else if(choix.equalsIgnoreCase("Creme Glacee")) {//si le choix est égal à Creme Glacee
			double coutPourBoule=0.50;//le cout pour chaque boule est de 0.50$
			coutDeBase=5;//le cout de base est égal à 5($)
			System.out.println("Quelle saveur de crème glacée voulez-vous? (chocolat, vanille, fraises, caramel)");//demande à l'utilisateur quelle saveur de crème glacée il veut
			garnitures=in.nextLine();//met la valeur entrée par l'utilisateur dans la variable garnitures
			System.out.println("Combien de boules voulez vous?");//demande à l'utilisateur combien de boules il veut
			int nombreDeBoules=in.nextInt();//met la valeur entrée dans la variable nombreDeBoules
			System.out.println("Vous avez commandé une crème glacée avec une saveur de "+garnitures+" avec "+nombreDeBoules+" boules. ");//dit à l'utilisateur quel type de crème glacée il a commandé et avec combien de boules
			System.out.println("Vous pouvez venir chercher votre creme glacee. ");//dit à l'utilisateur qu'il peut venir chercher sa crème glacée
			coutGarnitures=(nombreDeBoules*coutPourBoule);//calcule le cout pour les garnitures
		}
		coutTotal=coutDeBase+coutGarnitures;//calcule le coût total
		double coutAvecTaxes=coutTotal+(coutTotal*0.13);//calcule le coût avec les taxes
		/*
		 * arrondit la valeur du cout avec taxes à 2 decimales
		 */
		coutAvecTaxes=coutAvecTaxes*100;
		coutAvecTaxes=Math.round(coutAvecTaxes);
		coutAvecTaxes=coutAvecTaxes/100;
		
		System.out.println("Votre coût total est de "+coutAvecTaxes+"$.");//dit à l'utilisateur le coût total pour sa nourriture
		System.out.println("(: Merci d'avoir commandé la nourriture!! :)");//dit merci à l'utilisateur
		
		
	}
}