import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class LoginPanel extends JPanel {

    public JPanel LoginPanel;
    public JPanel Logo;
    public JPanel Login;

    public JTextArea textUsername;
    public JTextArea textPassword;
    public JLabel username;
    public JLabel password;
    public Canvas drawing;

    public LoginPanel() throws IOException{
        LoginPanel = new JPanel(new GridLayout(2,1));
        LoginPanel.setBackground(Color.WHITE);


        textUsername = new JTextArea(1,20);
        textPassword = new JTextArea(1,20);
        username= new JLabel("<html>Username :<br><html>");
        password= new JLabel("Password :");

        drawing= new Canvas();

        BufferedImage myPicture = ImageIO.read(new File("/Users/felixoury/Desktop/docint.png"));
        JLabel logo = new JLabel(new ImageIcon(myPicture));

        Logo.add(logo);
        Login.add(username);
        Login.add(textUsername);
        Login.add(password);
        Login.add(textPassword);

        LoginPanel.add(Logo);
        LoginPanel.add(Login);

        setLayout(new GridLayout());
    }
    public JPanel getLoginPanel() {
        return LoginPanel;
    }

}
