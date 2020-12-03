package Library;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
             setSize(400,300);
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
        new Main();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}


