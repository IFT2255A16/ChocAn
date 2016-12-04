/**
 * @author Maxime
 *
 */
public class Service extends Data {

	private Integer serviceID;
	private String serviceNom;
	private double serviceCout;

	//Constructeur de Service
	/**
	 * @param id
	 * @param nom
	 * @param cout
	 */
	public Service(Integer id, String nom, double cout)
	{
		this.serviceID = id;
		this.serviceNom = nom;
		this.serviceCout = cout;
	}
	
	//Determine l'affichage d'un instance Service
	public String toString(){
		
		return ("ID: "+this.serviceID+" Nom: "+this.serviceNom+" Cout: "+this.serviceCout);
	}
	
	//Methodes get et set
	
	
	/**
	 * @return serviceNom
	 */
	public String getServiceNom() {
		return this.serviceNom;
	}

	/**
	 * @param serviceNom
	 */
	public void setServiceNom(String serviceNom) {
		this.serviceNom = serviceNom;
	}
	
	/**
	 * @return serviceID
	 */
	public Integer getServiceID() {
		return this.serviceID;
	}

	/**
	 * @param serviceID
	 */
	public void setServiceID(Integer serviceID) {
		this.serviceID = serviceID;
	}

	/**
	 * @return serviceCout
	 */
	public double getServiceCout() {
		return this.serviceCout;
	}

	/**
	 * @param serviceCout
	 */
	public void setServiceCout(double serviceCout) {
		this.serviceCout = serviceCout;
	}

}