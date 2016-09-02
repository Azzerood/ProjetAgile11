package Draggenda;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Save{ 
	ArrayList<String> listuser=new ArrayList<>();

	public void sauvegarder(Agenda age){
		ObjectOutputStream ooss = null;
		try {
			//BufferedReader bw = new BufferedReader(new FileReader("Sauvegarde.csv"));
			ooss = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("Sauvegarde.csv"))));
			ooss.writeObject(age);
			ooss.close();
			//bw.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void nouveauUtilisateur(String newuser){
		ArrayList<String> tmp=new ArrayList<>();
		ObjectOutputStream ooss = null;
		listuser.add(newuser);
		try {
			BufferedReader bw = new BufferedReader(new FileReader("Sauvegarde.csv"));
			String line=bw.readLine();
			while(line!=null){
				tmp.add(line);
				line=bw.readLine();
			}
			ooss = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("Sauvegarde.csv"))));
			for(String ligne:tmp){
				ooss.writeObject(ligne);
			}
			ooss.writeObject(newuser+new Agenda(newuser.substring(0,newuser.indexOf(';'))));
			ooss.close();
			//bw.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public ArrayList<String> listeUtilisateur(){
		try {
			BufferedReader bw = new BufferedReader(new FileReader("Sauvegarde.csv"));
			String line=bw.readLine();
			while(line!=null){
				listuser.add(line.substring(0, line.lastIndexOf(';')));
				line=bw.readLine();
			}
			bw.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return listuser;
		
	}

	public Agenda charger(int i){
		ObjectInputStream oiss = null;
		Agenda age=null;
		try {
			oiss = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("Sauvegarde.csv"))));
			String conversion=(String)oiss.readObject();
			conversion=conversion.substring(conversion.lastIndexOf(';'));
			
			age=(Agenda)oiss.readObject();
			oiss.close();
		} catch (FileNotFoundException e) {
			
			try {
				PrintWriter pw = new PrintWriter(new File("Sauvegarde.csv"));
				pw.close();
				age=new Agenda(listuser.get(i).substring(0,listuser.indexOf(';')));
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
		}catch(EOFException e){
			age=new Agenda(listuser.get(i).substring(0,listuser.indexOf(';')));
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return age;
	}

}