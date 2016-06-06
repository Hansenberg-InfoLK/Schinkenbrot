package Datasets;

import Interfaces.Connectable.Dataset.UserDatasetConnectable;

/**
 * Created by David on 16.03.2016.
 */
/** 
 * Klasse der Tablle "User" mit den zugehörigen Attributen; wird für die Datenbank benötigt (einlesen und auslesen von Daten);
 * Die Tabelle "User" enthält die Daten der Benutzer des Spiels;
 * User können/sollen mit Episoden und Leveln interagieren;
 */
public class UserDataset extends Dataset implements UserDatasetConnectable
{
	int ID;
	String username;
	String password;
	String email;
	String birthdate;
	String firstname;
	String lastname;
	String lastlogin;
	int language;
	int [] friends;
	double xp;
	
	
	public UserDatasetConnectable(int ID){
		this.ID = ID;
	} //Konstruktor mit ID der Episode. KEIN AI.
	public int getID () {
		return this.ID;
	}
	
	public void setUsername(String username){
	this.username = username;	
	} //Benutzername
	public String getUsername(){
		return this.username;
	}

	public void setPassword(String password){
		this.password = password;
	} //Password-Hash
	public String getPassword(){
		return this.password;
	}

	public void setEmail(String email){
		this.email = email;
	} //E-Mail
	public String getEmail(){
		return this.email;
	}
    
	public void setBirthdate(String birthdate){
		this.birthdate = birthdate;
	} //Geburtstag mit dem Format: tt.mm.jjjj
	public String getBirthdate(){
		return this.birthdate;
	}
    
	public void setFirstname(String firstname){
		this.firstname = firstname;
	} //Vorname
	public String getFirstname(){
		return this.firstname;
	}
    
	public void setLastname(String lastname){
		this.lastname = lastname;
	} //Nachname
	public String getLastname(){
		return this.lastname;
	}
    
	public void setLanguage(int language){
		this.language = language;
	} //Fremdschlüssel ID aus Sprachentabelle
	public int getLanguage(){
		return this.language;
	}
    
	public void setFriends(int[] friends){
		this.friends = friends;
	} //Fremdschlüssel-Array ID aus UserTabelle
	public int[] getFriends(){
		return this.friends;
	}
    
	public void setLastlogin(String lastlogin){
		this.lastlogin = lastlogin;
	} //Lastlogin
	public String getLastlogin(){
		return this.lastlogin;
	}
    
	public void setXP(double xp){
		this.xp = xp;
	} //XP-Stand
	public double getXP(){
		return this.xp;
	}
}
