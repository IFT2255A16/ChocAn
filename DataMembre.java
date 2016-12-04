
/**
 *
 * @author Mohammed & Johnny & Maxime & Antoine
 */
public class DataMembre extends Database{

	static //Creation d'une database Hardcode avec 100 membres sur une capacite maximale de 200.
	//La premiere est utile pour le debugging.
	//Les statuts des 100000001 a 100000010 sont "annul�s".
	
	Membre[] listeMembre = new Membre[]{
		new Membre("M","debug","Membre",100000000,"Isabella Woods","3390 Lorem. Ave","Iqaluit","Nunavut","B0E 2T7","et.commodo.at@Proinvelit.co.uk",true),
		new Membre("sit@semperrutrum.net","BXB26FWB5PY","Membre",100000001,"Fulton Gould","276-1215 Nec St.","Blind River","Ontario","E8A 1E8","sit@semperrutrum.net",false),
		new Membre("scelerisque.neque.Nullam@et.co.uk","UKS71IOR1GG","Membre",100000002,"Burton Velazquez","Ap #360-2046 Libero. St.","Belcarra","British Columbia","O4C 2U0","scelerisque.neque.Nullam@et.co.uk",false),
		new Membre("feugiat@commodo.net","QJW63ODE0MR","Membre",100000003,"Avye Schultz","Ap #500-9531 Dolor Rd.","Regina","SK","K9K 1L2","feugiat@commodo.net",false),
		new Membre("est@Maurisquis.edu","RSI39WIQ4NV","Membre",100000004,"Hayfa Downs","P.O. Box 389, 957 In Street","Whitby","ON","D1D 2K7","est@Maurisquis.edu",false),
		new Membre("cursus@tempor.edu","QEA46MBM9PO","Membre",100000005,"Quemby Fulton","Ap #350-2475 Sed St.","Fort Simpson","NT","O9W 4N7","cursus@tempor.edu",false),
		new Membre("lorem@mollisneccursus.ca","PHO55TQW1YP","Membre",100000006,"Teagan Avery","Ap #384-192 Mauris Street","Etobicoke","ON","I6U 5L0","lorem@mollisneccursus.ca",false),
		new Membre("sed.tortor.Integer@nec.edu","YJG62RGV8YN","Membre",100000007,"Abigail Roberson","143-5140 Nulla Road","Dorval","Quebec","O4Q 1K0","sed.tortor.Integer@nec.edu",false),
		new Membre("magna.a@rutrumnonhendrerit.co.uk","NHZ15WQQ7RQ","Membre",100000008,"Alika Rocha","Ap #653-8827 Vitae Ave","North Saanich","British Columbia","P3X 0T2","magna.a@rutrumnonhendrerit.co.uk",false),
		new Membre("Cum.sociis@tincidunttempus.com","GYL76ROB3UB","Membre",100000009,"Nola Stephenson","3315 Sollicitudin St.","Moncton","New Brunswick","D3N 9E5","Cum.sociis@tincidunttempus.com",false),
		new Membre("neque@sollicitudinorcisem.com","ZQK50HDX2LX","Membre",100000010,"Harper Chang","5140 Posuere Street","Etobicoke","Ontario","L5D 6Q6","neque@sollicitudinorcisem.com",false),
		new Membre("hendrerit.consectetuer.cursus@Utsemper.com","WTX31DQZ1LM","Membre",100000011,"Chester Nixon","Ap #617-5463 Nascetur Av.","Pierrefonds","QC","P4O 8X4","hendrerit.consectetuer.cursus@Utsemper.com",true),
		new Membre("ipsum@ipsumleo.com","LID57BGG5UD","Membre",100000012,"Audrey Mcclure","P.O. Box 591, 359 Morbi Av.","Pointe-au-Pic","QC","I9D 7X6","ipsum@ipsumleo.com",true),
		new Membre("at.libero.Morbi@eratvolutpat.edu","PSE41MPA5XQ","Membre",100000013,"Brooke Lawrence","975-2760 Aenean St.","Valleyview","Alberta","O0M 9P0","at.libero.Morbi@eratvolutpat.edu",true),
		new Membre("tempor@augueSedmolestie.com","MSY40DYX0WF","Membre",100000014,"Drew Caldwell","480-9184 Sed Road","Tofield","AB","G5J 5T6","tempor@augueSedmolestie.com",true),
		new Membre("pellentesque@Cum.org","FOM45RIB9CW","Membre",100000015,"Willa Mercado","880-7890 Eu, Rd.","Minitonas","Manitoba","I8D 0P9","pellentesque@Cum.org",true),
		new Membre("Curabitur@sedest.com","CHF98RGT6BU","Membre",100000016,"Wang Chavez","P.O. Box 413, 4331 Ipsum St.","Cap-Rouge","QC","Z8C 4C9","Curabitur@sedest.com",true),
		new Membre("dui.nec@ametconsectetueradipiscing.org","NGH13QKR0YM","Membre",100000017,"Maisie English","P.O. Box 616, 8358 Ultricies Av.","Thunder Bay","ON","J5H 0H2","dui.nec@ametconsectetueradipiscing.org",true),
		new Membre("Cum.sociis@estNuncullamcorper.org","RCD95ADY6WY","Membre",100000018,"Elijah Hartman","7231 Ipsum Street","Vaughan","Ontario","S2C 4N8","Cum.sociis@estNuncullamcorper.org",true),
		new Membre("pede.blandit.congue@nonlaciniaat.net","ZVF74AFN0SI","Membre",100000019,"Abigail West","2806 Arcu Ave","Hull","Quebec","A3M 2X7","pede.blandit.congue@nonlaciniaat.net",true),
		new Membre("dui.quis.accumsan@liberomaurisaliquam.org","MVI29URL1JG","Membre",100000020,"Karyn Wilder","416-1801 Erat St.","Gravelbourg","Saskatchewan","T0Y 5X1","dui.quis.accumsan@liberomaurisaliquam.org",true),
		new Membre("dictum.eu.placerat@sitametmassa.org","ODQ96TBK7HX","Membre",100000021,"Tobias Hinton","230-6648 Erat Rd.","Moncton","New Brunswick","K6S 2S2","dictum.eu.placerat@sitametmassa.org",true),
		new Membre("in.faucibus@acturpisegestas.org","QBX03RYQ5FW","Membre",100000022,"Kelsey Landry","6963 Elit, St.","Stirling","Alberta","K2R 5P5","in.faucibus@acturpisegestas.org",true),
		new Membre("velit.Quisque@bibendumsed.edu","XCD09DEP2OS","Membre",100000023,"Jamalia Parrish","P.O. Box 251, 2248 Magna Ave","Chicoutimi","Quebec","K3P 3Z2","velit.Quisque@bibendumsed.edu",true),
		new Membre("Aliquam.ornare@metus.com","XFN95RNH1FQ","Membre",100000024,"Diana Diaz","P.O. Box 480, 3384 Lacinia Road","Murdochville","QC","B2M 1F0","Aliquam.ornare@metus.com",true),
		new Membre("eleifend.egestas@iaculisaliquetdiam.edu","VMC58DIF9ZW","Membre",100000025,"Brock Bright","517-9607 Vestibulum. Av.","Grande Prairie","AB","Y3S 7G9","eleifend.egestas@iaculisaliquetdiam.edu",true),
		new Membre("Donec@dolorFuscefeugiat.net","ZQJ17VXL7TC","Membre",100000026,"Driscoll Brennan","Ap #157-212 Cras Avenue","Whitewater Region Township","ON","K2C 2I9","Donec@dolorFuscefeugiat.net",true),
		new Membre("lacus.Quisque@nullaatsem.com","IQP02LJW5TI","Membre",100000027,"Slade Joseph","6391 Etiam Avenue","Verdun","QC","C7P 2W7","lacus.Quisque@nullaatsem.com",true),
		new Membre("Quisque.ac.libero@risusQuisquelibero.org","SNP23DJF0AL","Membre",100000028,"Carolyn Jordan","131 Ac Avenue","Champlain","Quebec","W3T 4I1","Quisque.ac.libero@risusQuisquelibero.org",true),
		new Membre("magna@Nuncsed.ca","CHZ74FMB8HT","Membre",100000029,"Remedios Ward","P.O. Box 160, 1648 Turpis. Rd.","Dubuisson","Quebec","N7S 6X1","magna@Nuncsed.ca",true),
		new Membre("Nullam@arcuVestibulumut.ca","ZUA20ECH1GZ","Membre",100000030,"Orlando Goodman","3329 Duis Rd.","Cumberland","ON","W8A 5D4","Nullam@arcuVestibulumut.ca",true),
		new Membre("tortor.dictum.eu@vulputatedui.edu","MYR10KSZ5CC","Membre",100000031,"Tyler Cochran","P.O. Box 968, 4025 Eu Avenue","Sylvan Lake","AB","A4D 5D0","tortor.dictum.eu@vulputatedui.edu",true),
		new Membre("viverra@ipsumporta.ca","XWB11KUW5CB","Membre",100000032,"Kelly Williams","P.O. Box 672, 8461 Fringilla Rd.","Saskatoon","Saskatchewan","I8B 9L6","viverra@ipsumporta.ca",true),
		new Membre("faucibus.Morbi@estarcuac.org","VSH50MFC4DK","Membre",100000033,"Nash Griffith","P.O. Box 399, 7172 Erat Avenue","Owen Sound","Ontario","P1K 1T8","faucibus.Morbi@estarcuac.org",true),
		new Membre("Integer.vitae@neque.edu","GJI64LMU2OD","Membre",100000034,"Orson Cleveland","Ap #300-269 Orci St.","East Gwillimbury","ON","Q6L 7N6","Integer.vitae@neque.edu",true),
		new Membre("neque.In.ornare@Nunc.edu","TSB11CBR6IZ","Membre",100000035,"Hadassah Bishop","P.O. Box 708, 9983 Orci St.","Whitchurch-Stouffville","Ontario","Q6M 2N3","neque.In.ornare@Nunc.edu",true),
		new Membre("cursus@malesuada.com","NDC26QVC1DH","Membre",100000036,"Kennedy Carter","4926 Quam Avenue","North Cowichan","British Columbia","Z5A 1T2","cursus@malesuada.com",true),
		new Membre("at.sem@feugiat.com","VCP28HOC1EI","Membre",100000037,"Lucian Pacheco","Ap #762-2983 Urna Street","Beausejour","Manitoba","M8A 0I2","at.sem@feugiat.com",true),
		new Membre("elit.pretium.et@adipiscingfringilla.ca","FTM35VZR7VK","Membre",100000038,"Gail Parker","9410 Molestie. Avenue","Hearst","ON","L0H 2S6","elit.pretium.et@adipiscingfringilla.ca",true),
		new Membre("orci@ametanteVivamus.co.uk","YTN54LVD1YB","Membre",100000039,"Brooke Conrad","Ap #450-6745 Purus, Road","C�te Saint-Luc","QC","F0D 1W0","orci@ametanteVivamus.co.uk",true),
		new Membre("erat.volutpat@tinciduntorciquis.edu","SXY73DNX4NL","Membre",100000040,"Edan Levy","Ap #390-8562 Lobortis Rd.","Anjou","QC","C6Z 9D8","erat.volutpat@tinciduntorciquis.edu",true),
		new Membre("est.vitae@nec.edu","QBU83CIY8GA","Membre",100000041,"Bianca Tillman","7793 Tempor, Ave","Fort Simpson","Northwest Territories","I4A 4T4","est.vitae@nec.edu",true),
		new Membre("id.ante@velvenenatis.edu","QXW75LSY8KU","Membre",100000042,"Dillon Head","251-2202 Et Av.","Midway","BC","P0H 8J2","id.ante@velvenenatis.edu",true),
		new Membre("eu.elit@viverraMaecenas.org","DYE02CFY4PF","Membre",100000043,"Macaulay Byers","P.O. Box 660, 8500 Aenean Street","Renfrew","ON","K9O 4T4","eu.elit@viverraMaecenas.org",true),
		new Membre("sit.amet.nulla@urna.ca","ICD12QPS1ZN","Membre",100000044,"Raja Mason","214-6202 Ac Road","Stratford","Prince Edward Island","R3X 5X2","sit.amet.nulla@urna.ca",true),
		new Membre("Donec.tincidunt@et.net","JAZ13FBJ0OL","Membre",100000045,"Hyatt Potts","6052 Orci Rd.","North Bay","ON","Y5J 9E9","Donec.tincidunt@et.net",true),
		new Membre("est.ac@semperegestasurna.co.uk","YRB83MHA1UW","Membre",100000046,"Florence Dunn","Ap #137-6555 Lobortis Avenue","St. Thomas","ON","H4Y 4B6","est.ac@semperegestasurna.co.uk",true),
		new Membre("ut.lacus.Nulla@utodio.edu","VOI42PAH4HV","Membre",100000047,"Leslie England","P.O. Box 765, 1840 Elementum Road","Quinte West","ON","E4B 6V0","ut.lacus.Nulla@utodio.edu",true),
		new Membre("arcu@bibendumullamcorper.com","LAQ56JFW0QZ","Membre",100000048,"Darius Villarreal","349-2153 Magna. Rd.","Kapuskasing","ON","S4H 4K6","arcu@bibendumullamcorper.com",true),
		new Membre("non@atpede.net","DNQ85XDS1BA","Membre",100000049,"Alea Harrington","4480 Tristique Rd.","Namur","Quebec","G1S 5C5","non@atpede.net",true),
		new Membre("cursus.non@nislMaecenasmalesuada.net","NMA44AXM1MX","Membre",100000050,"Giacomo Odonnell","Ap #486-7887 Rhoncus. Rd.","Leduc","AB","N0S 1B0","cursus.non@nislMaecenasmalesuada.net",true),
		new Membre("accumsan@sitametultricies.org","SLR96XWJ4FU","Membre",100000051,"Eliana Fletcher","P.O. Box 236, 5602 Amet, St.","Ramara","Ontario","R1X 4D4","accumsan@sitametultricies.org",true),
		new Membre("ut@sed.com","JCW94NYI0WW","Membre",100000052,"Colette Lester","123-9162 Sed Avenue","Merrickville-Wolford","Ontario","X2B 2I6","ut@sed.com",true),
		new Membre("enim.Suspendisse.aliquet@non.ca","IHU49RKR2PP","Membre",100000053,"Katelyn Downs","189-1473 Ac Av.","Champlain","Quebec","O8V 5W9","enim.Suspendisse.aliquet@non.ca",true),
		new Membre("Quisque.imperdiet@enim.net","TTN10YBC7AY","Membre",100000054,"Boris Woods","Ap #568-6538 Ridiculus Rd.","Newmarket","ON","F9X 9V0","Quisque.imperdiet@enim.net",true),
		new Membre("pede.ac.urna@velnislQuisque.org","FSD68SNX3TI","Membre",100000055,"Kylie Howe","534 Euismod Rd.","Arviat","NU","R1P 8S9","pede.ac.urna@velnislQuisque.org",true),
		new Membre("et.rutrum@elitAliquam.ca","MMV05GON3LX","Membre",100000056,"Katell Herrera","9630 Molestie Street","Weyburn","Saskatchewan","Q2P 5W7","et.rutrum@elitAliquam.ca",true),
		new Membre("metus@euerosNam.org","BAG93GOX7BF","Membre",100000057,"Solomon Schwartz","491-9271 Eleifend Ave","Owen Sound","ON","N3Y 5E0","metus@euerosNam.org",true),
		new Membre("natoque.penatibus.et@commodoauctor.edu","NJH77VPP4ML","Membre",100000058,"Jarrod Nolan","P.O. Box 992, 1640 Tempus Rd.","Thunder Bay","Ontario","E4S 6B0","natoque.penatibus.et@commodoauctor.edu",true),
		new Membre("ipsum.dolor.sit@est.edu","WES10NMH9FB","Membre",100000059,"Unity Rocha","Ap #155-9766 Feugiat St.","Orilla","ON","T7G 7F5","ipsum.dolor.sit@est.edu",true),
		new Membre("Aliquam.ornare.libero@sollicitudinorci.co.uk","MFU72ONQ9YG","Membre",100000060,"Hu Maynard","801-9790 Hendrerit St.","Charlottetown","PE","A1Q 2P7","Aliquam.ornare.libero@sollicitudinorci.co.uk",true),
		new Membre("libero@eusem.co.uk","AGW48IEY8DK","Membre",100000061,"Wanda Suarez","P.O. Box 608, 3098 Ornare. Rd.","Beausejour","Manitoba","E4Y 1R2","libero@eusem.co.uk",true),
		new Membre("ac.mattis.ornare@pedePraesenteu.com","SML73OMJ2UI","Membre",100000062,"Brianna Pierce","745-6284 Adipiscing Street","Lourdes","Manitoba","W2M 3M5","ac.mattis.ornare@pedePraesenteu.com",true),
		new Membre("eu.ligula@odioauctorvitae.net","HCP18RME5FZ","Membre",100000063,"Abbot Watkins","Ap #913-6922 Augue Rd.","Cobourg","Ontario","W5P 0N8","eu.ligula@odioauctorvitae.net",true),
		new Membre("consectetuer@dolordapibusgravida.edu","PZM66FPW4PW","Membre",100000064,"Guy Abbott","1570 Malesuada Ave","Cambridge Bay","NU","E9O 1Z9","consectetuer@dolordapibusgravida.edu",true),
		new Membre("Phasellus.elit.pede@non.co.uk","RWM84HJV7LT","Membre",100000065,"Damian Woodward","Ap #588-4475 Praesent Rd.","East Gwillimbury","Ontario","W3P 8R8","Phasellus.elit.pede@non.co.uk",true),
		new Membre("semper.cursus@nisidictumaugue.net","YPH95ZEJ6JJ","Membre",100000066,"Kadeem Cotton","P.O. Box 318, 9913 Eros. St.","Stratford","Prince Edward Island","M9C 7L2","semper.cursus@nisidictumaugue.net",true),
		new Membre("magna@cubiliaCurae.ca","JVA99YSO3WY","Membre",100000067,"Kelly Cleveland","395-8746 Suspendisse Avenue","Vanier","Ontario","W2Q 9M6","magna@cubiliaCurae.ca",true),
		new Membre("ridiculus@consequatlectussit.com","EEZ01DXR4DO","Membre",100000068,"MacKenzie Cannon","Ap #961-4268 Consequat St.","C�te Saint-Luc","Quebec","M2T 3G2","ridiculus@consequatlectussit.com",true),
		new Membre("et.rutrum@nuncac.edu","YOW40YWF4CI","Membre",100000069,"Delilah Adams","675-2632 Nisi Avenue","Cambridge Bay","Nunavut","H1S 6F8","et.rutrum@nuncac.edu",true),
		new Membre("suscipit.nonummy.Fusce@ligulaconsectetuerrhoncus.net","JBC44FLJ8WY","Membre",100000070,"Laura Fletcher","2614 Non, St.","Burns Lake","BC","J0U 6W3","suscipit.nonummy.Fusce@ligulaconsectetuerrhoncus.net",true),
		new Membre("nulla@Donecat.ca","IRX72VHK1LU","Membre",100000071,"Virginia Welch","2583 Arcu. St.","Mansfield-et-Pontefract","QC","P8U 2P8","nulla@Donecat.ca",true),
		new Membre("accumsan.sed@Nullamnisl.org","PSD21ESO7XG","Membre",100000072,"Dacey Jenkins","P.O. Box 580, 2503 Lacus. Avenue","Barrie","ON","V3G 9E8","accumsan.sed@Nullamnisl.org",true),
		new Membre("varius@Duiscursus.net","HJJ95FOT9EM","Membre",100000073,"Cadman Brooks","7291 Neque. Avenue","Delta","British Columbia","T5X 0E9","varius@Duiscursus.net",true),
		new Membre("consequat.auctor.nunc@ultricessitamet.net","OAF90YYB1SB","Membre",100000074,"Karina Leon","8295 Eu St.","Lakeshore","Ontario","T5X 8Q8","consequat.auctor.nunc@ultricessitamet.net",true),
		new Membre("augue@feugiatmetussit.edu","SYF96FKQ7RJ","Membre",100000075,"Lunea Good","9614 Vulputate Avenue","Pointe-du-Lac","Quebec","W0R 9L2","augue@feugiatmetussit.edu",true),
		new Membre("et.ultrices@Cras.ca","EAE59UCW7JQ","Membre",100000076,"Mikayla Oneal","6332 Sagittis St.","Ottawa-Carleton","Ontario","I3P 3D0","et.ultrices@Cras.ca",true),
		new Membre("rhoncus.Donec.est@euismod.ca","CQV91EKQ7UO","Membre",100000077,"Vincent Boyd","638-5290 Justo Av.","Malahide","Ontario","R4U 0J6","rhoncus.Donec.est@euismod.ca",true),
		new Membre("vel.venenatis.vel@infaucibusorci.net","JEV57JGI1FI","Membre",100000078,"Holmes Vinson","9379 Aliquet. Avenue","Woodlands County","Alberta","W3Z 7X4","vel.venenatis.vel@infaucibusorci.net",true),
		new Membre("interdum.libero@sitametornare.com","ZQA63XWC2HP","Membre",100000079,"Jocelyn Newman","176-803 Non Avenue","Canmore","AB","M3I 0W9","interdum.libero@sitametornare.com",true),
		new Membre("cursus.Nunc.mauris@maurissapiencursus.edu","BTC32DIO7TU","Membre",100000080,"Candace Klein","P.O. Box 858, 6087 Arcu. Road","Fort Saskatchewan","Alberta","O8H 8Q6","cursus.Nunc.mauris@maurissapiencursus.edu",true),
		new Membre("velit@orciDonecnibh.ca","LQZ40LPO0OO","Membre",100000081,"Ivy Simpson","143-8453 Turpis. Av.","Richmond","QC","E7X 1Y2","velit@orciDonecnibh.ca",true),
		new Membre("dolor.Quisque.tincidunt@pharetra.ca","ZZA25OYF6YQ","Membre",100000082,"Giselle Cardenas","Ap #493-4347 Mauris Ave","Leamington","Ontario","A5F 8E5","dolor.Quisque.tincidunt@pharetra.ca",true),
		new Membre("Suspendisse@Maurisvestibulumneque.net","SNB56LLR5YI","Membre",100000083,"Gage Wolf","Ap #151-5070 Ac Rd.","Fermont","QC","E7G 4D3","Suspendisse@Maurisvestibulumneque.net",true),
		new Membre("at.libero@congueInscelerisque.net","WDN93MYK0EI","Membre",100000084,"Ayanna Puckett","P.O. Box 348, 4922 Euismod Avenue","Stonewall","MB","U6Y 7Q4","at.libero@congueInscelerisque.net",true),
		new Membre("pede.malesuada.vel@quamelementum.org","WSH15XKR6YA","Membre",100000085,"Colette Blankenship","P.O. Box 156, 7379 Netus Road","Wilmont","ON","L4Z 1S4","pede.malesuada.vel@quamelementum.org",true),
		new Membre("accumsan.convallis.ante@aceleifendvitae.net","HLT35LWW3OY","Membre",100000086,"Phelan Morton","P.O. Box 990, 7587 Cursus Road","La Baie","QC","P2J 5Q4","accumsan.convallis.ante@aceleifendvitae.net",true),
		new Membre("vel.pede@dui.co.uk","QAK82QCZ5AF","Membre",100000087,"Hannah Mcgowan","P.O. Box 843, 1384 Id Rd.","Owen Sound","ON","P8A 2Q2","vel.pede@dui.co.uk",true),
		new Membre("mauris@egestasFuscealiquet.edu","STP91ITA9HQ","Membre",100000088,"Chiquita Cline","P.O. Box 636, 7981 Quisque Ave","Minitonas","MB","K1S 2R1","mauris@egestasFuscealiquet.edu",true),
		new Membre("aliquam.eros@volutpatNullafacilisis.org","PJQ00NHU7DX","Membre",100000089,"Sean Evans","951-8048 Sem Ave","Senneville","QC","L7B 2G7","aliquam.eros@volutpatNullafacilisis.org",true),
		new Membre("nec.eleifend@atsemmolestie.ca","DCT93WRI6VC","Membre",100000090,"Germaine Suarez","Ap #319-3647 Semper Ave","Beausejour","Manitoba","O7U 0P7","nec.eleifend@atsemmolestie.ca",true),
		new Membre("orci.lacus.vestibulum@euismod.edu","GKZ43AMX5PT","Membre",100000091,"Davis Melton","Ap #633-1600 Sem Rd.","Grey County","Ontario","Q7C 7W0","orci.lacus.vestibulum@euismod.edu",true),
		new Membre("dictum@pellentesquetellussem.net","YSY55PSJ7SY","Membre",100000092,"Christian Hendricks","3877 Amet Rd.","Pierrefonds","QC","B1H 2R6","dictum@pellentesquetellussem.net",true),
		new Membre("ac.mattis@mauriselitdictum.ca","QNK34AFN9WW","Membre",100000093,"Benedict Stephenson","8696 Sed Rd.","Leamington","ON","D3Y 2I1","ac.mattis@mauriselitdictum.ca",true),
		new Membre("ac.arcu.Nunc@sitamet.org","NSV82NTC1RN","Membre",100000094,"Rosalyn Hayes","176-8187 Auctor Avenue","Nanaimo","BC","Z6M 2M7","ac.arcu.Nunc@sitamet.org",true),
		new Membre("adipiscing.enim.mi@magnis.edu","QCE16SEJ5GY","Membre",100000095,"Norman Potter","Ap #900-8547 Dictum St.","Fort St. John","British Columbia","L1U 1L8","adipiscing.enim.mi@magnis.edu",true),
		new Membre("morbi@mattisvelitjusto.ca","GTC55WVQ1CD","Membre",100000096,"Steel Benjamin","9688 Non Rd.","Mansfield-et-Pontefract","QC","U5C 0C0","morbi@mattisvelitjusto.ca",true),
		new Membre("euismod.est.arcu@sagittis.edu","PWC55HGK6KF","Membre",100000097,"Cedric Norris","P.O. Box 896, 9472 Nec Rd.","Richmond Hill","Ontario","G0D 5O7","euismod.est.arcu@sagittis.edu",true),
		new Membre("lectus.pede@tristiquesenectus.com","JRF68DII3JO","Membre",100000098,"Kirsten Bean","Ap #785-8916 Quam Avenue","Canora","SK","K1B 6T4","lectus.pede@tristiquesenectus.com",true),
		new Membre("gravida@nuncidenim.co.uk","QFG75VCJ6KU","Membre",100000099,"Irma Barker","Ap #148-7800 Non Av.","Ajax","ON","Y3R 1U8","gravida@nuncidenim.co.uk",true),
		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null
	};//fin listeMembre
	
	
	//Methode permettant l'affichage de la database

