/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_9;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import java.time.LocalDateTime;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Juan Avila
 */
public class FormServidor extends JFrame {
    private JTextArea textArea;
    private ServidorChatTCP servidor;
    
    public FormServidor()
    {
        super("SERVIDOR");
        
        //Especifica
        this.setSize(420, 550);
        this.setLocationRelativeTo(null);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        this.add(panel);
        
        
        elementosPanel(panel);
        this.setVisible(true);
    }
    
    private String getHoraActual()
    {
        LocalDateTime localDateTime = LocalDateTime.now();
        int hora = localDateTime.getHour();
        int minuto = localDateTime.getMinute();
        int segundo = localDateTime.getSecond();
        
        String respuesta = "[" + hora + ":" + minuto + ":" + segundo + "] ";
        return respuesta;
        
    }
    private void elementosPanel(JPanel panel)
    {
        JLabel userLabel = new JLabel("Puerto");
        panel.add(userLabel);
        
        JTextField userText = new JTextField(20);
        userText.setText("49171");
        panel.add(userText);
        
        JButton iniciaButton = new JButton("Inicia Servidor");
        panel.add(iniciaButton);
        
        JButton detenerButton = new JButton("Detener Servidor");
        detenerButton.setEnabled(false);
        panel.add(detenerButton);
        
        iniciaButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                iniciaButton.setEnabled(false);
                detenerButton.setEnabled(true);
                String texto = userText.getText();
                Conecta(texto);
            }
            
        });
        
        detenerButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                detenerButton.setEnabled(false);
                iniciaButton.setEnabled(true);
                Desconecta();
            }            
        });
        this.textArea = new JTextArea();
        this.textArea.setLineWrap(true);
        this.textArea.setWrapStyleWord(true);
        JScrollPane areaJScrollPane = new JScrollPane(this.textArea);
        areaJScrollPane.setVerticalScrollBarPolicy(
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        areaJScrollPane.setPreferredSize(new Dimension(400,250));
        areaJScrollPane.setBorder(
            BorderFactory.createCompoundBorder(
                BorderFactory.createCompoundBorder(
                    BorderFactory.createTitledBorder("conversacion"),
                    BorderFactory.createEmptyBorder(5, 5, 5, 5)),
            areaJScrollPane.getBorder())
        );
        panel.add(areaJScrollPane);
        JTextField mensaje = new JTextField(20);
        mensaje.setBounds(10, 450, 270, 25);
        panel.add(mensaje);
        JButton enviarTxtButton = new JButton("Enviar");
        enviarTxtButton.setBounds(300, 450, 75, 25);
        panel.add(enviarTxtButton);
        
        enviarTxtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtMensaje = mensaje.getText();
                if(servidor.enviaTxt(txtMensaje))
                {
                    System.out.println(servidor.enviaTxt(txtMensaje));
                    textArea.append(getHoraActual() + " -> " + txtMensaje + "\n");
                    mensaje.setText("");
                }
            }
        });
    }
    void Conecta(String campo)
    {
        try
        {
            int puerto = Integer.parseInt(campo);
            this.textArea.append(getHoraActual()+ " Esperando a la conexion...\n");
            this.servidor = new ServidorChatTCP(puerto, this.textArea);
            this.servidor.start();
        } 
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    void Desconecta()
    {
        try
        {
            this.servidor.cierra();
            this.textArea.append(getHoraActual()+ " Conexion cerrando...");
        } 
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        FormServidor form = new FormServidor();
    }
}
