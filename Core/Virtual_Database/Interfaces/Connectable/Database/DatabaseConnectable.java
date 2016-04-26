package Interfaces.Connectable.Database;

public interface DatabaseConnectable
{
	DatabaseConnectable(int ID);
	
    int getID();

    void setName(String name);
    String getName();
    
    public HashMap<Integer, Table> database = new HashMap<Integer, Table>();
    
    public void add(Database database);

	public void remove(Database database);

	public void setDatabase(HashMap<Integer, Table> database);

	public HashMap<Integer,Table> getDatabase();
}