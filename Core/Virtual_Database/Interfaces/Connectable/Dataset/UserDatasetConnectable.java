package Interfaces.Connectable.Dataset;

/**
 * @author David Holland
 * Dieses Interface ist von jedem virtuellen Datensatz zu implementieren. So wird eine nachfolgende Funktionsumstellung gewÃ¤hrleistet
 */
public interface UserDatasetConnectable extends DatasetConnectable
{
    /* Redundant wegen extends
    int getID();

    void setName(String name);
    String getName();*/

	UserDatasetConnectable(int ID); //Konstruktor mit ID der Episode. KEIN AI.
	
    void setUsername(String username); //Benutzername
    String getUsername();

    void setPassword(String password); //Password-Hash
    String getPassword();

    void setEmail(String email); //E-Mail
    String getEmail();
    
    void setBirthdate(String birthdate); //Geburtstag mit dem Format: tt.mm.jjjj
    String getBirthdate();
    
    void setFirstname(String firstname); //Vorname
    String getFirstname();
    
    void setLastname(String lastname); //Nachname
    String getLastname();
    
    void setLanguage(int language); //Fremdschlüssel ID aus Sprachentabelle
    int getLanguage();
    
    void setFriends(int[] friends); //Fremdschlüssel-Array ID aus UserTabelle
    int[] getFriends();
    
    void setLastlogin(String lastlogin); //Lastlogin
    String getLastlogin();
    
    void setXP(double xp); //XP-Stand
    double getXP();
    
    
}
