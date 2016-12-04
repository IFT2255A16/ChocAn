/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class SystemeBancaire extends Utilisateur{
    //Classe "Enfant" d'Utilisateur qui est "Enfant" de Data

	private Integer banqueID;
	private String banqueNom;
	private String banqueAdresse;
	private String banqueVille;
	private String banqueProvince;
	private String banqueCodePostal;
	private String banqueEMail;

	//Constructeur incluant les arguments pour sa classe parente Utilisateur
	public SystemeBancaire(String username, String pass, String type, Integer id, String nom, String adr, String ville, String prov, String cPost, String eMail)
	{
		super(username,pass,type);	//Pour le constructeur d'Utilisateur
		this.banqueID = id;
		this.banqueNom = nom;
		this.banqueAdresse = adr;
		this.banqueVille = ville;
		this.banqueProvince = prov;
		this.banqueCodePostal = cPost;
		this.banqueEMail = eMail;
		
	}
	
	//Methode determinant l'affichage d'un instance du SystemeBancaire
	public String toString(){
		
		return ("ID: "+this.banqueID+" Nom: "+this.banqueNom+" Username: "+super.getUtilisateurID());
	}
	
	//Methodes get et set
	
	/**
	 * @return banqueNom
	 */
	public String getBanqueNom() {
		return this.banqueNom;
	}

	/**
	 * @param banqueNom
	 */
	public void setBanqueNom(String banqueNom) {
		this.banqueNom = banqueNom;
	}

	/**
	 * @return banqueID
	 */
	public Integer getBanqueID() {
		return this.banqueID;
	}

	/**
	 * @param banqueID
	 */
	public void setBanqueID(Integer banqueID) {
		this.banqueID = banqueID;
	}

	/**
	 * @return banqueAdresse
	 */
	public String getBanqueAdresse() {
		return this.banqueAdresse;
	}

	/**
	 * @param banqueAdresse
	 */
	public void setBanqueAdresse(String banqueAdresse) {
		this.banqueAdresse = banqueAdresse;
	}

	/**
	 * @return banqueVille
	 */
	public String getBanqueVille() {
		return this.banqueVille;
	}

	/**
	 * @param banqueVille
	 */
	public void setBanqueVille(String banqueVille) {
		this.banqueVille = banqueVille;
	}

	/**
	 * @return banqueProvince
	 */
	public String getBanqueProvince() {
		return this.banqueProvince;
	}

	/**
	 * @param banqueProvince
	 */
	public void setBanqueProvince(String banqueProvince) {
		this.banqueProvince = banqueProvince;
	}

	/**
	 * @return banqueCodePostal
	 */
	public String getBanqueCodePostal() {
		return this.banqueCodePostal;
	}

	/**
	 * @param banqueCodePostal
	 */
	public void setBanqueCodePostal(String banqueCodePostal) {
		this.banqueCodePostal = banqueCodePostal;
	}

	/**
	 * @return banqueEMail
	 */
	public String getBanqueEMail() {
		return this.banqueEMail;
	}

	/**
	 * @param banqueEMail
	 */
	public void setBanqueEMail(String banqueEMail) {
		this.banqueEMail = banqueEMail;
	}

}
