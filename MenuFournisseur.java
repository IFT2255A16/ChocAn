import java.util.Scanner;
import java.text.DateFormat;		//to verify data format
import java.text.ParseException;	//to verify date format
import java.text.SimpleDateFormat; 	//to verify date format
import java.util.Date;				//to verify date format
import java.util.InputMismatchException;

/**
 *
 * @author Maxime
 */
public class MenuFournisseur {

	Scanner scan = new Scanner(System.in);
	
	//Variable pour storer les elements qui seront inscrits dans les database apres un service rendu
	String writeDateHeureActuelle = "";
	String writeDateFourni = "";
	Integer writeFournisseurID = null;
	Integer writeMembreID = null;
	Integer writeCodeService = null;
	String writeCommentaire = "";
	String writeFournisseurNom = "";
	Double writeServiceCout = null;
	
	
	

    /**
     * Methode pour afficher les options disponibles pour les fournisseurs
     * @param user
     * @param allDatabase
     */
	public void afficherOption(Utilisateur user, Data[][] allDatabase){
		writeFournisseurID = ((Fournisseur)user).getFournisseurID();	//Variable n�cessaire lors de l'�criture vers le DataServiceRendu et vers le DataTEF
		writeFournisseurNom =((Fournisseur)user).getFournisseurNom();	//Variable n�cessaire lors de l'�criture vers le DataServiceRendu
		Integer menuChoix = 0;
		
		menuFournisseurLoop:
			while(true){
			try{
				System.out.println("\nVeuillez choisir une des options pour les fournisseurs:\n");
				System.out.println("1.Remplir une demande de service\n2.Consulter le repertoire\n3.Déconnexion\n");
			
				menuChoix = scan.nextInt();
				scan.nextLine(); //	to consume the \n from the nextInt()
			}catch (InputMismatchException e){
				scan.nextLine(); // 
				continue menuFournisseurLoop;
			}

			switch(menuChoix)
			{
			case 1:
				remplirDemandeService(allDatabase);
				break menuFournisseurLoop;
			case 2:
				consulterRepertoire(allDatabase);
				continue menuFournisseurLoop;
			case 3:
				break;
			}
		}
	}
    /**
     * Methode permettant l'affichage du repertoire des fournisseurs.
     * TODO Design: Est-ce qu'on fait l'envoie par email ou l'affichge � l'�cran?
     * @param allDatabase
     */
	public void consulterRepertoire(Data[][] allDatabase) {
		
		System.out.print("Vous avez choisi de consulter le repertoire des fournisseurs.\n");

		DataRepertoire.AfficherListeService((Service[])allDatabase[2]);
		
	}

