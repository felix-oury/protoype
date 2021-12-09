import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class SimpleUI {
    static GraphicsConfiguration gc; // Class field containing config info

    public static void main(String[] args) throws IOException, InterruptedException {

        JFrame frameLogin = new JFrame(gc); // Create a new JFrame
        frameLogin.setSize(800,450);
        JFrame framePatientS = new JFrame(gc);
        framePatientS.setSize(700,250);
        JFrame frameINFO = new JFrame(gc);
        frameINFO.setSize(1200,600);


        LoginPanel LP = new LoginPanel();
        Patients_selection PS =new Patients_selection();
        ButtonPanel BP = new ButtonPanel();

        frameLogin.getContentPane().add(LP);
        frameLogin.add(LP.getLoginPanel());
        frameLogin.setJMenuBar(new MainMenu());
        frameLogin.setVisible(true);

        while (LP.getPASS()==0) {
           //System.out.println(LP.getPASS());
            Thread.sleep(100);

        }
        frameLogin.setVisible(false);

        framePatientS.getContentPane().add(PS);
        framePatientS.add(PS.getPatients());
        framePatientS.setJMenuBar(new MainMenu());
        framePatientS.setVisible(true);

        while (PS.getPatient_selector()==0) {
            //System.out.println(PS.getPatient_selector()); // this line allows while loop to run
            Thread.sleep(100);
        }
        frameLogin.dispose();
        frameLogin.setVisible(false);

        if (PS.getPatient_selector()==1){
            frameINFO.getContentPane().add(BP);
            frameINFO.add(BP.getMainPanel());
            frameINFO.setJMenuBar(new MainMenu());
            frameINFO.setVisible(true);
        }


        frameLogin.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        framePatientS.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameINFO.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        //ButtonPanel DUIC =new ButtonPanel();
        //frame.getContentPane().add(DUIC);
        //frame.add(DUIC.getMainPanel());









// This next line closes the program when the frame is closed
    }
}
