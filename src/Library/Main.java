package Library;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main extends Books {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Books b1 = new Books("01","Life of Pi",10,"Action/Adventure");
        Books b2 = new Books("02","The Three Musketeers",15,"Action/Adventure");
        Books b3 = new Books("03","Carrie",7,"Horror");
        Books b4 = new Books("04","Royal Holiday",20,"Romance");
        Books b5 = new Books("05","1984",22,"Sci-Fi");
        Books b6 = new Books("06","This Is How You Lose Her",16,"Short Stories");
        Books b7 = new Books("07","The 19th Christmas",12,"Suspence/Thriller");
        Books b8 = new Books("08","The Queen of Hearts",15,"Women's Fiction");
        Books b9 = new Books("09","Me",30,"Biographies");
        Books b10 = new Books("10","Olive, Again",13,"Literary Fiction");
        Books b11 = new Books("11","The Help",17,"Historical Fiction");
        Books b12 = new Books("12","The Water Dancer",28,"Fantasy");
        Books b13 = new Books("13","Ninth House",12,"Fantasy");

        ArrayList<Books> allBooks = new ArrayList<Books>(Arrays.asList(b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13));

        String choice;

        do{
            choice = JOptionPane.showInputDialog("1. Add a Books\n2. Amend a Books\n3. Remove a Books" +
                    "\n4. View all Books\n5. Quit\n\nPlease enter your choice");

            int choiceAsInt = Integer.parseInt(choice);

            while(choiceAsInt<1 || choiceAsInt>5){
                choice = JOptionPane.showInputDialog("1. Add a Book\n2. Amend a Book\n3. Remove a Book" +
                        "\n4. View all Books\n5. Quit\n\nInvalid choice entered!! Must be between 1 and 5 inclusive");

                choiceAsInt = Integer.parseInt(choice);
            }


            switch(choice) {
                case "1":
                    addBook(allBooks);
                    break;

                case "2":
                    amendBook(allBooks);
                    break;

                case "3":
                    removeBook(allBooks);
                    break;

                case "4":
                    viewBooks(allBooks);
            }
        }while(!choice.equals("5"));

        JOptionPane.showMessageDialog(null,"Thanks for using the system!",
                "Farewell",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

    public static void addBook(ArrayList<Books> allBooks) {

        String bookID = JOptionPane.showInputDialog("Please enter the book ID");
        String name = JOptionPane.showInputDialog("Please enter the book name");
        int price = Integer.parseInt(JOptionPane.showInputDialog("Please enter the book price"));
        String genre = JOptionPane.showInputDialog("Please enter the genre of the book");

        Books b = new Books(bookID,name,price,genre);

        allBooks.add(b);
        JOptionPane.showMessageDialog(null,"Book now created and added to array list!",
                "Book Added",JOptionPane.INFORMATION_MESSAGE);

    }

    public static void amendBook(ArrayList<Books> allBooks) {

        ArrayList<Books> foundBooks = new ArrayList<Books>();
        String searchKey = JOptionPane.showInputDialog("Please enter the name of the book you wish to amend");

        for(Books bk: allBooks)
            if(bk.getName().toLowerCase().contains(searchKey.toLowerCase()))
                foundBooks.add(bk);

        String text="";

        for (Books bk : foundBooks)
            if(bk != null) {
                text += bk + "\n";
            }

        int searchID = Integer.parseInt(JOptionPane.showInputDialog("The following books matched your search phrase\n\n" + text +
                "\n\nEnter the ID of the one you want to amend"));

        Books bookToAmend=null;

        for(Books bk : foundBooks)
            if(bk !=null && bk.getBookID()==String.valueOf(searchID))
                bookToAmend = bk;

        String amendChoice = JOptionPane.showInputDialog("The deatails of the book you wish to amend are:\n\n" +
                bookToAmend + "\n\n1. Amend Book ID\n2. Amend Name" +
                "\n3. Cancel Amendment\n\nPlease enter your choice");

        int amendChoiceAsInt = Integer.parseInt(amendChoice);

        while(amendChoiceAsInt<1 || amendChoiceAsInt>3){
            amendChoice = JOptionPane.showInputDialog("The details of the product you wish to amend are:\n\n" +
                    bookToAmend + "\n\n1. Amend Book ID\n2. Amend Name" +
                    "\n3. Cancel Amendment\n\nInvalid choice entered!! Must be a value between 1 and 3 inclusive");

            amendChoiceAsInt = Integer.parseInt(amendChoice);
        }

        switch(amendChoice){
            case "1":
                String newName = JOptionPane.showInputDialog("Please enter the new name for the book");

                bookToAmend.setName(newName);

                break;

            case "2":
                String newPrice = JOptionPane.showInputDialog("Please enter the new price for the book");

                bookToAmend.setPrice(Double.parseDouble(newPrice));

                break;
        }
        JOptionPane.showMessageDialog(null,"Book details are now amended!",
                "Book Amended",JOptionPane.INFORMATION_MESSAGE);
        foundBooks.clear();
    }

    public static void removeBook(ArrayList<Books> allBooks) {

        ArrayList<Books> foundBooks = new ArrayList<Books>();
        String searchKey = JOptionPane.showInputDialog("Please enter the ID of the book you wish to remove");

        for(Books bk: allBooks)
            if(bk.getName().toLowerCase().contains(searchKey.toLowerCase()))
                foundBooks.add(bk);

        String text="";

        for (Books bk : foundBooks)
            if (bk != null) {
                text += bk + "\n";
            }

        int searchID = Integer.parseInt(JOptionPane.showInputDialog("The following books matched your search phrase\n\n" + text +
                "\n\nPlease enter the id of the one you want to remove"));

        Books bookToRemove=null;

        for (Books bk : foundBooks)
            if(bk != null && bk.getBookID()==String.valueOf(searchID))
                bookToRemove = bk;

        int removeChoice = JOptionPane.showConfirmDialog(null,"The details of the book you wish to amend are:\n\n" +
                bookToRemove + "\n\nAre you sure you wish to remove this book?","Product Removal Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);

        if(removeChoice==JOptionPane.YES_OPTION) {
            allBooks.remove(bookToRemove);
            JOptionPane.showMessageDialog(null,"Book now removed from array list!",
                    "Book Removed",JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null,"Book removal cenceled",
                    "Book not Removed",JOptionPane.INFORMATION_MESSAGE);

        foundBooks.clear();

    }

    public static void viewBooks(ArrayList<Books> allBooks) {
        String allBookData="";
        Books bk;

        Iterator<Books> iterator = allBooks.iterator();

        while(iterator.hasNext()) {
            bk = iterator.next();
            if (bk !=null)
                allBookData += bk + "\n";
        }

        JOptionPane.showMessageDialog(null,allBookData,
                "List of all Books",JOptionPane.INFORMATION_MESSAGE);
    }
}
