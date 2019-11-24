class Drugs {
    private int price;
    private String name;
    private String manufacturer;

    Drugs(int price, String name, String manufacturer){
        this.price = price;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
