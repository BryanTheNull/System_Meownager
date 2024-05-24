package Controller.EntrySystem;

import Config.PasswordUtils;
import View.EntrySystem.Login;
import View.EntrySystem.Register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class RegisterController implements ActionListener, DocumentListener {

    private Register register;

    RegisterOperation registerOp = new RegisterOperation();

    public RegisterController(Register register) {
        this.register = register;
        this.register.btnRegistrarsePrincipal.addActionListener(this);
        this.register.btnIniciarSesiónSecundario.addActionListener(this);
        this.register.txtContraseña.getDocument().addDocumentListener(this);

        register.barraVerificacionRoja.setVisible(false);
        register.barraVerificacionAmarillo.setVisible(false);
        register.barraVerificacionVerde.setVisible(false);
    }

    @Override   // Evento de Botones principales
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == register.btnRegistrarsePrincipal) {
            if (verificarCorreo()) {
                if (verificarContraseñas()) {
                    String email = register.txtEmail.getText();
                    String contraseña = register.txtContraseña.getText();
                    if (!contieneEspacio(contraseña)) {
                        if (crearCuenta()) {
                            Login login = new Login();
                            login.txtEmail.setText(email);
                            login.txtContraseña.setText(contraseña);
                            login.txtContraseña.setEchoChar('*');
                            login.btnIniciarSesiónPrincipal.requestFocusInWindow();
                            login.setVisible(true);
                            register.dispose();
                        }

                    } else {
                        JOptionPane.showMessageDialog(register, "La contraseña no puede contener espacios.\nPor favor, inténtalo de nuevo.");
                    }
                } else {
                    JOptionPane.showMessageDialog(register, "Las contraseñas no coinciden.\nPor favor, inténtalo de nuevo.");
                }
            }

        }
        if (e.getSource() == register.btnIniciarSesiónSecundario) {
            Login login = new Login();
            login.setVisible(true);
            register.dispose();

        }
    }

    @Override   // Evento para comprobar fortaleza de la contraseña
    public void insertUpdate(DocumentEvent e) {
        String contraseña = register.txtContraseña.getText();
        int estado = verificarCombinacion(contraseña);
        if (!contraseña.equals("Contraseña") && !contraseña.equals("")) {
            if (estado == 1) {
                register.barraVerificacionRoja.setVisible(true);
            } else if (estado == 2) {
                register.barraVerificacionRoja.setVisible(true);
                register.barraVerificacionAmarillo.setVisible(true);
            } else {
                register.barraVerificacionRoja.setVisible(true);
                register.barraVerificacionAmarillo.setVisible(true);
                register.barraVerificacionVerde.setVisible(true);
            }
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        String contraseña = register.txtContraseña.getText();
        int estado = verificarCombinacion(contraseña);

        if (!contraseña.equals("Contraseña") && !contraseña.equals("")) {
            if (estado == 1) {
                register.barraVerificacionRoja.setVisible(true);
                register.barraVerificacionAmarillo.setVisible(false);
                register.barraVerificacionVerde.setVisible(false);
            } else if (estado == 2) {
                register.barraVerificacionRoja.setVisible(true);
                register.barraVerificacionAmarillo.setVisible(true);
                register.barraVerificacionVerde.setVisible(false);
            } else {
                register.barraVerificacionRoja.setVisible(true);
                register.barraVerificacionAmarillo.setVisible(true);
                register.barraVerificacionVerde.setVisible(true);
            }
        } else {
            register.barraVerificacionRoja.setVisible(false);
            register.barraVerificacionAmarillo.setVisible(false);
            register.barraVerificacionVerde.setVisible(false);
        }
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
    }

    // Metodos para el funcionamento de Register
    private boolean verificarCorreo() {
        LoginOperation lO = new LoginOperation();
        String email = register.txtEmail.getText();
        int comprobar = lO.SQL_VerificarExistenciaUsuario(email);
        if (comprobar != 1) {
            return true;
        }
        int decision = JOptionPane.showConfirmDialog(register,
                "El correo electrónico ya está registrado.\n¿Deseas intentar iniciar sesión?",
                "Correo electrónico registrado", JOptionPane.YES_NO_OPTION);
        if (decision == JOptionPane.YES_OPTION) {
            Login login = new Login();
            login.setVisible(true);
            login.txtEmail.setText(email);
            login.txtContraseña.requestFocusInWindow();
            register.dispose();
        }
        return false;
    }

    private boolean verificarContraseñas() {
        String primeraContraseña = register.txtContraseña.getText();
        String segundaContraseña = register.txtRepetirContraseñaa.getText();
        if (primeraContraseña.equals(segundaContraseña)) {
            return true;
        }
        return false;
    }

    private boolean contieneEspacio(String contraseña) {
        boolean verificar = contraseña.contains(" ");
        return verificar;
    }

    private int verificarCombinacion(String contraseña) {
        /**
         * Descripcion: Metodo para verificar si la contraseña es fuerte,
         * mediana o debil.
         */

        boolean contieneLetra = contraseña.matches(".*[a-zA-Z].*");
        boolean contieneNumero = contraseña.matches(".*[0-9].*");
        boolean contieneCaracter = contraseña.matches(".*[^a-zA-Z0-9].*");

        if (contieneLetra && contieneNumero && contieneCaracter) {
            return 3; // Contiene letra, número y caracter
        } else if ((contieneLetra && contieneNumero) || (contieneNumero && contieneCaracter) || (contieneCaracter && contieneLetra)) {
            return 2; // Contiene dos de las combinaciones
        } else if (contieneLetra || contieneNumero || contieneCaracter) {
            return 1; // Contiene solo una de las combinaciones
        } else {
            return 0; // No contiene ninguna combinación
        }
    }

    private boolean crearCuenta() {
        String nombre = register.txtNombre.getText();
        String email = register.txtEmail.getText();
        String contraseña = register.txtContraseña.getText();

        // Crear contraseña encriptada
        String contraseñaHasheada = PasswordUtils.hashPassword(contraseña);

        int creado = registerOp.SQL_CrearCuenta(nombre, email, contraseñaHasheada);
        if (creado == 1) {
            limpiarCampos();
            JOptionPane.showMessageDialog(register, "¡Cuenta creada con éxito! Por favor, inicia sesión.", "Cuenta creada", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        JOptionPane.showMessageDialog(register, "Error al crear la cuenta. Por favor, inténtalo más tarde.", "Error al crear cuenta", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    private void limpiarCampos() {
        register.txtNombre.setText("");
        register.txtEmail.setText("");
        register.txtContraseña.setText("");
        register.txtRepetirContraseñaa.setText("");
    }
}
