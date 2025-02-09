package edu.neu.csye6200;

class ServiceItem extends Item {
    public ServiceItem(int id, String name, double price) {
        super(id, name, price);
    }

    public ServiceItem(String csv) {
        this(Integer.parseInt(csv.split(",")[0]), csv.split(",")[1], Double.parseDouble(csv.split(",")[2]));
    }

    @Override
    public String toString() {
        return "ServiceItem: " + id + " | " + name + " | $" + price;
    }
}
