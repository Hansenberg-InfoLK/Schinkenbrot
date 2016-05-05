package Datasets;

import Interfaces.Connectable.Dataset.LevelDatasetConnectable;

/**
 * Created by David on 16.03.2016.
 */
public class LevelDataset extends Dataset implements LevelDatasetConnectable
{
	int ID;
	String description;
	int author;
	int type;
	String [] resources;
	
	public LevelDatasetConnectable(int ID){
		this.ID = ID;
	} //Konstruktor mit ID als Parameter. KEIN AI
	public int getID (){
		return this.ID;
	}
	
	public void setDescription(String description){
		this.description = description;
	} //Beschreibung
	public String getDescription(){
		return this.description;
	}

	public void setAuthor(String author){
		this.author = author;
	} //Autor
	public String getAuthor(){
		return this.author;
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

	public void setResources(String[] resources){
		this.resources = resources;
	} //Alle Ressourcen
	public String[] getResources(){
		return this.resources;
	}
}
