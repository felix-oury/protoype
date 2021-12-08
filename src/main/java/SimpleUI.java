import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class SimpleUI {
    static GraphicsConfiguration gc; // Class field containing config info
    public static void main(String[] args) throws IOException {

        JFrame frame = new JFrame(gc); // Create a new JFrame
        ButtonPanel DUIC =new ButtonPanel();
        frame.setSize(1200,600);
        frame.getContentPane().add(DUIC);
        frame.add(DUIC.getMainPanel());
        frame.setJMenuBar(new MainMenu());
        frame.setVisible(true);
        frame.setVisible(true);

// This next line closes the program when the frame is closed
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}
}
