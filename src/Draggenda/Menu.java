package Draggenda;
import java.util.Scanner;

public class Menu {
	
	public Menu(){
			
	}
	public  void Showagenda(){
		
	}
	public  void CreateEvent(){
		
	}
	public  void SearchUsers(){
		
	}
	public String SaisieNombre(){
		String nombre;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Saisissez votre nombre");
		String reponse=sc.nextLine();
		
		return reponse;
		
		
	}
	public int VerifNombre(String nb){
		int nombre=-1;
		if(nb.matches("[0-9]")){
			nombre=Integer.parseInt(nb);
		}
		return nombre;
		
	}
	public  void LancerAction(int nb){
		if(nb==1){
			Showagenda();
		}else if(nb==2){
			CreateEvent();
		}else if(nb==3){
			SearchUsers();
		}
	}
	public  void AfficherMenu(){		
		System.out.println(new Menu().TexteMenu());
		
	}
	public void DeroulerMenu(){
		AfficherMenu();
		SaisieNombre();
	}
	public String TexteMenu(){
		return "Votre Menu d'actions\n1- Consulter votre agenda\n2- Créer un événement\n3- Recherche d'utilisateur";
	}
}
