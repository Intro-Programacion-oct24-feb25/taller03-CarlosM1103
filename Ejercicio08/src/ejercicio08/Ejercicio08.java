/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author utpl
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1 = 10;
        int valor2 = 9;
        int valor3 = 20;
        int valor4 = 500;
        int valor5 = 2;
        int valor6 = 3;
        int valor7 = 200;
        int valor8 = 50;
        int valor9 = 51;
        
        boolean resultado = ((valor1*valor2)+ valor3 - (valor4/valor5) + (Math.pow(valor6,valor5)) >= valor7 || (valor8>=valor8 - valor8 + valor9) );
        System.out.println(resultado);
    
    }
    
}
