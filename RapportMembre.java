/**
 * @author Mohammed & Johnny
 * 
 */
public class RapportMembre {

	private String membreNom, membreAdresse, membreVille, membreProvince,
			membreCodePostal, membreEMail;
	private Integer membreID;
	private Boolean membreActif;
	private Data[][] allDatabase;

	// Ajouter les attributs necessaire pour les infos qu affiche le rapport
	/**
	 * @param user
	 * @param allDatabase
	 */
	public RapportMembre(Membre user, Data[][] allDatabase) {

		this.allDatabase = allDatabase;
		membreNom = user.getMembreNom();
		membreID = user.getMembreID();
		membreAdresse = user.getMembreAdresse();
		membreVille = user.getMembreVille();
		membreProvince = user.getMembreProvince();
		membreCodePostal = user.getMembreCodePostal();
		membreEMail = user.getMembreEMail();
	}

	/**
		 * imprime le rapport du membre
		 */
	public void printRapport() {
		System.out.println("Nom du membre: " + membreNom);
		System.out.println("Numero du membre: " + membreID);
		System.out.println("Adresse du membre: " + membreAdresse);
		System.out.println("Ville du membre: " + membreVille);
		System.out.println("Province du membre: " + membreProvince);
		System.out.println("Code postal du membre: " + membreEMail);

		
		ServiceRendu[] liste = DataServicesRendus.getServicesRendusSemaine(allDatabase);
		System.out.println("Liste des services fournis au membre :");

		int noService = 0;
		int i =0;
		while( i<liste.length && liste[i]!=null){
		if (liste[i].getServiceRenduMembre().equals(membreID)) {
				System.out.println("Service No:"+(noService+1));

				System.out.println("	Date du service: "
						+ liste[i].getServiceRenduDateService());
				System.out.println("	Nom du fournisseur: "
						+ ServiceRendu.getNomFournisseur(liste[i].getServiceRenduFournisseur(), allDatabase));
				System.out.println("	Nom du service: "
						+ ServiceRendu.getNomServiceRendu(liste[i].getServiceRenduService(),allDatabase));
				System.out.println("");

				noService++;
			}
		i++;
		}
		
	}
}
