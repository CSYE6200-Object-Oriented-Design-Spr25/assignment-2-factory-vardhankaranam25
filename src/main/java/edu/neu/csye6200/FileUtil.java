package edu.neu.csye6200;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;


class FileUtil {
    public static List<String> readFile(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }

    public static void writeSampleCSV() throws IOException {
        writeFile("FoodItemCSV.txt", Arrays.asList(
            "1,Apple,1.50",
            "2,Banana,0.99",
            "3,Orange,1.20"
        ));
        
        writeFile("ElectronicItemCSV.txt", Arrays.asList(
            "101,Laptop,999.99",
            "102,Smartphone,699.50",
            "103,Tablet,499.00"
        ));
        
        writeFile("ServiceItemCSV.txt", Arrays.asList(
            "201,Car Wash,25.00",
            "202,House Cleaning,100.00",
            "203,Gardening,50.00"
        ));
    }

    private static void writeFile(String filePath, List<String> lines) throws IOException {
        Files.write(Paths.get(filePath), lines, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }
}



