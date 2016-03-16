package Interfaces.Connectable.Dataset;

/**
 * @author David Holland
 * Dieses Interface ist von jedem virtuellen Datensatz zu implementieren. So wird eine nachfolgende Funktionsumstellung gewährleistet
 */
public interface EpisodenDatasetConnectable extends DatasetConnectable
{
    /* Redundant wegen extends
    int getID();

    void setName(String name);
    String getName();*/

    void setDescription(String description);
    String getDescription();

    void setAuthor(int author);
    int getAuthor();

    void setLevels(Integer[] levels);
    Integer[] getLevels();

    void setResources(int[] resources);
    int[] getResources();
}
