import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pazar extends JFrame{
    public static void main(String args[]){
        Pazar cerceve = new Pazar();
        cerceve.setVisible(true);
        cerceve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    JButton elma, armut, kiraz, muz;
    JLabel toplam, toplam1, toplam2;
    public Pazar(){
        setLayout(new FlowLayout());
        setTitle("Pazar");
        setSize(300, 200);
        elma = new JButton("Elma");
        armut = new JButton("Armut");
        kiraz = new JButton("Kiraz");
        muz = new JButton("Muz");
        toplam = new JLabel("Toplam:");
        toplam1 = new JLabel("0");
        toplam2 = new JLabel("TL");
        add(elma);
        add(armut);
        add(kiraz);
        add(muz);
        add(toplam);
        add(toplam1);
        add(toplam2);
        elma.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                toplam1.setText(String.valueOf(Integer.parseInt(toplam1.getText()) + 4));
            }
        });
        armut.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                toplam1.setText(String.valueOf(Integer.parseInt(toplam1.getText()) + 5));
            }
        });
        kiraz.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                toplam1.setText(String.valueOf(Integer.parseInt(toplam1.getText()) + 6));
            }
        });
        muz.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                toplam1.setText(String.valueOf(Integer.parseInt(toplam1.getText()) + 8));
            }
        });
    }
}