    /**
     *
     * @param listeMembre
     */
	public static void AfficherListeMembre(Membre[] listeMembre){
		
		int n = 0;
		while (true){
			if (listeMembre[n]==null)
				break;
					
			System.out.println(listeMembre[n]);
			n++;
		}
			
	}
	
    /**
     * Ajouter un membre
     * @param mem
     * @param loc
     */
    public static void AjouterMembre(Membre mem, int loc) {
		listeMembre[loc] = mem;
		System.out.println("\nMembre ajoute au database\n");
	}

    /**
     * Supprimer un membre
     * @param indx
     */
    public static void SupprimerMembre(int indx) {
		if(indx!=-1){
			System.out.println("\nMembre Valide\n");
				listeMembre[indx]=null;
				for(int i = indx; i < listeMembre.length-2; i++){
					listeMembre[i]=listeMembre[i+1];
				}
				listeMembre[listeMembre.length-1]=null;
				System.out.println("\nMembre supprime\n");
			}
		else
			System.out.println("\nMembre invalide\n");
	}

    /**
     * Mettre à jour un membre
     * @param indx
     * @param choix
     * @param valeur
     */
    public static void MettreAJourMembre(int indx, String choix, Object valeur) {
		
		if(choix=="email")
			listeMembre[indx].setMembreEMail((String) valeur);
		if(choix=="nom")
			listeMembre[indx].setMembreNom((String) valeur);
		if(choix=="adr")
			listeMembre[indx].setMembreAdresse((String) valeur);
		if(choix=="ville")
			listeMembre[indx].setMembreVille((String) valeur);
		if(choix=="prov")
			listeMembre[indx].setMembreProvince((String) valeur);
		if(choix=="code")
			listeMembre[indx].setMembreCodePostal((String) valeur);
		if(choix=="id")
			listeMembre[indx].setMembreID((Integer) valeur);
	}

