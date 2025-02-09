package edu.neu.csye6200;

class FoodItem extends Item {
    public FoodItem(int id, String name, double price) {
        super(id, name, price);
    }

    public FoodItem(String csv) {
        this(Integer.parseInt(csv.split(",")[0]), csv.split(",")[1], Double.parseDouble(csv.split(",")[2]));
    }

    @Override
    public String toString() {
        return "FoodItem: " + id + " | " + name + " | $" + price;
    }
}
