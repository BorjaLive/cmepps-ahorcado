/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.b0ve.cmepps.ahorcado;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author borja
 */
public class Ahorcado {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Juego Ahorcado");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CanvasAhorcado canvas = new CanvasAhorcado();
        canvas.setBackground(Color.WHITE);
        frame.add(canvas);
        canvas.setSize(720, 480);
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        ControladorJuego controlador = new ControladorJuego(canvas);
        canvas.addKeyListener(controlador);
        frame.addKeyListener(controlador);
    }
    
}
