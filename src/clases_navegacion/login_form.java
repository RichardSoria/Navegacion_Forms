package clases_navegacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login_form {
    public JPanel mainPanel;
    private JTextField correo_campo;
    private JButton boton_iniciar_sesion;
    private JButton boton_credenciales;
    private JPasswordField campo_contrasena;

    public login_form() {
        boton_iniciar_sesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String correo = correo_campo.getText();
                String contrasena = new String(campo_contrasena.getPassword());
                if (correo.equals("richard.soria@epn.edu.ec") && contrasena.equals("Richard_Soria_1899"))
                {
                    JFrame frame = new JFrame("Biografía");
                    frame.setContentPane(new biografia_form().mainPanel);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);

                    // Cerrar la ventana de login
                    JFrame login_frame = (JFrame) SwingUtilities.getWindowAncestor(mainPanel);
                    login_frame.dispose();

                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
                }

            }
        });
        boton_credenciales.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Correo: richard.soria@epn.edu.ec" + "\n" + "Contraseña: Richard_Soria_1899");
            }
        });
    }
}
