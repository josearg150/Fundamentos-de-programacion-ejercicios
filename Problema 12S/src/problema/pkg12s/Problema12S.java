/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg12s;

import java.util.Scanner;
/**
 *
 * @author Jose angel
 */
public class Problema12S {

    /**
     * @param args the command line arguments
     */
    public static void comparador(int a, int b, int c){
        int numero_mayor;
        if (a>b && a>c)
            numero_mayor= a;
        else
            if(b>c)
                numero_mayor=b;
            else
                numero_mayor=c;
        
        System.out.println("El número mayor es: "+numero_mayor);

    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a,b,c;
        System.out.print("Introduce el primer número: ");
        a = leer.nextInt();
        System.out.print("Introduce el segundo número: ");
        b = leer.nextInt();
        System.out.print("Introduce el tercer número: ");
        c = leer.nextInt();
        comparador(a,b,c);
                
    }
    
}
