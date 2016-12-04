import static org.junit.Assert.*;

import org.junit.Test;

public class DataServiceTest {

	@Test
	public void testAjouterService() {
		Data[][] alldata = ChocAn.databaseCreation();
		Service s = new Service (000000,"TEST",0);
		int pos = 51;	//Premiere position nulle dans le database des services(data répertoire) 
				
		int n;
		int compteurAvant = 0;
		int compteurApres = 0;
		
		for (n=0; n<alldata[2].length; n++)
			if (alldata[2][n]!=null)
				compteurAvant++;
		
		//DataRepertoire.AfficherListeServices((Service[])alldata[2]);
		DataRepertoire.AjouterService(s,pos);
		
		for (n=0; n<alldata[2].length; n++)
			if (alldata[2][n]!=null)
				compteurApres++;
	
		//DataMembre.AfficherListeMembre((Membre[])alldata[0]);
		//System.out.print("Avant: "+compteurAvant+" Apres: "+compteurApres);
		assertTrue(compteurApres == compteurAvant+1);
		
		
		
		}

	
}