	//Methode permettant l'appel de la database

    /**
     *
     * @return
     */
	public Membre[] getListeMembre(){
		return listeMembre;
	}
	
    /**
     * Retourner un membre
     * @param id
     * @param allDatabase
     * @return
     */
    public static Membre getMembreById(Integer id, Data[][] allDatabase){
		
		Membre[] membre = (Membre[])allDatabase[0];
		for(int i=0; i<membre.length; i++){
			if(membre[i]!=null){
			if((membre[i].getMembreID()).equals(id)) return membre[i];
			}
		}
		return null;
		
	}
	
	
	/** 
         * Retourner la liste des membres 
	 * @param allDatabase
	 * @return liste des membre qui ont eu un service cette semaine
	 */
	public static Membre[] getMembreServiceSemaine(Data[][] allDatabase){

		ServiceRendu[] listeServicesSemaine = DataServicesRendus.getServicesRendusSemaine(allDatabase);
		Membre[] listeMembre = new Membre[listeServicesSemaine.length]; 

		int pos =0;
		for(int i=0; i< listeServicesSemaine.length; i++){ // parcourir les services de la semaine
			
			boolean sortie = true;
			int j =0;
			if(listeServicesSemaine[i]!=null){
			while(sortie && j<listeMembre.length){ // eliminer les repititions des membres dans la liste
				
				if((listeMembre[j]!=null)){
				if(listeServicesSemaine[i].getServiceRenduMembre().equals(listeMembre[j].getMembreID())){

					sortie = false;
				}	
				}
				j++;

			}
			if(sortie){ 
				// on ajoute le membre a listeMembre
				listeMembre[pos] =  getMembreById(listeServicesSemaine[i].getServiceRenduMembre(), allDatabase);
				pos++;
			
			}
			}
	 }
	return listeMembre;
	}
}