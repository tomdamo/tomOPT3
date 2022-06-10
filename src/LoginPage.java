import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Clear");
    JTextField userIDField = new JTextField();
    JPasswordField  userPwField = new JPasswordField();
    JLabel userIdLabel = new JLabel("Gebruikersnaam: ");
    JLabel userPwLabel = new JLabel("Wachtwoord: ");
    JLabel message = new JLabel("");

    HashMap<String,String> logininfo = new HashMap<String,String>();

    public LoginPage(HashMap<String,String> loginInfoOriginal) {
        logininfo = loginInfoOriginal;
        //kopie van de info, zodat het toegankelijk is globaal

        userIdLabel.setBounds(50,100,75,25);
        userPwLabel.setBounds(50,150,75,25);
        message.setBounds(125,250,250,35);
        message.setFont(new Font(null,Font.BOLD,25));

        userIDField.setBounds(125,100,200,25);
        userPwField.setBounds(125,150,200,25);

        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);
        resetButton.setBounds(225,200,100,25);
        resetButton.addActionListener(this);
        resetButton.setFocusable(false);


        frame.add(userIdLabel);
        frame.add(userPwLabel);
        frame.add(message);
        frame.add(userIDField);
        frame.add(userPwField);
        frame.add(loginButton);
        frame.add(resetButton);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //reset functie
        if (e.getSource() == resetButton) {
            userIDField.setText("");
            userPwField.setText("");
        }
        //login functie
        if (e.getSource() == loginButton) {
            String userID = userIDField.getText();
            String userPw = String.valueOf(userPwField.getText());

            //alleen nog toevoegen dat er maar 1 gebruiker steeds kan worden ingelogd
            if (logininfo.containsKey(userID)) {
                if (logininfo.get(userID).equals(userPw)) {
                    message.setText("Login succesful");
                    WelcomePage welcomePage = new WelcomePage(userID);
                } else {
                    message.setForeground(Color.red);
                    message.setText("Wrong pw");
                }

            }
            else {
                message.setForeground(Color.red);
                message.setText("gebruiker niet gevonden");
            }
        }
    }
}
