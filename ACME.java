

/**
 *
 * @author Ahmed
 */
public class ACME extends Utilisateur{
    private static Integer compagnieID;
    private static String compagnieNom;
    private static String compagnieAdresse;
    private static String compagnieVille;
    private static String compagnieProvince;
    private static String compagnieCodePostal;
    private static String compagnieEMail;

    /**
     *
     * @param username
     * @param pass
     * @param type
     * @param id
     * @param nom
     * @param adr
     * @param ville
     * @param prov
     * @param cPost
     * @param eMail
     */
    public ACME(String username, String pass, String type, Integer id, String nom, String adr, String ville, String prov, String cPost, String eMail)
	{
		super(username,pass,type);	//Pour le constructeur d'Utilisateur
		ACME.compagnieID = id;
		ACME.compagnieNom = nom;
		ACME.compagnieAdresse = adr;
		ACME.compagnieVille = ville;
		ACME.compagnieProvince = prov;
		ACME.compagnieCodePostal = cPost;
		ACME.compagnieEMail = eMail;
	}
    
    //Methode determinant l'affichage d'ACME
    @Override
	public String toString(){
		
		return ("ID: "+ACME.compagnieID+" Nom: "+ACME.compagnieNom+" Username: "+super.getUtilisateurID());
	}
        
        //Methodes get et set

    /**
     * Retourner le nom du compagnie 
     * @return nom du compagnie
     */
	
	public String getCompagnieNom() {
		return ACME.compagnieNom;
	}

    /**
     * Modifier le nom du compagnie 
     * @param fournisseurNom
     */
    public void setCompagnieNom(String fournisseurNom) {
		ACME.compagnieNom = compagnieNom;
	}

    /**
     * Retourner le ID du compagnie 
     * @return ID du compagnie
     */
    public Integer getCompagnieID() {
		return ACME.compagnieID;
	}

    /**
     * Modifier le ID du compagnie 
     * @param compagnieID
     */
    public void setCompagnieID(Integer compagnieID) {
		ACME.compagnieID = compagnieID;
	}

    /**
     * Retourner l'adresse du compagnie 
     * @return adresse du compagnie
     */
    public String getCompagnieAdresse() {
		return ACME.compagnieAdresse;
	}

    /**
     * Modifier l'adresse du compagnie 
     * @param compagnieAdresse
     */
    public void setCompagnieAdresse(String compagnieAdresse) {
		ACME.compagnieAdresse = compagnieAdresse;
	}

    /**
     * Retourner la ville du compagnie 
     * @return ville du compagnie
     */
    public String getCompagnieVille() {
		return ACME.compagnieVille;
	}

    /**
     * Modifier la ville du compagnie 
     * @param compagnieVille
     */
    public void setCompagnieVille(String compagnieVille) {
		ACME.compagnieVille = compagnieVille;
	}

    /**
     * Retourner la province du compagnie 
     * @return province du compagnie
     */
    public String getCompagnieProvince() {
		return ACME.compagnieProvince;
	}

    /**
     * Modifier le nom du compagnie 
     * @param compagnieProvince
     */
    public void setCompagnieProvince(String compagnieProvince) {
		ACME.compagnieProvince = compagnieProvince;
	}

    /**
     * Retourner le code postal du compagnie 
     * @return code postal du compagnie
     */
    public String getCompagnieCodePostal() {
		return ACME.compagnieCodePostal;
	}

    /**
     * Modifier le nom du compagnie 
     * @param compagnieCodePostal
     */
    public void setCompagnieCodePostal(String compagnieCodePostal) {
		ACME.compagnieCodePostal = compagnieCodePostal;
	}

    /**
     * Retourner le courriel du compagnie 
     * @return le courriel du compagnie
     */
    public String getCompagnieEMail() {
		return ACME.compagnieEMail;
	}

    /**
     * Modifer le courriel du compagnie 
     * @param compagnieEMail
     */
    public void setCompagnieEMail(String compagnieEMail) {
		ACME.compagnieEMail = compagnieEMail;
	}

}
