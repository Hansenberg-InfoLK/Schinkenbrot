package Interfaces.Connectable.Dataset;

/**
 * @author David Holland
 * Dieses Interface ist von jedem virtuellen Datensatz zu implementieren. So wird eine nachfolgende Funktionsumstellung gewÃ¤hrleistet
 */
/**
 * Interface der Tabelle "Episoden" mit den zugehörigen Attributen; wird für die Datenbank (das Einlesen und Speichern der Daten) benötigt
 */
public interface EpisodenDatasetConnectable extends DatasetConnectable
{
    /* Redundant wegen extends
    int getID();

    void setName(String name);
    String getName();*/
	
	EpisodenDatasetConnectable(int id); //Konstruktor mit ID der Episode. KEIN AI.

    void setDescription(String description); //Beschreibung
    String getDescription();

    void setAuthor(int author); //Fremdschlüssel ID von der User-Tabelle
    int getAuthor();

    void setLevels(Integer[] levels); //Fremdschlüssel ID von der Level-Tabelle
    Integer[] getLevels();

    void setType(int type); //Fremdschlüssel ID aus Type-Tabelle
    int getType();
    
    void setActive(boolean isActive); //Wird die Episode gespielt?
    boolean getActive();
    
    void setPublic(boolean isPublic); //Ist die episode öffentlich?
    boolean getPublic();
    
    void setResources(String[] resources); //Alle Ressourcen
    String[] getResources();
}
