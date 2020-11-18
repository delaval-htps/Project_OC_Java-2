package com.hemebiotech.analytics;

import com.hemebiotech.reader.ReadSymptomDataFromFile;
import com.hemebiotech.treatment.SortWithoutDuplicatesCountSymptoms;
import com.hemebiotech.writer.WriteSymptomDataIntoFile;

/**
 * The principal main class to run the application
 * 
 * @author delaval
 * @version v0.2
 */
public class Main {

	public static void main(String[] args) {

		AnalyticsCounter counterSymptoms = new AnalyticsCounter(new ReadSymptomDataFromFile("symptoms.txt"),
				new WriteSymptomDataIntoFile("result3.out"), new SortWithoutDuplicatesCountSymptoms());

		counterSymptoms.getListSymptoms();
		counterSymptoms.setTreatmentSymptoms();
		counterSymptoms.setFileResult();
	}

}
