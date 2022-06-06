package filehandlingconcepts;

import java.io.File;
import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJSONFile {

	public static void readJSONFile() {

		JSONParser parser = new JSONParser();
		try {
			String path = "C:\\Users\\prawat\\Downloads\\test\\IMCOutputVO0003.json";
			File file = new File(path);
			Object obj = parser.parse(new FileReader(file));
			JSONObject jsonObject = (JSONObject) obj;
			String ClosedDealId = (String) jsonObject.get("ClosedDealId");
			// String course = (String)jsonObject.get("Course");
			JSONArray subjects = (JSONArray) jsonObject.get("Subjects");
			System.out.println("ClosedDealId: " + ClosedDealId);
			// System.out.println("Course: " + course);
			// System.out.println("Subjects:");
			Iterator iterator = subjects.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
