/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg13s;

import java.util.Scanner;

/**
 *
 * @author Jose angel
 */
public class Problema13S {

    /**
     * @param args the command line arguments
     */
    public static void medidor(float temp){
        String mensaje="";
        if(temp <= 36.5)
            mensaje="Normal";
        else
            if(temp > 36.5 && temp <= 37.0)
                mensaje="Moderada";
        else
                if(temp > 37.0 && temp <= 37.5)
                    mensaje="Alta";
        else
                    mensaje="Muy alta";
        System.out.println("La temperatura es: "+mensaje);
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float temp;
        System.out.print("Introduce la temperatura: ");
        temp = leer.nextFloat();
        medidor(temp);
    }
    
}
