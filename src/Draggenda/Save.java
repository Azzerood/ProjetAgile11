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
import java.io.FileWriter;
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
			ooss = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("SauvegardeAgenda.csv"))));
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
			FileWriter fw=new FileWriter("SauvegardeUtilisateur.csv");
			fw.write(newuser);
			fw.close();
		} catch (FileNotFoundException e1) {
			
				e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public ArrayList<String> listeUtilisateur(){
		try {
			BufferedReader bw = new BufferedReader(new FileReader("SauvegardeUtilisateur.csv"));
			String line=bw.readLine();
			while(line!=null){
				listuser.add(line);
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

	public Agenda charger(int idx){
		ObjectInputStream oiss = null;
		Agenda age=null;
		try {
			oiss = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("SauvegardeAgenda.csv"))));
			for(int i=0; i<idx; i++){
				oiss.readObject();
			}
			age=(Agenda)oiss.readObject();
			oiss.close();
		} catch (FileNotFoundException e) {

			try {
				PrintWriter pw = new PrintWriter(new File("SauvegardeAgenda.csv"));
				pw.close();
				age=new Agenda(listuser.get(idx).substring(0,listuser.indexOf(';')));
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
		}catch(EOFException e){
			age=new Agenda(listuser.get(idx).substring(0,listuser.indexOf(';')));
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return age;
	}
}