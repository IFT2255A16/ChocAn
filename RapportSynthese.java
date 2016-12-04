/**
 * @author Mohammed & Johnny
 * 
 */
public class RapportSynthese {

	private int totalNbFournisseurs = 0, totalNbConsultations = 0;
	private double totalFrais = 0;
	private Data[][] allDatabase;

	/**
	 * @param allDatabase
	 */
	public RapportSynthese(Data[][] allDatabase) {

		this.allDatabase = allDatabase;
	}


	/**
	 *  imprime rapport Synthese
	 */
	public void printRapport() {

		System.out.println("Rapport de synthese :");
		
		// liste des services rendus cette semaine
		ServiceRendu[] listeServicesSemaine = DataServicesRendus.getServicesRendusSemaine(allDatabase);


		// liste des fournisseurs qui ont donne un service cette semaine 
		Fournisseur[] listeFournisseur = DataFournisseur.getFournisseurServiceSemaine(allDatabase);

		// parcourir la liste de Fournisseurs pour afficher leur rapport
		for (int i = 0; i < listeFournisseur.length; i++) {

			if(listeFournisseur[i]!=null){
				System.out.println("Le nom du fournisseur : "
						+ listeFournisseur[i].getFournisseurNom());

				int nbConsultation = 0;
				double frais = 0;
				for (int j = 0; j < listeServicesSemaine.length; j++) {
					if(listeServicesSemaine[j]!=null){
					if (listeServicesSemaine[j].getServiceRenduFournisseur().equals(listeFournisseur[i].getFournisseurID())) {

						// chercher la position du service pour recuperer le cout
						int position = DataRepertoire.findPosition(
								listeServicesSemaine[j].getServiceRenduService(),
								(Service[])allDatabase[2]); 
						nbConsultation++;
						frais += ((Service) allDatabase[2][position])
								.getServiceCout();
					}
					}
				}

				System.out.println("Nombre de consultations :" + nbConsultation);
				System.out.println("Frais a payer : " + frais);
				System.out.println("");
				totalNbConsultations += nbConsultation;
				totalNbFournisseurs++;
				totalFrais += frais;
			}
		}
		
		System.out.println("Nombre total de fournisseurs: "
				+ totalNbFournisseurs);
		System.out.println("Nombre total de consultations: "
				+ totalNbConsultations);
		System.out.println("montant total a payer: " + totalFrais);

	}

}
