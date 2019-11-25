package obchod;

class Electronics {
    private int price;
    private String name;
    private String label;

    Electronics(int price, String name, String label){
        this.price = price;
        this.name = name;
        this.label = label;
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
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
}
