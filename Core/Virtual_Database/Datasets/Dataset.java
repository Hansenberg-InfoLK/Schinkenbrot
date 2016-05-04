package Datasets;

import Interfaces.Connectable.Dataset.DatasetConnectable;

/**
 * Created by David on 16.03.2016.
 */
public abstract class Dataset implements DatasetConnectable
{
	String name = "";
	
	int ID;
	
	public DatasetConnectable(int ID){
		this.ID = ID;
	}
	
	public int getID(){
		return this.ID;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
}
