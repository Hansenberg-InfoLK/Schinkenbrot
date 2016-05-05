package Datasets;

import Interfaces.Connectable.Dataset.LevelDatasetConnectable;

/**
 * Created by David on 16.03.2016.
 */
public class LevelDataset extends Dataset implements LevelDatasetConnectable
{
	public LevelDatasetConnectable(int ID){} //Konstruktor mit ID als Parameter. KEIN AI
	
	public void setDescription(String description){} //Beschreibung
	public String getDescription(){}

	public void setAuthor(String author){} //Autor
	public String getAuthor(){}

	public void setType(int type){} //Fremdschlüssel ID aus Type-Tabelle
	public int getType(){}
    
	public void setActive(boolean isActive){} //Wird die Episode gespielt?
	public boolean getActive(){}

	public void setResources(String[] resources){} //Alle Ressourcen
	public String[] getResources(){}
}
