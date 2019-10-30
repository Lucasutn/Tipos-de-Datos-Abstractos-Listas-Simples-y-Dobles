import Ejercicio5.Cajero;
import Ejercicio5.ListDouble;

import javax.swing.*;

public class main {

//    Ejercicio​ ​5:
//    Desarrollar​ ​un​ ​programa​ ​para​ ​la​ ​simulación​ ​de​ ​un​ ​cajero​ ​automático.​ ​Utilizar​ ​para​ ​el​ ​mismo​ ​una estructura​ ​lineal​
//    ​dinámica​ ​para​ ​resolver​ ​el​ ​problema.
//            Se​ ​cuenta​ ​con​ ​la​ ​siguiente​ ​información: - Llegan​ ​clientes​ ​a​ ​la​ ​puerta​ ​del​ ​cajero​ ​cada​ ​2​ ​minutos. - Cada​
//            ​cliente​ ​tarda​ ​entre​ ​4​ ​minutos​ ​para​ ​ser​ ​atendido.
//            Se​ ​necesita​ ​determinar​ ​lo​ ​siguiente: - Cantidad​ ​de​ ​clientes​ ​que​ ​se​ ​atienden​ ​en​ ​10​ ​horas. - Cantidad​ ​de​ ​
//            clientes​ ​que​ ​hay​ ​en​ ​cola​ ​después​ ​de​ ​10​ ​horas. - Hora​ ​de​ ​llegada​ ​del​ ​primer​ ​cliente​ ​que​ ​no​ ​es​ ​atendido​ ​luego​
//            ​de​ ​10​ ​horas​ ​(es​ ​decir​ ​la persona​ ​que​ ​está​ ​primera​ ​en​ ​la​ ​cola​ ​cuando​ ​se​ ​cumplen​ ​10​ ​horas).
//    Aclaraciones: - Se​ ​considera​ ​que​ ​cada​ ​iteración​ ​o​ ​ciclo​ ​repetitivo​ ​dura​ ​un​ ​1​ ​minuto


    public static void main(String[] args) {


        ListDouble L1 = new ListDouble();

        Cajero cajero = new Cajero();

       cajero.startOn(L1,(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de horas: "))));



        //La cantidad de clientes que se encuentran en cola lo obtengo del ID del ultimo nodo agregado a la cola
        //ID+1 considerando que el ID del primer nodo es 0, actualmente pareciera que hay una persona de mas
        //pero esto se debe a que desde el 0 tiempo una persona ya se encuentra en el cajero, entonces en 600 min
        //arriban 300 personas + 1 que ya se encontraba(otro manera para seria contabilizar desde el min 2).

        System.out.println("Cantidad de personas que hay en cola: "+ (L1.getPrimerNodo().getBack().getID()+1));

        //utilizo un contador dentro de la clase cajero que incrementa cada que se cumple 4 unidades de tiemmpo
        //que es lo que se tarda en atender un cliente
        System.out.println("Cantidad de clientes que fueron atendidos: " + cajero.getCantClientesAtendidos());

        //Para la hora agregue un atributo a la clase Nodo de tipo string que guarda la hora de cada nodo(cliente)cuando arriaba a la cola
        //dentro de la clase Cajero agregue dos variables de tipo entero una para la hora que incremente en 1 unidad cada 60 iteraciones
        //y una variable entera mins que incrementa en una unidad cada iteracion y se reinicia cada 60 iteraciones
        System.out.println("Hora de llegada: " + L1.getPrimerNodo().getHora() + " cliente numero: " +L1.getPrimerNodo().getData());






    }
}
