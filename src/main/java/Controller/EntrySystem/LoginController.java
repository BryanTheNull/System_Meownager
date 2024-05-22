package Controller.EntrySystem;

import View.EntrySystem.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class LoginController implements ActionListener{
    private Login login;
    
    LoginOperation loginOp = new LoginOperation();
    
    public LoginController(Login login){
        this.login = login;
        this.login.btnIniciarSesiónPrincipal.addActionListener(this);
        this.login.btnRegistraseSecundario.addActionListener(this);
        this.login.txtContraseña.addActionListener(this);
        
        
        // Consultar al inicar ventana
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == login.btnIniciarSesiónPrincipal){
            if(VerificarEmail()){
                JOptionPane.showMessageDialog(login, "iNGRESE CONTRASEA");
            }
        }
    }
    
    
    // Metodos de Login
    public boolean VerificarEmail(){
        String emailIngresado = login.txtEmail.getText();
        System.out.println("CORREO INGRESADO: "+emailIngresado);
        int resultado = loginOp.SQL_VerificarExistenciaUsuario(emailIngresado);
        System.err.println(resultado);
        if ( resultado != 1){
           JOptionPane.showMessageDialog(login, "El correo electrónico ingresado no se encuentra registrado.\nPor favor, cree una nueva cuenta.");
           return false;
        }   
        return true;
    }
    
}
