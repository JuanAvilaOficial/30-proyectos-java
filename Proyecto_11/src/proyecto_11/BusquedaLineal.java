/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_11;

/**
 *
 * @author Juan Avila
 */
public class BusquedaLineal {
    int [] lista;
    int perdido;
    public BusquedaLineal(int[] lista, int perdido)
    {
        this.lista = lista;
        this.perdido = perdido;
    }   
    
    public int buscar()
    {       
        for(int i = 0; i <= lista.length - 1; i++ )
        {            
            if(lista[i] == perdido)
               return i;
        }
        return -1;
    }
}
