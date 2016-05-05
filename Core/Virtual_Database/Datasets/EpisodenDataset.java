package Datasets;

import Interfaces.Connectable.Dataset.EpisodenDatasetConnectable;

/**
 * Created by David on 16.03.2016.
 */
public class EpisodeDataset extends Dataset implements EpisodenDatasetConnectable
{
	public EpisodenDatasetConnectable(int id){} //Konstruktor mit ID der Episode. KEIN AI.

	public void setDescription(String description){} //Beschreibung
	public String getDescription(){}

	public void setAuthor(int author){} //Fremdschlüssel ID von der User-Tabelle
	public int getAuthor(){}

	public void setLevels(Integer[] levels){} //Fremdschlüssel ID von der Level-Tabelle
	public Integer[] getLevels(){}

	public void setType(int type){} //Fremdschlüssel ID aus Type-Tabelle
	public int getType(){}
    
	public void setActive(boolean isActive){} //Wird die Episode gespielt?
	public boolean getActive(){}
    
	public void setPublic(boolean isPublic){} //Ist die episode öffentlich?
	public boolean getPublic(){}
    
	public void setResources(String[] resources){} //Alle Ressourcen
	public String[] getResources(){}
}
