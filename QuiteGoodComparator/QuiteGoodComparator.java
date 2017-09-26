import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 21.09.2017
  * @author 
  */

public class QuiteGoodComparator extends JFrame {
  // Anfang Attribute
  private JNumberField jNumberField1 = new JNumberField();
  private JNumberField jNumberField2 = new JNumberField();
  private JButton Compare = new JButton();
  private JTextField jTextField1 = new JTextField();
  // Ende Attribute
  
  public QuiteGoodComparator() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("QuiteGoodComparator");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jNumberField1.setBounds(24, 24, 97, 25);
    jNumberField1.setText("");
    cp.add(jNumberField1);
    jNumberField2.setBounds(160, 24, 97, 25);
    jNumberField2.setText("");
    cp.add(jNumberField2);
    Compare.setBounds(88, 120, 89, 25);
    Compare.setText("Compare");
    Compare.setMargin(new Insets(2, 2, 2, 2));
    Compare.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        Compare_ActionPerformed(evt);
      }
    });
    cp.add(Compare);
    jTextField1.setBounds(128, 24, 25, 25);
    jTextField1.setEditable(false);
    cp.add(jTextField1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public QuiteGoodComparator
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new QuiteGoodComparator();
  } // end of main
  
  public void Compare_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    /**String a;
    a = jNumberField1.getText();
    
    String b;
    b = jNumberField2.getText();*/
    
    if(jNumberField1.getInt() > jNumberField2.getInt()){
      
      jTextField1.setText(">");
    }
    if(jNumberTextField1.getInt() > jNumberField2.getInt()){
      jTextField1.setText("<");
      }
    if(jNumberTextField1.getInt()==jNumberField2.getInt()){
    jTextField1.setText("=");
       // end of if
  } } // end of Compare_ActionPerformed

  // Ende Methoden
}
 // end of class QuiteGoodComparator
