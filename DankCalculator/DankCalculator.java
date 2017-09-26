import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 14.09.2017
  * @author 
  */

public class DankCalculator extends JFrame {
  // Anfang Attribute
  private JNumberField jNumberField1 = new JNumberField();
  private JNumberField jNumberField2 = new JNumberField();
  private JNumberField jNumberField3 = new JNumberField();
  private JButton bKalkulateee = new JButton();
  private JLabel lTotal = new JLabel();
  // Ende Attribute
  
  public DankCalculator() { 
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
    setTitle("DankCalculator");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jNumberField1.setBounds(120, 16, 65, 49);
    jNumberField1.setText("");
    cp.add(jNumberField1);
    jNumberField2.setBounds(120, 88, 65, 41);
    jNumberField2.setText("");
    cp.add(jNumberField2);
    jNumberField3.setBounds(120, 208, 65, 33);
    jNumberField3.setText("");
    cp.add(jNumberField3);
    bKalkulateee.setBounds(120, 144, 65, 41);
    bKalkulateee.setText("Kalkulateee");
    bKalkulateee.setMargin(new Insets(2, 2, 2, 2));
    bKalkulateee.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bKalkulateee_ActionPerformed(evt);
      }
    });
    cp.add(bKalkulateee);
    lTotal.setBounds(16, 208, 91, 33);
    lTotal.setText("Total");
    cp.add(lTotal);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public DankCalculator
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new DankCalculator();
  } // end of main
  
  public void bKalkulateee_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int a;
    
    a = jNumberField1.getInt();
    
    jNumberField3.setInt(a + jNumberField2.getInt());
  } // end of bKalkulateee_ActionPerformed

  // Ende Methoden
} // end of class DankCalculator
