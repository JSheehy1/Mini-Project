package Library;

import java.io.Serializable;

public class Books implements Serializable {

    private String category;
    private String name;


    public Books() {this("Not Given","Not Given");}

    public Books(String category, String name) {
        setCategory(category);
        setName(name);
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Category: %s\nName: %.2f\n",getCategory(),getName());
    }

}
