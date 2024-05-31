package Controller.EntrySystem;

import View.EntrySystem.Login;
import View.EntrySystem.RecoverPassword;
import View.EntrySystem.Register;
import View.MainInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
        this.login.mostrarContraseña.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login.btnIniciarSesiónPrincipal) {
            // Verificar campos de texto y datos ingresados
            if (!validarCamposLogin()) {
                return;
            }

            // Verificar que el correo ingresado exista
            if (!verificarExistenciaEmail()) {
                return;
            }

            // Verificar si la contraseña existe
            if (verificarContraseñaAcceso()) {
                accederSistema();
            }
        }

        if (e.getSource() == login.btnRegistraseSecundario) {
            registrarCuenta();
        }

        if (e.getSource() == login.mostrarContraseña) {
            if (login.mostrarContraseña.isSelected()) {
                login.txtContraseña.setEchoChar((char) 0);
            } else {
                login.txtContraseña.setEchoChar('*');
            }
        }

    }

    // Metodos de Login
    private boolean validarCamposLogin() {
        String email = login.txtEmail.getText();
        String contraseña = login.txtContraseña.getText();

        // Validar Contraseña en blanco
        if (contraseña.equals("Contraseña") || contraseña.isEmpty() || contraseña.equals("")) {
            JOptionPane.showMessageDialog(login, "La contraseña esta vacia.", "Error: Contraseña en blanco", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validar formato de correo electronico ingresado
        if (!verificarFormatoCorreo(email)) {
            JOptionPane.showMessageDialog(login, "El formato del correo electrónico es inválido.", "Error: Correo inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    public boolean verificarExistenciaEmail() {
        String emailIngresado = login.txtEmail.getText();
        int resultado = loginOp.SQL_VerificarExistenciaUsuario(emailIngresado);
        if (resultado == 1) {
            return true;
        }
        int decision = JOptionPane.showConfirmDialog(login,
                "El correo electrónico no se encuentra registrado. ¿Deseas crear una cuenta?",
                "Correo electrónico no registrado", JOptionPane.YES_NO_OPTION);
        if (decision == JOptionPane.YES_OPTION) {
            registrarCuenta();
            return false;
        }
        return false;
    }

    public boolean verificarContraseñaAcceso() {
        String emailIngresado = login.txtEmail.getText();
        String ContraseñaIngresada = login.txtContraseña.getText();
        boolean accesoPermitido = loginOp.SQL_VerificarContraseña(emailIngresado, ContraseñaIngresada);

        if (accesoPermitido) {
            return true;
        } else {
            intentosRealizados++;
            if (intentosRealizados >= intentosMax) {
                JOptionPane.showMessageDialog(login, "Se ha excedido el número máximo de intentos. La ventana se cerrará.", "Intentos excedidos", JOptionPane.ERROR_MESSAGE);
                int decision = JOptionPane.showConfirmDialog(login,
                        "¿Olvido su contraseña? Desea recuperarla?",
                        "Recuperar contraseña", JOptionPane.YES_NO_OPTION);
                if (decision == JOptionPane.YES_OPTION) {
                    RecoverPassword recoverPassword = new RecoverPassword();
                    recoverPassword.setVisible(true);
                    login.dispose();
                } else {
                    login.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(login, "Contraseña incorrecta. Intento " + intentosRealizados + " de " + intentosMax, "Contraseña incorrecta", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return false;
    }

    private boolean verificarFormatoCorreo(String v_Correo) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(v_Correo);
        if (matcher.matches() == true) {
            return true;
        }
        return false;
    }

    private Register registrarCuenta() {
        Register register = new Register();
        register.setVisible(true);
        login.dispose();
        return register;
    }

    private MainInterface accederSistema() {
        MainInterface mainInterface = new MainInterface();
        mainInterface.setVisible(true);
        login.dispose();
        return mainInterface;
    }
}
