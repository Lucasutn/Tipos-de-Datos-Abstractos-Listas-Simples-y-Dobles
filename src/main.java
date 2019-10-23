import Ejercicio1.ListDouble;
import Ejercicio1.ListSimple;

public class main {


    public static void main(String[] args) {

        ListDouble L1 = new ListDouble();


        L1.agregar(1);
        L1.agregar(2);
        L1.agregar(3);
        L1.agregar(4);
        L1.agregar(5);


//        L1.imprimir();

        System.out.println(L1.getPrimerNodo().getBack().getData());



    }
}
