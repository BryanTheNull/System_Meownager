package Controller;

import Model.Usuario;
import View.Paneles.PanelConfiguraciones;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class ConfiguracionController implements ActionListener {

    private PanelConfiguraciones panelConfiguraciones;

    // Instaciar clases a utilizar
    ConfiguracionOperation configuracionOp = new ConfiguracionOperation();

    public ConfiguracionController(PanelConfiguraciones panelConfiguraciones) {
        this.panelConfiguraciones = panelConfiguraciones;
        this.panelConfiguraciones.btnGuardarCambios.addActionListener(this);
        
        // Temporisador para obtener datos de usuario cuando ya esten cargados
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                obtenerDatosUsuario();
            }
        }, 200); // Retraso de 200 milisegundos (0,2 segundos)

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == panelConfiguraciones.btnGuardarCambios){
            if(!validarCamposVacios()){
                return;
            }
            actualizarDatosUsuario();         
        }
    }
    
    private void actualizarDatosUsuario(){
        // OBTENER VALORES DE ENTRADA DE TEXTO
        String nombre = panelConfiguraciones.txtNombre.getText();
        String apellido = panelConfiguraciones.txtApellido.getText();
        String email = panelConfiguraciones.txtEmail.getText();
        
        // OBTENER VALORES DE CLASE USUARIO 
        Usuario usuario = Usuario.getInstance();
        String nombreUsuario = usuario.getNombre();
        String apellidoUsuario = usuario.getApellido();
        String emailUsuario = usuario.getEmail();
        
        if(!nombre.equals(nombreUsuario)){
            int r = configuracionOp.SQL_ActualziarNombre(nombre, emailUsuario);
            if(r == 1){
                JOptionPane.showMessageDialog(panelConfiguraciones, "Nombre de usuario actualizado con exito!", "Nombre actualizado.", JOptionPane.INFORMATION_MESSAGE);
            } else {
                 JOptionPane.showMessageDialog(panelConfiguraciones, "Error al actualizado nombre de usuario", "Error al actualizar. ", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if (!apellido.equals(apellidoUsuario)) {
            int r = configuracionOp.SQL_ActualziarApellido(apellido, emailUsuario);
            if (r == 1) {
                JOptionPane.showMessageDialog(panelConfiguraciones, "Apellido de usuario actualizado con exito!", "Apellido actualizado.", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(panelConfiguraciones, "Error al actualizado apellido de usuario", "Error al actualizar. ", JOptionPane.ERROR_MESSAGE);
            }
        }
         
        
         
        
        
        
    }
    
    
    
    

    private void obtenerDatosUsuario() {
        // OBTEENR INFORMACION DE USUARIO EN EL SISTEMA
        Usuario usuario = Usuario.getInstance();
        String nombre = usuario.getNombre();
        String apellido = usuario.getApellido();
        String email = usuario.getEmail();
        String rango = usuario.getRango();
        
        // SETEAR INFORMACION A CAMPOS DE TEXTOS
        panelConfiguraciones.txtNombre.setText(nombre);
        panelConfiguraciones.txtNombre.setForeground(Color.BLACK);
        
        if (apellido != null) {
            panelConfiguraciones.txtApellido.setText(apellido);
            panelConfiguraciones.txtApellido.setForeground(Color.BLACK);
        }
        
        panelConfiguraciones.txtEmail.setText(email);
        panelConfiguraciones.txtEmail.setForeground(Color.BLACK);
        
        panelConfiguraciones.jComboBoxRango.setSelectedItem(rango);
        panelConfiguraciones.jComboBoxRango.setForeground(Color.BLACK);
        
        // MOSTRAR GESTIONAR USUARIOS SOLO AL ADMINISTRADOR
        if(!rango.equals("Administrador")){
            panelConfiguraciones.lbAdministracion.setVisible(false);
            panelConfiguraciones.btnAdministrarUsuarios.setVisible(false);
        }
        

    }

    private boolean validarCamposVacios(){
        // OBTENER VALORES DE ENTRADA DE TEXTO
        String nombre = panelConfiguraciones.txtNombre.getText();
        String apellido = panelConfiguraciones.txtApellido.getText();
        String email = panelConfiguraciones.txtEmail.getText();
        if(nombre.isEmpty() || nombre.equals("Ingresa tu nombre") || nombre.contains(" ")){
            JOptionPane.showMessageDialog(panelConfiguraciones, "El nombre no puede estar vacio ni contener espacio", "Nombre invalido", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(apellido.isEmpty() || apellido.equals("Ingresa tu apellido") || apellido.contains(" ")){
            JOptionPane.showMessageDialog(panelConfiguraciones, "El apellido no puede estar vacio ni contener espacio", "Apellido invalido", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(!verificarFormatoCorreo(email)){
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
}
