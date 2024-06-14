package Controller.EntrySystem;

import Config.PasswordUtils;
import View.EntrySystem.Login;
import View.EntrySystem.Register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
        this.register.mostrarContraseña.addActionListener(this);

        register.barraVerificacionRoja.setVisible(false);
        register.barraVerificacionAmarillo.setVisible(false);
        register.barraVerificacionVerde.setVisible(false);
    }

    @Override   // Evento de Botones principales
    public void actionPerformed(ActionEvent e) {
        // Validar Campos de entrada de texto
        if (e.getSource() == register.btnRegistrarsePrincipal) {
            if (!validarCamposRegister()) {
                return;
            }
            if (!verificarCorreo()) {
                return;
            }
            crearCuenta();
        }
        if (e.getSource() == register.btnIniciarSesiónSecundario) {
            Login iniciarSesion = iniciarSesion();
            iniciarSesion.txtEmail.requestFocusInWindow();
        }

        if (e.getSource() == register.mostrarContraseña) {
            if (register.mostrarContraseña.isSelected()) {
                register.txtContraseña.setEchoChar((char) 0);
                register.txtRepetirContraseñaa.setEchoChar((char) 0);
            } else {
                register.txtContraseña.setEchoChar('*');
                register.txtRepetirContraseñaa.setEchoChar('*');
            }
        }
    }

    @Override   // Evento para comprobar fortaleza de la contraseña al escribir
    public void insertUpdate(DocumentEvent e) {
        String contraseña = register.txtContraseña.getText();
        int estado = verificarFortalezaContraseña(contraseña);
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

    @Override   // Evento para comprobar fortaleza de la contraseña al borrar
    public void removeUpdate(DocumentEvent e) {
        String contraseña = register.txtContraseña.getText();
        int estado = verificarFortalezaContraseña(contraseña);

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
    private boolean validarCamposRegister() {
        String nombre = register.txtNombre.getText();
        String email = register.txtEmail.getText();
        String contraseña = register.txtContraseña.getText();
        String repetirContraseña = register.txtRepetirContraseñaa.getText();

        // Validar campos vacios
        if (nombre.isEmpty() || email.isEmpty() || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(register, "Por favor, complete todos los campos.", "Error: Campos vacios", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validar Correo Electronico
        if (!verificarFormatoCorreo(email)) {
            JOptionPane.showMessageDialog(register, "El formato del correo electrónico es inválido.", "Error: Correo inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validar coincidencia de contraseñas
        if (!verificarContraseñasIguales(contraseña, repetirContraseña)) {
            JOptionPane.showMessageDialog(register, "Las contraseñas no coinciden. Por favor, inténtalo de nuevo.", "Error: Contraseñas no coinciden", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validar que la contraseña no tenga espacio
        if (contraseña.contains(" ")) {
            JOptionPane.showMessageDialog(register, "La contraseña no puede contener espacios. Por favor, inténtalo de nuevo.", "Error: Contraseña con espacios", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validar que el nombre no contenga números, caracteres especiales o múltiples espacios consecutivos
        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]*") || nombre.matches(".*\\s{2,}.*")) {
            JOptionPane.showMessageDialog(register, "El nombre solo puede contener letras y un solo espacio entre palabras.", "Error: Nombre inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validar longitud de la contraseña
        if (contraseña.length() < 8 || contraseña.length() > 20) {
            JOptionPane.showMessageDialog(register, "La contraseña debe tener entre 8 y 20 caracteres.", "Error: Longitud de la contraseña", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (nombre.length() < 2 || nombre.length() > 50) {
            JOptionPane.showMessageDialog(register, "El nombre debe tener entre 2 y 50 caracteres.", "Error: Longitud del nombre", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;    // Si pasa todas las validaciones :)
    }

    private Login iniciarSesion() {
        Login login = new Login();
        login.setVisible(true);
        register.dispose();
        return login;
    }

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
            Login iniciarSesion = iniciarSesion();
            iniciarSesion.txtEmail.setText(email);
            iniciarSesion.txtContraseña.requestFocusInWindow();

        }
        return false;
    }

    private int verificarFortalezaContraseña(String contraseña) {
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
            Login iniciarSesion = iniciarSesion();
            iniciarSesion.txtEmail.setText(email);
            iniciarSesion.txtContraseña.setText(contraseña);
            iniciarSesion.txtContraseña.setEchoChar('*');
            iniciarSesion.btnIniciarSesiónPrincipal.requestFocusInWindow();
            register.dispose();
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

    private boolean verificarFormatoCorreo(String v_Correo) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(v_Correo);
        if (matcher.matches() == true) {
            return true;
        }
        return false;
    }

    private boolean verificarContraseñasIguales(String v_1contraseña, String v_2contraseña) {
        if (v_2contraseña.equals(v_1contraseña)) {
            return true;
        }
        return false;
    }
}
