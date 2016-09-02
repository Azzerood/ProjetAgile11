package Draggenda;

import java.util.Scanner;

public class MenuLog {
		
	String nom;
	String motdepasse;
	Scanner sc= new Scanner(System.in);
	Logs log;
	Save s;
	public MenuLog(Logs l, Save s){
		this.log=l;
		this.s=s;
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
	
		int reponseMenu=new Scanner(System.in).nextInt();
		
		if(reponseMenu==1){
			seConnecter(); 
		}else if(reponseMenu==2){
			Sinscrire();
			s.nouveauUtilisateur(nom+";"+motdepasse);
			log.deserialiser(s.listeUtilisateur());
			System.out.println(log.comptes.toString());
			System.out.println(nom+";"+motdepasse);
		}
	}
	public void seConnecter(){
		String login;
		String mdp;
		int compteur=0;
		do{
	
		login = SaisirNom();
		
		mdp = SaisirMdp();
		compteur++;
		if(compteur>=5){
			System.out.println("......................................");
			Menu();
		}
		}while(!log.CompteExiste(login, mdp));
		
		
	}
	public void Sinscrire(){
		String login;
		String mdp;
		int compteur=0;
		do{
			
		login = SaisirNom();
		compteur++;
		if(compteur>=5){
			Menu();
		}
		}while(log.loginExiste(login));
		mdp = SaisirMdp();
		log.ajouterCompte(login, mdp);
		
		
		
	}
	
	public void LancerMenuLog(){
		seConnecter();
	}
}
