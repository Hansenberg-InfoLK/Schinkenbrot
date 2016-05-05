package Datasets;

import Interfaces.Connectable.Dataset.UserDatasetConnectable;

/**
 * Created by David on 16.03.2016.
 */
public class UserDataset extends Dataset implements UserDatasetConnectable
{
	public UserDatasetConnectable(int ID){} //Konstruktor mit ID der Episode. KEIN AI.
	
	public void setUsername(String username){} //Benutzername
	public String getUsername(){}

	public void setPassword(String password){} //Password-Hash
	public String getPassword(){}

	public void setEmail(String email){} //E-Mail
	public String getEmail(){}
    
	public void setBirthdate(String birthdate){} //Geburtstag mit dem Format: tt.mm.jjjj
	public String getBirthdate(){}
    
	public void setFirstname(String firstname){} //Vorname
	public String getFirstname(){}
    
	public void setLastname(String lastname){} //Nachname
	public String getLastname(){}
    
	public void setLanguage(int language){} //Fremdschlüssel ID aus Sprachentabelle
	public int getLanguage(){}
    
	public void setFriends(int[] friends){} //Fremdschlüssel-Array ID aus UserTabelle
	public int[] getFriends(){}
    
	public void setLastlogin(String lastlogin){} //Lastlogin
	public String getLastlogin(){}
    
	public void setXP(double xp){} //XP-Stand
	public double getXP(){}
}
