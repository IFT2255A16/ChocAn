import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * @author Mohammed & Johnny & Ahmed
 *
 */
public class MenuManager {

	Scanner scan = new Scanner(System.in);

	//Methode pour afficher les options du manager
	/**
	 * @param user
	 * @param allDatabase
	 */
	public void afficherOption(Utilisateur user, Data[][] allDatabase){
		System.out.println("\nVeuillez choisir une des options pour les gerants:\n");
		System.out.println("1.Executer un rapport manuel du membre ou fournisseur");
		System.out.println("2.Executer un rapport manuel de synthese");
		System.out.println("3.Executer un rapport manuel de vendredi minuit");
		System.out.println("4.Déconnexion");


		Integer menuChoix = scan.nextInt();
		scan.nextLine();  //to consume the \n from the nextInt();
		
		switch(menuChoix)
		{
		case 1:
			// demande le id de l'utilisateur et execute son rapport
			System.out.println("Entrez le id de l'ultilisateur");
			int userId = 0; 
			try { 
				    userId= scan.nextInt();
					scan.nextLine();
			// cas ou la saisie est invalide affiche un message et retourne au menu manager		
				} catch(InputMismatchException e) { 
			        System.out.println("saisissez un id valide");
			        MenuManager menu = new MenuManager();
					menu.afficherOption(user, allDatabase);
			    } 
			executerRapportManuel(userId, allDatabase);
			break;
		case 2:
			executeRapportManuelSynthese(allDatabase);
			break;
		case 3:
			executeRapportMinuit(allDatabase);
			break;
		}
		
	}
	
	//Methode qui execute les rapports des membres, fournisseur et les rapports de synthese manuellement.
	/**
	 * @param userId
	 * @param allDatabase
	 */
	public void executerRapportManuel(Integer userId, Data[][] allDatabase) {
		Rapport rapport = new Rapport(userId, allDatabase);
		
	}

	public void executeRapportManuelSynthese(Data[][] allDatabase) {
		Rapport rapport = new Rapport(allDatabase);	
	}
	
	/**
	 * @param allDatabase
	 */
	public void executeRapportMinuit(Data[][] allDatabase){
		
//		 imprime tous les  rapports membres de la derniere semaine
		Membre[] membreSemaine = DataMembre.getMembreServiceSemaine(allDatabase);
		for(int i=0; i<membreSemaine.length; i++){
			if(membreSemaine[i]!=null){
			executerRapportManuel(membreSemaine[i].getMembreID(), allDatabase);
		}
		}
		
		// imprime tous les  rapports fournisseurs de la derniere semain
		Fournisseur[] fournisseurSemaine = DataFournisseur.getFournisseurServiceSemaine(allDatabase);
		for(int i=0; i<fournisseurSemaine.length; i++){
			if(fournisseurSemaine[i]!=null){
			executerRapportManuel(fournisseurSemaine[i].getFournisseurID(), allDatabase);

		}

		}
		
//		 imprimer le rapport synthese
		Rapport rapportSynthese = new Rapport(allDatabase);
		
	}
}