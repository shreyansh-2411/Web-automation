package utilities;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader {
	
	public static ThreadLocal<JSONObject> data= new ThreadLocal<>();
	
	public static JSONObject getData() {
		return data.get();
	}
	
	public static void setData() throws IOException, ParseException {
		data.set(getJsonData());
	}
	
	public static JSONObject getJsonData() throws IOException, ParseException {
		JSONParser jsonparser= new JSONParser();
		FileReader file= new FileReader(System.getProperty("user.dir")+"/src/test/resources/TestData/testData.json");
		Object obj= jsonparser.parse(file);
		JSONObject jsonobj= (JSONObject)obj;
		return jsonobj;
	}
}