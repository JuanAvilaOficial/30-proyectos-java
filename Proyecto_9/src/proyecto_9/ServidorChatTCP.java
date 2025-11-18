/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JTextArea;

/**
 *
 * @author Juan Avila
 */
public class ServidorChatTCP extends Thread{
    private ServerSocket serverSocket;
    private Socket socket;
    private InputStream inputStream;
    private InputStreamReader inputStreamReader;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private OutputStream outputStream;
    private OutputStreamWriter outputStreamWriter;
    private int puerto;
    private JTextArea textArea;
    
    public ServidorChatTCP(int puerto, JTextArea textArea)
    {
        this.puerto = puerto;
        this.textArea = textArea;
    }
    @Override
    public void run()
    {
        try
        {
            this.serverSocket = new ServerSocket(this.puerto);
            this.socket = this.serverSocket.accept();
            System.out.println("proyecto_9.ServidorChatTCP.run");
            estableceStreamsSocket();
            recibeMensajes();
            enviarMensajes();
        } 
        catch(IOException e)
        {
            e.printStackTrace();
        }
   
    }
    public void cierra() throws IOException
    {
        this.bufferedReader.close();
        this.socket.close();
        this.serverSocket.close();
    }
    public Socket getSocket()
    {
        return this.socket;
    }
    
    private void estableceStreamsSocket(){
        try
        {
            this.inputStream = this.socket.getInputStream();
            this.inputStreamReader = new InputStreamReader(inputStream);
            this.bufferedReader = new BufferedReader(inputStreamReader);
            
            this.outputStream = this.socket.getOutputStream();
            this.outputStreamWriter = new OutputStreamWriter(outputStream);
            this.bufferedWriter = new BufferedWriter(outputStreamWriter);
        } 
        catch(Exception e)
        {
            e.printStackTrace();
            return;
        }
    }
    private void enviarMensajes()
    {
        try
        {
            this.outputStream = this.socket.getOutputStream();
            this.outputStreamWriter = new OutputStreamWriter(outputStream);
            this.bufferedWriter = new BufferedWriter(outputStreamWriter);
        } catch(IOException e)
        {
            e.printStackTrace();
        }
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
            
        } catch(IOException e)
        {
            e.printStackTrace();
            return false;   
        }        
    }
    private void recibeMensajes()
    {
        enviarMensajes();
        String mensaje;
        while(true)
        {
            if(this.socket.isClosed())
                return;
            if(!this.socket.isConnected())
                return;
            try
            {
                mensaje = this.bufferedReader.readLine();
                this.textArea.append(mensaje + "\n");
                System.out.println("SERVIDOR: " + mensaje);
                this.textArea.repaint();
            } catch(IOException e)
            {
                return;
            }
        }
    }
}
