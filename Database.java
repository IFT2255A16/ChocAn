//Classe commune a tous les Database.

/**
 *
 * @author Maxime
 */

public class Database {

    /**
     * Methode permettant de trouver le prochain emplacement null 
     * dans une database et de retourner sa position.
     * @param database
     * @return
     */
	public static Integer findNextNull(Data[] database){
		
		for(int n=0; n<database.length; n++)
		{
			if (database[n]==null)
				return n;
		}
		return -1;			//TODO Doubler la taille de la table si on atteint la limite. 
	}
	
}
