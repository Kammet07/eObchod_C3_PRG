package obchod;

class Books {
    private int price;
    private String name;
    private String author;

    Books(int price, String name, String author){
        setPrice(price);
        setName(name);
        setAuthor(author);
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
    String getAuthor() {
        return author;
    }
    private void setAuthor(String author) {
        this.author = author;
    }
}
