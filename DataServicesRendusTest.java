import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author Johnny Pho
 *
 */
public class DataServicesRendusTest {

	@Test
	public void testAjouterFournisseur() {
		Data[][] alldata = ChocAn.databaseCreation();
		ServiceRendu s = new ServiceRendu ("15-12-05 18:11:21","15-12-05",200000000,122222222,123456,"test");
		int pos = 100;	//Premiere position nulle dans le database des fournisseurs
				
		int n;
		int compteurAvant = 0;
		int compteurApres = 0;
		
		for (n=0; n<alldata[3].length; n++)
			if (alldata[3][n]!=null)
				compteurAvant++;
		
		DataServicesRendus.AjouterServiceRendu(alldata,"15-12-05 18:11:21","15-12-05",200000000,122222222,123456,"test");
		
		for (n=0; n<alldata[3].length; n++)
			if (alldata[3][n]!=null)
				compteurApres++;
//        System.out.println(compteurApres == compteurAvant+1);
		assertTrue(compteurApres == compteurAvant+1);
		
		
		
		}

}
