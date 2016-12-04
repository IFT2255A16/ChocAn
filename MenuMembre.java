import java.util.Scanner;
//TODO Design: Est-ce que cette classe est vraiment nécessaire? L'opérateur est celui qui les ajoute/supprime

public class MenuMembre {

	Scanner scan = new Scanner(System.in);

	//Methode qui affiche les options des membres
	public void afficherOption(Utilisateur user, Data[][] allDatabase){
		System.out.println("\nVeuillez choisir une des options pour les membres:\n");
		System.out.println("1.S'abonner\n2.Se desabonner\n3.Log off\n");
	
		Integer menuChoix = scan.nextInt();
		
		switch(menuChoix)
		{
		case 1:
			abonnement();
			break;
		case 2:
			desabonnement();
			break;
		case 3:
			break;
		}
	}

	//Methode ajoutant un membre?
	public void abonnement(){
	}
	
	//Methode supprimant un membre?
	public void desabonnement(){
	}
	
	
	//Genere un nouveau ID pour un nouveau membre
	//Verifie le dernier membre dans le databaseMembre et prend son ID+1.
		public int genererIdMembre(){
	
		return 0; //temporairement
	}
	
}
	

