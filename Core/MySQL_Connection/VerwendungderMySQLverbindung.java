import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

...
JsonArray array = new PHPConnect().postParams("SELECT ...");
String username = ((JsonObject) array.get(datensatz_index)).get("Spaltenname");
