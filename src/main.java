import Ejercicio1.ListDouble;
import Ejercicio1.ListSimple;

public class main {

//    Ejercicio 3:
//    Incluya en todos los tipos de Listas un método que permita eliminar un valor en una posición
//    determinada y luego imprima el resultado de la lista resultante.
//    Ejemplo: En una lista conformada por los siguientes valores: “juan”, “pedro”, “ana” y “nina”,
//    solicitar eliminar el valor en la posición 2, el cual sería “ana” (considerando que los índices en la
//    lista se implementan de la misma forma que los Arreglos en Java, comenzando por el índice 0),
//    la lista final sería “juan”, “pedro”, “nina”.


    public static void main(String[] args) {

        ListDouble L1 = new ListDouble();


        L1.agregar("juan");
        L1.agregar("pedro");
        L1.agregar("ana");
        L1.agregar("nina");
        L1.delete(2);

//        L1.agregar();


//        L1.imprimir();

        System.out.println(L1.buscarNombre(8));

//        System.out.println(L1.getPrimerNodo().getNext().getID());



    }
}
