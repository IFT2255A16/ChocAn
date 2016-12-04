/**
 * @author Maxime
 *
 */
public class TEF extends Data{

	private Integer tefFournisseurID;
	private String tefFournisseurNom;
	private Integer tefServiceRenduID;
	private Double tefCout;
	
	//Constructeur de TEF
	public TEF(Integer fId, String fNom, Integer service, Double cout){
		this.tefFournisseurID = fId;
		this.tefFournisseurNom = fNom;
		this.tefServiceRenduID = service;
		this.tefCout = cout;
	}
	
	//Determine l'affichage d'une instance de TEF
	public String toString(){
		
		return ("Service: "+this.tefServiceRenduID+"\tCout: "+this.tefCout+"\tFournisseur: "+this.tefFournisseurID+" "+this.tefFournisseurNom);
	}
	
	//Methodes get et set
	
	
	/** 
	 * @return tefFournisseurNom
	 */
	public String getTEFFournisseurNom() {
		return this.tefFournisseurNom;
	}

	/**
	 * @param tefFournisseurNom
	 */
	public void setTEFFournisseurNom(String tefFournisseurNom) {
		this.tefFournisseurNom = tefFournisseurNom;
	}

	/**
	 * @return tefFournisseurID
	 */
	public Integer getTEFFournisseurID() {
		return this.tefFournisseurID;
	}

	/**
	 * @param tefFournisseurID
	 */
	public void setTEFFournisseurID(Integer tefFournisseurID) {
		this.tefFournisseurID = tefFournisseurID;
	}

	/**
	 * @return tefCout
	 */
	public Double getTEFCout() {
		return this.tefCout;
	}

	/**
	 * @param tefCout
	 */
	public void setTEFCout(Double tefCout) {
		this.tefCout = tefCout;
	}

	/**
	 * @return tefServiceRenduID
	 */
	public Integer getTEFServiceRenduID() {
		return this.tefServiceRenduID;
	}

	/**
	 * @param tefServiceRenduID
	 */
	public void setTEFServiceRenduID(Integer tefServiceRenduID) {
		this.tefServiceRenduID = tefServiceRenduID;
	}

}