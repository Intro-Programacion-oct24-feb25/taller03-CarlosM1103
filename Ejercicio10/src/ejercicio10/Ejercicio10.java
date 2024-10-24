/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author utpl
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1 = 25;
        int valor2 = 10;
        int valor3 = 100;
        int valor4 = 5;
        int valor5 = 2;
        boolean valor6 = true;
        boolean valor7 = false;
        
        boolean resultado = (Math.sqrt(valor1) * valor2 >= valor3 && valor6 || valor7 || (valor2/valor4)>= valor5  );
        System.out.println(resultado);      
    }
    
}
