/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Juan Avila
 */
public class Proyecto_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                String obj = "", numero="";
        boolean flag = false;
        double resultado=0.0;
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        
        System.out.println("""                           
                           *------------------------------------------------------------*
                           PROYECTO #4:Convertidor de unidades
                           Crea un convertidor de unidades (como cent\u00edmetros a 
                           pulgadas, centrimetro a yardas y kil\u00f3metros a etc).
                           *------------------------------------------------------------*
                           """);        
        
        while(!flag)
        {            
            try 
            {                
                if(obj.equals("")){
                    System.out.println(mensaje("##############################\n"
                            + "Cambio de unidades de medida\n"
                            + "1. Cambiar CENTRIMETROS a PULGADAS\n"
                            + "2. Cambiar METROS a YARDAS\n"
                            + "3. Cambiar KILOMETRO a MILLAS"));
                
                    obj = sc.nextLine();
                    flag = obj.toLowerCase().equals("exit");
                }
                
                switch (obj) {
                    case "1":                        
                        System.out.println(mensaje("Dame los centimetros "
                                + "que quieres convertir a pulgadas:"));
                        numero = sc.nextLine();  
                        if(numero.toLowerCase().equals("exit")){ 
                            obj = "";
                        }else{
                            if(!numero.equals("")){
                                resultado = Double.parseDouble(numero)/2.54;
                                System.out.print(mensaje("Los cm "+ numero +" equivalen a "
                                        + decimalFormat.format(resultado) +" pulgadas"));
                                System.out.print(mensaje(""));
                            }
                            else
                                resultado = 0.0;
                        }
                        break;
                    case "2":                        
                        System.out.println(mensaje("Dame los metros "
                                + "que quieres convertir a yardas:"));                        
                        numero = sc.nextLine(); 
                        
                        if(numero.toLowerCase().equals("exit")){
                            obj = "";
                        }else{
                            if(!numero.equals("")){
                                resultado = Double.parseDouble(numero)*1.09361;
                                System.out.println(mensaje("Los metros "+ numero +" equivalen a "
                                    + decimalFormat.format(resultado) +" yardas"));
                                System.out.print(mensaje(""));
                            }else
                                resultado = 0.0;
                        }
                        break;
                    case "3":                        
                        System.out.println(mensaje("Dame los kilometros "
                                + "que quieres convertir a millas"));
                        numero = sc.nextLine();    
                        
                       if(numero.toLowerCase().equals("exit")){
                            obj = "";
                        }else{                           
                           if(!numero.equals(""))
                            {
                                resultado = Double.parseDouble(numero)/1.6093444978926;
                                System.out.println(mensaje("Los kilometros "+ numero +" equivalen a "
                                        + decimalFormat.format(resultado) +" millas"));
                                System.out.print(mensaje(""));
                            }else
                                resultado = 0.0;
                        }                       
                        break;
                    default:
                        System.out.println("Dato no valido, solo 1, 2, 3 O exit para terminar el proyecto 4");
                        obj = "";
                } 
                if(!flag){
                    if(resultado != 0.0){
                        String temp = sc.nextLine();                
                        if (!temp.equals(""))
                            obj = sc.nextLine();
                    }
                }
            } catch (MatchException e) 
            {
                sc.nextLine();
            }
        }
        System.out.println(mensaje("Exit... GOODBYE!!!!!"));
    }
    static String mensaje(String s)
    {
        return "\n*------------------------------------------------------------*\n"
            + s;
    }
}
