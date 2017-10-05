import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 28.09.2017
  * @author 
  */

public class Zinsiminsi extends JFrame {
  // Anfang Attribute
  private JLabel lStartkapital = new JLabel();
  private JLabel lZinssatz = new JLabel();
  private JLabel lLaufzeit = new JLabel();
  private JLabel lEndkapital = new JLabel();
  private JButton bCalculate = new JButton();
  private JNumberField startKapitalField = new JNumberField();
  private JNumberField zinssatzField = new JNumberField();
  private JNumberField endKapitalField = new JNumberField();
  private JNumberField laufzeitField = new JNumberField();
  // Ende Attribute
  
  public Zinsiminsi() { 
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
    setTitle("Zinsiminsi");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    lStartkapital.setBounds(8, 16, 147, 33);
    lStartkapital.setText("Startkapital");
    cp.add(lStartkapital);
    lZinssatz.setBounds(8, 64, 155, 41);
    lZinssatz.setText("Zinssatz");
    cp.add(lZinssatz);
    lLaufzeit.setBounds(8, 120, 155, 41);
    lLaufzeit.setText("Laufzeit");
    cp.add(lLaufzeit);
    lEndkapital.setBounds(8, 224, 155, 33);
    lEndkapital.setText("Endkapital");
    cp.add(lEndkapital);
    bCalculate.setBounds(72, 176, 129, 33);
    bCalculate.setText("Calculate");
    bCalculate.setMargin(new Insets(2, 2, 2, 2));
    bCalculate.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bCalculate_ActionPerformed(evt);
      }
    });
    cp.add(bCalculate);
    startKapitalField.setBounds(200, 16, 65, 41);
    startKapitalField.setText("");
    cp.add(startKapitalField);
    zinssatzField.setBounds(200, 72, 65, 41);
    zinssatzField.setText("");
    cp.add(zinssatzField);
    endKapitalField.setBounds(200, 216, 65, 41);
    endKapitalField.setText("");
    endKapitalField.setEditable(false);
    cp.add(endKapitalField);
    laufzeitField.setBounds(200, 128, 65, 41);
    laufzeitField.setText("");
    cp.add(laufzeitField);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Zinsiminsi
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Zinsiminsi();
  } // end of main
  
  public void bCalculate_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    double a;   
    a = startKapitalField.getDouble();
    
    double b;
    b = zinssatzField.getDouble();
    
    int c;
    c = laufzeitField.getInt();
    
    int d;
    d = 0;
    
    while(d<c){
    
      a = (a * (b + 100.0) / 100);
      d = d + 1;
      
      }
  endKapitalField.setDouble(a); 
  } // end of bCalculate_ActionPerformed

  // Ende Methoden
} // end of class Zinsiminsi
