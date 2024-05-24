package Controller.EntrySystem;

import Config.SendEmail;
import View.EntrySystem.RecoverPassword;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RecoverPasswordController implements ActionListener {

    private RecoverPassword recoverPassword;
    private String codigoGenerado;

    RecoverPasswordOperation recoverPasswordOp = new RecoverPasswordOperation();

    public RecoverPasswordController(RecoverPassword recoverPassword) {
        this.recoverPassword = recoverPassword;
        recoverPassword.btnEnviarCodigo.addActionListener(this);
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == recoverPassword.btnEnviarCodigo) {
            System.out.println("BOTON FUNCIOANNDOO");
            enviarCorreo();
        }
    }

    public void enviarCorreo() {
        String emailIngresado = recoverPassword.txtEmail.getText();
        String emailTo = emailIngresado;
        String subject = "Correo de prueba";
        generarCodigoVerificacio();
        String content = "Codigo de verificacion: "+ codigoGenerado;

        SendEmail email = new SendEmail(emailTo, subject, content);
        email.send();
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
}


