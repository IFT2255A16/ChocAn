/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class Operateur extends Utilisateur{
    private Integer operateurID;
    private String operateurNom;
    private String operateurAdresse;
    private String operateurVille;
    private String operateurProvince;
    private String operateurCodePostal;
    private String operateurEMail;

    public Operateur(String username, String pass, String type, Integer id, String nom, String adr, String ville, String prov, String cPost, String eMail)
	{
		super(username,pass,type);	//Pour le constructeur d'Utilisateur
		this.operateurID = id;
		this.operateurNom = nom;
		this.operateurAdresse = adr;
		this.operateurVille = ville;
		this.operateurProvince = prov;
		this.operateurCodePostal = cPost;
		this.operateurEMail = eMail;
	}
    
    //Methode determinant l'affichage d'un instance de Operateur
	public String toString(){
		
		return ("ID: "+this.operateurID+" Nom: "+this.operateurNom+" Username: "+super.getUtilisateurID());
	}
        
        //Methodes get et set
	
	public String getOperateurNom() {
		return this.operateurNom;
	}

	public void setOperateurNom(String operateurNom) {
		this.operateurNom = operateurNom;
	}

	public Integer getOperateurID() {
		return this.operateurID;
	}

	public void setOperateurID(Integer operateurID) {
		this.operateurID = operateurID;
	}

	public String getOperateurAdresse() {
		return this.operateurAdresse;
	}

	public void setOperateurAdresse(String operateurAdresse) {
		this.operateurAdresse = operateurAdresse;
	}

	public String getOperateurVille() {
		return this.operateurVille;
	}

	public void setOperateurVille(String operateurVille) {
		this.operateurVille = operateurVille;
	}

	public String getOperateurProvince() {
		return this.operateurProvince;
	}

	public void setOperateurProvince(String operateurProvince) {
		this.operateurProvince = operateurProvince;
	}

	public String getOperateurCodePostal() {
		return this.operateurCodePostal;
	}

	public void setOperateurCodePostal(String operateurCodePostal) {
		this.operateurCodePostal = operateurCodePostal;
	}

	public String getOperateurEMail() {
		return this.operateurEMail;
	}

	public void setOperateurEMail(String operateurEMail) {
		this.operateurEMail = operateurEMail;
	}
}
