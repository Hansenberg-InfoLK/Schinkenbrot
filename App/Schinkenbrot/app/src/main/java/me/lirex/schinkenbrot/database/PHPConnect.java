package me.lirex.schinkenbrot.database;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class PHPConnect
{
    URL url;
    URLConnection con;
    PrintStream ps;
    BufferedReader in;
    String line;
    String result;
    JsonParser jsonParser;
    JsonArray jsonArray;

    public PHPConnect()
    {
        try
        {
            url = new URL("http://brainfuq.net/info-lk/schinkenbrot/getResultInfo.php");
            con = null;
            ps = null;
            in = null;
            line = null;
            result = "";
            jsonParser = null;
            jsonArray = null;
        }
        catch(MalformedURLException e)
        {
            e.printStackTrace();
        }
    }

    public JsonArray postParams(String params)
    {
        try
        {
            // open a connection to the site
            con = url.openConnection();
            // activate the output
            con.setDoOutput(true);
            ps = new PrintStream(con.getOutputStream());
            // send your parameters to your site
            ps.print("params=" + params);
            //ps.print("&secondKey=secondValue");

            // we have to get the input stream in order to actually send the request
            con.getInputStream();

            in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            line = null;
            result = "";
            while ((line = in.readLine()) != null)
            {
                result += line;
            }
            ps.close();

            jsonParser = new JsonParser();

            result = result.replace("Array", "");
            jsonArray = (JsonArray) jsonParser.parse(result);
            //System.out.println(((JsonObject)jsonArray.get(1)).get("Username"));
            //String title = ((JsonObject) entries.get(0)).get("Username");
            //System.out.println("Json object :: "+jsonArray);
            // close the print stream*/
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        catch (IOException f)
        {
            f.printStackTrace();
        }
        return jsonArray;
    }

    public String postParamsString(String params)
    {
        try
        {
            // open a connection to the site
            con = url.openConnection();
            // activate the output
            con.setDoOutput(true);
            ps = new PrintStream(con.getOutputStream());
            // send your parameters to your site
            ps.print("params=" + params);
            //ps.print("&secondKey=secondValue");

            // we have to get the input stream in order to actually send the request
            con.getInputStream();

            in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            line = null;
            result = "";
            while ((line = in.readLine()) != null)
            {
                result += line;
            }
            ps.close();

        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        catch (IOException f)
        {
            f.printStackTrace();
        }
        return result;
    }
}

