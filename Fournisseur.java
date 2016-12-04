
/**
 *
 * @author Maxime
 */
public class Fournisseur extends Utilisateur {
	//Classe "Enfant" d'Utilisateur qui est "Enfant" de Data

	private Integer fournisseurID;
	private String fournisseurNom;
	private String fournisseurAdresse;
	private String fournisseurVille;
	private String fournisseurProvince;
	private String fournisseurCodePostal;
	private String fournisseurEMail;


	/**
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
	public Fournisseur(String username, String pass, String type, Integer id, String nom, String adr, String ville, String prov, String cPost, String eMail)
	{
		super(username,pass,type);	//Pour le constructeur d'Utilisateur
		this.fournisseurID = id;
		this.fournisseurNom = nom;
		this.fournisseurAdresse = adr;
		this.fournisseurVille = ville;
		this.fournisseurProvince = prov;
		this.fournisseurCodePostal = cPost;
		this.fournisseurEMail = eMail;
		
	}
	
	//Methode determinant l'affichage d'un instance de Fournisseur
	public String toString(){
		
		return ("ID: "+this.fournisseurID+" Nom: "+this.fournisseurNom+" Username: "+super.getUtilisateurID());
	}
	
	//Methodes get et set

    /**
     * @return fournisseurNom
     */
	
	public String getFournisseurNom() {
		return this.fournisseurNom;
	}

    /**
     * @param fournisseurNom
     */
    public void setFournisseurNom(String fournisseurNom) {
		this.fournisseurNom = fournisseurNom;
	}

    /**
     * @return fournisseurID
     */
    public Integer getFournisseurID() {
		return this.fournisseurID;
	}

    /**
     * @param fournisseurID
     */
    public void setFournisseurID(Integer fournisseurID) {
		this.fournisseurID = fournisseurID;
	}

    /**
     * @return fournisseurAdresse
     */
    public String getFournisseurAdresse() {
		return this.fournisseurAdresse;
	}

    /**
     * @param fournisseurAdresse
     */
    public void setFournisseurAdresse(String fournisseurAdresse) {
		this.fournisseurAdresse = fournisseurAdresse;
	}

    /**
     * @return fournisseurVille
     */
    public String getFournisseurVille() {
		return this.fournisseurVille;
	}

    /**
     * @param fournisseurVille
     */
    public void setFournisseurVille(String fournisseurVille) {
		this.fournisseurVille = fournisseurVille;
	}

    /**
     * @return fournisseurProvince
     */
    public String getFournisseurProvince() {
		return this.fournisseurProvince;
	}

    /**
     * @param fournisseurProvince
     */
    public void setFournisseurProvince(String fournisseurProvince) {
		this.fournisseurProvince = fournisseurProvince;
	}

    /**
     * @return fournisseurCodePostal
     */
    public String getFournisseurCodePostal() {
		return this.fournisseurCodePostal;
	}

    /**
     * @param fournisseurCodePostal
     */
    public void setFournisseurCodePostal(String fournisseurCodePostal) {
		this.fournisseurCodePostal = fournisseurCodePostal;
	}

    /**
     * @return fournisseurEMail
     */
    public String getFournisseurEMail() {
		return this.fournisseurEMail;
	}

    /**
     * @param fournisseurEMail
     */
    public void setFournisseurEMail(String fournisseurEMail) {
		this.fournisseurEMail = fournisseurEMail;
	}

}