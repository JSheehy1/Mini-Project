package Library;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

public class MainScreen {

    JMenu bookMenu;
    JMenu clientMenu;
    JMenu authorMenu;
    JLabel imgLabel;
    JLabel welcomeLabel;
    JPanel buttonC;
    JPanel wlcPanel;
    JButton bookButton;
    JButton clientButton;
    JButton authorButton;

    TitledBorder titledBorder;
    ArrayList<Books> books = new ArrayList<>();
    private Books books;


    public MainScreen() {

        setTitle("Labyrinth Library");
        setSize(500,400);
        setLocationRelativeTo(null);
        setResizable(false);

        setIconImage(new ImageIcon(getClass().getResourse("logo.png")).getImage());
        
        Container cPane = getContainerPane();
        setLayout(new FlowLayout());
        
        JMenu menubar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(Color.LIGHT_GRAY);

        menuBar.add(bookMenu);
        menuBar.add(clientMenu);
        menuBar.add(authorMenu);

        wlcPanel = new JPanel();
        wlcPanel.add(Box.createVerticalStrut(15));
        wlcPanel.setLayout(new BoxLayout(wlcPanel, BoxLayout.Y_AXIS));

        welcomeLabel = new JLabel("Welcome to Labyrinth Library");
        welcomeLabel.setFont(new Font("serif",4,15));
        welcomeLabel.setForeground(Color.RED);

        welcomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        wlcPanel.add(welcomeLabel);
        wlcPanel.add(Box.createVerticalStrut(30));

        try {
            imgLabel = new JLabel();
            imgLabel.setIcon(new ImageIcon(getClass().getResource("logo.png")));

            imgLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            wlcPanel.add(imgLabel);
        }
        catch(Exception ex) {

            JOptionPane.showMessageDialog(null,"Invalid Image File in Main Screen");
        }

        wlcPanel.add(Box.createVerticalStrut(35));

        buttonC = new JPanel();

        titledBorder = new TitledBorder("Shortcut");
        titledBorder.setTitleColor(Color.BLACK);

        buttonC.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        buttonC.setPreferredSize(new Dimension(390,50));
        buttonC.setBorder(titledBorder);
        buttonC.setLayout(new GridLayout(1,3));

        bookButton = new JButton("Find Book");
        bookButton.addActionListener(this);
        buttonC.add(bookButton);

        clientButton = new JButton("Add Client");
        clientButton.addActionListener(this);
        buttonC.add(clientButton);

        authorButton = new JButton("Find Author");
        authorButton.addActionListener(this);
        buttonC.add(authorButton);

        add(wlcPanel);
        add(buttonC);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        open();
    }



}
