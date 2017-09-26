import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*



;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 07.09.2017
  * @author 
  */

public class JFrameTest extends JFrame {
  // Anfang Attribute
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  private JButton jButton1 = new JButton();
  private JButton jButtonReset = new JButton();
  // Ende Attribute
  
  public JFrameTest() { 
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
    setTitle("JFrameTest");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jTextField1.setBounds(16, 24, 121, 25);
    cp.add(jTextField1);
    jTextField2.setBounds(160, 24, 113, 25);
    
    jTextField2.setEditable(false);
    cp.add(jTextField2);
    
    //COPY button
    jButton1.setBounds(72, 128, 131, 25);
    jButton1.setText("don't click this");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    
    jButtonReset.setBounds(72, 180, 131, 25);
    jButtonReset.setText("reset");
    jButtonReset.setMargin(new Insets(2, 2, 2, 2));
    jButtonReset.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButtonReset_ActionPerformed(evt);
      }
    });
    cp.add(jButtonReset);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public JFrameTest
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new JFrameTest();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    String s;
    s = jTextField1.getText();
    jTextField2.setText(s);
  } // end of jButton1_ActionPerformed
  
  public void jButtonReset_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    jTextField1.setText("");
    
    //set right text field empty too
    jTextField2.setText("");
  } // end of jButtonReset_ActionPerformed

  // Ende Methoden
} // end of class JFrameTest
