/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_9;

import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import javax.swing.JTextArea;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Juan Avila
 */
public class ClienteChatTCP extends Thread
{
    private String IP;
    private int puerto;
    private Socket socket;
    private InputStream inputStream;
    private InputStreamReader inputStreamReader;    
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private JTextArea textArea;
    
    public ClienteChatTCP(String IP, int puerto, JTextArea textArea)
    {
        this.IP = IP;
        this.puerto = puerto;
        this.textArea = textArea;
    }
    
    public Socket getSocket()
    {
        return this.socket;
    }
    
    public boolean enviaTxt(String mensaje)
    {
        if(!this.socket.isConnected())
            return false;        
        try
        {
            this.bufferedWriter.write(mensaje);
            this.bufferedWriter.newLine();
            this.bufferedWriter.flush();            
            return true; 
            
        } 
        catch(IOException e)
        {
            e.printStackTrace();
            return false;   
        }        
    }
    private void inicializarRecepcion()
    {
        try
        {
            this.inputStream = this.socket.getInputStream();
            this.inputStreamReader = new InputStreamReader(inputStream);
            this.bufferedReader = new BufferedReader(inputStreamReader);
        } catch(IOException e)
        {
            e.printStackTrace();
            return;
        }
    }
    private void recibeMensajes() {
        // Mientras el socket no se cierre, leemos datos
        inicializarRecepcion();
        String mensaje;
        while (true) {
            if (this.socket.isClosed()) 
                return;            
            if (!this.socket.isConnected())
                return;
            try {
                mensaje = this.bufferedReader.readLine();
                this.textArea.append(mensaje + "\n");
                System.out.println("CLIENTE: " + mensaje);
                this.textArea.repaint();
            } catch (IOException e) {
                return;
            }
        }
    }
    @Override
    public void run()
    {
        try
        {
            this.socket = new Socket(this.IP, this.puerto);
            OutputStream outputStream = this.socket.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            this.bufferedWriter = new BufferedWriter(outputStreamWriter);
            recibeMensajes();   
            inicializarRecepcion();
        } 
        catch(IOException e)
        {
            e.printStackTrace();
        }
   
    }
}
