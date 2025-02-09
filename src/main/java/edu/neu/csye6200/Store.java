package edu.neu.csye6200;

import java.io.IOException;
import java.util.Comparator;

class Store extends AbstractStore {
    @Override
    public void demo() {
        try {
            FoodItemFactory foodFactory = new FoodItemFactory();
            ElectronicItemFactory electronicFactory = ElectronicItemFactory.getInstance();
            ServiceItemFactory serviceFactory = ServiceItemFactory.getInstance();

            for (String line : FileUtil.readFile("FoodItemCSV.txt")) {
                inventory.add(foodFactory.createItem(line));
            }
            for (String line : FileUtil.readFile("ElectronicItemCSV.txt")) {
                inventory.add(electronicFactory.createItem(line));
            }
            for (String line : FileUtil.readFile("ServiceItemCSV.txt")) {
                inventory.add(serviceFactory.createItem(line));
            }
        
            System.out.println("\nSorted by ID:");
            inventory.sort(Comparator.comparingInt(Item::getId));
            inventory.forEach(System.out::println);

            System.out.println("\nSorted by Name:");
            inventory.sort(Comparator.comparing(Item::getName));
            inventory.forEach(System.out::println);

            System.out.println("\nSorted by Price:");
            inventory.sort(Comparator.comparingDouble(Item::getPrice));
            inventory.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

