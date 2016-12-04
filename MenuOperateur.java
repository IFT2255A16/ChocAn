import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Antoine
 *
 */
public class MenuOperateur {

	Scanner scan = new Scanner(System.in);
	
	//Methode affichant les options de l'operateur
	/**
	 * @param user
	 * @param allDatabase
	 */
	public void afficherOption(Utilisateur user, Data[][] allDatabase){
		System.out.println("\nVeuillez choisir une des options pour les operateurs:\n");
		System.out.println("1.Gerer le compte d'un membre\n2.Gerer le compte d'un fournisseur\n3.Gerer les informations d'un service\n4.Log off");
	
		Integer menuChoix = scan.nextInt();
		
		switch(menuChoix)
		{
		case 1:
			gererMembre(allDatabase[0]);
			break;
		case 2:
			gererFournisseur(allDatabase[1]);
			break;
		case 3:
			gererService(allDatabase[2]);
		case 4:
			break;
		}
	}
	
	//TODO Design: Ajouter/Supprimer un membre/fournisseur l'ajoute/supprime des utilisateurs �galement?
	//Methode permettant l'ajout, la modification et la suppression d'un membre
	/**
	 * @param DBMembre
	 */
	public void gererMembre(Data[] DBMembre) {
		
		System.out.println("\nVeuillez choisir une des options suivantes:\n");
		System.out.println("1.Ajouter un membre\n2.Modifier les information d'un membre\n3.Supprimer un membre\n4.Afficher la liste des membres\n5.Log off");
	
		Integer menuChoix = scan.nextInt();
		
		switch(menuChoix)
		{
		case 1:
			ajouterMembre(DBMembre);
			break;
		case 2:
			modifierMembre(DBMembre);
			break;
		case 3:
			supprimerMembre(DBMembre);
			break;
		case 4:
			DataMembre.AfficherListeMembre((Membre[])DBMembre);
			gererMembre(DBMembre);
			break;
		case 5:
			break;
		
		}
		
	}

	//Methode permettant l'ajout, la modification et la suppression d'un fournisseur
	/**
	 * @param DBFournisseur
	 */
	public void gererFournisseur(Data[] DBFournisseur) {
		
		System.out.println("\nVeuillez choisir une des options suivantes:\n");
		System.out.println("1.Ajouter un fournisseur\n2.Modifier les information d'un fournisseur\n3.Supprimer un fournisseur\n4.Afficher la liste des fournisseurs\n5.Retour");
	
		Integer menuChoix = scan.nextInt();
		
		switch(menuChoix)
		{
		case 1:
			ajouterFournisseur(DBFournisseur);
			break;
		case 2:
			modifierFournisseur(DBFournisseur);
			break;
		case 3:
			supprimerFournisseur(DBFournisseur);
			break;
		case 4:
			DataFournisseur.AfficherListeFournisseur((Fournisseur[])DBFournisseur);
			gererFournisseur(DBFournisseur);
			break;
		case 5:
			break;
		}
	}

	//Methode permettant l'ajout, la modification et la suppression d'un service
	/**
	 * @param DBService
	 */
	public void gererService(Data[] DBService) {
		
		System.out.println("\nVeuillez choisir une des options suivantes:\n");
		System.out.println("1.Ajouter un service\n2.Modifier un service\n3.Supprimer un service\n4.Afficher la liste des services\n5.Log off");
	
		Integer menuChoix = scan.nextInt();
		
		switch(menuChoix)
		{
		case 1:
			ajouterService(DBService);
			break;
		case 2:
			modifierService(DBService);
			break;
		case 3:
			supprimerService(DBService);
			break;
		case 4:
			DataRepertoire.AfficherListeService((Service[])DBService);
			gererService(DBService);
			break;
		case 5:
			break;
		}
	}

