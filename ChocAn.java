import java.util.Scanner;

/**
 *
 * @author Maxime
 */
public class ChocAn {
	
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);						
		
		//Cretion des databases hardcodes, un tableau a 2 dimensions contenant des objets Data
		Data[][] allDatabase = databaseCreation();		
		
		System.out.print("Bienvenue dans ChocAn!\n\n");
		
		//Appel d'IdentifierUtilisateur pour recevoir l'objet Utilisateur une fois identifie.
		Utilisateur user = IdentifierUtilisateur(scan, allDatabase);	
		
		if (user == null)
		{
			user = IdentifierUtilisateur(scan, allDatabase);
		}
		
		//System.out.print(user);
		//Affiche le menu correspondant au type d'utilisateur identifie
		switch(user.getUtilisateurType()){			
		case "Membre":
		{
			System.out.println("\nVeuillez contacter un Operateur de ChocAn pour faire des modifications ou annuler votre abonnement.\n");
		}
			break;
		case "Fournisseur":
		{
			MenuFournisseur menu = new MenuFournisseur();
			menu.afficherOption(user, allDatabase);
		}
			break;
		case "Operateur":
		{
			MenuOperateur menu = new MenuOperateur();
			menu.afficherOption(user, allDatabase);
		}
			break;
		case "Manager":
		{
			MenuManager menu = new MenuManager();
			menu.afficherOption(user, allDatabase);
		}
			break;
		case "ACME":
		{	
			MenuACME menu = new MenuACME();
			menu.afficherOption(user, allDatabase);
		}
			break;
		case "Systeme Bancaire":
		{
			MenuSystemeBancaire menu = new MenuSystemeBancaire();
			menu.afficherOption(user, allDatabase);
		}
			break;
		default:
			break;	
		}
		
		System.out.print("\n\nMerci d'avoir utiliser le Systeme ChocAn");
			
	}//fin Main
		
	//Methode pour identifier les utilisateurs et recevoir l'objet Utilisateur correspondant.

    /**
     *
     * @param scan
     * @param allDatabase
     * @return utilisateur
     */
	public static Utilisateur IdentifierUtilisateur(Scanner scan, Data[][] allDatabase) {
				
		Utilisateur user = null;
		/*
		//Option de debugging pour avoir rapidement acces aux listes
		System.out.print("\nTapez L pour consulter les listes ");
		String listeDebug = scan.nextLine().toUpperCase();
		
		if (listeDebug.equals("L"))
			debugAfficherListe(scan, allDatabase);
		*/
		System.out.println("\nIdentifiez-vous, SVP.\n");
		
		//Options de debugging pour rapidement avoir acces au menu d'un type d'utilisateur
//		System.out.println("Debugging:");
//		System.out.println("Username: Membre(M),Fournisseur(F),Gerant(G),Operateur(O),ACME(A),Banques(B)");
//		System.out.println("Mot de passe: debug");
		
		System.out.print("\nEntrez votre nom d'utilisateur:");
		String username = scan.nextLine().toUpperCase();                // Ajoute toUpperCase par Ahmed
		
		System.out.print("\nEntrez votre mot de passe:");
		String password = scan.nextLine();
		
		//Appel d'authenfication avec le username et mot de passe entres par l'utilisateur.
		user = authentification(allDatabase, username, password);
		
		return user;
		
	}//Fin IdentifierUtilisateur


	//Methode pour authentifier l'utilisateur avec son username et password.	

    /**
     *
     * @param allDatabase
     * @param username
     * @param mdp
     * @return
     */
	public static Utilisateur authentification(Data[][] allDatabase, String username, String mdp){
	
		//Boucle verifiant que le username et le mot de passe existent et concordent
		for (int n=0; n<allDatabase[5].length && allDatabase[5][n] != null; n++){
			if (((Utilisateur)allDatabase[5][n]).getUtilisateurID().equals(username))		//si le username donn� est dans la liste
			{
				if (((Utilisateur)allDatabase[5][n]).getUtilisateurPassword().equals(mdp))		//et que le mot de passe concorde
					return (Utilisateur)allDatabase[5][n];										//return l'Utilisateur correspondant
				else 
				{
					System.out.println("Mauvais mot de passe\n");									//sinon, mauvais de mot de passe
					return null;
				}
			}
		}				
		System.out.println("Le nom d'utilisateur n'existe pas\n");								//sinon, le username n'existe pas
		return null;
			
	}//fin authentification

	
	//methode qui cree les databases hardcodes

    /**
     *
     * @return all databse
     */
	public static Data[][] databaseCreation(){
		
		//creation d'une table de Data a deux dimensions.
		Data[][] allDatabase = new Data[6][9999];
		
		//creation des sous-tables pour chaque type de Data
		DataMembre data0 = new DataMembre();
		DataFournisseur data1 = new DataFournisseur();
		DataRepertoire data2 = new DataRepertoire();
		DataServicesRendus data3 = new DataServicesRendus();
		DataTEF data4 = new DataTEF();
		DataUtilisateurs data5 = new DataUtilisateurs();
		
		//Chaque database est hardcode dans sa propre classe.
		//Assignation des listes hardcode a un espace dans le tableau allDatabase.
		//Note: Le tableau d'Utilisateur est un peu different. Plus d'informationd dans la classe DataUtilisateur.
		allDatabase[0] = data0.getListeMembre();
		allDatabase[1] = data1.getListeFournisseur();
		allDatabase[2] = data2.getListeService();
		allDatabase[3] = data3.getListeServiceRendu();
		allDatabase[4] = data4.getListeTEF();
		allDatabase[5] = data5.createUserDatabase(allDatabase);
		
		return allDatabase;
	}//Fin creationDatabase
	
	//Methode uniquement pour le debugging. Elle permet d'afficher la liste souhaitee.

    /**
     *
     * @param scan
     * @param allDatabase
     */
	public static void debugAfficherListe(Scanner scan, Data[][] allDatabase){
		System.out.println("\nQuelle liste voulez-vous afficher?");
		System.out.println("1.Membre\n2.Fournisseur\n3.Service\n4.Services Rendus\n5.TEF\n6.Utilisateur\n");
		
		int menuChoix = scan.nextInt();
		scan.nextLine(); 	//to consume the \n of nextInt()
		
		switch (menuChoix){
		case 1:
			DataMembre.AfficherListeMembre((Membre[])allDatabase[0]);
			break;
		case 2:
			DataFournisseur.AfficherListeFournisseur((Fournisseur[])allDatabase[1]);
			break;
		case 3:
			DataRepertoire.AfficherListeService((Service[])allDatabase[2]);
			break;
		case 4:
			DataServicesRendus.AfficherListeServicesRendus((ServiceRendu[])allDatabase[3]);
			break;
		case 5:
			DataTEF.AfficherListeTEF((TEF[])allDatabase[4]);
			break;
		case 6:
			DataUtilisateurs.AfficherListeUtilisateur((Utilisateur[])allDatabase[5]);
			break;
		default:
			break;
		}
		
	}//Fin debugAfficherListe
			
	
	
}//end Main
