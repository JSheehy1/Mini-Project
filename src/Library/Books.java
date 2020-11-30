package Library;

import java.io.Serializable;

public class Books implements Serializable {

    private String bookID;
    private String name;
    private double price;
    private String genre;


    public Books() {this("Not Given","Not Given",0,"Not Given");}

    public Books(String bookID, String name, double price, String genre) {
        setBookID(bookID);
        setName(name);
        setPrice(price);
        setGenre(genre);
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getBookID() {
        return bookID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return String.format("Book ID: %s\nName: %s\nPrice: %s\nGenre: %.2f\n",getBookID(),getName(),getPrice(),getGenre());
    }

}
