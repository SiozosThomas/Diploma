package client;

import data_processing.JsonProcessing;

public class Client {

	public static void main(String[] args) {
		JsonProcessing jsonProcessing = new JsonProcessing();
		//jsonProcessing.processingJsonFile("photo.json");
		//jsonProcessing.processingJsonFile("tip.json");
		//jsonProcessing.processingJsonFile("test_countries_2_entries.json");
		jsonProcessing.processingJsonFile("profiles.json");
	}
}