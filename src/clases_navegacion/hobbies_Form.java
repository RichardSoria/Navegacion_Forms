package clases_navegacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hobbies_Form {
    private JLabel imagen_1;
    private JLabel imagen_5;
    private JLabel imagen_3;
    private JLabel imagen_2;
    public JPanel mainPanel;
    private JLabel imagen_4;
    private JButton boton_bibliografia;

    public hobbies_Form() {
        ImageIcon icon = new ImageIcon("src/hobbie_1.jpg");
        icon = new ImageIcon(icon.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
        imagen_1.setIcon(icon);

        icon = new ImageIcon("src/hobbie_2.jpg");
        icon = new ImageIcon(icon.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
        imagen_2.setIcon(icon);

        icon = new ImageIcon("src/hobbie_3.jpg");
        icon = new ImageIcon(icon.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
        imagen_3.setIcon(icon);

        icon = new ImageIcon("src/hobbie_4.jpg");
        icon = new ImageIcon(icon.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
        imagen_4.setIcon(icon);
        boton_bibliografia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Biografía");
                frame.setContentPane(new biografia_form().mainPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

                JFrame hobbies_frame = (JFrame) SwingUtilities.getWindowAncestor(mainPanel);
                hobbies_frame.dispose();
            }
        });
    }


}
