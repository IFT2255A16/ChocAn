
/**
 *
 * @author Antoine
 */
public class DataFournisseur extends Database{

	//Creation d'une database hardcod� avec 100 fournisseurs sur une capacite maximale de 200.
	//La premiere est utile pour les debug.
	static Fournisseur[] listeFournisseur = new Fournisseur[]{
		new Fournisseur("F","debug","Fournisseur",200000000,"Netus Et Malesuada Institute","Ap #999-5804 Commodo St.","Senneville","Quebec","R7A 6G5","In.mi@mus.edu"),
		new Fournisseur("Nulla.semper@egetmagnaSuspendisse.net","TCQ92SOW7CN","Fournisseur",200000001,"Non Enim PC","761-5408 Dis Road","Grande Cache","AB","W4X 1I8","Nulla.semper@egetmagnaSuspendisse.net"),
		new Fournisseur("sit.amet@conubianostra.ca","QHK73DKI5NI","Fournisseur",200000002,"Sem Foundation","P.O. Box 384, 1031 Hendrerit St.","Fort St. John","BC","J0I 7P0","sit.amet@conubianostra.ca"),
		new Fournisseur("Integer.vulputate.risus@necmetus.co.uk","JEU94VGW1QE","Fournisseur",200000003,"Ipsum Dolor Corp.","944 At Av.","Lakeshore","ON","B2Z 6Y0","Integer.vulputate.risus@necmetus.co.uk"),
		new Fournisseur("risus.In.mi@at.com","JHV19SNG2MZ","Fournisseur",200000004,"Nam Porttitor LLP","351-3768 Justo Street","Vilna","Alberta","I9N 1T5","risus.In.mi@at.com"),
		new Fournisseur("a@hendreritnequeIn.org","NWM20MII7OJ","Fournisseur",200000005,"Ultricies Sem Incorporated","Ap #352-5800 Vel Rd.","Medicine Hat","AB","W0H 2P7","a@hendreritnequeIn.org"),
		new Fournisseur("eleifend.non@blanditmattisCras.net","VSJ07BXV0HX","Fournisseur",200000006,"At Pede LLP","738-8798 Lorem Rd.","King Township","ON","S1H 8M7","eleifend.non@blanditmattisCras.net"),
		new Fournisseur("elementum.sem@Donec.co.uk","YQC42GQH0WR","Fournisseur",200000007,"Mattis Semper Dui Ltd","525-9542 Ut Rd.","Richmond","QC","O9E 4X2","elementum.sem@Donec.co.uk"),
		new Fournisseur("mauris.sapien@eueratsemper.net","IVS30UTG7QQ","Fournisseur",200000008,"Nec Ligula Limited","Ap #812-4591 Quam, Rd.","Coleville Lake","Northwest Territories","P1G 3G3","mauris.sapien@eueratsemper.net"),
		new Fournisseur("egestas.ligula@Namconsequat.ca","WYF33HFX7VT","Fournisseur",200000009,"Lacus Etiam PC","2742 Quam Rd.","Bay Roberts","NL","P8T 7D9","egestas.ligula@Namconsequat.ca"),
		new Fournisseur("Aenean.eget.magna@sit.org","UCS24AZR7NI","Fournisseur",200000010,"Pellentesque Ultricies Ltd","Ap #877-3345 Nunc Rd.","Hampstead","Quebec","O4A 5F2","Aenean.eget.magna@sit.org"),
		new Fournisseur("laoreet@sitametante.net","HMK76AFW3LJ","Fournisseur",200000011,"Quisque Inc.","P.O. Box 105, 8753 Dui Road","Trochu","AB","F8N 8P5","laoreet@sitametante.net"),
		new Fournisseur("porta.elit.a@montesnasceturridiculus.ca","SRO12SMJ2NB","Fournisseur",200000012,"Ac Nulla In Corporation","982-2777 Consectetuer Rd.","Hearst","Ontario","U6Z 9F8","porta.elit.a@montesnasceturridiculus.ca"),
		new Fournisseur("Duis.dignissim.tempor@per.co.uk","TOX66INR4ZZ","Fournisseur",200000013,"Eu Industries","Ap #505-6899 Duis Av.","Essex","Ontario","D4X 9D4","Duis.dignissim.tempor@per.co.uk"),
		new Fournisseur("hendrerit@nascetur.org","OUS37ZIU3HG","Fournisseur",200000014,"Ac Urna Ut Consulting","399-9396 Amet St.","Batiscan","QC","E5A 3I0","hendrerit@nascetur.org"),
		new Fournisseur("tristique@arcuNunc.co.uk","ZTS67JDU7OR","Fournisseur",200000015,"Fringilla Ornare Institute","P.O. Box 120, 8916 A Av.","Okotoks","AB","Y8V 7F9","tristique@arcuNunc.co.uk"),
		new Fournisseur("magna.Duis.dignissim@faucibusMorbi.net","JZT55JJR5WN","Fournisseur",200000016,"Eu Nibh Vulputate Consulting","Ap #150-4311 Lobortis, Rd.","St. Catharines","ON","E1I 9M1","magna.Duis.dignissim@faucibusMorbi.net"),
		new Fournisseur("urna.nec.luctus@Cumsociisnatoque.edu","KWQ14YQJ3CI","Fournisseur",200000017,"Hendrerit LLP","4229 Ornare St.","Grey County","ON","D9B 3L8","urna.nec.luctus@Cumsociisnatoque.edu"),
		new Fournisseur("mattis.semper.dui@luctusetultrices.ca","GVL21GLZ5PX","Fournisseur",200000018,"Dapibus Gravida Corporation","P.O. Box 292, 5457 Quisque Av.","Mundare","AB","M8A 9R5","mattis.semper.dui@luctusetultrices.ca"),
		new Fournisseur("arcu@ut.net","WGW74ZNW2BN","Fournisseur",200000019,"Ultrices Vivamus Institute","213 Risus. St.","Goderich","ON","U4J 3U9","arcu@ut.net"),
		new Fournisseur("consequat.dolor@enim.org","PKL99OLQ5FJ","Fournisseur",200000020,"Ligula Nullam Enim Inc.","Ap #390-3405 Odio, Av.","St. Albert","Alberta","W9K 3S1","consequat.dolor@enim.org"),
		new Fournisseur("Vivamus@molestiearcu.org","FEJ44TOI4PB","Fournisseur",200000021,"Duis Cursus Diam Limited","P.O. Box 516, 462 Urna Ave","Lakeshore","ON","U6P 3A6","Vivamus@molestiearcu.org"),
		new Fournisseur("fermentum@velitduisemper.co.uk","UGQ34CLK8SC","Fournisseur",200000022,"Nisl LLC","790-8249 Nunc. St.","Buckingham","QC","M1R 2U9","fermentum@velitduisemper.co.uk"),
		new Fournisseur("justo@utipsumac.edu","UST28GRK5EM","Fournisseur",200000023,"Sapien Nunc Pulvinar Company","Ap #504-9016 Nonummy Av.","Sherbrooke","QC","G8W 9I1","justo@utipsumac.edu"),
		new Fournisseur("blandit.viverra.Donec@metus.org","RUM12KVW4VD","Fournisseur",200000024,"Placerat Velit Incorporated","2849 Dui. Ave","Windsor","Ontario","W5H 4W2","blandit.viverra.Donec@metus.org"),
		new Fournisseur("neque.In@lobortis.co.uk","FIX42YTL4BV","Fournisseur",200000025,"Ultrices Posuere Cubilia LLP","P.O. Box 917, 9930 Amet, Avenue","Arviat","NU","J3P 7T7","neque.In@lobortis.co.uk"),
		new Fournisseur("Phasellus@habitantmorbi.ca","XRT65SYP3QR","Fournisseur",200000026,"Ut Erat Sed LLC","P.O. Box 302, 9910 Ligula. Rd.","Deschambault","QC","O1T 9D3","Phasellus@habitantmorbi.ca"),
		new Fournisseur("id.risus.quis@tortornibhsit.edu","BAJ31QGJ3NE","Fournisseur",200000027,"Egestas Lacinia Associates","P.O. Box 403, 5570 Proin Avenue","Beausejour","Manitoba","N9G 2K0","id.risus.quis@tortornibhsit.edu"),
		new Fournisseur("arcu.Curabitur@commodo.co.uk","GZH09JDW9KA","Fournisseur",200000028,"Vitae Sodales At Ltd","P.O. Box 903, 4870 Suspendisse Av.","Hearst","Ontario","A0R 2E9","arcu.Curabitur@commodo.co.uk"),
		new Fournisseur("In@consectetuer.org","QZB74QUL1KL","Fournisseur",200000029,"Mauris Ut Inc.","103-5329 Nullam Avenue","Fermont","Quebec","U3D 4W7","In@consectetuer.org"),
		new Fournisseur("metus.Aliquam.erat@eunibh.ca","ZTF45MVY3NN","Fournisseur",200000030,"Tempor Diam Dictum Company","928-3818 Arcu. Ave","Lakeshore","ON","S7C 3A3","metus.Aliquam.erat@eunibh.ca"),
		new Fournisseur("Curabitur.vel.lectus@turpisNulla.edu","CFS34VVY4FI","Fournisseur",200000031,"Auctor Mauris Vel Institute","219-5564 Mi St.","Wabamun","AB","R3N 5O7","Curabitur.vel.lectus@turpisNulla.edu"),
		new Fournisseur("molestie.dapibus.ligula@tortorNunc.org","EBF73FOU5CE","Fournisseur",200000032,"Non Vestibulum Nec Consulting","966-8174 Velit Rd.","King Township","ON","O9E 7V9","molestie.dapibus.ligula@tortorNunc.org"),
		new Fournisseur("volutpat.Nulla@mifelisadipiscing.co.uk","ESJ60RAE4PS","Fournisseur",200000033,"Et Ipsum Cursus Consulting","7704 Sit Rd.","Watson Lake","Yukon","A7A 0N4","volutpat.Nulla@mifelisadipiscing.co.uk"),
		new Fournisseur("luctus@imperdietullamcorper.net","URP99CBQ2MH","Fournisseur",200000034,"Integer Tincidunt Aliquam PC","P.O. Box 286, 8263 Montes, Avenue","Wetaskiwin","AB","Y5X 0J7","luctus@imperdietullamcorper.net"),
		new Fournisseur("Cum@etmalesuadafames.ca","DOR61QLE1GV","Fournisseur",200000035,"Fusce Feugiat Lorem LLP","Ap #800-9257 Et Avenue","Owen Sound","Ontario","J4F 4V5","Cum@etmalesuadafames.ca"),
		new Fournisseur("Aliquam.tincidunt@anteblandit.org","JOR23PRG7RX","Fournisseur",200000036,"Magna Sed Company","7524 Aliquet, Rd.","Ramara","ON","M2Y 8T3","Aliquam.tincidunt@anteblandit.org"),
		new Fournisseur("augue@arcuimperdietullamcorper.ca","HII76SZD6ZK","Fournisseur",200000037,"Et Associates","P.O. Box 765, 3124 Mi. Street","Ville de Maniwaki","Quebec","M1M 6U6","augue@arcuimperdietullamcorper.ca"),
		new Fournisseur("sit.amet@amet.net","VNY22GLA9EF","Fournisseur",200000038,"A Consulting","Ap #265-5319 Sed St.","Whitewater Region Township","ON","T3Z 5Z0","sit.amet@amet.net"),
		new Fournisseur("fermentum.risus@dolor.ca","KVW62KSS7VQ","Fournisseur",200000039,"Mauris Erat PC","3423 Rutrum. Street","Vanier","ON","O4J 1V8","fermentum.risus@dolor.ca"),
		new Fournisseur("Morbi@scelerisquescelerisque.com","EMY71HQA6HR","Fournisseur",200000040,"Nunc Mauris LLC","4956 Metus. St.","Ramara","Ontario","C3Z 8B7","Morbi@scelerisquescelerisque.com"),
		new Fournisseur("nec.tempus@pharetranibhAliquam.co.uk","FMV24QAT5YQ","Fournisseur",200000041,"Mauris Id Sapien Institute","P.O. Box 119, 9192 Nulla Street","Amqui","QC","S1E 5I0","nec.tempus@pharetranibhAliquam.co.uk"),
		new Fournisseur("neque@consequat.net","SQV70XDG7VR","Fournisseur",200000042,"Tellus Lorem Inc.","Ap #543-4156 Nec, Rd.","Vaughan","ON","O9Q 7J6","neque@consequat.net"),
		new Fournisseur("eros.Nam@laciniavitaesodales.com","TRL49LBJ8ZF","Fournisseur",200000043,"Aliquam Inc.","P.O. Box 301, 7350 Ut Rd.","Estevan","SK","D2W 6G1","eros.Nam@laciniavitaesodales.com"),
		new Fournisseur("ut@lectusquis.edu","GDB80UYJ2PB","Fournisseur",200000044,"Blandit Congue In Consulting","2657 Condimentum St.","Tofield","AB","G2X 4K0","ut@lectusquis.edu"),
		new Fournisseur("sit@In.edu","TCI00GLL8DP","Fournisseur",200000045,"Purus PC","4855 Cras Avenue","Hudson's Hope","British Columbia","T0A 3U8","sit@In.edu"),
		new Fournisseur("ullamcorper@volutpat.com","WEG24XBW1XS","Fournisseur",200000046,"Risus Odio Corp.","996-8359 Tempus Street","Cabano","QC","S7B 9H3","ullamcorper@volutpat.com"),
		new Fournisseur("tristique.ac.eleifend@egestasrhoncus.com","IZX58ODY1AN","Fournisseur",200000047,"Pharetra LLC","P.O. Box 864, 6923 Semper St.","Price","QC","M1F 9T7","tristique.ac.eleifend@egestasrhoncus.com"),
		new Fournisseur("non.lobortis@pellentesqueSed.co.uk","VSH00VTE3PN","Fournisseur",200000048,"Posuere Enim Nisl Corp.","5977 Elementum, St.","Flin Flon","MB","L0Z 0M4","non.lobortis@pellentesqueSed.co.uk"),
		new Fournisseur("Suspendisse.non.leo@egestasrhoncusProin.co.uk","YZD17MMU8OC","Fournisseur",200000049,"Lorem Lorem Luctus Limited","126-7043 Ultricies Ave","Ottawa-Carleton","ON","T0Y 6C5","Suspendisse.non.leo@egestasrhoncusProin.co.uk"),
		new Fournisseur("Integer.vulputate.risus@vitae.edu","RUC42JFS6MU","Fournisseur",200000050,"Nulla Magna Incorporated","3300 Eget St.","Kitscoty","Alberta","L4V 5H1","Integer.vulputate.risus@vitae.edu"),
		new Fournisseur("et@ultricesposuere.co.uk","BHO43RFM5IQ","Fournisseur",200000051,"Dictum Inc.","Ap #930-2945 Eget, St.","North Battleford","Saskatchewan","Z1L 4W0","et@ultricesposuere.co.uk"),
		new Fournisseur("augue@Cumsociis.ca","DMJ69OCS9LI","Fournisseur",200000052,"Vestibulum Lorem Corporation","P.O. Box 621, 7257 Gravida Road","Richmond","BC","R4R 5Z5","augue@Cumsociis.ca"),
		new Fournisseur("luctus.ut@elementumpurusaccumsan.com","NED25CPY9ET","Fournisseur",200000053,"Et Pede Nunc Inc.","P.O. Box 672, 7349 Nibh Road","Sunshine Coast Regional District","BC","Y7L 7I1","luctus.ut@elementumpurusaccumsan.com"),
		new Fournisseur("eu.odio.Phasellus@penatibuset.co.uk","GGP52LHW9EM","Fournisseur",200000054,"Mi Tempor Lorem Corporation","5589 Pede, St.","Sparwood","British Columbia","X7R 3Y3","eu.odio.Phasellus@penatibuset.co.uk"),
		new Fournisseur("dolor.dapibus.gravida@magnaLoremipsum.com","UAE48MVA4PT","Fournisseur",200000055,"Nulla LLP","P.O. Box 453, 1399 Vel St.","Chilliwack","BC","R3B 2E9","dolor.dapibus.gravida@magnaLoremipsum.com"),
		new Fournisseur("dolor@etrisusQuisque.edu","GCH86NQG4SS","Fournisseur",200000056,"Amet Foundation","1277 Phasellus Av.","Spaniard's Bay","NL","T3G 3K2","dolor@etrisusQuisque.edu"),
		new Fournisseur("Duis.at.lacus@Nulla.edu","JKB03LOV2ZQ","Fournisseur",200000057,"Feugiat Lorem Ipsum Associates","P.O. Box 795, 1340 Dignissim Av.","Cobourg","Ontario","E6H 9J9","Duis.at.lacus@Nulla.edu"),
		new Fournisseur("at.pede.Cras@vulputaterisus.com","NYA55ZLP0AW","Fournisseur",200000058,"Ipsum Industries","P.O. Box 855, 8930 Orci. Av.","Canora","SK","O0M 1K1","at.pede.Cras@vulputaterisus.com"),
		new Fournisseur("Morbi.non@consequat.net","JKK33VCL5BQ","Fournisseur",200000059,"In Sodales Elit Corp.","P.O. Box 628, 607 Est Rd.","Fraser Lake","BC","P7P 2X1","Morbi.non@consequat.net"),
		new Fournisseur("erat.eget@sedturpis.ca","MTU10FMR9FZ","Fournisseur",200000060,"Nec Eleifend Industries","556-3361 Fringilla Avenue","Cantley","QC","D9D 4I8","erat.eget@sedturpis.ca"),
		new Fournisseur("tempor.augue@natoquepenatibuset.edu","ZYH77IAM6CK","Fournisseur",200000061,"Nec Corp.","5425 Ullamcorper St.","D�gelis","QC","V8F 9Y4","tempor.augue@natoquepenatibuset.edu"),
		new Fournisseur("gravida@nonummyacfeugiat.edu","RSK96DQV5BE","Fournisseur",200000062,"Metus Sit Amet LLC","751-1197 Eget Street","Watson Lake","Yukon","L1C 5J6","gravida@nonummyacfeugiat.edu"),
		new Fournisseur("lectus@fringillaporttitorvulputate.co.uk","SAC67DFS4NZ","Fournisseur",200000063,"Libero Industries","2689 Condimentum Ave","Rocky Mountain House","Alberta","U7P 3S5","lectus@fringillaporttitorvulputate.co.uk"),
		new Fournisseur("Aliquam.nec@interdum.edu","DCE80KWB0GQ","Fournisseur",200000064,"Ut Pharetra PC","667-5575 Lobortis. Road","Grande Cache","Alberta","O2Y 5H8","Aliquam.nec@interdum.edu"),
		new Fournisseur("Fusce.mollis@Namnulla.ca","VSE94AMY1ZZ","Fournisseur",200000065,"Aptent Inc.","756 Sit St.","Cap-Rouge","QC","X3G 6D4","Fusce.mollis@Namnulla.ca"),
		new Fournisseur("in@Sednulla.com","NRW81BWG4DN","Fournisseur",200000066,"Cursus Ltd","414-1937 Malesuada Ave","100 Mile House","BC","Y2R 4J3","in@Sednulla.com"),
		new Fournisseur("mattis.semper.dui@nuncIn.net","FVB91BVU8XW","Fournisseur",200000067,"Vulputate Incorporated","P.O. Box 744, 9649 Tempor Road","Daly","MB","W6W 1H7","mattis.semper.dui@nuncIn.net"),
		new Fournisseur("lorem.ac.risus@atiaculis.edu","WVT56RAZ6RL","Fournisseur",200000068,"Sociis Corp.","411-4871 Vulputate Road","Strathcona County","Alberta","W1T 0G8","lorem.ac.risus@atiaculis.edu"),
		new Fournisseur("Nam.ligula@sempertellus.org","YUB33USV4LQ","Fournisseur",200000069,"Ut Sem Ltd","Ap #375-5133 Lorem Av.","Norfolk County","ON","U0P 6B2","Nam.ligula@sempertellus.org"),
		new Fournisseur("tincidunt.neque@diamdictumsapien.com","RRY55HEN2LW","Fournisseur",200000070,"Donec Ltd","832-7526 Semper Ave","Beausejour","Manitoba","X7L 6O4","tincidunt.neque@diamdictumsapien.com"),
		new Fournisseur("euismod.est@nunc.org","LHO54SZD0AF","Fournisseur",200000071,"Ac Facilisis Corp.","3111 Hendrerit. Avenue","Cache Creek","British Columbia","K4L 4O5","euismod.est@nunc.org"),
		new Fournisseur("orci.Ut.sagittis@ornareegestasligula.com","JIW91VSI4NJ","Fournisseur",200000072,"Magna Ut Tincidunt Ltd","Ap #206-1793 In Street","Pugwash","NS","U7F 3T7","orci.Ut.sagittis@ornareegestasligula.com"),
		new Fournisseur("velit.Quisque@Nullam.ca","GIZ88JUW4AP","Fournisseur",200000073,"Amet Foundation","P.O. Box 684, 217 Donec Street","Grey County","ON","G5V 4I9","velit.Quisque@Nullam.ca"),
		new Fournisseur("Quisque@elitpellentesquea.ca","XMY05IFB6NZ","Fournisseur",200000074,"Suspendisse Sagittis Industries","Ap #473-9916 Erat St.","Kearny","ON","P6U 8O4","Quisque@elitpellentesquea.ca"),
		new Fournisseur("tempor.lorem.eget@aliquet.net","QCA59ORA1BL","Fournisseur",200000075,"Justo Praesent LLC","772-700 Odio, Rd.","St. Thomas","ON","Z4M 9Q6","tempor.lorem.eget@aliquet.net"),
		new Fournisseur("Sed.nunc.est@mollis.org","CSP72EBE3JT","Fournisseur",200000076,"Ut Nec Associates","765-1846 Nec Street","Caledon","Ontario","X9M 6R0","Sed.nunc.est@mollis.org"),
		new Fournisseur("dolor@Nullamvitaediam.com","AHJ26YPV2XS","Fournisseur",200000077,"Suspendisse Dui Consulting","5658 Vulputate Rd.","Renfrew","ON","P7Y 3E3","dolor@Nullamvitaediam.com"),
		new Fournisseur("non.vestibulum@nonquamPellentesque.net","OAO20GUR1ZW","Fournisseur",200000078,"Duis Elementum Dui Company","Ap #710-2314 Dolor. Avenue","Medicine Hat","Alberta","P8W 9U3","non.vestibulum@nonquamPellentesque.net"),
		new Fournisseur("diam@Aliquamfringillacursus.net","GRU19HBR5VV","Fournisseur",200000079,"Lectus Nullam Suscipit Corporation","P.O. Box 368, 8869 Vitae Rd.","Kitchener","Ontario","Q2K 8G0","diam@Aliquamfringillacursus.net"),
		new Fournisseur("viverra.Donec@vestibulum.com","GZC47JGY8PZ","Fournisseur",200000080,"Pellentesque Company","Ap #445-7003 Eget, St.","Osgoode","ON","F7O 4N4","viverra.Donec@vestibulum.com"),
		new Fournisseur("lectus.ante.dictum@acmieleifend.ca","GVE27PTB4PJ","Fournisseur",200000081,"Nullam Vitae Diam LLC","Ap #342-6778 Mauris, Rd.","Beauport","Quebec","R8X 5X0","lectus.ante.dictum@acmieleifend.ca"),
		new Fournisseur("est@loremsitamet.ca","CUI01ATN6ML","Fournisseur",200000082,"Iaculis Nec Eleifend Industries","5341 Mi. Av.","Municipal District","NS","F6Z 4O8","est@loremsitamet.ca"),
		new Fournisseur("ligula.Nullam.enim@interdum.edu","RAX23NKS7DY","Fournisseur",200000083,"Ridiculus Ltd","Ap #490-2799 Aliquet. Av.","Burlington","Ontario","U7C 6D1","ligula.Nullam.enim@interdum.edu"),
		new Fournisseur("pede@nuncinterdum.ca","RGF14DOM1CX","Fournisseur",200000084,"Faucibus Associates","913-4923 Ligula Road","Beaumont","Alberta","T2C 1C6","pede@nuncinterdum.ca"),
		new Fournisseur("vel@elementumpurus.ca","MAZ96RPX6IO","Fournisseur",200000085,"Gravida LLC","681-9694 Pellentesque Street","Murdochville","Quebec","Q4C 3M3","vel@elementumpurus.ca"),
		new Fournisseur("Duis.elementum@ultricies.org","KQE53CMA4TK","Fournisseur",200000086,"Fames PC","173 Donec Rd.","Estevan","Saskatchewan","D9T 2Z1","Duis.elementum@ultricies.org"),
		new Fournisseur("eu.nibh.vulputate@Pellentesquehabitant.org","BCM08XLG8ES","Fournisseur",200000087,"Ac Nulla Company","Ap #782-7732 Lectus, Street","Aylmer","Quebec","W9I 5D5","eu.nibh.vulputate@Pellentesquehabitant.org"),
		new Fournisseur("pharetra@imperdietnonvestibulum.com","DAN24USL9ZW","Fournisseur",200000088,"Lacus Cras Interdum LLP","Ap #664-168 Vehicula Rd.","Senneville","QC","F0S 2S7","pharetra@imperdietnonvestibulum.com"),
		new Fournisseur("velit.in.aliquet@velitegetlaoreet.edu","WZP61ASG7BD","Fournisseur",200000089,"Aliquet Lobortis Nisi Inc.","9651 Nulla. Avenue","Wilmont","ON","I9K 8E9","velit.in.aliquet@velitegetlaoreet.edu"),
		new Fournisseur("lacus@eterosProin.ca","UGR42OJH2GV","Fournisseur",200000090,"Nisi LLC","137-2203 Luctus Rd.","Devon","AB","K9S 1H2","lacus@eterosProin.ca"),
		new Fournisseur("tempor.erat.neque@risusat.edu","IHY29TOO3OG","Fournisseur",200000091,"Amet Consectetuer Adipiscing Consulting","642-4922 Neque Rd.","Tay","Ontario","C2T 2G6","tempor.erat.neque@risusat.edu"),
		new Fournisseur("est@mitempor.co.uk","BDD78MAI5NG","Fournisseur",200000092,"Molestie Sed Industries","136-5925 Aliquam Av.","Spaniard's Bay","NL","L0K 2C7","est@mitempor.co.uk"),
		new Fournisseur("et@Vivamus.ca","FIG57TAG4AD","Fournisseur",200000093,"Neque Venenatis Lacus Corporation","P.O. Box 642, 6693 In St.","Whitewater Region Township","Ontario","K8Y 8E5","et@Vivamus.ca"),
		new Fournisseur("massa@ametconsectetuer.net","XBQ47AWI0MG","Fournisseur",200000094,"Nulla Ltd","699-2083 Quis, Road","Woodstock","Ontario","Y8H 3T9","massa@ametconsectetuer.net"),
		new Fournisseur("ipsum.Suspendisse@nonbibendumsed.edu","KBY13UOG7TW","Fournisseur",200000095,"Donec Consulting","6518 Nullam St.","St. Albert","Alberta","V3J 9T8","ipsum.Suspendisse@nonbibendumsed.edu"),
		new Fournisseur("cursus@ligula.edu","YKY90DKN1GB","Fournisseur",200000096,"At Egestas Industries","Ap #756-6195 Tempor St.","Lac La Biche County","AB","B7S 4S1","cursus@ligula.edu"),
		new Fournisseur("Donec@arcu.com","GEK25GVA1TP","Fournisseur",200000097,"Habitant Morbi Tristique Incorporated","5816 Lorem. Rd.","Innisfail","Alberta","P4G 4H4","Donec@arcu.com"),
		new Fournisseur("eget@nonnisiAenean.net","RVO57MBD0FU","Fournisseur",200000098,"Cursus Institute","P.O. Box 143, 4750 Vehicula Road","Beausejour","Manitoba","K4P 2Z6","eget@nonnisiAenean.net"),
		new Fournisseur("amet@magna.co.uk","KUI07RYQ1KL","Fournisseur",200000099,"Integer Foundation","Ap #463-8457 Nascetur St.","Dieppe","New Brunswick","M4S 2B6","amet@magna.co.uk"),
		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null
	};//fin listeFournisseur
	
