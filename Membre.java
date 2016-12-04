
/**
 *
 * @author Maxime
 */
public class Membre extends Utilisateur{
	//Classe "Enfant" d'Utilisateur qui est "Enfant" de Data

	private Integer membreID;
	private String membreNom;
	private String membreAdresse;
	private String membreVille;
	private String membreProvince;
	private String membreCodePostal;
	private String membreEMail;
	private Boolean membreActif;	//Variable representant le statut du membre (Actif/Suspendu)

	//Constructeur incluant les arguments pour sa classe parente Utilisateur

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
     * @param mActif
     */
	public Membre(String username, String pass, String type, Integer id, String nom, String adr, String ville, String prov, String cPost, String eMail, Boolean mActif)
	{
		super(username,pass,type);	//Pour le constructeur d'Utilisateur
		this.membreID = id;
		this.membreNom = nom;
		this.membreAdresse = adr;
		this.membreVille = ville;
		this.membreProvince = prov;
		this.membreCodePostal = cPost;
		this.membreEMail = eMail;
		this.membreActif = mActif;
	}
	
	//Methode determinant l'affichage d'un instance de Fournisseur
	public String toString(){
		return ("ID: "+this.membreID+" Nom: "+this.membreNom+" Actif? "+this.membreActif);
	}
	
	//Methodes get et set
	
    /**
    *  Méthode pour obtenir le nom du membre 
     * @return le nom du membre
     */
    public String getMembreNom() {
		return this.membreNom;
	}

    /**
     * Méthode pour obtenir le nom du membre 
     * @param membreNom
     */
    public void setMembreNom(String membreNom) {
		this.membreNom = membreNom;
	}

    /**
     * Méthode pour obtenir le ID du membre 
     * @return le ID du membre
     */
    public Integer getMembreID() {
		return this.membreID;
	}

    /**
     * Modifier le ID du membre
     * @param membreID
     */
    public void setMembreID(Integer membreID) {
		this.membreID = membreID;
	}

    /**
     * Retourner l'adresse du membre
     * @return l'adresse du membre
     */
    public String getMembreAdresse() {
		return this.membreAdresse;
	}

    /**
     * Modifier l'addresse du membre
     * @param membreAdresse
     */
    public void setMembreAdresse(String membreAdresse) {
		this.membreAdresse = membreAdresse;
	}

    /**
     * Retourner la ville du membre
     * @return la ville du membre
     */
    public String getMembreVille() {
		return this.membreVille;
	}

    /**
     * Modifier la ville du membre
     * @param membreVille
     */
    public void setMembreVille(String membreVille) {
		this.membreVille = membreVille;
	}

    /**
     * Retourner la province du membre
     * @return la province du membre
     */
    public String getMembreProvince() {
		return this.membreProvince;
	}

    /**
     * Modifier la province du membre
     * @param membreProvince
     */
    public void setMembreProvince(String membreProvince) {
		this.membreProvince = membreProvince;
	}

    /**
     * Retourner le code postal du membre
     * @return le code postal du membre
     */
    public String getMembreCodePostal() {
		return this.membreCodePostal;
	}

    /**
     * Modifier le code postal du membre
     * @param membreCodePostal
     */
    public void setMembreCodePostal(String membreCodePostal) {
		this.membreCodePostal = membreCodePostal;
	}

    /**
     * Retourner le courriel du membre
     * @return le courriel du membre
     */
    public String getMembreEMail() {
		return this.membreEMail;
	}

    /**
     * Modifier le courriel du membre
     * @param membreEMail
     */
    public void setMembreEMail(String membreEMail) {
		this.membreEMail = membreEMail;
	}

    /**
     * Retourner si le membre est actif ou suspendu
     * @return l'état du membre
     */
    public Boolean getMembreActif() {
		return this.membreActif;
	}

    /**
     * Modifier l'état du membre
     * @param membreActif
     */
    public void setMembreActif(Boolean membreActif) {
		this.membreActif = membreActif;
	}

}