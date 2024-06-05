package Controller.EntrySystem;

import View.EntrySystem.NewPassword;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class NewPasswordController implements ActionListener, DocumentListener {

    private NewPassword newPassword;
    NewPasswordOperation newPasswordOp = new NewPasswordOperation();

    public NewPasswordController(NewPassword newPassword) {
        this.newPassword = newPassword;
        this.newPassword.btnCambiarContraseña.addActionListener(this);
        this.newPassword.txtContraseña.getDocument().addDocumentListener(this);
        this.newPassword.mostrarContraseña.addActionListener(this);

        newPassword.barraVerificacionRoja.setVisible(false);
        newPassword.barraVerificacionAmarillo.setVisible(false);
        newPassword.barraVerificacionVerde.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newPassword.btnCambiarContraseña) {

        }
        if (e.getSource() == newPassword.mostrarContraseña) {
            if (newPassword.mostrarContraseña.isSelected()) {
                newPassword.txtContraseña.setEchoChar((char) 0);
                newPassword.txtRepetirContraseñaa.setEchoChar((char) 0);
            } else {
                newPassword.txtContraseña.setEchoChar('*');
                newPassword.txtRepetirContraseñaa.setEchoChar('*');
            }
        }
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        String contraseña = newPassword.txtContraseña.getText();
        int estado = verificarFortalezaContraseña(contraseña);
        if (!contraseña.equals("Contraseña") && !contraseña.equals("")) {
            if (estado == 1) {
                newPassword.barraVerificacionRoja.setVisible(true);
            } else if (estado == 2) {
                newPassword.barraVerificacionRoja.setVisible(true);
                newPassword.barraVerificacionAmarillo.setVisible(true);
            } else {
                newPassword.barraVerificacionRoja.setVisible(true);
                newPassword.barraVerificacionAmarillo.setVisible(true);
                newPassword.barraVerificacionVerde.setVisible(true);
            }
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        String contraseña = newPassword.txtContraseña.getText();
        int estado = verificarFortalezaContraseña(contraseña);

        if (!contraseña.equals("Contraseña") && !contraseña.equals("")) {
            if (estado == 1) {
                newPassword.barraVerificacionRoja.setVisible(true);
                newPassword.barraVerificacionAmarillo.setVisible(false);
                newPassword.barraVerificacionVerde.setVisible(false);
            } else if (estado == 2) {
                newPassword.barraVerificacionRoja.setVisible(true);
                newPassword.barraVerificacionAmarillo.setVisible(true);
                newPassword.barraVerificacionVerde.setVisible(false);
            } else {
                newPassword.barraVerificacionRoja.setVisible(true);
                newPassword.barraVerificacionAmarillo.setVisible(true);
                newPassword.barraVerificacionVerde.setVisible(true);
            }
        } else {
            newPassword.barraVerificacionRoja.setVisible(false);
            newPassword.barraVerificacionAmarillo.setVisible(false);
            newPassword.barraVerificacionVerde.setVisible(false);
        }
    }

    @Override
    public void changedUpdate(DocumentEvent e) {

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
}
