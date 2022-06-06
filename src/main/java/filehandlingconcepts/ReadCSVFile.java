package filehandlingconcepts;

import java.io.File;
import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class ReadCSVFile {

	public static int aP() {
		int count = 0;
		try {
			String path = "C:\\Users\\prawat\\Downloads\\test\\Dealers.csv";
			File file = new File(path);
			// Create an object of file reader class with CSV file as a parameter.
			FileReader filereader = new FileReader(file);

			// create csvReader object and skip first Line
			CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
			List<String[]> allData = csvReader.readAll();
			
			// print Data
			for (String[] row : allData) {
				for (String cell : row) {
					count++;
					System.out.print(cell + "\t");
				}
				System.out.println();
			}
			
			System.out.println("Total Dealers Count for Input: " + count);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
}

// public static void readDataLineByLine(String file){

/*
 * try { String path = "C:\\Users\\prawat\\Downloads\\test\\Dealers.csv"; File
 * file = new File(path); // Create an object of filereader // class with CSV
 * file as a parameter. FileReader filereader = new FileReader(file);
 * 
 * // create csvReader object passing // file reader as a parameter CSVReader
 * csvReader = new CSVReader(filereader); String[] nextRecord; int count = 0; //
 * we are going to read data line by line while ((nextRecord =
 * csvReader.readNext()) != null) { for (String cell : nextRecord) { count++;
 * System.out.print(cell + "\t"); } System.out.println(); }
 * System.out.println(+count); } catch (Exception e) { e.printStackTrace(); } }
 * 
 * }
 */
