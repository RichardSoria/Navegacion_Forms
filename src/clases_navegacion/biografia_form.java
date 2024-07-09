package clases_navegacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class biografia_form {
    private JTextPane estudianteDeLaCarreraTextPane;
    private JButton boton_hobbies;
    public JPanel mainPanel;
    private JButton boton_cerrar_sesion;

    public biografia_form() {
        boton_cerrar_sesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

                JFrame login_frame = new JFrame("Login");
                login_frame.setContentPane(new login_form().mainPanel);
                login_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                login_frame.pack();
                login_frame.setLocationRelativeTo(null);
                login_frame.setVisible(true);

                JFrame biografia_frame = (JFrame) SwingUtilities.getWindowAncestor(mainPanel);
                biografia_frame.dispose();
            }
        });
        boton_hobbies.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Hobbies");
                frame.setContentPane(new hobbies_Form().mainPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

                JFrame biografia_frame = (JFrame) SwingUtilities.getWindowAncestor(mainPanel);
                biografia_frame.dispose();
            }
        });
    }
}
