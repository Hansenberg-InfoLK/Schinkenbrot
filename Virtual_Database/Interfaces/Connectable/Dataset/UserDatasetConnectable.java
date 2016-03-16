package Interfaces.Connectable.Dataset;

/**
 * @author David Holland
 * Dieses Interface ist von jedem virtuellen Datensatz zu implementieren. So wird eine nachfolgende Funktionsumstellung gewährleistet
 */
public interface UserDatasetConnectable extends DatasetConnectable
{
    /* Redundant wegen extends
    int getID();

    void setName(String name);
    String getName();*/

    void setUsername(String username);
    String getUsername();

    void setPassword(String password);
    String getPassword();

    void setXP(double xp);
    double getXP();
}
