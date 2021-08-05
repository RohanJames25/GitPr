package mavenpractice.mavenjava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

@Test
public class JsonRead {
	
	public void readfile() throws IOException, ParseException {
		
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader("E:\\Eclipse Projects New\\Data\\testdata.json");
		//Read JSON file
		Object obj = jsonParser.parse(reader);
		
		JSONArray empList = (JSONArray) obj;
		//System.out.println(empList); //This prints the entire json file
		
		for(int i=0;i<empList.size();i++) 
		{
		JSONObject emps = (JSONObject) empList.get(i);
		//System.out.println(emps);
		JSONObject emp = (JSONObject) emps.get("Employees");
		System.out.println(emp);
		String uname = (String) emp.get("username");
		String pwd = (String) emp.get("password");
		//System.out.println("The username is " + uname);
		//System.out.println("The password is " + pwd);
	
	}
	}


}
