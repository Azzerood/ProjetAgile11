package Draggenda;

import java.util.Scanner;

public class MenuLog {
		
	String nom;
	String motdepasse;
	Scanner sc= new Scanner(System.in);
	Logs log;
	public MenuLog(Logs l){
		this.log=l;
	}
	
	public String SaisirNom(){
		System.out.println("Veuillez saisir votre nom d'utilisateur");
		nom=sc.nextLine();
		return nom;
	}
	public String SaisirMdp(){
		System.out.println("Veuillez saisir votre mot de passe");
		motdepasse=sc.nextLine();
		return motdepasse;
	}
	public void Menu(){
		System.out.println("1- Se connecter");
		System.out.println("2- S'inscrire");
		int reponseMenu=sc.nextInt();
		
		if(reponseMenu==1){
			seConnecter();
		}else if(reponseMenu==2){
			Sinscrire();
		}
	}
	public void seConnecter(){
		String login;
		String mdp;
		do{
	
		login = SaisirNom();
		
		mdp = SaisirMdp();
		}while(!log.CompteExiste(login, mdp));
	}
	public void Sinscrire(){
		String login;
		String mdp;
		do{
			
		login = SaisirNom();
		}while(log.loginExiste(login));
		mdp = SaisirMdp();
		log.ajouterCompte(login, mdp);
		
	}
	
	public void LancerMenuLog(){
		seConnecter();
	}
}
