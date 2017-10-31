import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Description
  *
  * @version 1.0 from 16-Oct-17
  * @author 
  */

public class GuessGame extends JFrame {
  // start attributes
  private JLabel jLabel1 = new JLabel();
  // end attributes
  
  public GuessGame() { 
    // Frame-Init
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 392; 
    int frameHeight = 310;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("GuessGame");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // start components
    
    jLabel1.setBounds(8, 8, 83, 25);
    jLabel1.setText("text");
    cp.add(jLabel1);
    // end components
    
    setVisible(true);
  } // end of public GuessGame
  
  // start methods
  
  public static void main(String[] args) {
    new GuessGame();
  } // end of main
  
  // end methods
} // end of class GuessGame
