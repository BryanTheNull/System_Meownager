package Config;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 * Nombre del archivo: GradientPanel.java
 Descripción: Creacion de clase que permite darle estilo de Degradado a un JPanel
 Autor: Bryan Vera
 Fecha de creación: 21-05-2024
 Última modificación: 21-05-2024
 Versión: 1.0.0
 .
 */


public class GradientPanel extends JPanel{
    
    private Color color1;
    private Color color2;
    
    public GradientPanel(Color color1, Color color2){
        this.color1 = color1;
        this.color2 = color2;
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // Crear Degradado lineal desde la parte superior a inferior.
        int width = getWidth();
        int height = getHeight();
        GradientPaint gradientPaint = new GradientPaint(0, 0, color1, 0, height, color2);
        g2d.setPaint(gradientPaint);
        g2d.fillRect(0, 0, width, height);
    }
}