	//Methode permettant l'ajout d'un membre
	/**
	 * @param DBMembre
	 */
	public void ajouterMembre(Data[] DBMembre){
		
		System.out.println("\nVeuillez entrer le courriel du membre:\n");
		scan.nextLine();
		String eMail = scan.nextLine();
		System.out.println("\nVeuillez entrer le nom du membre:\n");
		String nom = scan.nextLine();
		System.out.println("\nVeuillez entrer l'adresse du membre:\n");
		String adr = scan.nextLine();
		System.out.println("\nVeuillez entrer la ville du membre:\n");
		String ville = scan.nextLine();
		System.out.println("\nVeuillez entrer la province du membre:\n");
		String prov = scan.nextLine();
		System.out.println("\nVeuillez entrer le code postal du membre:\n");
		String cPost = scan.nextLine();
		System.out.println("\nVeuillez entrer un mot de passe pour le membre:\n");
		String pass = scan.nextLine();
		
		int id = 0, loc = 0;
		for (int i = 0; i < DBMembre.length; i++){
			//assumant une fonction de rehash qui permet toujours d'avoir des elements null
			if (DBMembre[i] == null){
				id = ((Membre) DBMembre[i-1]).getMembreID()+1;
				loc = i;
				break;
			}
		}
		Membre nouveauMembre = new Membre(eMail, pass, "Membre", id, nom, adr, ville, prov, cPost, eMail, true);
		DataMembre.AjouterMembre(nouveauMembre, loc);
		gererMembre(DBMembre);

	}
	
	//Methode permettant la modification d'un membre
	/**
	 * @param DBMembre
	 */
	public void modifierMembre(Data[] DBMembre){
		try{
			System.out.println("\nVeuillez entrer le ID du membre:\n");
			scan.nextLine();
			Integer id = scan.nextInt();
			int indx = IndexMembre(id, DBMembre);
			if(indx==-1)
				System.out.println("\nMembre non valide\n");
			while(indx!=-1){

				System.out.println("\nQuelle information voulez vous modifier?:\n");
				System.out.println("1.Courriel\n2.Nom\n3.Adresse\n4.Ville\n5.Province\n6.Code postal\n7.ID\n8.Retour");
				Integer choix = scan.nextInt();
				
				switch(choix)
				{
				case 1:
					System.out.println("\nVeuillez entrer le courriel du membre:\n");
					scan.nextLine();
					String courriel = scan.nextLine();
					DataMembre.MettreAJourMembre(indx, "email", courriel);
					break;
				case 2:
					System.out.println("\nVeuillez entrer le nom du membre:\n");
					scan.nextLine();
					String nom = scan.nextLine();
					DataMembre.MettreAJourMembre(indx, "nom", nom);
					break;
				case 3:
					System.out.println("\nVeuillez entrer l'adresse du membre:\n");
					scan.nextLine();
					String adr = scan.nextLine();
					DataMembre.MettreAJourMembre(indx, "adr", adr);
					break;
				case 4:
					System.out.println("\nVeuillez entrer la ville du membre:\n");
					scan.nextLine();
					String ville = scan.nextLine();
					DataMembre.MettreAJourMembre(indx, "ville", ville);
					break;
				case 5:
					System.out.println("\nVeuillez entrer la province du membre:\n");
					scan.nextLine();
					String prov = scan.nextLine();
					DataMembre.MettreAJourMembre(indx, "prov", prov);
					break;
				case 6:
					System.out.println("\nVeuillez entrer le code postal du membre:\n");
					scan.nextLine();
					String code = scan.nextLine();
					DataMembre.MettreAJourMembre(indx, "code", code);
					break;
				case 7:
					System.out.println("\nVeuillez entrer le ID du membre:\n");
					scan.nextLine();
					Integer newId = scan.nextInt();
					DataMembre.MettreAJourMembre(indx, "id", newId);
					break;
				case 8:
					gererMembre(DBMembre);
					break;
				default:
					break;
				}
				gererMembre(DBMembre);
			}
			gererMembre(DBMembre);
		}catch (InputMismatchException e){
			System.out.print("Input invalide");
			modifierMembre(DBMembre);
		}
		
	}

	//Methode permettant la suppression d'un membre
	/**
	 * @param DBMembre
	 */
	public void supprimerMembre(Data[] DBMembre){
		try{
			System.out.println("\nVeuillez entrer le ID du membre:\n");
			scan.nextLine();
			Integer id = scan.nextInt();
	
			int indx = IndexMembre(id, DBMembre);
			if(indx==-1)
				System.out.println("\nMembre non valide\n");
			else
				DataMembre.SupprimerMembre(indx);
			gererMembre(DBMembre);
		}catch (InputMismatchException e){
			System.out.print("Input invalide");
			supprimerMembre(DBMembre);
		}
	}