    /**
     * Methode posant les questions et verifiant les reponses necessaire pour remplir une demande de service.
     * Elle est �galement responsable de l'�criture des donn�es vers DataServiceRendu et DataTEF.
     * @param allDatabase
     */
	public void remplirDemandeService(Data[][] allDatabase) {
		System.out.print("Vous avez choisi de remplir une demande de service\n");

		Integer idMembre = 0;
		
		//Loop pour s'assurer que le membre est valide.
		validationLoop:
		while (true)
		{
				//scan.nextLine();
			try{
				System.out.println("\nVeuillez authentifier le membre.\n\nEntrez son numero d'identification ou entrez 0 pour quitter.");
				idMembre = scan.nextInt();
				
				
			}catch (InputMismatchException e){
				System.out.println ("Numero de membre invalide\n");
				scan.nextLine(); // 
				continue validationLoop;
			}
			
			
			if (idMembre == 0)			//Si l'utilisateur entre 0, il quitte ChocAn.
				return;
			else if ((int)(Math.log10(idMembre)+1)!=9) //V�rifie que le idMembre a 9 caracteres
			{
				System.out.println("\nNumero de membre invalide\n");
				continue validationLoop;
			}	
			else
				System.out.println("\nLe numero du membre est: "+idMembre);
			
				//Appel de la methode validerMembre pour v�rifier s'il est dans la database et s'il est actif.
				String isValid = validerMembre(idMembre, allDatabase);
			
				//S'il n'est pas valide, on imprime un message expliquant qu'il est soit inexistant, soit suspendu.
				if (!(isValid.equals("valide"))){
					System.out.println("\nDesole. Le membre est "+isValid);
					continue validationLoop;
				}
				
				//S'il est valide, on sort de la boucle
				System.out.println("\nMembre valide.");
				writeMembreID = idMembre; //Variable necessaire pour �crire dans le DataServiceRendus
				
				scan.nextLine(); //to consume the \n from a nextInt() somewhere
				break validationLoop;
			}
		
		
		//Loop pour s'assurer que la date est entr�e dans le bon format
		dateServiceLoop:
		while(true){
			
			System.out.println("\nEntrez la date dans le format JJ-MM-AAAA");
			
			String dateEntree = scan.nextLine();
			
			//Verifie que le format de la date est correct
			if (isValidDateFormat("dd-MM-yyyy",dateEntree)){
				writeDateFourni = dateEntree;		//Variable necessaire pour �crire dans DataServiceRendu
				break dateServiceLoop;
			}
				
				
		}
		
		Integer codeEntre = 0;
		Service serviceOffert = null; //pour y storer le service	
		
		//Loop pour v�rifier que le code existe et est bien celui d�sir� par le fournisseur.
		codeServiceLoop:
		while(true){	
		
			try{
				System.out.println("\nEntrez le code du service (ou entrez 99 pour voir le repertoire des services offerts)");
		
				
				codeEntre = scan.nextInt();
			}catch (InputMismatchException e){
				System.out.println ("Code de service invalide\n");
				scan.nextLine(); // 
				continue codeServiceLoop;
			}
			
			//Si l'utilisateur entre 99, on refait appel � consulterRepertoire
			if (codeEntre == 99)
			{
				consulterRepertoire(allDatabase);
				continue codeServiceLoop;
			}
			else if (((int)(Math.log10(codeEntre)+1)!=6))	//Verification que le code a bien 6 chiffres
			{
				System.out.println("\nLe code de service doit avoir 6 chiffres.");
				continue codeServiceLoop;
			}
			else
				//Appel de la methode qui va valider le code de Service. Permet de recevoir l'instance de Service.
				serviceOffert = validerCodeService(codeEntre, allDatabase);
			
				//Si aucun service ne correspond au code, on recommence la loop
				if (serviceOffert == null){
					System.out.println("\nAucun service ne correspond au code");
					continue codeServiceLoop;
				}
				
				//Verification que c'est bien le service d�sir� par le fournisseur				
				System.out.println("\nLe code correspond au service suivant: "+serviceOffert.getServiceNom());
				System.out.print("Est-ce bien le service que vous avez offert? (O/N)");
				
				scan.nextLine(); //to consume the \n from the nextInt()
				String serviceConfirme = scan.nextLine().toUpperCase();
				
				//Si c'est bien le code, on sort de la loop, sinon on recommence la loop.
				switch(serviceConfirme){
					case "O":
					{
						writeCodeService = serviceOffert.getServiceID();	//Variable n�cessaire pour �crire les donn�es dans DataServiceRendu et DataTEF
						writeServiceCout = serviceOffert.getServiceCout();	//Variable n�cessaire pour �crire les donn�es dans DataTEF
						break codeServiceLoop;
					}
					case "N":
						continue codeServiceLoop;
					default:
					{
						System.out.println("Mauvais choix.\n");
						continue codeServiceLoop;
					}
				}
		}//fin codeServiceLoop
		
		//Loop pour demander � l'utilisateur s'il veut ajouter un commentaire.
		commentaireLoop:
		while(true){
			System.out.print("\nVoulez-vous ajouter un commentaire?(O/N)?");

			String commentaireConfirme = scan.nextLine().toUpperCase();
			
			switch(commentaireConfirme){
				case "O":
				{
					System.out.println("Ecrivez votre commentaire.\n");
					writeCommentaire = scan.nextLine();	//Variable necessaire pour �crire dans DataServiceRendu
					//TODO Contrainte de 100 mots pour le commentaire
				}	
				case "N":
					break commentaireLoop;
				default:
					continue commentaireLoop;
				
			}	
		}
		
		//Ajout des donn�es dans les database DataServiceRendu et DataTEF
		updateServiceRendu(allDatabase);
		updateTEF(allDatabase);
		
		//Debug pour voir les nouvelles listes avec les ServiceRendu et TEF ajout�	
		System.out.print("\n(DEBUG)Voir les nouvelles listes?(O/N)");
		String checkChoix = scan.nextLine().toUpperCase();
		
		if (checkChoix.equals("O")){
			DataServicesRendus.AfficherListeServicesRendus((ServiceRendu[])allDatabase[3]);
			DataTEF.AfficherListeTEF((TEF[])allDatabase[4]);
		}
	}
	

