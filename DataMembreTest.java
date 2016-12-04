import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Maxime
 *
 */
public class DataMembreTest {

	@Test
	public void testAjouterMembre() {
		Data[][] alldata = ChocAn.databaseCreation();
		Membre m = new Membre ("Test@test.com","TESTTESTEST","Membre",111111111,"Test Rodriguez","Test Room, 1337 Test St.","Testville","QC","T35 T1G","test@test.com",true);
		int pos = 100;	//Premiere position nulle dans le database des membres
				
		int n;
		int compteurAvant = 0;
		int compteurApres = 0;
		
		for (n=0; n<alldata[0].length; n++)
			if (alldata[0][n]!=null)
				compteurAvant++;
		
		//DataMembre.AfficherListeMembre((Membre[])alldata[0]);
		DataMembre.AjouterMembre(m,pos);
		
		for (n=0; n<alldata[0].length; n++)
			if (alldata[0][n]!=null)
				compteurApres++;
	
		//DataMembre.AfficherListeMembre((Membre[])alldata[0]);
		//System.out.print("Avant: "+compteurAvant+" Apres: "+compteurApres);
		assertTrue(compteurApres == compteurAvant+1);
		
		
		
		}

	
}
