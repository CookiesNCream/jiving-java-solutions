class MyBook extends Book {
    
    private int price;
    
    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }
    
    void display() {
        System.out.println("Title: "+title+"\nAuthor: "+author+"\nPrice: "+getPrice());
    }
    
    public int getPrice() {
        return this.price;
    }
}
