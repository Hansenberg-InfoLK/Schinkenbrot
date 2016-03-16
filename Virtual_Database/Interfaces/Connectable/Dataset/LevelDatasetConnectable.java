package Interfaces.Connectable.Dataset;

/**
 * @author David Holland
 * Dieses Interface ist von jedem virtuellen Datensatz zu implementieren. So wird eine nachfolgende Funktionsumstellung gewährleistet
 */
public interface LevelDatasetConnectable extends DatasetConnectable
{
    /* Redundant wegen extends
    void setName(String name);
    String getName();*/

    void setDescription(String description);
    String getDescription();

    void setAuthor(String author);
    String getAuthor();

    void setType(String type);
    String getType();

    void setResources(int[] resources);
    int[] getResources();
}
