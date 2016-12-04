/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxime
 */
public class Manager extends Utilisateur{
    private Integer managerID;
    private String managerNom;
    private String managerAdresse;
    private String managerVille;
    private String managerProvince;
    private String managerCodePostal;
    private String managerEMail;

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
    public Manager(String username, String pass, String type, Integer id, String nom, String adr, String ville, String prov, String cPost, String eMail)
	{
		super(username,pass,type);	//Pour le constructeur d'Utilisateur
		this.managerID = id;
		this.managerNom = nom;
		this.managerAdresse = adr;
		this.managerVille = ville;
		this.managerProvince = prov;
		this.managerCodePostal = cPost;
		this.managerEMail = eMail;
	}
    
    //Methode determinant l'affichage d'un instance de Manager
	public String toString(){
		
		return ("ID: "+this.managerID+" Nom: "+this.managerNom+" Username: "+super.getUtilisateurID());
	}
        
        //Methodes get et set

    /**
     * Méthode pour obtenir le nom du gérant 
     * @return le nom du manager
     */
	
	public String getManagerNom() {
		return this.managerNom;
	}

    /**
     * Méthode pour modifier le nom du gérant 
     * @param managerNom
     */
    public void setManagerNom(String managerNom) {
		this.managerNom = managerNom;
	}

    /**
     * Méthode pour obtenir le ID du gérant 
     * @return le ID du manager
     */
    public Integer getManagerID() {
		return this.managerID;
	}

    /**
     * Modifier le ID du gérant
     * @param managerID
     */
    public void setManagerID(Integer managerID) {
		this.managerID = managerID;
	}

    /**
     * Retourner l'adresse du gérant
     * @return l'adresse du gérant
     */
    public String getManagerAdresse() {
		return this.managerAdresse;
	}

    /**
     * Modifier l'addresse du gérant
     * @param managerAdresse
     */
    public void setManagerAdresse(String managerAdresse) {
		this.managerAdresse = managerAdresse;
	}

    /**
     * Retourner la ville du gérant
     * @return la ville du gérant
     */
    public String getManagerVille() {
		return this.managerVille;
	}

    /**
     * Modifier la ville du gérant
     * @param managerVille
     */
    public void setManagerVille(String managerVille) {
		this.managerVille = managerVille;
	}

    /**
      * Retourner la province du gérant
     * @return la province de gérant
     */
    public String getManagerProvince() {
		return this.managerProvince;
	}

    /**
     * Modifier la province du gérant
     * @param managerProvince
     */
    public void setManagerProvince(String managerProvince) {
		this.managerProvince = managerProvince;
	}

    /**
      * Retourner le code postal du gérant
     * @return le code postal du gérant
     */
    public String getManagerCodePostal() {
		return this.managerCodePostal;
	}

    /**
     *
     * @param managerCodePostal
     */
    public void setManagerCodePostal(String managerCodePostal) {
		this.managerCodePostal = managerCodePostal;
	}

    /**
     * Retourner le courriel du gérant
     * @return le courriel du gérant
     */
    public String getManagerEMail() {
		return this.managerEMail;
	}

    /**
     * Modifier le courriel du gérant
     * @param managerEMail
     */
    public void setManagerEMail(String managerEMail) {
		this.managerEMail = managerEMail;
	}
    
}
