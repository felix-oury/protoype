import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;


public class LoginPanel extends JPanel{

    public JPanel LoginPanel,LogoPanel,Login;
    public FlowLayout grid;

    public JTextField textUsername;
    public JPasswordField textPassword;
    public JLabel username,password,message;
    public JButton LoginButton;
    public Canvas drawing;
    int PASS;

    public LoginPanel() throws IOException{
        PASS=0;
        LoginPanel = new JPanel();
        LoginPanel.setBackground(Color.WHITE);
        LogoPanel = new JPanel();
        Login =new JPanel(new FlowLayout());
        LoginButton = new JButton("Login");

        message = new JLabel();


        textUsername = new JTextField(20);
        textPassword = new JPasswordField(20);
        username= new JLabel("<html>Username :<br><html>");
        password= new JLabel("Password :");
        grid = new FlowLayout(10,10,10);



        drawing= new Canvas();

        BufferedImage myPicture = ImageIO.read(new File("/Users/felixoury/Desktop/docint.png"));
        JLabel logo = new JLabel(new ImageIcon(myPicture));

        LoginButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
            @Override
            public void mousePressed(MouseEvent e) {
                String usernameS = textUsername.getText();
                String passwordS = textPassword.getText();
                if (usernameS.trim().equals("Felix") && passwordS.trim().equals("OK")) {
                    message.setText(" Hello " + usernameS + "");
                    PASS=1;

                } else {
                    message.setText("invalid User");
                }

                drawing.repaint();

            }
            @Override
            public void mouseReleased(MouseEvent e) {

            }
            @Override
            public void mouseEntered(MouseEvent e) {

            }
            @Override
            public void mouseExited(MouseEvent e) {

            }
        });




        LogoPanel.add(logo);
        Login.add(username);
        Login.add(textUsername);
        Login.add(password);
        Login.add(textPassword);
        Login.add(message);




        LoginPanel.add(LogoPanel);
        LoginPanel.add(Login);
        LoginPanel.add(LoginButton);

        LoginPanel.add(drawing);

        setLayout(grid);





    }
    
    public JPanel getLoginPanel() {
        return LoginPanel;
    }
    public int getPASS(){
        return PASS;
    }



}
