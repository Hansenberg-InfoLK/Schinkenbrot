package Datasets;

import Interfaces.Connectable.Dataset.EpisodenDatasetConnectable;

/**
 * Created by David on 16.03.2016.
 */
public class EpisodeDataset extends Dataset implements EpisodenDatasetConnectable
{
	int ID;
	String description;
	int author;
	Integer[] levels;
	int type;
	boolean isActive;
	boolean isPublic;
	String [] resources;
	
	public EpisodenDatasetConnectable(int id){
		this.ID = ID;
	} //Konstruktor mit ID der Episode. KEIN AI.
	public int getID(){
		return this.ID;
	}

	public void setDescription(String description){
		this.description = description;
	} //Beschreibung
	public String getDescription(){
		return this.description;
	}

	public void setAuthor(int author){
		this.author = author;
	} //Fremdschlüssel ID von der User-Tabelle
	public int getAuthor(){
		return this.author;
	}

	public void setLevels(Integer[] levels){
		this.levels = levels;
	} //Fremdschlüssel ID von der Level-Tabelle
	public Integer[] getLevels(){
		return this.levels;
	}

	public void setType(int type){
		this.type = type;
	} //Fremdschlüssel ID aus Type-Tabelle
	public int getType(){
		return this.type;
	}
    
	public void setActive(boolean isActive){
		this.isActive = isActive;
	} //Wird die Episode gespielt?
	public boolean getActive(){
		return this.isActive;
	}
    
	public void setPublic(boolean isPublic){
		this.isPublic = isPublic;
	} //Ist die episode öffentlich?
	public boolean getPublic(){
		return this.isPublic;
	}
    
	public void setResources(String[] resources){
		this.resources = resources;
	} //Alle Ressourcen
	public String[] getResources(){
		return this.resources;
	}
}
