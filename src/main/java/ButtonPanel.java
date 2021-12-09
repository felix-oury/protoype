import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ButtonPanel extends JPanel {

    public JPanel LoginPanel1;
    public JPanel LivePanelECG;
    public JPanel LivePanelHR;
    public JPanel LivePanelRR;
    public JPanel LivePanelTemp;
    public JPanel LivePanelPressure;
    public JPanel LivePanelPID;
    public JPanel LivePanel;


    public JTextArea textUsername;
    public JTextArea textPassword;
    public Canvas drawing;
    public JLabel username;
    public JLabel password;
    public JLabel Space;
    public FlowLayout grid;
    public BufferedImage image;
    public JLabel picLabel;
    public JLabel PatientINFO;
    public JLabel ECG;
    public JLabel HR;
    public JLabel HRnum;
    public JLabel RR;
    public JLabel RRnum;
    public JLabel Pressure;
    public JLabel Pressurenum;
    public JLabel BT;
    public JLabel BTnum;



    public ButtonPanel() throws IOException {
        LivePanel = new JPanel(new GridLayout(3,1));
        LoginPanel1 = new JPanel();
        LivePanelECG = new JPanel(new GridLayout(2,1));
        LivePanelPID = new JPanel(new GridLayout());
        LivePanelRR = new JPanel(new GridLayout(2,1));
        LivePanelHR = new JPanel(new GridLayout(2,1));
        LivePanelPressure = new JPanel(new GridLayout(2,1));
        LivePanelTemp = new JPanel(new GridLayout(2,1));

        Color color = Color.white;
        LivePanel.setBackground(color);

        textUsername = new JTextArea(1,20);
        textPassword = new JTextArea(1,20);
        username= new JLabel("<html>Username :<br><html>");
        password= new JLabel("Password :");

        grid = new FlowLayout(10,10,10);


        PatientINFO = new JLabel("<html>Patient Name: Paul Williams<br>Birthday: 20/06/1978<br>PID: 01720061978<html>");
        PatientINFO.setFont(new Font("Serif", Font.PLAIN, 24));
        ECG= new JLabel("ECG");
        ECG.setFont(new Font("Serif", Font.PLAIN, 16));
        HR= new JLabel("Heart Rate");
        HR.setFont(new Font("Serif", Font.PLAIN, 16));
        HRnum=new JLabel("53 bpm");
        HRnum.setFont(new Font("Serif", Font.PLAIN, 80));
        RR= new JLabel("Respiratory Rate");
        RR.setFont(new Font("Serif", Font.PLAIN, 16));
        RRnum=new JLabel("19/min");
        RRnum.setFont(new Font("Serif", Font.PLAIN, 80));
        BT= new JLabel("Body Temperature");
        BT.setFont(new Font("Serif", Font.PLAIN, 16));
        BTnum=new JLabel("37 C");
        BTnum.setFont(new Font("Serif", Font.PLAIN, 80));
        Pressure= new JLabel("Blood Pressure");
        Pressure.setFont(new Font("Serif", Font.PLAIN, 16));
        Pressurenum=new JLabel("120/80");
        Pressurenum.setFont(new Font("Serif", Font.PLAIN, 80));



        drawing= new Canvas();

        /*mgLabel = new JLabel(new ImageIcon("Desktop/"));*/
        BufferedImage myPicture = ImageIO.read(new File("/Users/felixoury/Desktop/docint.png"));
        JLabel logo = new JLabel(new ImageIcon(myPicture));
        BufferedImage myPicture2 = ImageIO.read(new File("/Users/felixoury/Desktop/ECG.png"));
        JLabel ecg = new JLabel(new ImageIcon(myPicture2));



        /*but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("be Happy !!!");
            }
        });

        checkbox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("go to dominos");
            }
        });

        French_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Felicitation");
            }
        });*/

            LoginPanel1.add(logo);
            LoginPanel1.add(username);
            LoginPanel1.add(textUsername);
            LoginPanel1.add(password);
            LoginPanel1.add(textPassword);

            LivePanelPID.add(PatientINFO);
            LivePanelECG.add(ECG);
            LivePanelECG.add(ecg);
            LivePanelRR.add(RR);
            LivePanelRR.add(RRnum);
            LivePanelHR.add(HR);
            LivePanelHR.add(HRnum);
            LivePanelTemp.add(BT);
            LivePanelTemp.add(BTnum);
            LivePanelPressure.add(Pressure);
            LivePanelPressure.add(Pressurenum);


            /*add(but1);
            add(checkbox1);
            add(French_Button);*/


        LivePanel.add(LivePanelPID);
        LivePanel.add(LivePanelECG);
        LivePanel.add(LivePanelHR);
        LivePanel.add(LivePanelTemp);
        LivePanel.add(LivePanelPressure);
        LivePanel.add(LivePanelRR);

        LivePanel.add(drawing);
        //LoginPanel.add(drawing); //add when we want lopgin panel

        setLayout(grid);

    }
    public JPanel getMainPanel() {
        //return LoginPanel; // return loginpanel take of when want an other panel
        return LivePanel;
    }
}
