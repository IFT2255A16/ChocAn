/**
 * @author Mohammed & Johnny
 * 
 */
public class RapportFournisseur {

	private String fournisseurNom, fournisseurAdresse, fournisseurVille,
			fournisseurProvince, fournisseurCodePostal, fournisseurEMail;
	private Integer fournisseurID;
	private Data[][] allDatabase;

	// Ajouter les attributs necessaire pour les infos qu affiche le rapport
	/**
	 * @param user
	 * @param allDatabase
	 */
	public RapportFournisseur(Fournisseur user, Data[][] allDatabase) {

		this.allDatabase = allDatabase;
		fournisseurNom = user.getFournisseurNom();
		fournisseurID = user.getFournisseurID();
		fournisseurAdresse = user.getFournisseurAdresse();
		fournisseurVille = user.getFournisseurVille();
		fournisseurProvince = user.getFournisseurProvince();
		fournisseurCodePostal = user.getFournisseurCodePostal();
		fournisseurEMail = user.getFournisseurEMail();
	}

	/**
		 * imprime le rapport de fournisseur
		 */
	public void printRapport() {
		System.out.println("Nom du fournisseur: " + fournisseurNom);
		System.out.println("Numero du fournisseur: " + fournisseurID);
		System.out.println("Adresse du fournisseur: " + fournisseurAdresse);
		System.out.println("Ville du fournisseur: " + fournisseurVille);
		System.out.println("Province du fournisseur: " + fournisseurProvince);
		System.out.println("Code postal du fournisseur: " + fournisseurEMail);

		ServiceRendu[] liste = DataServicesRendus.getServicesRendusSemaine(allDatabase);
		System.out.println("Liste des services fournis par le fournisseur :");
  
		int noService = 0;
		int i =0;
		while( i<liste.length && liste[i]!=null){
			if (liste[i].getServiceRenduFournisseur().equals(fournisseurID)) {
				//cherche la position du service rendu	
				int position = DataRepertoire.findPosition(liste[i].getServiceRenduService(),(Service[])allDatabase[2]);
				System.out.println("Service No:" +(noService+1));

				System.out.println("	Date du service: "
						+ liste[i].getServiceRenduDateService());
				System.out
						.println("	Date et heure à laquelle les données étaient reçues par l’ordinateur: "
								+ liste[i].getServiceRenduDateEntree());
				System.out
						.println("	Nom du membre: " + liste[i].getNomMembre(liste[i].getServiceRenduMembre(), allDatabase)); 
				System.out.println("	Numéro du membre: "+ liste[i].getServiceRenduMembre());
				System.out.println("	Code du service: "
						+ liste[i].getServiceRenduService()); 
				System.out.println("	Montant à payer: "
						+ ((Service)allDatabase[2][position]).getServiceCout()); 
				System.out.println("");
				noService++;
			}
			i++;
			
		}
	}

}
