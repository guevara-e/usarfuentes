/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuentes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;


import java.awt.Font;
import java.awt.FontFormatException;



import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Eduar
 */
public class VentanaP extends JPanel{
    // ventana
    private JFrame ventana;
    // contenedor
    private Container contenedor;
    
    //declaramos un Objeto de tipo Font
    Font f0, f1, f2, f3;
    
    //declaramos un Objeto de tipo Font
    Font miFuente;
    
    
    
    
    GraphicsEnvironment g;
    
     public VentanaP(String titulo) {
         //Agregamos una nueva fuente desde un archivo
           try {
            miFuente = Font.createFont(Font.TRUETYPE_FONT, new File("PixelMplus10-Regular.ttf")).deriveFont(35f);
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(VentanaP.class.getName()).log(Level.SEVERE, null, ex);
        } 
        // inicializar la ventana
        ventana = new JFrame(titulo);
        //definir tamaño a ventana
        ventana.setSize(800, 400);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        
        contenedor = ventana.getContentPane();
        contenedor.setSize(800, 400);
        // agregar la ventana en el contenedor
        contenedor.add(this, BorderLayout.CENTER);
        
        //Instanciamos nuestros objetos de tipo Font
        //Cada uno de ellos tiene un estilo diferente
        f0 = new Font("Comic Sans MS", 0, 35);
        f1 = new Font("Arial", 1, 35);
        f2 = new Font("Times New Roman", 2, 35);
        f3 = new Font("Informal Roman", 3, 35);
        

    }

    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        //Utilizamos nuestra fuente que agregamos desde el archivo
        g.setFont(miFuente);
        g.drawString("Soy un texto pixelado",50 , 50);
        
        //Utilizamos las fuentes que vienen por default, pero les cambiamos
        //el estilo 
        g.setFont(f0);
        g.drawString("Soy un texto plano",50 , 100);
        
        g.setFont(f1);
        g.drawString("Soy un texto en negritas",50 , 150);
        
        g.setFont(f2    );
        g.drawString("Soy un texto en cursiva",50 , 200);
        
        g.setFont(f3);
        g.drawString("Soy una combinación",50 , 250);
        
        
        
        
    }
    
    //Nos permite obtener todas lo nombres de las familias de fuentes y
    //las imprime en consola
    void obtenerFuentes(){
        String todasLasFuentes[]= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (int i = 0; i < todasLasFuentes.length; i++) {
            System.out.println(todasLasFuentes[i]);
        }
    }
     
    
    
}
