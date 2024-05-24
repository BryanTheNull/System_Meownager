package Controller.EntrySystem;

import View.EntrySystem.Login;
import View.EntrySystem.Register;
import View.MainInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginController implements ActionListener {

    private Login login;
    private int intentosRealizados = 0;
    private static final int intentosMax = 3;

    LoginOperation loginOp = new LoginOperation();

    public LoginController(Login login) {
        this.login = login;
        this.login.btnIniciarSesiónPrincipal.addActionListener(this);
        this.login.btnRegistraseSecundario.addActionListener(this);
        this.login.txtContraseña.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login.btnIniciarSesiónPrincipal) {
            if (VerificarEmail()) {
                if (VerificarContraseña()) {
                    MainInterface mainInterface = new MainInterface();
                    mainInterface.setVisible(true);
                    login.dispose();
                } else {

                }
            }
        }

        if (e.getSource() == login.btnRegistraseSecundario) {
            Register register = new Register();
            register.setVisible(true);
            login.dispose();
        }
    }

    // Metodos de Login
    public boolean VerificarEmail() {
        String emailIngresado = login.txtEmail.getText();
        int resultado = loginOp.SQL_VerificarExistenciaUsuario(emailIngresado);
        if (resultado == 1) {
            return true;
        }
        int decision = JOptionPane.showConfirmDialog(login,
                "El correo electrónico no se encuentra registrado.\n¿Deseas crear una cuenta?",
                "Correo electrónico no registrado", JOptionPane.YES_NO_OPTION);
        if (decision == JOptionPane.YES_OPTION) {
            Register register = new Register();
            register.setVisible(true);
            login.dispose();
            return false;
        }
        return false;
    }

    public boolean VerificarContraseña() {
        String emailIngresado = login.txtEmail.getText();
        String ContraseñaIngresada = login.txtContraseña.getText();
        boolean accesoPermitido = loginOp.SQL_VerificarContraseña(emailIngresado, ContraseñaIngresada);

        if (accesoPermitido) {
            return true;
        } else {
            intentosRealizados++;
            if (intentosRealizados >= intentosMax) {
                JOptionPane.showMessageDialog(login, "Se ha excedido el número máximo de intentos. La ventana se cerrará.", "Intentos excedidos", JOptionPane.ERROR_MESSAGE);
                login.dispose();
            } else {
                JOptionPane.showMessageDialog(login, "Contraseña incorrecta. Intento " + intentosRealizados + " de " + intentosMax, "Contraseña incorrecta", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return false;
    }
}
