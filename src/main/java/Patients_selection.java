import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class Patients_selection extends JPanel {
    public JPanel Patients;
    public JButton patient1, patient2, patient3, patient4, patient5;
    public Canvas drawing;
    int patient_selector;
    public FlowLayout grid;

    public Patients_selection() throws IOException {
        Patients = new JPanel();
        Patients.setBackground(Color.WHITE);
        patient_selector=0;

        patient1=new JButton("Paul Walker");
        patient2=new JButton("Vin Diesel");
        patient3=new JButton("Mickey Mouse");
        patient4=new JButton("peter Pan");
        patient5=new JButton("me");
        drawing = new Canvas();
        grid = new FlowLayout(10,10,10);

        patient1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
            @Override
            public void mousePressed(MouseEvent e) {
                patient_selector=1;
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
        patient2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
            @Override
            public void mousePressed(MouseEvent e) {
                patient_selector=2;
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
        patient3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
            @Override
            public void mousePressed(MouseEvent e) {
                patient_selector=3;
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
        patient4.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
            @Override
            public void mousePressed(MouseEvent e) {
                patient_selector=4;
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
        patient5.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
            @Override
            public void mousePressed(MouseEvent e) {
                patient_selector=5;
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




        Patients.add(patient1);
        Patients.add(patient2);
        Patients.add(patient3);
        Patients.add(patient4);
        Patients.add(patient5);



        Patients.add(drawing);
        setLayout(grid);



    }
    public JPanel getPatients() {
        return Patients;
    }
    public int getPatient_selector(){
        return patient_selector;
    }
}
