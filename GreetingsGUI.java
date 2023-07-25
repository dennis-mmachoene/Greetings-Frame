
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class GreetingsGUI extends JFrame {
  
    //Panels
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel nameAndSurnamePnl;
    private JPanel greetingsAreaPnl;
    private JPanel btnPnl;
    private JPanel mainPnl;
    private JPanel headingPnl;
    
    //Labels
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    
    //Textfields 
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    
    //TextArea
    private JTextArea greetingsTxtArea;
    
    //Buttons
    private JButton greetBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    
    public GreetingsGUI(){
        setLayout(new BorderLayout());
        setTitle("Greetings UI");
        setSize(250,300);
        setBackground(Color.yellow);
        
        //Create Panels
        namePnl = new JPanel(new FlowLayout());
        surnamePnl = new JPanel(new FlowLayout());
        
        nameAndSurnamePnl = new JPanel(new GridLayout(2,1));
        
        greetingsAreaPnl = new JPanel(new FlowLayout());
        greetingsAreaPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1),"Greetings"));
        
        
        btnPnl = new JPanel(new FlowLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        //Creatings Labels
        headingLbl = new JLabel("Greetingds App");
        nameLbl = new JLabel("Name: ");
        surnameLbl = new JLabel("Surname: ");
       
        
        //Creating TextFields
        nameTxtFld = new JTextField(20);
        surnameTxtFld = new JTextField(20);
        
        //Greetings Area
        greetingsTxtArea = new JTextArea(10,20);
        greetingsTxtArea.setEditable(false);
        greetingsTxtArea.setText("Hello [name] [surname]");
        
        //Buttons
        greetBtn = new JButton("Greet");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        //Add name attributes to their panel
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        
        //Add surname args to their panel
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        
        //Add to a collective panel
        nameAndSurnamePnl.add(namePnl);
        nameAndSurnamePnl.add(surnamePnl);
        
        //Greetings Txt to its panel
        greetingsAreaPnl.add(greetingsTxtArea);
        
        btnPnl.add(greetBtn);
        btnPnl.add(clearBtn);
        btnPnl.add(exitBtn);
        
        //Add them to the main Panel and specify positions
        mainPnl.add(nameAndSurnamePnl, BorderLayout.NORTH);
        mainPnl.add(greetingsAreaPnl, BorderLayout.CENTER);
        mainPnl.add(btnPnl, BorderLayout.SOUTH);
        
        //Add Panel to frame
        add(headingPnl, BorderLayout.NORTH);
        add(mainPnl, BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
                                           
}
