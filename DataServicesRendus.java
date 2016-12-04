import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Maxime
 */
public class DataServicesRendus extends Database{

	//Creation de la database hardcod� avec 100 services rendus sur une possibilit� de 200.
	//Seulement dix d'entre elles ont des commentaires.
	ServiceRendu[] listeServiceRendu = new ServiceRendu[]{
		new ServiceRendu("15-12-05 18:11:21","15-12-05",200000097,100000045,586245,""),
		new ServiceRendu("15-12-12 13:10:06","15-12-12",200000018,100000099,314159,""),
		new ServiceRendu("15-12-14 21:10:37","15-12-14",200000095,100000082,258147,""),
		new ServiceRendu("15-12-14 10:09:45","15-12-14",200000084,100000055,123456,""),
		new ServiceRendu("15-12-15 22:09:47","15-12-15",200000082,100000073,852741,""),
		new ServiceRendu("15-12-16 11:11:48","15-12-16",200000027,100000070,678912,""),
		new ServiceRendu("15-12-16 14:11:37","15-12-16",200000025,100000015,777777,"Premiere visite chez un dentiste du patient en 77 ans."),
		new ServiceRendu("15-12-18 23:11:44","15-12-18",200000062,100000025,741852,""),
		new ServiceRendu("15-12-19 01:09:18","15-12-19",200000096,100000090,123456,""),
		new ServiceRendu("15-12-27 00:10:12","15-12-27",200000091,100000068,753159,""),
		new ServiceRendu("15-12-29 19:10:03","15-12-29",200000049,100000038,123456,""),
		new ServiceRendu("15-12-30 13:09:11","15-12-30",200000068,100000025,314159,""),
		new ServiceRendu("16-01-15 09:11:21","16-01-15",200000027,100000089,765432,""),
		new ServiceRendu("16-01-15 19:10:04","16-01-15",200000009,100000068,584265,""),
		new ServiceRendu("16-01-17 19:09:58","16-01-17",200000050,100000063,741852,""),
		new ServiceRendu("16-01-17 13:10:47","16-01-17",200000037,100000056,198765,""),
		new ServiceRendu("16-01-17 06:11:50","16-01-17",200000080,100000064,234567,""),
		new ServiceRendu("16-01-18 19:09:51","16-01-18",200000095,100000046,654321,""),
		new ServiceRendu("16-01-19 00:10:29","16-01-19",200000007,100000032,198765,""),
		new ServiceRendu("16-01-23 18:09:04","16-01-23",200000052,100000026,912345,""),
		new ServiceRendu("16-01-25 05:10:19","16-01-25",200000063,100000071,999999,"Traitement de canal sur la grosse molaire."),
		new ServiceRendu("16-01-27 09:10:26","16-01-27",200000060,100000027,765432,""),
		new ServiceRendu("16-01-27 13:09:00","16-01-27",200000070,100000034,444444,"Le patient a un pacemaker. Le torse est donc a eviter."),
		new ServiceRendu("16-01-30 23:09:24","16-01-30",200000008,100000020,271828,""),
		new ServiceRendu("16-02-05 02:11:42","16-02-05",200000079,100000027,432198,""),
		new ServiceRendu("16-02-11 01:11:28","16-02-11",200000063,100000023,852963,""),
		new ServiceRendu("16-02-18 17:10:05","16-02-18",200000038,100000059,139750,""),
		new ServiceRendu("16-02-23 19:10:31","16-02-23",200000033,100000033,219876,""),
		new ServiceRendu("16-02-28 02:09:17","16-02-28",200000014,100000032,987456,""),
		new ServiceRendu("16-02-29 10:11:55","16-02-29",200000045,100000056,147258,""),
		new ServiceRendu("16-03-03 05:09:35","16-03-03",200000079,100000004,586245,""),
		new ServiceRendu("16-03-03 00:10:55","16-03-03",200000037,100000037,852963,""),
		new ServiceRendu("16-03-04 10:09:10","16-03-04",200000060,100000043,179350,""),
		new ServiceRendu("16-03-07 09:09:03","16-03-07",200000086,100000053,555555,""),
		new ServiceRendu("16-03-19 03:10:17","16-03-19",200000090,100000023,584265,""),
		new ServiceRendu("16-03-20 12:09:08","16-03-20",200000023,100000064,753159,""),
		new ServiceRendu("16-03-26 05:10:34","16-03-26",200000058,100000037,888888,"Le patient est un artiste reconnu mondialement et demande le secret professionnel."),
		new ServiceRendu("16-04-01 13:10:50","16-04-01",200000017,100000086,222222,""),
		new ServiceRendu("16-04-05 23:09:32","16-04-05",200000009,100000004,654321,""),
		new ServiceRendu("16-04-10 04:10:24","16-04-10",200000044,100000005,987654,""),
		new ServiceRendu("16-04-18 19:10:57","16-04-18",200000093,100000087,314159,""),
		new ServiceRendu("16-04-23 08:09:15","16-04-23",200000087,100000088,543219,""),
		new ServiceRendu("16-04-23 06:11:17","16-04-23",200000028,100000055,753159,""),
		new ServiceRendu("16-05-05 06:10:40","16-05-05",200000064,100000073,432198,""),
		new ServiceRendu("16-05-06 22:11:57","16-05-06",200000064,100000039,432198,""),
		new ServiceRendu("16-05-10 19:10:50","16-05-10",200000055,100000024,258369,""),
		new ServiceRendu("16-05-18 10:09:58","16-05-18",200000067,100000078,963741,""),
		new ServiceRendu("16-05-23 21:09:25","16-05-23",200000071,100000054,333333,""),
		new ServiceRendu("16-05-23 10:09:01","16-05-23",200000046,100000081,139750,""),
		new ServiceRendu("16-06-07 23:10:30","16-06-07",200000094,100000089,222222,"Blessure lombaire durant un accident de voiture."),
		new ServiceRendu("16-06-10 00:09:27","16-06-10",200000011,100000067,584265,""),
		new ServiceRendu("16-06-12 12:09:48","16-06-12",200000083,100000089,147258,""),
		new ServiceRendu("16-06-13 17:09:41","16-06-13",200000073,100000055,456321,""),
		new ServiceRendu("16-06-18 07:09:15","16-06-18",200000032,100000022,741852,""),
		new ServiceRendu("16-06-18 01:10:45","16-06-18",200000089,100000057,321987,""),
		new ServiceRendu("16-06-22 05:10:33","16-06-22",200000014,100000054,852741,""),
		new ServiceRendu("16-06-29 01:11:23","16-06-29",200000034,100000020,123456,""),
		new ServiceRendu("16-07-02 15:10:22","16-07-02",200000088,100000077,891234,""),
		new ServiceRendu("16-07-07 23:09:33","16-07-07",200000089,100000028,258147,""),
		new ServiceRendu("16-07-08 15:11:42","16-07-08",200000026,100000079,753159,""),
		new ServiceRendu("16-07-17 00:10:14","16-07-17",200000022,100000059,112358,""),
		new ServiceRendu("16-07-20 10:10:22","16-07-20",200000054,100000055,567891,""),
		new ServiceRendu("16-07-21 11:10:32","16-07-21",200000058,100000092,999999,"Traitement de canal sur la molaire M7."),
		new ServiceRendu("16-07-23 06:10:21","16-07-23",200000026,100000055,219876,""),
		new ServiceRendu("16-07-27 13:09:41","16-07-27",200000035,100000056,584265,""),
		new ServiceRendu("16-08-02 02:10:09","16-08-02",200000004,100000076,852963,""),
		new ServiceRendu("16-08-07 15:11:31","16-08-07",200000099,100000000,666666,"Accompagne par un enfant de moins de 5 ans."),
		new ServiceRendu("16-08-08 17:09:36","16-08-08",200000092,100000022,888888,"Plaquette or sur les deux palettes."),
		new ServiceRendu("16-08-15 07:09:14","16-08-15",200000050,100000077,432198,""),
		new ServiceRendu("16-08-17 02:09:08","16-08-17",200000002,100000039,912345,""),
		new ServiceRendu("16-08-19 23:11:23","16-08-19",200000064,100000087,314159,""),
		new ServiceRendu("16-08-24 08:09:51","16-08-24",200000073,100000061,271828,""),
		new ServiceRendu("16-09-01 06:09:23","16-09-01",200000021,100000030,586245,""),
		new ServiceRendu("16-09-08 01:11:49","16-09-08",200000043,100000077,852369,""),
		new ServiceRendu("16-09-09 03:10:29","16-09-09",200000024,100000081,112358,""),
		new ServiceRendu("16-09-09 23:10:45","16-09-09",200000000,100000023,852456,""),
		new ServiceRendu("16-09-09 13:10:16","16-09-09",200000047,100000025,345678,""),
		new ServiceRendu("16-09-14 00:10:09","16-09-14",200000050,100000015,741852,""),
		new ServiceRendu("16-09-22 01:11:26","16-09-22",200000072,100000057,234567,""),
		new ServiceRendu("16-09-24 00:10:40","16-09-24",200000002,100000087,678912,""),
		new ServiceRendu("16-09-24 11:09:02","16-09-24",200000043,100000089,456321,""),
		new ServiceRendu("16-09-26 21:10:21","16-09-26",200000025,100000066,666666,"Le patient se remet d'une blessure au poignet alors la session a ete moins active."),
		new ServiceRendu("16-10-06 12:11:03","16-10-06",200000079,100000084,111111,""),
		new ServiceRendu("16-10-10 02:10:53","16-10-10",200000063,100000075,586245,""),
		new ServiceRendu("16-10-11 03:11:17","16-10-11",200000016,100000074,987456,""),
		new ServiceRendu("16-10-25 02:09:11","16-10-25",200000054,100000047,666666,"Premier cours."),
		new ServiceRendu("16-10-31 15:09:20","16-10-31",200000088,100000047,271828,""),
		new ServiceRendu("16-11-07 20:10:22","16-11-07",200000012,100000061,951357,""),
		new ServiceRendu("16-11-12 15:11:38","16-11-12",200000041,100000062,345678,""),
		new ServiceRendu("16-11-14 22:10:54","16-11-14",200000047,100000099,456321,""),
		new ServiceRendu("16-11-16 19:09:42","16-11-16",200000044,100000061,678912,""),
		new ServiceRendu("16-11-19 01:11:46","16-11-19",200000009,100000008,543219,""),
		new ServiceRendu("16-11-19 10:09:30","16-11-19",200000000,100000086,987456,""),
		new ServiceRendu("16-11-20 04:11:48","16-11-20",200000000,100000000,432198,""),
		new ServiceRendu("16-11-23 14:10:30","16-11-23",200000004,100000000,258147,""),
		new ServiceRendu("16-11-24 15:09:44","16-11-24",200000003,100000000,147258,""),
		new ServiceRendu("16-11-26 03:09:30","16-11-28",200000002,100000000,789123,""),
		new ServiceRendu("16-11-27 03:09:30","16-11-28",200000001,100000000,789123,""),
		new ServiceRendu("16-11-30 03:09:30","16-11-28",200000000,100000000,789123,""),
		new ServiceRendu("16-11-30 00:09:13","16-11-30",200000002,100000002,852456,""),
		new ServiceRendu("16-12-01 09:11:38","16-12-01",200000001,100000001,198765,""),
		new ServiceRendu("16-12-03 12:10:40","16-12-03",200000000,100000000,139750,""),
		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null
		};
	
