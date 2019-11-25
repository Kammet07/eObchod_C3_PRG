package obchod;

class Electronics {
    private int price;
    private String name;
    private String label;

    Electronics(int price, String name, String label){
        setPrice(price);
        setName(name);
        setLabel(label);

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
    String getLabel() {
        return label;
    }
    private void setLabel(String label) {
        this.label = label;
    }
}
