package Ejercicio5;

public class Cajero {

    private int cantClientesAtendidos=0;



    public void startOn(ListDouble L1,int horas){

        int minutos= horas*60;
        //idPersona es una varia que pongo para identificar a cada persona que llega a la cola, es como un nombre.
        //No esta relacionado con el ID del nodo en la clase nodo.
        int idPersona=1;
        int hora=0;
        int mins=-1;


        for (int i = 0; i <= minutos ; i++) {

            mins++;

            if(mins==60){

                hora++;
                mins=0;
            }


            if(i==0) {
                L1.agregar("" + idPersona,""+0);
                idPersona++;
                continue;
            }

            //la condicion es saltar el bucle si i no es multiplo de 2 ya que solo se agregan o quitan
            //personas a la cola cada 2 unidades de tiempo y cada 4 se quita una.Por tanto en las unidades de tiempo impar
            //salta a la siguien iteracion del ciclo
            if(i%2!=0) {
                continue;
            }

            if(i%2==0){

                if(i%4==0){

                    //IF solo para darle formato a la hora  ":0"
                    if(mins<10){

                    L1.agregar(""+idPersona,""+hora+":0"+mins);
                    }else {
                        L1.agregar("" + idPersona, "" + hora + ":" + mins);
                    }

                    L1.borrar(0);
                    idPersona++;
                    cantClientesAtendidos++;


                }else{

                    if(mins<10){

                        L1.agregar(""+idPersona,""+hora+":0"+mins);
                    }else {
                        L1.agregar("" + idPersona, "" + hora + ":" + mins);
                    }
                    idPersona++;
                }

            }



        }


    }

    public int getCantClientesAtendidos() {
        return cantClientesAtendidos;
    }

    public void setCantClientesAtendidos(int cantClientesAtendidos) {
        this.cantClientesAtendidos = cantClientesAtendidos;
    }


}
