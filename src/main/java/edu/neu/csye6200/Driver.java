package edu.neu.csye6200;

import java.io.IOException;

/**
 * 
 * @author Ruchika Sharm
 * 
 */

public class Driver {
	public static void main(String[] args) {
		System.out.println("============Main Execution Start===================\n\n");

        try {
            FileUtil.writeSampleCSV(); // This will generate the CSV files if they don't exist.
        } catch (IOException e) {
            System.out.println("Error writing CSV files: " + e.getMessage());
        }

        Store store = new Store();
        store.demo();
    

		
		System.out.println("\n\n============Main Execution End===================");
	}
}
