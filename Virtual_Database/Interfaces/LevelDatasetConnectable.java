package com.schinkenbrot.Interfaces;

/**
 * @author David Holland
 * Dieses Interface ist von jedem virtuellen Datensatz zu implementieren. So wird eine nachfolgende Funktionsumstellung gewährleistet
 */
public interface LevelDatasetConnectable extends DatasetConnectable
{
    void setName(String name);
    String getName();

    void setDescription(String description);
    String getDescription();

    void setAuthor(String author);
    String getAuthor();

    void setType(String type);
    String getType();

    void setResources(int[] resources);
    int[] getResources();
}
