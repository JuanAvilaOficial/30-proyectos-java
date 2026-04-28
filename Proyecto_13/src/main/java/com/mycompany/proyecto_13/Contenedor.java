/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_13;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author JuanWindows
 */
public class Contenedor extends JPanel implements ActionListener
{
    /// Pantalla    
    static final int PANTALLA = 600;
    static final int CUADRITO_SIZE = 25;
    static final int CUADRITOS_PARALELOS= (int) PANTALLA/CUADRITO_SIZE;
    
    ///SERPIENTE    
    static final int TOTAL_CUERPO_SERPIENTE = (PANTALLA*PANTALLA)/CUADRITO_SIZE;
    int [] serpineteX = new int[TOTAL_CUERPO_SERPIENTE], 
           serpineteY = new int[TOTAL_CUERPO_SERPIENTE];
    int cuerpo_serpiente =3;
    char direccion= 'd';
    
    ///COMIDA    
    int comidaX, comidaY;
    
    ///TIMER
    boolean running = true;
    static final int DELAY = 100;
    Timer timer;
    
    ///OTROS        
    Random random = new Random();
    
    Contenedor()
    {
        this.setPreferredSize(new Dimension(PANTALLA,PANTALLA));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new Controles());
        iniciarJuego();
    }
    public void iniciarJuego()
    {
        agregarComida();
        timer = new Timer(DELAY,this);
        timer.start();
    }
    
    public void agregarComida()
    {
        comidaY = random.nextInt(CUADRITOS_PARALELOS)*CUADRITO_SIZE;
        comidaX = random.nextInt(CUADRITOS_PARALELOS)*CUADRITO_SIZE;
    }
    
    public void movimiento()
    {
        for (int i = cuerpo_serpiente; i > 0; i--) 
        {
            serpineteX[i] = serpineteX[i-1];
            serpineteY[i] = serpineteY[i-1];
        }
        switch(direccion)
        {
            case 'a':
                serpineteX[0] = serpineteX[0]-CUADRITO_SIZE;
                break;
            case 'd':
                serpineteX[0] = serpineteX[0]+CUADRITO_SIZE;
                break;
            case 'w':
                serpineteY[0] = serpineteY[0]-CUADRITO_SIZE;
                break;
            case 's':
                serpineteY[0] = serpineteY[0]+CUADRITO_SIZE;
                break;
        }
    }
    public void checkComida()
    {
        if(serpineteY[0] == comidaY && comidaX == serpineteX[0])
        {
            cuerpo_serpiente++;
            agregarComida();
        }
    }
    
    public void coliciones()
    {       
        if(serpineteX[0] > PANTALLA-CUADRITO_SIZE)
            serpineteX[0] = 0;
        
        if(serpineteY[0] > PANTALLA-CUADRITO_SIZE)
            serpineteY[0] = 0;
        
        if(serpineteX[0] < 0)
            serpineteX[0] = PANTALLA;
        
        if(serpineteY[0] < 0)
            serpineteY[0] = PANTALLA;
        //AGREGA ESTO: chequea si la cabeza toca el cuerpo
        for (int i = 1; i < cuerpo_serpiente; i++)
        {
            if(serpineteX[0] == serpineteX[i] && serpineteY[0] == serpineteY[i])
            {
                running = false;
                timer.stop();
                break;
            }
    }
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(running)
        {
            movimiento();
            checkComida();
            coliciones();
        }
        repaint();
    }
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for (int i = 0; i < CUADRITOS_PARALELOS; i++) {
            g.drawLine(0, CUADRITO_SIZE*i, PANTALLA, CUADRITO_SIZE*i);
            g.drawLine(CUADRITO_SIZE*i, 0, CUADRITO_SIZE*i, PANTALLA);
        }
        g.setColor(Color.RED);
        g.fillOval(comidaX, comidaY, CUADRITO_SIZE, CUADRITO_SIZE);
        g.setColor(Color.green);
        for (int i = 0; i < cuerpo_serpiente; i++) {
            g.fillRect(serpineteX[i], serpineteY[i], CUADRITO_SIZE, CUADRITO_SIZE);
        }
    }
    
    public class Controles extends KeyAdapter
    {
        @Override
        public void keyPressed(KeyEvent e)
        {
            switch(e.getKeyChar())
            {
                case 'w':
                    if(direccion != 's')
                        direccion = 'w';
                    break;
                case 's':
                    if(direccion != 'w')
                        direccion = 's';
                    break;
                case 'a':
                    if(direccion != 'd')
                        direccion = 'a';
                    break;
                case 'd':
                    if(direccion != 'a')
                        direccion = 'd';
                    break;
            }
        }
    }
}
