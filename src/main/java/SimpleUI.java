import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class SimpleUI {
    static GraphicsConfiguration gc; // Class field containing config info
    public static void main(String[] args) throws IOException {

        JFrame frame = new JFrame(gc); // Create a new JFrame
        frame.setSize(700,450);

        LoginPanel LP = new LoginPanel();
        frame.getContentPane().add(LP);
        frame.add(LP.getLoginPanel());

        //ButtonPanel DUIC =new ButtonPanel();
        //frame.getContentPane().add(DUIC);
        //frame.add(DUIC.getMainPanel());


        frame.setJMenuBar(new MainMenu());
        frame.setVisible(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);





// This next line closes the program when the frame is closed
    }
}
