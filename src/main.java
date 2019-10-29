import Ejercicio1.ListDouble;
import Ejercicio1.ListSimple;

import javax.swing.*;
import java.util.Scanner;

public class main {

//    Ejercicio 4:
//    Desarrolle un programa que permita leer por teclado un serie de 5 caracteres y luego imprima
//    la lista de forma inversa a como fueron ingresados por teclado. Utilice una estructura lineal
//    dinámica para resolver dicho problema.
//            Ejemplo: Si se ingresan por teclado los caracteres: “a”, “b”, “c”, “d”, “e”; la lista resultado seria
//“e”, “d”, “c”, “b”, “a”.


    public static void main(String[] args) {

        int num = 5;

        Scanner scanner = new Scanner(System.in);

        ListDouble L1 = new ListDouble();


        while (num != 0) {

            L1.agregar(JOptionPane.showInputDialog("Ingrese un caracter: "));
            num--;

        }


        /*
         * Cambio en la funcion imprimir cambiando de lugar la funcion recursiva por arriba del print*/

        L1.imprimir();


    }
}
