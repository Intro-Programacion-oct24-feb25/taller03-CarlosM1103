/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author utpl
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1 = 81;
        int valor2 = 9;
        int valor3= 3;
        int valor4 = 10;
        int valor5= 1;
        int valor6 = 100;
        int valor7 = 25;
        
        boolean resultado = ((((Math.sqrt(valor1)+(valor2))/(valor3)) == valor2 ) ||(valor4 > valor5) && (valor6/valor7) >= Math.sqrt(valor6));
        System.out.println(resultado);
    }
    
}
