/**
 * @author Maxime
 *
 */
public class Utilisateur extends Data{

	private String utilisateurID;
	private String utilisateurPassword;
	private String utilisateurType;

	//Constructeur d'Utilisateur
	public Utilisateur(String id, String pass, String type){
		this.utilisateurID = id;
		this.utilisateurPassword = pass;
		this.utilisateurType = type;
	}
	
	//Determine l'affichage d'une instance d'Utilisateur
	public String toString(){
		
		return ("Username: "+this.utilisateurID+" Password: "+this.utilisateurPassword+" Type: "+this.utilisateurType);
	}
	
	//Methodes get et set
	
	/**
	 * @return utilisateurID
	 */
	public String getUtilisateurID() {
		return this.utilisateurID;
	}

	/**
	 * @param utilisateurID
	 */
	public void setUtilisateurID(String utilisateurID) {
		this.utilisateurID = utilisateurID;
	}

	/**
	 * @return utilisateurPassword
	 */
	public String getUtilisateurPassword() {
		return this.utilisateurPassword;
	}

	/**
	 * @param utilisateurPassword
	 */
	public void setUtilisateurPassword(String utilisateurPassword) {
		this.utilisateurPassword = utilisateurPassword;
	}

	/**
	 * @return utilisateurType
	 */
	public String getUtilisateurType() {
		
		return this.utilisateurType;
	}

	/**
	 * @param utilisateurType
	 */
	public void setUtilisateurType(String utilisateurType) {
		this.utilisateurType = utilisateurType;
	}

}