import Ejercicio1.ListDouble;
import Ejercicio1.ListSimple;

public class main {

//
//    Incluya​ ​en​ ​todos​ ​los​ ​tipos​ ​de​ ​Listas​ ​un​ ​método​ ​que​ ​permita​ ​retornar​ ​el​ ​valor​ ​en​ ​una​ ​posición determinado.
//    Ejemplo:​ ​En​ ​una​ ​lista​ ​conformada​ ​por​ ​los​ ​siguientes​ ​valores:​ ​“juan”,​ ​“pedro”,​ ​“ana”​ ​y​ ​“nina”, solicitar​
//    ​recuperar​ ​el​ ​valor​ ​en​ ​la​ ​posición​ ​2,​ ​el​ ​cual​ ​será​ ​“ana”​ ​(considerando​ ​que​ ​los​ ​índices​ ​en la​ ​lista​ ​se​ ​implementan​
//    ​de​ ​la​ ​misma​ ​forma​ ​que​ ​los​ ​Arreglos​ ​en​ ​Java,​ ​comenzando​ ​por​ ​el​ ​índice 0)



    public static void main(String[] args) {

        ListDouble L1 = new ListDouble();


        L1.agregar("juan");
        L1.agregar("pedro");
        L1.agregar("ana");
        L1.agregar("nina");
//        L1.agregar();


        L1.imprimir();

        System.out.println(L1.getPrimerNodo().getBack().getID());



    }
}
