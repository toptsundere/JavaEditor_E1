import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 05.10.2017
  * @author 
  */

public class GuessGame extends JFrame {
  // Anfang Attribute
  private JLabel lMaximum = new JLabel();
  private JLabel lMinimum = new JLabel();
  private JLabel lZuraten = new JLabel();
  private JLabel lMaxAnzahlVersuche = new JLabel();
  private JLabel lMeldungen = new JLabel();
  private JNumberField jNumberFieldMax = new JNumberField();
  private JNumberField jNumberFieldMin = new JNumberField();
  private JNumberField jNumberFieldRaten = new JNumberField();
  private JNumberField jNumberFieldMaxV = new JNumberField();
  private JLabel lTipp = new JLabel();
  private JNumberField jNumberFieldTipp = new JNumberField();
  private JLabel lBisherbenotigteVersuche = new JLabel();
  private JNumberField jNumberFieldBisherV = new JNumberField();
  private JButton bSavenumber = new JButton();
  private JButton bUberprufen = new JButton();
  private JTextField jTextFieldMeldungen = new JTextField();
  private JButton bReset = new JButton();
  // Ende Attribute
  //ANFANG globale Variablen
  int tipp, zuRaten, maxAnzahlV, bisherV;
  //ENDE globale Variablen
  
  public GuessGame() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 422; 
    int frameHeight = 333;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("GuessGame");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    lMaximum.setBounds(8, 8, 91, 25);
    lMaximum.setText("Maximum");
    cp.add(lMaximum);
    lMinimum.setBounds(8, 64, 91, 25);
    lMinimum.setText("Minimum");
    cp.add(lMinimum);
    lZuraten.setBounds(8, 112, 91, 25);
    lZuraten.setText("Zu raten");
    cp.add(lZuraten);
    lMaxAnzahlVersuche.setBounds(8, 160, 99, 25);
    lMaxAnzahlVersuche.setText("max. Anzahl Versuche");
    cp.add(lMaxAnzahlVersuche);
    lMeldungen.setBounds(8, 248, 99, 25);
    lMeldungen.setText("Meldungen");
    cp.add(lMeldungen);
    jNumberFieldMax.setBounds(112, 8, 49, 33);
    jNumberFieldMax.setText("");
    cp.add(jNumberFieldMax);
    jNumberFieldMin.setBounds(112, 64, 49, 33);
    jNumberFieldMin.setText("");
    cp.add(jNumberFieldMin);
    jNumberFieldRaten.setBounds(112, 112, 49, 33);
    jNumberFieldRaten.setText("");
    cp.add(jNumberFieldRaten);
    jNumberFieldMaxV.setBounds(112, 152, 49, 33);
    jNumberFieldMaxV.setText("");
    jNumberFieldMaxV.setEditable(true);
    cp.add(jNumberFieldMaxV);
    lTipp.setBounds(176, 8, 91, 25);
    lTipp.setText("Tipp");
    cp.add(lTipp);
    jNumberFieldTipp.setBounds(280, 8, 49, 33);
    jNumberFieldTipp.setText("");
    cp.add(jNumberFieldTipp);
    lBisherbenotigteVersuche.setBounds(176, 56, 154, 33);
    lBisherbenotigteVersuche.setText("bisher benötigte Versuche");
    cp.add(lBisherbenotigteVersuche);
    jNumberFieldBisherV.setBounds(344, 56, 57, 41);
    jNumberFieldBisherV.setText("");
    jNumberFieldBisherV.setEditable(false);
    cp.add(jNumberFieldBisherV);
    bSavenumber.setBounds(8, 200, 177, 33);
    bSavenumber.setText("Save number");
    bSavenumber.setMargin(new Insets(2, 2, 2, 2));
    bSavenumber.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSavenumber_ActionPerformed(evt);
      }
    });
    cp.add(bSavenumber);
    bUberprufen.setBounds(208, 200, 177, 33);
    bUberprufen.setText("Überprüfen");
    bUberprufen.setMargin(new Insets(2, 2, 2, 2));
    bUberprufen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bUberprufen_ActionPerformed(evt);
      }
    });
    cp.add(bUberprufen);
    jTextFieldMeldungen.setBounds(112, 248, 273, 33);
    jTextFieldMeldungen.setEditable(false);
    cp.add(jTextFieldMeldungen);
    bReset.setBounds(208, 160, 177, 33);
    bReset.setText("Reset");
    bReset.setMargin(new Insets(2, 2, 2, 2));
    bReset.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bReset_ActionPerformed(evt);
      }
    });
    cp.add(bReset);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public GuessGame
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new GuessGame();
  } // end of main
  
  public void bSavenumber_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    //also hide the number
    int maximum, minimum;
    maximum = jNumberFieldMax.getInt();
    minimum = jNumberFieldMin.getInt();
    maxAnzahlV = jNumberFieldMaxV.getInt();
    zuRaten = jNumberFieldRaten.getInt();
    
    jNumberFieldRaten.setVisible(false);
    //2 is just a placeholder
    jNumberFieldRaten.setInt(2);
  } // end of bSavenumber_ActionPerformed

  public void bUberprufen_ActionPerformed(ActionEvent evt) {
    tipp = jNumberFieldTipp.getInt();
    //bisher benötigte Versuche speichern
    int versuche; 
    
    for(versuche = 1, versuche = versuche + 1){
    
    jNumberFieldBisherV.setInt(versuche);
    
          if(tipp == zuRaten){
          jTextFieldMeldungen.setText("Glückwunsch!");
          } if(bisherV > maxAnzahlV){
          jTextFieldMeldungen.setText("Falsch! Verloren! >:(");
          } else {
          jTextFieldMeldungen.setText("Falsch! Verloren! >:(");
          }
    }
    
    //TODO at the end: disable all the fields, so the game is OVER
  } // end of bUberprufen_ActionPerformed

  public void bReset_ActionPerformed(ActionEvent evt) {
    //TODO reset the fields to editable
    jNumberFieldMax.setText("");
    jNumberFieldMin.setText("");
    jNumberFieldRaten.setText("");
    jNumberFieldMaxV.setText("");
    jNumberFieldTipp.setText("");
    jNumberFieldBisherV.setText("");
  } // end of bReset_ActionPerformed

  // Ende Methoden
} // end of class GuessGame
