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

public class JayJay extends JFrame {
  // Anfang Attribute
  private JTextField jTextFieldCopy = new JTextField();
  private JTextField jTextFieldPaste = new JTextField();
  private JButton bDontcliccthis = new JButton();
  private JButton bReflectyourwrongactions = new JButton();
  // Ende Attribute
  
  public JayJay() { 
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
    setTitle("JayJay");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jTextFieldCopy.setBounds(16, 32, 105, 25);
    cp.add(jTextFieldCopy);
    jTextFieldPaste.setBounds(160, 32, 105, 25);
    jTextFieldPaste.setEditable(true);
    cp.add(jTextFieldPaste);
    bDontcliccthis.setBounds(88, 104, 121, 25);
    bDontcliccthis.setText("don't clicc this");
    bDontcliccthis.setMargin(new Insets(2, 2, 2, 2));
    bDontcliccthis.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bDontcliccthis_ActionPerformed(evt);
      }
    });
    cp.add(bDontcliccthis);
    bReflectyourwrongactions.setBounds(64, 152, 161, 25);
    bReflectyourwrongactions.setText("reflect your wrong actions");
    bReflectyourwrongactions.setMargin(new Insets(2, 2, 2, 2));
    bReflectyourwrongactions.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bReflectyourwrongactions_ActionPerformed(evt);
      }
    });
    cp.add(bReflectyourwrongactions);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public JayJay
  
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new JayJay();
  } // end of main
  
  public void bDontcliccthis_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    //COPY inputted Text
        //get copied text
        String sPaste;
        
        sPaste = jTextFieldPaste.getText(); 
        jTextFieldPaste.setText(jTextFieldCopy.getText());
        jTextFieldCopy.setText(sPaste);
        
        
  } // end of bDontcliccthis_ActionPerformed

  public void bReflectyourwrongactions_ActionPerformed(ActionEvent evt) {
    // set the text fields to an empty string
    jTextFieldPaste.setText("");
    jTextFieldCopy.setText("");
  } // end of bReflectyourwrongactions_ActionPerformed

  // Ende Methoden
} // end of class JayJay
