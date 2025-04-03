/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_11;

/**
 *
 * @author Juan Avila
 */
public class BusquedaBinaria {
    int [] lista;
    int perdido;
    public BusquedaBinaria(int[] lista, int perdido)
    {
        this.lista = lista;
        this.perdido = perdido; 
    }
    public int buscar()
    {       
        int ini = 0, 
            fin = lista.length - 1;
        
        while(ini <= fin)
        {
            int medio = ini + (fin - ini)/2;
            if(perdido == lista[medio])
                return medio;
            
            if(lista[medio] < perdido)
                ini = medio + 1;
            else
                fin = medio - 1;
        }
        return -1;
    } 
}
