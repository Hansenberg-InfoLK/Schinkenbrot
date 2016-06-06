package Interfaces.Connectable.Dataset;

/**
 * @author David Holland
 * Dieses Interface ist von jedem virtuellen Datensatz zu implementieren. So wird eine nachfolgende Funktionsumstellung gewährleistet
 */
 
 /**
  * Interface der Tabelle "Language" mit den zugehörigen Attributen; wird für die Datenbank (das Einlesen und Speichern der Daten) benötigt
  */
public interface LanguageDatasetConnectable extends DatasetConnectable
{
    /* Redundant wegen extends
     * int getID();
     * 
    void setName(String name);
    String getName();*/

	LanguageDatasetConnectable(int ID); //Konstruktor mit ID als Parameter. KEIN AI
}
