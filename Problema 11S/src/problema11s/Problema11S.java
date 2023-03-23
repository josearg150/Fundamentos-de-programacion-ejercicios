/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema11s;

import java.util.Scanner;
/**
 *
 * @author Jose angel
 */
public class Problema11S {

    
    public static void porcentaje(float sueldo_actual)
    {
        float sueldo_nuevo;
        float porcentaje=0;
                
        if(sueldo_actual <= 5000 ){
            porcentaje = sueldo_actual * 0.05f;
        }
        if(sueldo_actual >5000 && sueldo_actual<10000){
            porcentaje = sueldo_actual * 0.035f;    
        }
        if(sueldo_actual >= 10000){
            porcentaje = sueldo_actual * 0.03f;
        }
        sueldo_nuevo = sueldo_actual+porcentaje; 
        System.out.println("El sueldo nuevo es:"+sueldo_nuevo);
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float sueldo_actual;
        System.out.print("Introduce el sueldo actual:");
        sueldo_actual = leer.nextFloat();
        porcentaje(sueldo_actual);
    }
    
}
