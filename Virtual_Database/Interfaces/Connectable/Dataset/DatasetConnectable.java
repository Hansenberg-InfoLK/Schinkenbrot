package Interfaces.Connectable.Dataset;

/**
 * Created by David on 16.03.2016.
 */
public interface DatasetConnectable
{
	DatasetConnectable(int ID);
	
    int getID();

    void setName(String name);
    String getName();
}
