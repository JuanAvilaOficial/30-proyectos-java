/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_13;

import javax.swing.JFrame;

/**
 *
 * @author JuanWindows
 */
public class Ventana extends JFrame{
    Ventana()
    {
        this.setTitle("Snek");
        this.add(new Contenedor());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }
}
