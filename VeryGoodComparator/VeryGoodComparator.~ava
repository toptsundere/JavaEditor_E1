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

public class VeryGoodComparator extends JFrame {
  // Anfang Attribute
  private JNumberField jNumberField1 = new JNumberField();
  private JNumberField jNumberField2 = new JNumberField();
  private JTextField jTextField1 = new JTextField();
  private JButton bCompare = new JButton();
  private JNumberField jNumberField3 = new JNumberField();
  // Ende Attribute
  
  public VeryGoodComparator() { 
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
    setTitle("VeryGoodComparator");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jNumberField1.setBounds(16, 24, 89, 33);
    jNumberField1.setText("");
    cp.add(jNumberField1);
    jNumberField2.setBounds(112, 24, 73, 33);
    jNumberField2.setText("");
    cp.add(jNumberField2);
    jTextField1.setBounds(120, 176, 41, 33);
    jTextField1.setEditable(false);
    cp.add(jTextField1);
    bCompare.setBounds(88, 120, 97, 25);
    bCompare.setText("Compare");
    bCompare.setMargin(new Insets(2, 2, 2, 2));
    bCompare.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bCompare_ActionPerformed(evt);
      }
    });
    cp.add(bCompare);
    jNumberField3.setBounds(200, 24, 57, 33);
    jNumberField3.setText("");
    cp.add(jNumberField3);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public VeryGoodComparator
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new VeryGoodComparator();
  } // end of main
  
  public void bCompare_ActionPerformed(ActionEvent evt) {
  
  int a;
  a = jNumberField1.getInt();
  
  int b;
  b = jNumberField2.getInt();
  
  int c;
  c = jNumberField3.getInt();
    
    
    // a > b
    if(a > b){
      
      jNumberField1.setInt(jNumberField2.getInt());
      jNumberField2.setInt(a);
    } if(b > c){
      
      jNumberField2.setInt(jNumberField3.getInt());
      jNumberField3.setInt(b);
    } if(a > c){
      
      jNumberField1.setInt(jNumberField3.getInt());
      jNumberField3.setInt(a);
      }
      
  
     // end of bCompare_ActionPerformed
  }
  // Ende Methoden
} // end of class VeryGoodComparator