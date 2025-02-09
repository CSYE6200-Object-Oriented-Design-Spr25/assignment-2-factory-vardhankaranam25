package edu.neu.csye6200;

class ElectronicItem extends Item {
    public ElectronicItem(int id, String name, double price) {
        super(id, name, price);
    }

    public ElectronicItem(String csv) {
        this(Integer.parseInt(csv.split(",")[0]), csv.split(",")[1], Double.parseDouble(csv.split(",")[2]));
    }

    @Override
    public String toString() {
        return "ElectronicItem: " + id + " | " + name + " | $" + price;
    }
}
