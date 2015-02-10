import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Adressbuch_GUI extends JFrame implements View {
  // Anfang Attribute
  private JTextField VnameT = new JTextField();
  private JLabel VnameL = new JLabel();
  private JLabel NnameL = new JLabel();
  private JTextField NnameT = new JTextField();
  private JLabel emailL = new JLabel();
  private JLabel telefonL = new JLabel();
  private JTextField emailT = new JTextField();
  private JTextField telefonT = new JTextField();
  private JButton suchenB = new JButton();
  private JButton eintragenB = new JButton();
  private JButton aktualisierenB = new JButton();
  private JLabel rueckL = new JLabel();
  private JLabel anzahlL = new JLabel();
  private MyController c;
  // Ende Attribute
  
  public Adressbuch_GUI(String title) { 
    // Frame-Initialisierung
    super(title);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) { dispose(); }
    });
    int frameWidth = 582; 
    int frameHeight = 574;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Panel cp = new Panel(null);
    add(cp);
    // Anfang Komponenten
    
    VnameT.setBounds(184, 64, 150, 20);
    cp.add(VnameT);
    VnameL.setBounds(72, 64, 110, 20);
    VnameL.setText("Vorname");
    cp.add(VnameL);
    NnameL.setBounds(72, 88, 110, 20);
    NnameL.setText("Nachname");
    cp.add(NnameL);
    NnameT.setBounds(184, 88, 150, 20);
    cp.add(NnameT);
    emailL.setBounds(72, 120, 110, 20);
    emailL.setText("E-Mail");
    cp.add(emailL);
    telefonL.setBounds(72, 144, 110, 20);
    telefonL.setText("Telefon");
    cp.add(telefonL);
    emailT.setBounds(184, 120, 150, 20);
    cp.add(emailT);
    telefonT.setBounds(184, 144, 150, 20);
    cp.add(telefonT);
    suchenB.setBounds(352, 64, 99, 25);
    suchenB.setText("suchen");
    suchenB.setMargin(new Insets(2, 2, 2, 2));
    suchenB.addActionListener(new ActionListener() 
    { 
      public void actionPerformed(ActionEvent evt) { 
        suchenB_ActionPerformed(evt);
      }
    });
    cp.add(suchenB);
    eintragenB.setBounds(352, 104, 99, 25);
    eintragenB.setText("eintragen");
    eintragenB.setMargin(new Insets(2, 2, 2, 2));
    eintragenB.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        eintragenB_ActionPerformed(evt);
      }
    });
    cp.add(eintragenB);
    aktualisierenB.setBounds(352, 136, 99, 25);
    aktualisierenB.setText("aktualisieren");
    aktualisierenB.setMargin(new Insets(2, 2, 2, 2));
    aktualisierenB.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        aktualisierenB_ActionPerformed(evt);
      }
    });
    cp.add(aktualisierenB);
    rueckL.setBounds(344, 176, 110, 20);
    rueckL.setText("Rückmeldung");
    cp.add(rueckL);
    anzahlL.setBounds(72, 176, 262, 20);
    anzahlL.setText("");
    cp.add(anzahlL);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Adressbuch_GUI
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Adressbuch_GUI("Adressbuch_GUI");
  }
  
  public void controllerSetzen(MyController cNeu){
      this.c = cNeu;
  }
  
  public void adresseAnzeigen(Adresse a){}
  public void anzahlEintraegeAnzeigen(int i){}
  public void kommentarAnzeigen(String s){}
   // end of main
  
  public void suchenB_ActionPerformed(ActionEvent evt) {
       c.adresseSuchen(NnameT.getText());
  }  //end of suchenB_ActionPerformed

  public void eintragenB_ActionPerformed(ActionEvent evt) {
       c.adresseEintragen(NnameT.getText(), VnameT.getText(), emailT.getText(), telefonT.getText());
  }  //end of eintragenB_ActionPerformed

  public void aktualisierenB_ActionPerformed(ActionEvent evt) { 
      if(emailT.getText() != null)
       {
           c.emailAendern(NnameT.getText(), emailT.getText());
       } else {
           if(telefonT.getText() != null)
           {
               c.telefonAendern(NnameT.getText(), telefonT.getText());
           } else {
               view.kommentarAnzeigen("Bitte ausfüllen");
            }
        }
    }  //end of aktualisierenB_ActionPerformed

//    Ende Methoden
// }  end of class Adressbuch_GUI
}
