/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_11;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Juan Avila
 */
public class Proyecto_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("""                   
                            PROYECTO #11: Algoritmos de búsqueda comunes 
                            como la búsqueda lineal y la búsqueda binaria.                           
                                        """);
        
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        
        int[] listado = new int[20];
        
        for(int i = 0; i < 20; i++)
        {
            listado[i] = ran.nextInt(200);
        }
        
        Arrays.sort(listado);
        System.out.println("Obsiones para buscar: " + Arrays.toString(listado));
        try
        {
            int aBuscar = Integer.valueOf(scan.nextLine());       
        
            BusquedaLineal lineal = new BusquedaLineal(listado, aBuscar);
            BusquedaBinaria binaria = new BusquedaBinaria(listado, aBuscar);
            System.out.println(" Posicion Algoritmos de busqueda: \n");
            int temp = lineal.buscar();
            if (temp != -1)
            {
                System.out.println("    - Lineal: " + temp);
                System.out.println("    - Binaria: " + binaria.buscar());
            }
            else
                System.out.println("No existe en la lista");                        
        } 
        catch(NumberFormatException e)
        {
            System.out.println("El dato que escribiste no es numerico");
        }
    }
    
}
