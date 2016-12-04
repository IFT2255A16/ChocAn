
/**
 *
 * @author Maxime
 */
public class DataUtilisateurs extends Database{

	//Creation manuel de la iste des utilisateurs qui ne sont ni Membres, ni Fournisseurs
	
	Utilisateur[] listeAutre = new Utilisateur[]{
		new Utilisateur("G","debug","Manager"),
		new Utilisateur("eu@tincidunt.co.uk","RUJ13CEG8ML","Manager"),
		new Utilisateur("felis@egestasAliquamnec.edu","EVG20XBU2QX","Manager"),
		new Utilisateur("metus.urna.convallis@nuncsed.net","NXN53JTX2VW","Manager"),
		new Utilisateur("neque.sed.dictum@auguemalesuada.com","PVZ53WYH3RE","Manager"),
		new Utilisateur("O","debug","Operateur"),
		new Utilisateur("tincidunt.dui.augue@necimperdiet.net","BNR24FFA8KL","Operateur"),
		new Utilisateur("vitae.aliquet.nec@dui.org","ZMC25FSQ2FY","Operateur"),
		new Utilisateur("dui@tellusAeneanegestas.ca","BLR49HBB3ZN","Operateur"),
		new Utilisateur("lorem.lorem.luctus@lacusCrasinterdum.edu","XOR50LXS3EO","Operateur"),
		new Utilisateur("enim.Mauris.quis@arcu.net","KSM15PNO9ZM","Operateur"),
		new Utilisateur("enim.Curabitur@tincidunt.org","IHO13NIX5BD","Operateur"),
		new Utilisateur("tincidunt.Donec.vitae@hendrerit.net","EYG38ALC6IV","Operateur"),
		new Utilisateur("nonummy@libero.edu","IVB59EQK6VH","Operateur"),
		new Utilisateur("A","debug","ACME"),
		new Utilisateur("ipsum.primis.in@eu.org","KDR24VDX7NL","ACME"),
		new Utilisateur("Vivamus.nibh@sagittislobortismauris.com","QDR79KNY1BJ","ACME"),
		new Utilisateur("tristique.aliquet.Phasellus@erat.ca","SSN63NQJ6IH","ACME"),
		new Utilisateur("est.congue.a@tempuslorem.net","ONB30LGE5ZH","ACME"),
		new Utilisateur("B","debug","Systeme Bancaire"),
		new Utilisateur("Cras.pellentesque.Sed@Fuscediam.org","NWD05MGK7VG","Systeme Bancaire"),
		new Utilisateur("vel@semconsequat.edu","WAT35SPC7TO","Systeme Bancaire"),
		new Utilisateur("semper@dis.ca","FFW36SBZ1ZU","Systeme Bancaire"),
		new Utilisateur("nec@euismodmauris.net","IYZ31UJV5BT","Systeme Bancaire"),
		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null
	};//fin listeUtilisateur

	//Creation de la liste des utilisateurs depuis la liste des membres, fournisseurs et autres.
	//Note: C'est diff�rent des autres Database, puisque les membres et fournisseurs sont �galement des classes.
	//On doit donc aller les chercher depuis les database DataMembre et DataFournisseur

    /**
     * Retourner la liste des utilisateurs
     * @param allDatabase
     * @return liste des utilisateurs
     */
	
	public Utilisateur[] createUserDatabase(Data[][] allDatabase){
	
		int k=0;
		Utilisateur[] listeUtilisateur = new Utilisateur[500];	//creation du tableau d'Utilisateur
		
		//Peuplement de tous les membres de DataMembre
		for (int n=0; n<allDatabase[0].length; n++)
			if (allDatabase[0][n] != null)
			{
				listeUtilisateur[k] = (Membre)allDatabase[0][n];
				k++;
			}
		
		//Peuplement de tous les fournisseurs de DataFournisseur
		for (int m=0; m<allDatabase[1].length; m++)
			if (allDatabase[1][m] != null)
			{
				listeUtilisateur[k] = (Fournisseur)allDatabase[1][m];
				k++;
			}
		
		//Peuplement des autres utilisateurs depus le tableau listeAutre
		for (int p=0; p<listeAutre.length; p++){
			listeUtilisateur[k] = listeAutre[p];
				k++;
			}
		
		return listeUtilisateur;
	}
	
    /**
     * Methode permettant l'affichage de la database
     * @param listeUtilisateur
     */
	public static void AfficherListeUtilisateur(Utilisateur[] listeUtilisateur){	//pour le debug seulement
		
		int n = 0;
		while (n<listeUtilisateur.length){
			try{
			System.out.println(listeUtilisateur[n]);
			n++;
			}catch (NullPointerException npe){
				//Ignore les null de facon a ce qu'on puisse les afficher.
				//Non n�cessaire, si le tableau est retri� apres la suppression (� v�rifier)
			}
		}
	
	}

    /**
     * Ajouter un utilisateur
     */
    public void AjouterUtiliateur() {
		// TODO - implement DataUtilisateurs.AjouterUtiliateur
		// Ajouter l'intance de Data Membre ou Fournisseur
		// Si c'est un  manager,op�rateur,Acme ou systeme bancaire: Ajouter les donn�es (username,password,type)
	}

    /**
     * Supprimer un utilisateur
     */
    public void SupprimerUtilisateur() {
		// TODO - implement DataUtilisateurs.SupprimerUtilisateur
	}

    /**
     * Mettre à jour un utilisateur
     */
    public void MettreAJourUtilisateur() {
		// TODO - implement DataUtilisateurs.MettreAJourUtilisateur
	}

	
}