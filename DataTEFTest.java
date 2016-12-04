import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Antoine
 *
 */
public class DataTEFTest {

	@Test
	public void testAjouterTEF() {
		Data[][] alldata = ChocAn.databaseCreation();
		
		int n;
		int compteurAvant = 0;
		int compteurApres = 0;
		
		for (n=0; n<alldata[4].length; n++)
			if (alldata[4][n]!=null)
				compteurAvant++;
		
		//DataMembre.AfficherListeMembre((Membre[])alldata[0]);
		DataTEF.AjouterTEF(alldata, 200000149, "test", 258247, 60.6);
		
		for (n=0; n<alldata[4].length; n++)
			if (alldata[4][n]!=null)
				compteurApres++;
	
		//DataMembre.AfficherListeMembre((Membre[])alldata[0]);
		//System.out.print("Avant: "+compteurAvant+" Apres: "+compteurApres);
		assertTrue(compteurApres == compteurAvant+1);
		
	}

}
