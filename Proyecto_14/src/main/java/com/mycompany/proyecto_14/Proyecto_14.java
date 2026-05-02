/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_14;

import java.util.Scanner;

/**
 *
 * @author JuanWindows
 */
public class Proyecto_14 
{
    
    public static void main(String[] args) 
    {
        System.out.println("Ingresas tu tarjeta de credito al validador de TJs");
        Scanner sc = new Scanner(System.in);
        String numeroTarjeta = sc.nextLine();
                
        try 
        {
            // Intentamos convertir a Long (las tarjetas suelen ser muy largas para un Integer)
            Long.parseLong(numeroTarjeta); 
            // Si llega aquí, es un número válido. Ahora llamamos a tu función lógica.
            System.out.println(esValida(numeroTarjeta) ? "Valido" : "No valido");
        } 
        catch (NumberFormatException e) 
        {
            // Si falla la conversión, entra aquí
            System.out.print("Dato no válido: debe ser numérico");
        }   
    }
    
    public static boolean esValida(String numeroTarjeta) {
    int suma = 0;
    boolean state = false; // Controla si debemos duplicar el dígito

    // Recorremos de derecha a izquierda
    for (int i = numeroTarjeta.length() - 1; i >= 0; i--) {
        // Obtenemos el valor numérico del carácter de forma eficiente
        int digito = Character.getNumericValue(numeroTarjeta.charAt(i));

        if (state) {
            digito *= 2;
            if (digito > 9) {
                digito -= 9; // Equivale a sumar sus dígitos: 12 -> 1+2 = 3
            }
        }

        suma += digito;
        state = !state; // Cambiamos el estado para el siguiente dígito
    }

    // La tarjeta es válida solo si la suma total termina en 0
    return (suma % 10 == 0);
}
}
