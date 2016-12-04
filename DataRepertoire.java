
/**
 *
 * @author Antoine
 */
public class DataRepertoire extends Database{

	//Creation d'une database hardcode contenant 50 types de services avec un maximum de 100.
	
	static Service[] listeService = new Service[]{
		new Service(111111,"Massage sur chaise (10 minutes)",10.1),
		new Service(112358,"Massage sur chaise (20 minutes)",18.18),
		new Service(123456,"Massage sur chaise (30 minutes)",25.25),
		new Service(139750,"Massage sur table (30 minutes)",50.5),
		new Service(147258,"Massage sur table (45 minutes)",66.66),
		new Service(147852,"Massage sur table (60 minutes)",80.8),
		new Service(179350,"Massage suedois (20 minutes)",28.28),
		new Service(198765,"Massage suedois (40 minutes)",38.38),
		new Service(219876,"Massage suedois (60 minutes)",48.48),
		new Service(222222,"Massage shiatsu (20 minutes)",30.3),
		new Service(234567,"Massage shiatsu (40 minutes)",40.4),
		new Service(258147,"Massage shiatsu (60 minutes)",60.6),
		new Service(258369,"Massage californien (20 minutes)",25.25),
		new Service(271828,"Massage californien (40 minutes)",35.35),
		new Service(314159,"Massage californien (60 minutes)",45.45),
		new Service(321987,"Massage thai (20 minutes)",32.32),
		new Service(333333,"Massage thai (40 minutes)",42.42),
		new Service(345678,"Massage thai (60 minutes)",62.62),
		new Service(369147,"Reflexologie",12.12),
		new Service(432198,"Acuponcture",35.35),
		new Service(444444,"Electroacuponcture",41.41),
		new Service(456321,"Fire Needle Acuponcture",38.38),
		new Service(456789,"Sonoponcture",43.43),
		new Service(543219,"Acupressure",24.24),
		new Service(555555,"Cupping Therapy",27.27),
		new Service(567891,"Osteopathie",36.36),
		new Service(584265,"Chiropratique",44.44),
		new Service(586245,"Dieteticien",53.53),
		new Service(654321,"S�ance d'aerobie",19.19),
		new Service(666666,"S�ance de boxe",21.21),
		new Service(678912,"S�ance de cardio",15.15),
		new Service(741852,"S�ance de musculation",18.18),
		new Service(753159,"S�ance de crossfit",26.26),
		new Service(765432,"S�ance d'art martiaux",23.23),
		new Service(777777,"Dentiste: Examen buccal",23.99),
		new Service(789123,"Dentiste: Nettoyage",79.89),
		new Service(852369,"Dentiste: Extraction dent",111.11),
		new Service(852456,"Dentiste: Extraction dents de sagesse",385.22),
		new Service(852654,"Dentiste: Implant",550.55),
		new Service(852741,"Dentiste: Appareil dentaire",666.66),
		new Service(852963,"Dentiste: Plombage",88.88),
		new Service(876543,"Dentiste: Couronne",221.25),
		new Service(888888,"Dentiste: Facette",123.25),
		new Service(891234,"Dentiste: Pont",169.93),
		new Service(912345,"Dentiste: Blanchissement",689.85),
		new Service(951357,"Dentiste: Blanchissement (kit a la maison)",258.69),
		new Service(963741,"Dentiste: Traitemente de canal (1 canal)",474.95),
		new Service(987456,"Dentiste: Traitemente de canal (2 canaux)",675.95),
		new Service(987654,"Dentiste: Traitemente de canal (3 canaux)",866.95),
		new Service(999999,"Dentiste: Traitemente de canal (4 canaux)",995.95),
		null,null,null,null,null,null,null,null,null,null,
		null,null,null,null,null,null,null,null,null,null,
		null,null,null,null,null,null,null,null,null,null,
		null,null,null,null,null,null,null,null,null,null,
		null,null,null,null,null,null,null,null,null,null	
	};
	
	//Methode permettant l'affichage des services disponibles.
	//Pour debug seulement? 
	
	//Quand les fournisseurs veulent la consulter, est-ce qu'on envoie la liste par email
	//ou on l'affiche a l'�cran?

    /**
     *
     * @param listeService
     */
	public static void AfficherListeService(Service[] listeService){	
		int n = 0;
		while (true){
			if (listeService[n]==null)
				break;
					
			System.out.println(listeService[n]);
			n++;
		}
	}
	
    /**
     * Ajouter un service
     * @param ser
     * @param loc
     */
    public static void AjouterService(Service ser, int loc) {
		listeService[loc] = ser;
		System.out.println("\nService ajoute au database\n");
	}

    /**
     * Supprimer un service
     * @param indx
     */
    public static void SupprimerService(int indx) {
		if(indx!=-1){
			System.out.println("\nService Valide\n");
				listeService[indx]=null;
				for(int i = indx; i < listeService.length-2; i++){
					listeService[i]=listeService[i+1];
				}
				listeService[listeService.length-1]=null;
				System.out.println("\nService supprime\n");
			}
		else
			System.out.println("\nService invalide\n");
	}

    /**
     * Mettre à jour un service
     * @param indx
     * @param choix
     * @param valeur
     */
    public static void MettreAJourService(int indx, String choix, Object valeur) {
		if(choix=="cout")
			listeService[indx].setServiceCout((Double) valeur);
		if(choix=="nom")
			listeService[indx].setServiceNom((String) valeur);
		if(choix=="id")
			listeService[indx].setServiceID((Integer) valeur);
	}

	//Methode permettant l'appel de la database

    /**
     * Retourner la liste des services 
     * @return la liste des services
     */
	public Service[] getListeService(){
		return listeService;
	}
	
	//Methode permettant de trouver la position d'un service � l'int�rieur de la database.
	//Retourne sa position (retourne -1 si elle n'est pas dans la database)

    /**
     * Retourner position du service dans la base de données
     * @param code
     * @param listeService
     * @return position du service dans la base de données
     */
	public static int findPosition(Integer code,Service[] listeService){
	
		try{
			for(int n=0; n<listeService.length; n++)
			{
				if (listeService[n].getServiceID().equals(code))
					return n;
			}
		}catch (NullPointerException npe){
			//Ignore les null
		}
		return -1;
		
	}
	
}