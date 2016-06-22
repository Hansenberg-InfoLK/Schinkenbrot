package cvghkxcv;
import com.google.gson.*;

public class CoreFunctions 
{
	PHPConnect dbconnect = new PHPConnect();
	
	public void newUser(String email, String firstname, String lastname, String birthdate, String sprache, String accounttype, String password)
	{
		dbconnect.postParams("INSERT INTO User (email, firstname, lastname, birthdate, sprache, accounttype, password) "
				+ "VALUES ('" + email + "','" + firstname + "','" + lastname + "','" + birthdate + "','" + sprache + "','" + accounttype + "','" + password + "');");
	}
	
	public boolean userExists(String email, String firstname, String lastname, String birthdate)
	{
		JsonArray result = dbconnect.postParams("SELECT * FROM User WHERE email = '" + email + "' AND firstname = '" + firstname + "' AND lastname = '" + lastname + "' AND birthdate = '" + birthdate + "');");
		//Nicht sicher ob man 'result.get(0) == 0' oder 'result .get(0) == null' oder 'result == null' abfragen muss
		switch(result)
		{
			case null:
				return false;
			default:
				return true;
		}
	}
	
	public boolean userExists(String email, String firstname, String lastname)
	{
		JsonArray result = dbconnect.postParams("SELECT * FROM User WHERE email = '" + email + "' AND firstname = '" + firstname + "' AND lastname = '" + lastname + "');");
		//Nicht sicher ob man 'result.get(0) == 0' oder 'result .get(0) == null' oder 'result == null' abfragen muss
		switch(result)
		{
			case null:
				return false;
			default:
				return true;
		}
	}
	
	public boolean userExists(String email, String firstname)
	{
		JsonArray result = dbconnect.postParams("SELECT * FROM User WHERE email = '" + email + "' AND firstname = '" + firstname + "');");
		//Nicht sicher ob man 'result.get(0) == 0' oder 'result .get(0) == null' oder 'result == null' abfragen muss
		switch(result)
		{
			case null:
				return false;
			default:
				return true;
		}
	}
	
	public boolean userExists(String email)
	{
		JsonArray result = dbconnect.postParams("SELECT * FROM User WHERE email = '" + email + "');");
		//Nicht sicher ob man 'result.get(0) == 0' oder 'result .get(0) == null' oder 'result == null' abfragen muss
		switch(result)
		{
			case null:
				return false;
			default:
				return true;
		}
	}

}
