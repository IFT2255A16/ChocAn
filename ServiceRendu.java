/**
 * @author Maxime
 *
 */
public class ServiceRendu extends Data{

	private String serviceRenduDateService;
	private String serviceRenduDateEntree;
	private Integer serviceRenduMembre;
	private Integer serviceRenduFournisseur;
	private Integer serviceRenduService;
	private String serviceRenduCommentaire;

	//Constructeur de Service Rendu
	/**
	 * @param dateHeureEntree
	 * @param dateService
	 * @param fournisseur
	 * @param membre
	 * @param service
	 * @param commentaire
	 */
	public ServiceRendu(String dateHeureEntree, String dateService, Integer fournisseur,Integer membre, Integer service, String commentaire)
	{
		this.serviceRenduDateService = dateHeureEntree;
		this.serviceRenduDateEntree = dateService;
		this.serviceRenduMembre = membre;
		this.serviceRenduFournisseur = fournisseur;
		this.serviceRenduService = service;
		this.serviceRenduCommentaire = commentaire;
	}
	
	//Determine l'affichage d'une instance ServiceRendu
	public String toString(){
		
		return ("Date Service: "+this.serviceRenduDateService+" Date Service Entre: "+serviceRenduDateEntree+" Fournisseur: "+this.serviceRenduFournisseur
				+" Membre: "+this.serviceRenduMembre+" Service: "+this.serviceRenduService+" Commentaires: "+this.serviceRenduCommentaire);
	}
	
	//Methodes get et set
	
	/**
	 * @return serviceRenduService
	 */
	public Integer getServiceRenduService(){
		return this.serviceRenduService;
	}
	
	
	/**
	 * @param id fournisseur
	 * @param data : database 
	 * @return le nom de fournisseur
	 */
	public static String getNomFournisseur(Integer id, Data[][] data){
		
		Fournisseur[] fournisseur = (Fournisseur[])data[1];
		for(int i=0; i<fournisseur.length; i++  ){
		
			if(fournisseur[i].getFournisseurID().equals(id)) return fournisseur[i].getFournisseurNom();		
		}
		
		return null;
	}
	
	/**
	 * @param idService
	 * @param data
	 * @return service
	 */
	public static String getNomServiceRendu(Integer idService, Data[][] data){
		Service[] service = (Service[])data[2];
		for(int i=0; i<service.length; i++  ){
		
			if(service[i].getServiceID().equals(idService)) return service[i].getServiceNom();	

		}
		return null;
	}
	
	/**
	 * @param id
	 * @param data
	 * @return membre
	 */
	public String getNomMembre(Integer id, Data[][] data){
		
		Membre[] membre = (Membre[])data[0];
		for(int i=0; i<membre.length; i++){
		
			if(membre[i].getMembreID().equals(id)) return membre[i].getMembreNom();		
		}
		
		return null;
	}
	
	/**
	 * @return serviceRenduDateService
	 */
	public String getServiceRenduDateService() {
		return this.serviceRenduDateService;
	}

	/**
	 * @param serviceRenduDateService
	 */
	public void setServiceRenduDateService(String serviceRenduDateService) {
		this.serviceRenduDateService = serviceRenduDateService;
	}

	/**
	 * @return serviceRenduDateEntree
	 */
	public String getServiceRenduDateEntree() {
		return this.serviceRenduDateEntree;
	}

	/**
	 * @param serviceRenduDateEntree
	 */
	public void setServiceRenduDateEntree(String serviceRenduDateEntree) {
		this.serviceRenduDateEntree = serviceRenduDateEntree;
	}

	/**
	 * @return serviceRenduMembre
	 */
	public Integer getServiceRenduMembre() {
		return this.serviceRenduMembre;
	}

	/**
	 * @param serviceRenduMembre
	 */
	public void setServiceRenduMembre(Integer serviceRenduMembre) {
		this.serviceRenduMembre = serviceRenduMembre;
	}

	/**
	 * @return serviceRenduFournisseur
	 */
	public Integer getServiceRenduFournisseur() {
		return this.serviceRenduFournisseur;
	}

	/**
	 * @param serviceRenduFournisseur
	 */
	public void setServiceRenduFournisseur(Integer serviceRenduFournisseur) {
		this.serviceRenduFournisseur = serviceRenduFournisseur;
	}

	/**
	 * @return serviceRenduCommentaire
	 */
	public String getServiceRenduCommentaire() {
		return this.serviceRenduCommentaire;
	}

	/**
	 * @param serviceRenduCommentaire
	 */
	public void setServiceRenduCommentaire(String serviceRenduCommentaire) {
		this.serviceRenduCommentaire = serviceRenduCommentaire;
	}

}