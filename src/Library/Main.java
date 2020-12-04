package Library;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Main extends JFrame implements ActionListener{

    JMenu booksMenu;
    JMenu usersMenu;
    JLabel imgLabel;
    JLabel welcomeLabel;
    JPanel wlcPanel;
    JPanel buttonC;
    JButton booksButton;
    JButton usersButton;

    TitledBorder titledBorder;
    ArrayList<Books> books = new ArrayList<>();
    private Books book;

    public Main() {

        setTitle("Apex Library");
        setSize(400,310);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());

        Container cPane = getContentPane();
        setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(Color.LIGHT_GRAY);

        menuBar.add(booksMenu);
        menuBar.add(usersMenu);

        wlcPanel = new JPanel();
        wlcPanel.add(Box.createVerticalStrut(10));
        wlcPanel.setLayout(new BoxLayout(wlcPanel, BoxLayout.Y_AXIS));

        welcomeLabel = new JLabel("Welcome to Apex Library");
        welcomeLabel.setFont(new Font("serif",3,20));
        welcomeLabel.setForeground(Color.BLUE);

        welcomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        wlcPanel.add(welcomeLabel);
        wlcPanel.add(Box.createVerticalStrut(35));

        try {
            imgLabel = new JLabel();
            imgLabel.setIcon(new ImageIcon(getClass().getResource("books.jpg")));

            imgLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            wlcPanel.add(imgLabel);
        }
        catch(Exception ex) {

            JOptionPane.showMessageDialog(null,"Invalid Image File in Main Screen");
        }

        wlcPanel.add(Box.createVerticalStrut(30));

        buttonC = new JPanel();

        titledBorder = new TitledBorder("Shortcut Button");
        titledBorder.setTitleColor(Color.RED);

        buttonC.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        buttonC.setPreferredSize(new Dimension(390,50));
        buttonC.setBorder(titledBorder);
        buttonC.setLayout(new GridLayout(1,3));

        booksButton = new JButton("View Books");
        booksButton.addActionListener(this);
        buttonC.add(booksButton);

        usersButton = new JButton("View Users");
        usersButton.addActionListener(this);
        buttonC.add(usersButton);

        add(wlcPanel);
        add(buttonC);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {

        Books b1 = new Books("01","Decline and Fall",34,"Non-Fiction");
        Books b2 = new Books("02","The Unconsoled",30,"Fiction");
        Books b3 = new Books("03","The Lord of the Rings",60,"Fantasy");
        Books b4 = new Books("04","Dracula",55,"Horror");
        Books b5 = new Books("05","Life of PI",9,"Adventure");
        Books b6 = new Books("06","To Kill a Mockingbird",10,"Classic");
        Books b7 = new Books("07","Watchmen",20,"Graphic novel");
        Books b8 = new Books("08","The Adventures of Sherlock Holmes",10,"Detective/Mystery");

        Books allBooks[] = {b1,b2,b3,b4,b5,b6,b7,b8};
    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
