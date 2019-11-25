package obchod;

class Drugs {
    private int price;
    private String name;
    private String manufacturer;

    Drugs(int price, String name, String manufacturer){
        setPrice(price);
        setName(name);
        setManufacturer(manufacturer);
    }

    int getPrice() {
        return price;
    }
    private void setPrice(int price) {
        this.price = price;
    }
    String getName() {
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }
    String getManufacturer() {
        return manufacturer;
    }
    private void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