    /**
     * Methode pour valider l'ID d'un membre
     * @param id
     * @param allDatabase
     * @return
     */
	public String validerMembre(Integer id, Data[][]allDatabase) {
		
		String isNotValid = "inexistant";	//Par d�faut, le membre est inexistant
		
		for (int n=0; n<allDatabase[0].length; n++){
			try{
			if ((((Membre)allDatabase[0][n]).getMembreID().equals(id)))			//Si l'ID du membre existe
					if (((Membre)allDatabase[0][n]).getMembreActif()==true)			//Si le membre est actif
						return "valide";											//Retourner "valide"
					else
						return "suspendu";											//Sinon, retourner "suspendu"
			}catch (NullPointerException npe){
				//Juste pour ignorer les membres null du tableau
			}
		}
		return isNotValid;													//Si il n'est pas trouv�, retourner "inexistant"
	}

	//Methode permettant de valier le code de service et retourne le service valid�.

    /**
     * Retourner un service associé avec le code fourni
     * @param code
     * @param allDatabase
     * @return service associé avec le code fourni
     */
	public Service validerCodeService(Integer code, Data[][]allDatabase){
		
		//On cherhce le code parmi le database
		int pos = DataRepertoire.findPosition(code, (Service[])allDatabase[2]);

		//On renvoie -1 s'il n'est pas dans le database
		if (pos == -1)
			return null;
		
		//S'il s'y trouve, on renvoie le service.
		return (Service)allDatabase[2][pos];
	}
	
	//Verifie le format de la date (copy/paste depuis StackOverflow)

    /**
     * Retourner une évaluation de la date entrée
     * @param format
     * @param text
     * @return un booléen qui indique si la date entrée est dans la bonne format ou non
     */
	public static boolean isValidDateFormat(String format, String text){
		
		Date date = null;
		try{
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			date = sdf.parse(text);
			if(!text.equals(sdf.format(date)))
				date=null;
		}catch (ParseException ex){
			System.out.print("\nMauvais format de date!\n");
		}
		return date != null;
	}
	
    /**
     * On ajoute le service rendu au datababse DataServiceRendu
     * @param allDatabase
     */
	public void updateServiceRendu(Data[][] allDatabase){
		
		//Pour pouvoir avoir la date et heure actuelle dans le format d�sir�
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Date date = new Date();
		
		writeDateHeureActuelle = dateFormat.format(date).toString();	//Variable necessaire pour �crire dans DataServiceRendu
		
		//Appel de AjouterServiceRendue
		DataServicesRendus.AjouterServiceRendu(allDatabase, writeDateHeureActuelle, writeDateFourni, writeFournisseurID, writeMembreID, writeCodeService, writeCommentaire);
		
		//Signifier a l'utilisateur que le changement a eu lieu et quels ont �t� les changements.
		System.out.print("\n***Write to ServiceRendu Database***");
		System.out.print("\nDate et Heure Actuelle: "+writeDateHeureActuelle+"\nDate du Service Fourni: "+writeDateFourni
				+"\nFournisseur: "+writeFournisseurID+"\nMembre: "+writeMembreID+"\nCode du Service: "+writeCodeService+"\nCommentaire: "+writeCommentaire);
		}
	

    /**
     * On ajoute le TEF au database DataTEF
     * @param allDatabase
     */
	public void updateTEF(Data[][] allDatabase){
		
		//Appel d'AjouterTEF
		DataTEF.AjouterTEF(allDatabase, writeFournisseurID, writeFournisseurNom, writeCodeService, writeServiceCout);
		
		//Signifer � l'utilisateur que le changement a eu lieu et quels ont �t� les changements.
		System.out.print("\n\n***Write to TEF Database***");
		System.out.print("\nFournisseur: "+writeFournisseurID+" "+writeFournisseurNom+"\nCode du Service: "+writeCodeService+"\nCout du service: "+writeServiceCout);
		}
}
	
