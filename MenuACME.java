import java.util.Scanner;

/**
 *
 * @author Ahmed
 */
public class MenuACME {

Scanner scan = new Scanner(System.in);
boolean logOff = false;

	//Methode affichant les options disponibles pour les operateurs d'ACME

    /**
     *
     * @param user
     * @param allDatabase
     */
	public void afficherOption(Utilisateur user, Data[][] allDatabase){
            while (logOff==false){
		 try {
                    System.out.println("\nVeuillez choisir une des options pour les operateurs d'ACME:\n");
                    System.out.println("1.Gerer l'adhesion d'un membre\n2.Log off\n");
               
                    Integer menuChoix = Integer.parseInt(scan.nextLine());
                    switch(menuChoix)
                    {
                    case 1:
                    	GererAdhesion(allDatabase);
                    	break;
                    case 2:
                    	logOff = true;
                        break;
                    }
                }
                catch(Exception e){
                    System.out.println("Numero du membre invalide");
                }
            }
		
		
	}
	
	//Methode permettant a l'operateur de changer l'attribut membreActif d'un utilisateur.
	//Change pour true, s'il s'agit d'un membre suspendu qui a recommence a payer.
	//Change pour false s'il s'agit d'un membre qui n'a pas paye.

    /**
     *
     * @param allDatabase
     */
	public void GererAdhesion(Data[][] allDatabase) {
            boolean change = false;
            System.out.println("\nVeuillez entrer le numero du membre:\n");
            while (change == false){
                try {
                    int numeroMembre = Integer.parseInt(scan.nextLine());
                    DataMembre dm = new DataMembre();
                    Membre membre = null;
                    while (numeroMembre<100000000){
                        System.out.println("Numero du membre invalide\nVeuillez reessayer de nouveau");
                        numeroMembre = scan.nextInt();
                    }

                    membre = dm.getMembreById(numeroMembre,allDatabase);
                    String membreActif = membre.getMembreActif()?"Actif":"Suspendu";
                    System.out.println("État present du membre est : "+membreActif);
                    System.out.print("Voulez-vous changez l'etat du membre ? (O)Oui , (N)Non : ");
                    String confirmation = scan.next();
                    confirmation = confirmation.toUpperCase();
                    boolean oui = confirmation.startsWith("O");
                    boolean non = confirmation.startsWith("N");
                    if (!oui && !non){
                        boolean entreeValide = false;
                        while (entreeValide == false){
                            System.out.println("Cette entree est invalide\nVeuillez essayer de nouveau\nVoulez-vous changez l'etat du membre ? (O)Oui , (N)Non : ");
                            confirmation = scan.next();
                            confirmation = confirmation.toUpperCase();
                            oui = confirmation.startsWith("O");
                            non = confirmation.startsWith("N");
                            if (oui || non){
                                entreeValide = true;
                            }
                        }
                    }
                    else if (oui){
                        membre.setMembreActif(!membre.getMembreActif());
                        System.out.println("Etat du membre ("+membre.getMembreNom()+") change\nSon etat present est : "+(membre.getMembreActif()?"Actif":"Suspendu"));
                    }
                    change = true;
                }
                catch(Exception e){
                    System.out.println("Entree Invalide\nVeuillez essayer de nouveau");
                }
            }
	}

}