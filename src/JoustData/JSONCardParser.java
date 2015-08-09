package JoustData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.json.*;

public class JSONCardParser {
	private static String fileName = "data/AllSets.json";
	public String JSONLine;
	private void readJSONLine() {
		String line;
		StringBuilder builder = new StringBuilder();
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
			while((line = bufferedReader.readLine()) != null) {
				builder.append(line);
			}
			bufferedReader.close();
		}
		catch(IOException e) {
			System.out.println("IO ERROR" + e);
		}
		JSONLine = builder.toString();
	}
	public Card getCardByName(String cardName) {
		JSONObject obj = new JSONObject(JSONLine);
		JSONArray arr = obj.names();
		for(int i = 0; i < arr.length(); i++) {
			String setName = arr.getString(i);
			if(setName != null) {
				JSONArray set = obj.getJSONArray(setName);
				for(int j = 0; j < set.length(); j++) {
					JSONObject card = set.getJSONObject(j);
					if(card.getString("name").equals(cardName) && !card.getString("type").equals("Hero")) {
						return new Card(cardName, Integer.parseInt(card.get("cost").toString()), 0);
					}
				}
			}
		}
		return null;
	}
	
	public JSONCardParser() {
		readJSONLine();
	}
	
	public static void main(String[] args) {
		JSONCardParser parser = new JSONCardParser();
		Card c = parser.getCardByName("Ancestral Healing");
		System.out.println(c.toString());
	}
}
