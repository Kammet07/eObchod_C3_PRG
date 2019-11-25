package obchod;

class Books {
    private int price;
    private String name;
    private String author;

    Books(int price, String name, String author){
        this.price = price;
        this.name = name;
        this.author = author;
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
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
