package Controller.EntrySystem;

import Config.SendEmail;
import View.EntrySystem.NewPassword;
import View.EntrySystem.RecoverPassword;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class RecoverPasswordController implements ActionListener {

    private RecoverPassword recoverPassword;
    private String codigoGenerado;
    private int intentosRealizados = 0;
    private static final int intentosMax = 3;
    public String emailUsuario;

    public RecoverPasswordController(RecoverPassword recoverPassword) {
        this.recoverPassword = recoverPassword;
        recoverPassword.btnRecoverPassword.addActionListener(this);
    }

    @Override

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == recoverPassword.btnRecoverPassword) {
            String boton = recoverPassword.btnRecoverPassword.getText();
            if (boton.equals("Enviar Codigo")) {
                if (!validarCamposRecoverPassword()) {
                    return;
                }
                enviarCorreo();
                recoverPassword.btnRecoverPassword.setText("Verificar Código");
                recoverPassword.estadoDePanel = false;
                recoverPassword.txtEmail.setText("Código");
                recoverPassword.txtEmail.setForeground(Color.decode("#999999"));
                JOptionPane.showMessageDialog(recoverPassword, "Ingrese el código de verificación", "Ingresar código", JOptionPane.INFORMATION_MESSAGE);
                
            } else {
                if (verificarCodigoIngresado()) {
                    cambiarContraseña();
                }
            }
        }
    }

    public void enviarCorreo() {
        String emailIngresado = recoverPassword.txtEmail.getText();
        String emailTo = emailIngresado;
        String subject = "Solicitud de Cambio de Contraseña: Código de Verificación";
        generarCodigoVerificacio();
        String content = generarCorreo("C:\\Users\\bv587\\Documents\\NetBeansProjects\\Meownager\\src\\main\\java\\Config\\GenerarContenidoCorreo.html",codigoGenerado);

        SendEmail email = new SendEmail(emailTo, subject, content);
        email.send();
        emailUsuario = emailIngresado;
    }

    public static String generarCorreo(String filePath, String codigoGenerado) {
       try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            return content.replace("{codigo}", codigoGenerado);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String generarCodigoVerificacio() {
        String caracteresPermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder codigo = new StringBuilder(6);

        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(caracteresPermitidos.length());
            codigo.append(caracteresPermitidos.charAt(index));
        }
        return codigoGenerado = codigo.toString();
    }

    private boolean validarCamposRecoverPassword() {
        // OBTENER VALORES DE CAMPOS
        String email = recoverPassword.txtEmail.getText();

        if (email.isEmpty() || email.equals("Código")) {
            JOptionPane.showMessageDialog(recoverPassword, "Ingrese el código de verificación", "Error: Código inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!verificarFormatoCorreo(email)) {
            JOptionPane.showMessageDialog(recoverPassword, "El código ingresado es incorrecto.", "Error: Código inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
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

    private NewPassword cambiarContraseña() {
        NewPassword abrirCambioContraseña = new NewPassword();
        abrirCambioContraseña.setVisible(true);
        recoverPassword.dispose();
        return abrirCambioContraseña;
    }

    private boolean verificarCodigoIngresado() {
        String codigoIngresado = recoverPassword.txtEmail.getText();
        if (!codigoIngresado.equals(codigoGenerado)) {
            intentosRealizados++;
            if (intentosRealizados >= intentosMax) {
                JOptionPane.showMessageDialog(recoverPassword, "Se ha excedido el número máximo de intentos. La ventana se cerrará.", "Intentos excedidos", JOptionPane.ERROR_MESSAGE);
                recoverPassword.dispose();
            } else {
                JOptionPane.showMessageDialog(recoverPassword, "Código incorrecto. Intento " + intentosRealizados + " de " + intentosMax, "Código incorrecto", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }
}
