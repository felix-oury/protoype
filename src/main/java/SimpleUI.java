import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class SimpleUI {
    static GraphicsConfiguration gc; // Class field containing config info
    public static void main(String[] args) throws IOException {

        JFrame frame = new JFrame(gc); // Create a new JFrame
        frame.setSize(1200,600);

        LoginPanel LP = new LoginPanel();
        frame.getContentPane().add(LP);
        frame.add(LP.getLoginPanel());
        frame.setJMenuBar(new MainMenu());
        frame.setVisible(true);
        frame.setVisible(true);




        //ButtonPanel DUIC =new ButtonPanel();
        //frame.getContentPane().add(DUIC);
        //frame.add(DUIC.getMainPanel());


// This next line closes the program when the frame is closed
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}
}