	//Methode permettant l'affichage de la liste des fournisseur. Pour debug seulement.

    /**
     *
     * @param listeFournisseur
     */
	public static void AfficherListeFournisseur(Fournisseur[] listeFournisseur){
		
		int n = 0;
		while (true){
			if (listeFournisseur[n]==null)
				break;
					
			System.out.println(listeFournisseur[n]);
			n++;
		}
	}
	
    /**
     * Ajouter fournisseur
     * @param mem
     * @param loc
     */
    public static void AjouterFournisseur(Fournisseur mem, int loc) {
		listeFournisseur[loc] = mem;
		System.out.println("\nFournisseur ajoute au database\n");
	}

    /**
     * Supprimer fournisseur
     * @param indx
     */
    public static void SupprimerFournisseur(int indx) {
		if(indx!=-1){
			System.out.println("\nFournisseur Valide\n");
				listeFournisseur[indx]=null;
				for(int i = indx; i < listeFournisseur.length-2; i++){
					listeFournisseur[i]=listeFournisseur[i+1];
				}
				listeFournisseur[listeFournisseur.length-1]=null;
				System.out.println("\nFournisseur supprime\n");
			}
		else
			System.out.println("\nFournisseur invalide\n");
	}

    /**
     * Méthode pour mettre à jour un fournisseur
     * @param indx
     * @param choix
     * @param valeur
     */
    public static void MettreAJourFournisseur(int indx, String choix, Object valeur){
		
		if(choix=="email")
			listeFournisseur[indx].setFournisseurEMail((String) valeur);
		if(choix=="nom")
			listeFournisseur[indx].setFournisseurNom((String) valeur);
		if(choix=="adr")
			listeFournisseur[indx].setFournisseurAdresse((String) valeur);
		if(choix=="ville")
			listeFournisseur[indx].setFournisseurVille((String) valeur);
		if(choix=="prov")
			listeFournisseur[indx].setFournisseurProvince((String) valeur);
		if(choix=="code")
			listeFournisseur[indx].setFournisseurCodePostal((String) valeur);
		if(choix=="id")
			listeFournisseur[indx].setFournisseurID((Integer) valeur);
	}
	
