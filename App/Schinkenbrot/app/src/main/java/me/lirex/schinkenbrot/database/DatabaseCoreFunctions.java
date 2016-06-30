package me.lirex.schinkenbrot.database;

import com.google.gson.*;

import me.lirex.schinkenbrot.database.PHPConnect;

/**
 * Created by Alexander on 25.06.2016.
 */
public class DatabaseCoreFunctions
{
    PHPConnect dbconnect = new PHPConnect();

    public void newUser(String email, String firstname, String lastname, String birthdate, String sprache, String accounttype, String password)
    {
        if (userExists(email, firstname, lastname, birthdate))
        {
            dbconnect.postParams("INSERT INTO User (email, firstname, lastname, birthdate, sprache, accounttype, password) "
                    + "VALUES ('" + email + "','" + firstname + "','" + lastname + "','" + birthdate + "','" + sprache + "','" + accounttype + "','" + password + "');");
        }
    }

    public boolean userExists(String email, String firstname, String lastname, String birthdate)
    {
        JsonArray result = dbconnect.postParams("SELECT * FROM User WHERE email = '" + email + "' AND firstname = '" + firstname + "' AND lastname = '" + lastname + "' AND birthdate = '" + birthdate + "');");

        return result.size() != 0;
    }

    public boolean isPasswordCorrect(String email, String pwd)
    {
        JsonArray result = dbconnect.postParams("SELECT * FROM User WHERE email = '" + email + "');");
        String db_pwd = ((JsonObject) result.get(0)).get("password").toString();

        return db_pwd.equals(pwd);
    }
}
