/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.idesi.proyecto.recursos;


import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Hola
 */
public class ImagenFondo extends JPanel{
    private Image imagen;
        public void paint(Graphics g){
           imagen = new ImageIcon(getClass().getResource("Fondo.jpg")).getImage();
           g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
           setOpaque(false);
           super.paint(g);
        }
    
}
