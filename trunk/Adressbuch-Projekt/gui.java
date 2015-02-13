import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class gui extends JFrame implements View{
  // Anfang Attribute
  private JLabel Hintergrund = new JLabel();
  private JButton suchenButton = new JButton();
  private JButton eintragenButton = new JButton();
  private JButton aktualisierenButton = new JButton();
  private JLabel nachnameLabel = new JLabel();
  private JLabel vornameLabel = new JLabel();
  private JLabel emailLabel = new JLabel();
  private JLabel telefonLabel = new JLabel();
  private JTextField nachnameField = new JTextField();
  private JTextField vornameField = new JTextField();
  private JTextField emailField = new JTextField();
  private JTextField telefonField = new JTextField();
  private JLabel jLabel1 = new JLabel();
  private Controller c;
  // Ende Attribute
  
  public gui(String title) { 
    // Frame-Initialisierung
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 392;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    Hintergrund.setBounds(0, 0, 286, 356);
    Hintergrund.setText("");
    Hintergrund.setBackground(Color.blue);
    Hintergrund.setOpaque(true);
    cp.add(Hintergrund);
    suchenButton.setBounds(8, 256, 75, 25);
    suchenButton.setText("suchen");
    suchenButton.setMargin(new Insets(2, 2, 2, 2));
    suchenButton.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        suchenButton_ActionPerformed(evt);
      }
    });
    cp.add(suchenButton);
    eintragenButton.setBounds(96, 256, 75, 25);
    eintragenButton.setText("eintragen");
    eintragenButton.setMargin(new Insets(2, 2, 2, 2));
    eintragenButton.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        eintragenButton_ActionPerformed(evt);
      }
    });
    cp.add(eintragenButton);
    aktualisierenButton.setBounds(184, 256, 91, 25);
    aktualisierenButton.setText("aktualisieren");
    aktualisierenButton.setMargin(new Insets(2, 2, 2, 2));
    aktualisierenButton.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        aktualisierenButton_ActionPerformed(evt);
      }
    });
    cp.add(aktualisierenButton);
    nachnameLabel.setBounds(80, 8, 110, 20);
    nachnameLabel.setText("Nachname");
    nachnameLabel.setBackground(Color.blue);
    nachnameLabel.setOpaque(true);
    nachnameLabel.setForeground(Color.white);
    cp.add(nachnameLabel);
    vornameLabel.setBounds(80, 64, 110, 20);
    vornameLabel.setText("Vorname");
    vornameLabel.setBackground(Color.blue);
    vornameLabel.setOpaque(true);
    vornameLabel.setForeground(Color.white);
    cp.add(vornameLabel);
    emailLabel.setBounds(80, 128, 110, 20);
    emailLabel.setText("E-Mail");
    emailLabel.setBackground(Color.blue);
    emailLabel.setOpaque(true);
    emailLabel.setForeground(Color.white);
    cp.add(emailLabel);
    telefonLabel.setBounds(80, 192, 110, 20);
    telefonLabel.setText("Telefon");
    telefonLabel.setBackground(Color.blue);
    telefonLabel.setOpaque(true);
    telefonLabel.setForeground(Color.white);
    cp.add(telefonLabel);
    nachnameField.setBounds(80, 32, 150, 20);
    cp.add(nachnameField);
    vornameField.setBounds(80, 88, 150, 20);
    cp.add(vornameField);
    emailField.setBounds(80, 152, 150, 20);
    cp.add(emailField);
    telefonField.setBounds(80, 216, 150, 20);
    cp.add(telefonField);
    jLabel1.setBounds(8, 296, 110, 20);
    jLabel1.setText("Rückmeldung");
    jLabel1.setBackground(Color.blue);
    jLabel1.setOpaque(true);
    jLabel1.setForeground(Color.white);
    cp.add(jLabel1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public gui
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new gui("gui");
  } // end of main
  
  public void adresseAnzeigen(Adresse a){
    }
  public void anzahlEintraegeAnzeigen(int i){
    }
  public void kommentarAnzeigen(String s){
    }
    
  
  public void suchenButton_ActionPerformed(ActionEvent evt) {
    c.adresseSuchen(nachnameField.getText());
  } // end of suchenButton_ActionPerformed

  public void eintragenButton_ActionPerformed(ActionEvent evt) {
    c.adresseEintragen( new Adresse(nachnameField.getText(), vornameField.getText(), emailField.getText(), telefonField.getText()));
  } // end of eintragenButton_ActionPerformed

  public void aktualisierenButton_ActionPerformed(ActionEvent evt) {
    if(emailField.getText() != null)
       {
           c.emailAendern(nachnameField.getText(), emailField.getText());
       } else {
           if(telefonField.getText() != null)
           {
               c.telefonAendern(nachnameField.getText(), telefonField.getText());
           } else {
               this.kommentarAnzeigen("Bitte ausfüllen");
            }
        }
  } // end of aktualisierenButton_ActionPerformed

  public void controllerSetzen(Controller cNeu) {
      this.c = cNeu;
    }
  // Ende Methoden
} // end of class gui
