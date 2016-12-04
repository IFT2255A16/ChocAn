/**
 * @author Mohammed & Johnny
 * 
 */
public class Rapport {

	private Integer userId;
	private Data[][] allDatabase;

	public Rapport(Integer userId, Data[][] allDatabase) {
		this.userId = userId;
		this.allDatabase = allDatabase;

		GenereRapportIndividuel(userId);
	}

	/**
	 * @param allDatabase
	 */
	public Rapport(Data[][] allDatabase) {

		this.allDatabase = allDatabase;
		GenereRapportSynthese();
	}
	
	/**
	 * @param utilisateurID
	 * genere rapport pour un utilisateur
	 */
	public void GenereRapportIndividuel(Integer utilisateurID) {
		Utilisateur[] users = (Utilisateur[]) allDatabase[5];
		boolean found = true;
		int pos = 0;
		// parcourir la liste des utilisateurs
		while (found && (pos < users.length)) {
			if (users[pos] instanceof Fournisseur) {

				if (((Fournisseur) users[pos]).getFournisseurID().equals(utilisateurID)) {

					RapportFournisseur monRapport = new RapportFournisseur(
							(Fournisseur) users[pos], allDatabase);
					monRapport.printRapport(); 
					found = false;
				}
				pos++;
			} else if (users[pos] instanceof Membre) {
				if (((Membre) users[pos]).getMembreID().equals(utilisateurID)) {
					RapportMembre monRapport = new RapportMembre((Membre) users[pos], allDatabase);
					monRapport.printRapport();

					found = false;
				}
				pos++;
			}
			pos++;
		} 
		System.out.println("Utilisateur non trouvé"); // cas ou utilisateur non trouve

		

	}

	/**
	 * genere un rapport de synthese
	 */
	public void GenereRapportSynthese() {

		RapportSynthese monRapport = new RapportSynthese(allDatabase);
		monRapport.printRapport();
	}

}