	//Methode permettant d'afficher la liste des services rendus. Pour debug seulement.

    /**
     *
     * @param listeServiceRendu
     */
	public static void AfficherListeServicesRendus(ServiceRendu[] listeServiceRendu){	
		
		int n = 0;
		while (true){
			if (listeServiceRendu[n]==null)
				break;
					
			System.out.println(listeServiceRendu[n]);
			n++;
		}
	}
	
	/**
	 * @param allDatabase
	 * @return tableau ServiceRendu[]
	 */
	public static ServiceRendu[] getServicesRendusSemaine(Data[][] allDatabase){
			
			ServiceRendu[] liste = (ServiceRendu[]) allDatabase[3]; //liste de tous les services rendus
			ServiceRendu[] listeSemaine= new ServiceRendu[liste.length]; // liste a retourner

			
			DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss"); // specifie le format de la date
			Date dateCourante = new Date(); 
			
			Calendar c = Calendar.getInstance();
			c.setTime(dateCourante);
			c.add(Calendar.DATE, -7); //chercher la date de la semaine precedente
			
			Date dateSemainePrec = c.getTime(); // la date de la semaine derniere en String
			
			String dateSemainePrecFormat =dateFormat.format(dateSemainePrec); // date de la semaine derniere avec le bon format

			
			int pos=0; // position dans le tableau a retourner
			int i = liste.length;
			String dateService;
			boolean sortie = true;
			while(sortie){
				   if(liste[i-1]!= null ){
					   
				   dateService = liste[i-1].getServiceRenduDateService(); // date du service rendu
				 //si date du service est superieure a la date d'il y a une semaine .equalTo retourne >= 0

				   if((dateService.compareTo(dateSemainePrecFormat) >= 0)){
					
				    listeSemaine[pos] = liste[i-1];
					pos++;	
				   }else sortie = false;
				   
				}
				   i--;
			}
			return listeSemaine;
	}

    /**
     * Methode permettant l'ajout d'un service rendue au database
     * @param allDatabase
     * @param dateAct
     * @param dateFournie
     * @param fournisseurID
     * @param membreID
     * @param codeID
     * @param commentaire
     */
	public static void AjouterServiceRendu(Data[][] allDatabase, String dateAct, String dateFournie, Integer fournisseurID, Integer membreID, Integer codeID, String commentaire) {
	
		//On doit d'abord trouver la premiere position disponible
		int pos = Database.findNextNull(allDatabase[3]);
		
		//Puis, on cr�e l'instance ServiceRendu
		ServiceRendu sR = new ServiceRendu(dateAct,dateFournie,fournisseurID,membreID,codeID,commentaire);
		
		//Enfin, on la met dans la database � la premiere espace disponible
		allDatabase[3][pos]=sR;
	}

	//Methode permettant l'appel de la database

    /**
     * Retourner la liste des services rendus 
     * @return liste des services rendus
     */
	public ServiceRendu[] getListeServiceRendu(){
		return listeServiceRendu;
	}

}