package GoogleCloudProject.GoogleCloudProject;

import java.util.Collections;
import java.util.List;

import filehandlingconcepts.ReadCSVFile;
import filehandlingconcepts.ReadJSONFile;

public class MainClass {
	

	public static void main(String[] args) {
		
		
		
		ListObjectsWithPrefix LO = new ListObjectsWithPrefix();
		
		//String latestprocessedfile = LO.listObjectsWithPrefix("am-kube-stg", "eeq-us-east4-private-incentives-stg", "eeq-us-east4-private-incentives-stg/IncentiveMenuCalculator/IncentiveMenuCalculator-VehicleRecommendation/aMProduct/Dealers/Approved/id=AUDI/").get(0);
		String latestDate = LO.listObjectsWithPrefix("am-kube-stg", "eeq-us-east4-private-incentives-stg", "IncentiveMenuCalculator/IncentiveMenuCalculator-VehicleRecommendation/ProcessedDealers/Approved/id=Audi/").get(0);
		//String processedDealers = LO.listObjectsWithPrefix("am-kube-stg", "eeq-us-east4-private-incentives-stg", "latestDate.get(0)").get(0);
		//System.out.println("==========================");
		//System.out.println(processedDealers);
		//System.out.println("==========================");
		List<String> latest2 = LO.listFilesObjectsWithPrefix("am-kube-stg", "eeq-us-east4-private-incentives-stg", latestDate);
		System.out.println(latest2.size());
		//System.out.println(latest2.get(0));
		//DownloadObject.downloadObject("am-kube-stg", "eeq-us-east4-private-incentives-stg", latest2.get(0), "C:\\Users\\prawat\\IMCProcessedFile.csv");
		
		//DownloadObjectIntoMemory downloadObjectIntoMemory = new DownloadObjectIntoMemory();
		//downloadObjectIntoMemory.downloadObjectIntoMemory("am-kube-stg", "eeq-us-east4-private-incentives-stg", "/IncentiveMenuCalculator/IncentiveMenuCalculator-VehicleRecommendation/ProcessedDealers/Approved/id=Audi/dt=20220418/AU0046/file=AU0046_080045.json");
		//String destFilePath = "C:\\Users\\prawat\\OneDrive - automotiveMastermind\\Documents\\IMCProcessedFile\\test.json";
				//ReadCSVFile rcv = new ReadCSVFile();
				//int c = ReadCSVFile.aP();
				//System.out.println(c);
				
				//ReadJSONFile.readJSONFile();
	}

}
