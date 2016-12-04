import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Mohammed Belmajdoub
 *
 */
public class DataFournisseurTest{

	@Test
	public void testAjouterFournisseur() {
		Data[][] alldata = ChocAn.databaseCreation();
		Fournisseur f = new Fournisseur ("test","test","test",222222222,"test","test","test","test","test","test");
		int pos = 100;	//Premiere position nulle dans le database des fournisseurs
				
		int n;
		int compteurAvant = 0;
		int compteurApres = 0;
		
		for (n=0; n<alldata[1].length; n++)
			if (alldata[1][n]!=null)
				compteurAvant++;
		
		//DataRepertoire.AfficherListeFournisseur((Fournisseur[])alldata[1]);
		DataFournisseur.AjouterFournisseur(f,pos);
		
		for (n=0; n<alldata[1].length; n++)
			if (alldata[1][n]!=null)
				compteurApres++;
	
		//DataFournisseur.AjouterFournisseur((Fournisseur[])alldata[0]);
		//System.out.print("Avant: "+compteurAvant+" Apres: "+compteurApres);
		assertTrue(compteurApres == compteurAvant+1);
		
		
		
		}

	
}