	/**
	 * @param DBFournisseur
	 */
	public void ajouterFournisseur(Data[] DBFournisseur){
		System.out.println("\nVeuillez entrer le courriel du Fournisseur:\n");
		scan.nextLine();
		String eMail = scan.nextLine();
		System.out.println("\nVeuillez entrer le nom du Fournisseur:\n");
		String nom = scan.nextLine();
		System.out.println("\nVeuillez entrer l'adresse du Fournisseur:\n");
		String adr = scan.nextLine();
		System.out.println("\nVeuillez entrer la ville du Fournisseur:\n");
		String ville = scan.nextLine();
		System.out.println("\nVeuillez entrer la province du Fournisseur:\n");
		String prov = scan.nextLine();
		System.out.println("\nVeuillez entrer le code postal du Fournisseur:\n");
		String cPost = scan.nextLine();
		System.out.println("\nVeuillez entrer un mot de passe pour le Fournisseur:\n");
		String pass = scan.nextLine();
		
		int id = 0, loc = 0;
		for (int i = 0; i < DBFournisseur.length; i++){
			//assumant une fonction de rehash qui permet toujours d'avoir des elements null
			if (DBFournisseur[i] == null){
				id = ((Fournisseur) DBFournisseur[i-1]).getFournisseurID()+1;
				loc = i;
				break;
			}
		}
		Fournisseur nouveauFournisseur = new Fournisseur(eMail, pass, "Fournisseur", id, nom, adr, ville, prov, cPost, eMail);
		DataFournisseur.AjouterFournisseur(nouveauFournisseur, loc);
		gererFournisseur(DBFournisseur);
	}
	
	/**
	 * @param DBFournisseur
	 */
	public void modifierFournisseur(Data[] DBFournisseur){
		try{
			System.out.println("\nVeuillez entrer le ID du Fournisseur:\n");
			scan.nextLine();
			Integer id = scan.nextInt();
		
			int indx = IndexFournisseur(id, DBFournisseur);
			if(indx==-1)
				System.out.println("\nFournisseur non valide\n");
			while(indx!=-1){
	
				System.out.println("\nQuelle information voulez vous modifier?:\n");
				System.out.println("1.Courriel\n2.Nom\n3.Adresse\n4.Ville\n5.Province\n6.Code postal\n7.ID\n8.Retour");
				Integer choix = scan.nextInt();
	
				switch(choix)
				{
				case 1:
					System.out.println("\nVeuillez entrer le courriel du Fournisseur:\n");
					scan.nextLine();
					String courriel = scan.nextLine();
					DataFournisseur.MettreAJourFournisseur(indx, "email", courriel);
					break;
				case 2:
					System.out.println("\nVeuillez entrer le nom du Fournisseur:\n");
					scan.nextLine();
					String nom = scan.nextLine();
					DataFournisseur.MettreAJourFournisseur(indx, "nom", nom);
					break;
				case 3:
					System.out.println("\nVeuillez entrer l'adresse du Fournisseur:\n");
					scan.nextLine();
					String adr = scan.nextLine();
					DataFournisseur.MettreAJourFournisseur(indx, "adr", adr);
					break;
				case 4:
					System.out.println("\nVeuillez entrer la ville du Fournisseur:\n");
					scan.nextLine();
					String ville = scan.nextLine();
					DataFournisseur.MettreAJourFournisseur(indx, "ville", ville);
					break;
				case 5:
					System.out.println("\nVeuillez entrer la province du Fournisseur:\n");
					scan.nextLine();
					String prov = scan.nextLine();
					DataFournisseur.MettreAJourFournisseur(indx, "prov", prov);
					break;
				case 6:
					System.out.println("\nVeuillez entrer le code postal du Fournisseur:\n");
					scan.nextLine();
					String code = scan.nextLine();
					DataFournisseur.MettreAJourFournisseur(indx, "code", code);
					break;
				case 7:
					System.out.println("\nVeuillez entrer le ID du Fournisseur:\n");
					scan.nextLine();
					Integer newId = scan.nextInt();
					DataFournisseur.MettreAJourFournisseur(indx, "id", newId);
					break;
				case 8:
					gererFournisseur(DBFournisseur);
					break;
				default:
					break;
				}
			}
			gererFournisseur(DBFournisseur);
		}catch (InputMismatchException e){
			System.out.print("Input invalide");
			modifierFournisseur(DBFournisseur);
		}
	}
	
