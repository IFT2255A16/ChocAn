import java.util.Formatter;

/**
 *
 * @author Maxime
 */
public class DataTEF extends Database{

	//creation d'une database Hardcode de 100 Transfert electronique avec un maximum de 200
	
	TEF[] listeTEF = new TEF[]{
		new TEF(200000054,"Mi Tempor Lorem Corporation",666666,21.21),
		new TEF(200000026,"Ut Erat Sed LLC",753159,26.26),
		new TEF(200000035,"Fusce Feugiat Lorem LLP",584265,44.44),
		new TEF(200000009,"Lacus Etiam PC",543219,24.24),
		new TEF(200000025,"Ultrices Posuere Cubilia LLP",852456,385.22),
		new TEF(200000052,"Vestibulum Lorem Corporation",912345,689.85),
		new TEF(200000034,"Integer Tincidunt Aliquam PC",123456,25.25),
		new TEF(200000024,"Placerat Velit Incorporated",112358,18.18),
		new TEF(200000009,"Lacus Etiam PC",654321,19.19),
		new TEF(200000050,"Nulla Magna Incorporated",741852,18.18),
		new TEF(200000000,"Netus Et Malesuada Institute",852456,385.22),
		new TEF(200000097,"Habitant Morbi Tristique Incorporated",586245,53.53),
		new TEF(200000073,"Amet Foundation",271828,35.35),
		new TEF(200000004,"Nam Porttitor LLP",852963,88.88),
		new TEF(200000099,"Integer Foundation",666666,21.21),
		new TEF(200000070,"Donec Ltd",444444,41.41),
		new TEF(200000087,"Ac Nulla Company",543219,24.24),
		new TEF(200000089,"Aliquet Lobortis Nisi Inc.",258147,60.6),
		new TEF(200000008,"Nec Ligula Limited",271828,35.35),
		new TEF(200000063,"Libero Industries",852963,88.88),
		new TEF(200000041,"Mauris Id Sapien Institute",345678,62.62),
		new TEF(200000064,"Ut Pharetra PC",432198,35.35),
		new TEF(200000025,"Ultrices Posuere Cubilia LLP",666666,21.21),
		new TEF(200000014,"Ac Urna Ut Consulting",852741,666.66),
		new TEF(200000030,"Tempor Diam Dictum Company",987456,675.95),
		new TEF(200000093,"Neque Venenatis Lacus Corporation",444444,41.41),
		new TEF(200000045,"Purus PC",147258,66.66),
		new TEF(200000012,"Ac Nulla In Corporation",951357,258.69),
		new TEF(200000044,"Blandit Congue In Consulting",987654,866.95),
		new TEF(200000014,"Ac Urna Ut Consulting",987456,675.95),
		new TEF(200000060,"Nec Eleifend Industries",179350,28.28),
		new TEF(200000094,"Nulla Ltd",222222,30.3),
		new TEF(200000050,"Nulla Magna Incorporated",432198,35.35),
		new TEF(200000027,"Egestas Lacinia Associates",678912,15.15),
		new TEF(200000079,"Lectus Nullam Suscipit Corporation",432198,35.35),
		new TEF(200000002,"Sem Foundation",912345,689.85),
		new TEF(200000095,"Donec Consulting",654321,19.19),
		new TEF(200000021,"Duis Cursus Diam Limited",586245,53.53),
		new TEF(200000027,"Egestas Lacinia Associates",765432,23.23),
		new TEF(200000058,"Ipsum Industries",888888,123.25),
		new TEF(200000028,"Vitae Sodales At Ltd",753159,26.26),
		new TEF(200000038,"A Consulting",444444,41.41),
		new TEF(200000037,"Et Associates",852963,88.88),
		new TEF(200000090,"Nisi LLC",584265,44.44),
		new TEF(200000089,"Aliquet Lobortis Nisi Inc.",321987,32.32),
		new TEF(200000023,"Sapien Nunc Pulvinar Company",139750,50.5),
		new TEF(200000068,"Sociis Corp.",314159,45.45),
		new TEF(200000064,"Ut Pharetra PC",314159,45.45),
		new TEF(200000044,"Blandit Congue In Consulting",678912,15.15),
		new TEF(200000047,"Pharetra LLC",456321,38.38),
		new TEF(200000046,"Risus Odio Corp.",198765,38.38),
		new TEF(200000093,"Neque Venenatis Lacus Corporation",586245,53.53),
		new TEF(200000018,"Dapibus Gravida Corporation",777777,23.99),
		new TEF(200000002,"Sem Foundation",258369,25.25),
		new TEF(200000043,"Aliquam Inc.",999999,995.95),
		new TEF(200000048,"Posuere Enim Nisl Corp.",219876,48.48),
		new TEF(200000079,"Lectus Nullam Suscipit Corporation",345678,62.62),
		new TEF(200000025,"Ultrices Posuere Cubilia LLP",891234,169.93),
		new TEF(200000055,"Nulla LLP",586245,53.53),
		new TEF(200000063,"Libero Industries",234567,40.4),
		new TEF(200000026,"Ut Erat Sed LLC",741852,18.18),
		new TEF(200000047,"Pharetra LLC",852741,666.66),
		new TEF(200000088,"Lacus Cras Interdum LLP",741852,18.18),
		new TEF(200000063,"Libero Industries",432198,35.35),
		new TEF(200000080,"Pellentesque Company",753159,26.26),
		new TEF(200000062,"Metus Sit Amet LLC",584265,44.44),
		new TEF(200000082,"Iaculis Nec Eleifend Industries",741852,18.18),
		new TEF(200000050,"Nulla Magna Incorporated",258147,60.6),
		new TEF(200000064,"Ut Pharetra PC",112358,18.18),
		new TEF(200000091,"Amet Consectetuer Adipiscing Consulting",765432,23.23),
		new TEF(200000009,"Lacus Etiam PC",753159,26.26),
		new TEF(200000032,"Non Vestibulum Nec Consulting",219876,48.48),
		new TEF(200000095,"Donec Consulting",222222,30.3),
		new TEF(200000022,"Nisl LLC",789123,79.89),
		new TEF(200000060,"Nec Eleifend Industries",888888,123.25),
		new TEF(200000023,"Sapien Nunc Pulvinar Company",234567,40.4),
		new TEF(200000033,"Et Ipsum Cursus Consulting",333333,42.42),
		new TEF(200000017,"Hendrerit LLP",123456,25.25),
		new TEF(200000071,"Ac Facilisis Corp.",123456,25.25),
		new TEF(200000092,"Molestie Sed Industries",271828,35.35),
		new TEF(200000072,"Magna Ut Tincidunt Ltd",999999,995.95),
		new TEF(200000071,"Ac Facilisis Corp.",198765,38.38),
		new TEF(200000096,"At Egestas Industries",123456,25.25),
		new TEF(200000084,"Faucibus Associates",456321,38.38),
		new TEF(200000088,"Lacus Cras Interdum LLP",852369,111.11),
		new TEF(200000058,"Ipsum Industries",555555,27.27),
		new TEF(200000037,"Et Associates",198765,38.38),
		new TEF(200000049,"Lorem Lorem Luctus Limited",258147,60.6),
		new TEF(200000073,"Amet Foundation",584265,44.44),
		new TEF(200000043,"Aliquam Inc.",111111,10.1),
		new TEF(200000086,"Fames PC",963741,474.95),
		new TEF(200000007,"Mattis Semper Dui Ltd",147258,66.66),
		new TEF(200000090,"Nisi LLC",567891,36.36),
		new TEF(200000011,"Quisque Inc.",147258,66.66),
		new TEF(200000079,"Lectus Nullam Suscipit Corporation",987456,675.95),
		new TEF(200000067,"Vulputate Incorporated",789123,79.89),
		new TEF(200000015,"Fringilla Ornare Institute",321987,32.32),
		new TEF(200000054,"Mi Tempor Lorem Corporation",987654,866.95),
		new TEF(200000083,"Ridiculus Ltd",271828,35.35),
		new TEF(200000016,"Eu Nibh Vulputate Consulting",891234,169.93),
		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null
	};//fin listeTEF


    /**
     * Methode permettant l'affichage de la liste des TEFs
     * @param listeTEF
     */
	public static void AfficherListeTEF(TEF[] listeTEF){	//pour le debug seulement
		
		int n = 0;
		while (true){
			if (listeTEF[n]==null)
				break;
					
			System.out.println(listeTEF[n]);
			n++;
		}		
	}
	
    /**
     * Methode permettant l'ajout d'un TEF dans la database
     * @param allDatabase
     * @param fournisseurID
     * @param fournisseurNom
     * @param codeID
     * @param serviceCout
     */
	public static void AjouterTEF(Data[][] allDatabase, Integer fournisseurID, String fournisseurNom, Integer codeID, Double serviceCout) {
		
		//On doit d'abord trouver la premiere position disponible
		int pos = Database.findNextNull(allDatabase[4]);
		
		//Puis, on cr�e l'instance TEF
		TEF tef = new TEF(fournisseurID,fournisseurNom,codeID,serviceCout);
		
		//Enfin, on l'ajoute dans la database � la premiere position disponible
		allDatabase[4][pos]=tef;
	}

    /**
     * Methode permettant l'appel de la database
     * @return liste de TEFs
     */
	public TEF[] getListeTEF(){
		return listeTEF;
	}

}