    /**
     * Méthode pour obtenir un fournisseur
     * @param id
     * @param allDatabase
     * @return
     */
    public static Fournisseur getFournisseurById(Integer id, Data[][] allDatabase){
		
		Fournisseur[] fournisseur = (Fournisseur[])allDatabase[1];
		for(int i=0; i<fournisseur.length; i++){
			if(fournisseur[i]!=null){
			if((fournisseur[i].getFournisseurID()).equals(id)) return fournisseur[i];
			}
		}
		return null;
		
	}
	
    /**
     * Méthode pour obtenir la liste des fournisseurs qui ont fournis des services pendant la semaine 
     * @param allDatabase
     * @return la liste des fournisseurs 
     */
    public static Fournisseur[] getFournisseurServiceSemaine(Data[][] allDatabase){

		ServiceRendu[] listeServicesSemaine = DataServicesRendus.getServicesRendusSemaine(allDatabase);
		Fournisseur[] listeFournisseur = new Fournisseur[listeServicesSemaine.length]; 

		int pos =0;
		
		for(int i=0; i< listeServicesSemaine.length; i++){ // parcourir les services de la semaine
			boolean sortie = true;
			int j =0;
			if(listeServicesSemaine[i]!=null){
			while(sortie && j<listeFournisseur.length){ // eliminer les repititions des fournisseurs dans la liste
				if(listeFournisseur[j]!= null){
				if(listeServicesSemaine[i].getServiceRenduFournisseur().equals(listeFournisseur[j].getFournisseurID())){
					sortie = false;
				}	
				}
				j++;

			}
			if(sortie){ 
				// on ajoute le fournisseur a listeFournisseur 
				listeFournisseur[pos] = getFournisseurById(listeServicesSemaine[i].getServiceRenduFournisseur(), allDatabase);
				pos++;
			 }
			}
			}
		
	return listeFournisseur;
	}

	//Methode permettant d'appeler la database

    /**
     * Retourner la liste des fournisseurs 
     * @return la liste des fournisseurs
     */
	public Fournisseur[] getListeFournisseur(){
		return listeFournisseur;
	}

}