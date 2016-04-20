package Interfaces.Connectable.Dataset;

/**
 * @author David Holland
 * Dieses Interface ist von jedem virtuellen Datensatz zu implementieren. So wird eine nachfolgende Funktionsumstellung gewÃ¤hrleistet
 */
public interface LevelDatasetConnectable extends DatasetConnectable
{
    /* Redundant wegen extends
    void setName(String name);
    String getName();*/

	LevelDatasetConnectable(int ID); //Konstruktor mit ID als Parameter. KEIN AI
	
    void setDescription(String description); //Beschreibung
    String getDescription();

    void setAuthor(String author); //Autor
    String getAuthor();

    void setType(int type); //Fremdschlüssel ID aus Type-Tabelle
    int getType();
    
    void setActive(boolean isActive); //Wird die Episode gespielt?
    boolean getActive();

    void setResources(String[] resources); //Alle Ressourcen
    String[] getResources();
}
