import java.util.Scanner;

/**
 * @author Maxime & Ahmed
 *
 */
public class MenuSystemeBancaire {

Scanner scan = new Scanner(System.in);
	
	//Methode permettant l'affichage des options des systemes bancaires
	/**
	 * @param user
	 * @param allDatabase
	 */
	public void afficherOption(Utilisateur user, Data[][] allDatabase){
		System.out.println("\nVeuillez choisir une des options pour les systemes bancaires:\n");
		System.out.println("1.Consulter les TEF\n2.Log off\n");
	
		Integer menuChoix = scan.nextInt();
		scan.nextLine();  //to consume the \n from the nextInt();
		
		switch(menuChoix)
		{
		case 1:
			ConsulterTEF(allDatabase);
			break;
		case 2:
			break;
		}
	}
	
	//Design: On envoie les informations par email?
	/**
	 * @param allDatabase
	 */
	public void ConsulterTEF(Data[][] allDatabase) {
		  DataTEF.AfficherListeTEF((TEF[])allDatabase[4]);
	}
}