	/**
	 * @param DBFournisseur
	 */
	public void supprimerFournisseur(Data[] DBFournisseur){
		try{
			System.out.println("\nVeuillez entrer le ID du fournisseur:\n");
			scan.nextLine();
			Integer id = scan.nextInt();
			int indx = IndexFournisseur(id, DBFournisseur);
			if(indx==-1)
				System.out.println("\nFournisseur non valide\n");
			else
				DataFournisseur.SupprimerFournisseur(indx);
			gererFournisseur(DBFournisseur);
		}catch (InputMismatchException e){
			System.out.print("Input invalide");
			supprimerFournisseur(DBFournisseur);
		}
	}
	
	/**
	 * @param DBService
	 */
	public void ajouterService(Data[] DBService){
		System.out.println("\nVeuillez entrer le nom du service:\n");
		scan.nextLine();
		String nom = scan.nextLine();
		System.out.println("\nVeuillez entrer le cout du service:\n");
		Double cout = scan.nextDouble();

		
		int id = 0, loc = 0;
		for (int i = 0; i < DBService.length; i++){
			//assumant une fonction de rehash qui permet toujours d'avoir des elements null
			if (DBService[i] == null){
				id = ((Service) DBService[i-1]).getServiceID()+1;
				loc = i;
				break;
			}
		}
		Service nouveauService = new Service(id, nom, cout);
		DataRepertoire.AjouterService(nouveauService, loc);
		gererService(DBService);
	}
	
	/**
	 * @param DBService
	 */
	public void modifierService(Data[] DBService){
		try{
			System.out.println("\nVeuillez entrer le ID du service:\n");
			scan.nextLine();
			Integer id = scan.nextInt();
	
			int indx = IndexService(id, DBService);
			if(indx==-1)
				System.out.println("\nService non valide\n");
			while(indx!=-1){
	
				System.out.println("\nQuelle information voulez vous modifier?:\n");
				System.out.println("1.Nom\n2.Cout\n3.ID\n4.Retour");
				Integer choix = scan.nextInt();
				
				
				switch(choix)
				{
				case 1:
					System.out.println("\nVeuillez entrer le nom du service:\n");
					scan.nextLine();
					String nom = scan.nextLine();
					DataRepertoire.MettreAJourService(indx, "nom", nom);
					break;
				case 2:
					System.out.println("\nVeuillez entrer le cout du service:\n");
					scan.nextLine();
					Double cout = scan.nextDouble();
					DataRepertoire.MettreAJourService(indx, "cout", cout);
					break;
				case 3:
					System.out.println("\nVeuillez entrer le ID du service:\n");
					scan.nextLine();
					Integer newId = scan.nextInt();
					DataRepertoire.MettreAJourService(indx, "id", newId);
					break;
				case 4:
					gererService(DBService);
					break;
				default:
					break;
				}
			}
			gererService(DBService);
		}catch (InputMismatchException e){
			System.out.print("Input invalide");
			modifierService(DBService);
		}
	}
	
	/**
	 * @param DBService
	 */
	public void supprimerService(Data[] DBService){
		try{
			System.out.println("\nVeuillez entrer le id du service:\n");
			scan.nextLine();
			Integer newId = scan.nextInt();
	
			int indx = IndexService(newId, DBService);
			if(indx==-1)
				System.out.println("\nService non valide\n");
			else
				DataRepertoire.SupprimerService(indx);
			gererService(DBService);
		}catch (InputMismatchException e){
			System.out.print("Input invalide");
			supprimerService(DBService);
		}
	}
	
	
	/**
	 * @param id
	 * @param DB
	 * @return
	 */
	public int IndexMembre(int id, Data[] DB){
		
		for (int i = 0; i < DB.length; i++){
			if((DB[i])!=null){
				if(((Membre) DB[i]).getMembreID()==id){
					return i;
				}
			}
		}
		return -1;
	}
	/**
	 * @param id
	 * @param DB
	 * @return
	 */
	public int IndexFournisseur(int id, Data[] DB){
		for (int i = 0; i < DB.length; i++){
			if((DB[i])!=null){
				if(((Fournisseur) DB[i]).getFournisseurID()==id){
					return i;
				}
			}
		}
		return -1;
	}
	/**
	 * @param id
	 * @param DB
	 * @return
	 */
	public int IndexService(int id, Data[] DB){
		for (int i = 0; i < DB.length; i++){
			if((DB[i])!=null){
				if(((Service) DB[i]).getServiceID()==id){
					return i;
				}
			}
		}
		return -1;
	}
}
	



