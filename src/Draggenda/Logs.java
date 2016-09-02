package Draggenda;


import java.util.ArrayList;
import java.util.HashMap;

public class Logs {
	HashMap<String, String> comptes = new HashMap<>();
	
	public void ajouterCompte(String login, String mdp){
		comptes.put(login, mdp);
	}
	
	public ArrayList<String> serialiser(){
	ArrayList<String> serial = new ArrayList<String>();
	for (String mapKey : comptes.keySet()) {
		serial.add(""+mapKey+";"+comptes.get(mapKey));
	}
	return serial;
	}
	
	public void deserialiser( ArrayList<String> comptes){
		for(String serial : comptes){
			boolean loginFini= false;
			String login ="";
			String mdp = "";
			for(int idx=0; idx<serial.length();idx++){
				
				if(serial.charAt(idx) != ';'){
					if(!loginFini){
						login +=serial.charAt(idx);
					}else{
						mdp+=serial.charAt(idx);
					}
				}else{
					loginFini=true;
				}
			
			}
			this.comptes.put(login, mdp);
		}
	}
	public int retournerIndexUser(String login){
		int idx = 0;
		for (String mapKey : comptes.keySet()) {
			System.out.println("mapKey: "+mapKey);
			System.out.println("login: "+login);
			System.out.println("indice: "+idx);
			if(mapKey.compareTo(login)==0){
				System.out.println("match !");
				return idx;
			}
			idx+=1;
		}
		return idx;
	}
	
	public boolean loginExiste(String login){
		return comptes.containsKey(login);
	}
	public boolean CompteExiste(String login, String mdp){
		
		if(!loginExiste(login)){
			return false;
		}
		if(!mdp.equals(comptes.get(login))){
			return false;
		}
		return true;
	}
	public void saveComptes(){
		ArrayList<String> serial = serialiser();
		//TODO
		//il faut stocker chaque string de serial dans une ligne du fichier csv
	}
	
	public ArrayList<String> loadComptes(){
		ArrayList<String> serial = serialiser();
	
		//TODO
		return serial;
	}
}
