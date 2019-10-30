package Ejercicio5;
public class ListSimple {

    private Nodo primerNodoSimple;

    public Nodo getPrimerNodoSimple() {
        return primerNodoSimple;
    }

    public ListSimple(Nodo primerNodoSimple) {
        this.primerNodoSimple = primerNodoSimple;
    }

    public ListSimple() {
    }


    public void agregar(String num) {

        Nodo n1 = new Nodo(num);

        if (this.primerNodoSimple == null) {

            n1.setID(0);
            n1.setNext(n1);
            this.primerNodoSimple = n1;

        } else {

            recorrerYAgregar(this.primerNodoSimple, n1);


        }

    }

    /**
     *
     */
    private void recorrerYAgregar(Nodo nodo, Nodo n1) {

        if (nodo.getNext() == primerNodoSimple) {

            nodo.setNext(n1);
            n1.setNext(primerNodoSimple);

        } else {

            recorrerYAgregar(nodo.getNext(), n1);

        }


    }

    public void imprimir(){
        recorrerEImprimir(this.primerNodoSimple);
    }

    public void recorrerEImprimir(Nodo nodo){

        if(nodo==null){
            System.out.println(nodo);
        }else {

            System.out.println(nodo.getData());

            recorrerEImprimir(nodo.getNext());

        }

    }
//
//    public void recorrer(){
//
//        recorrerFuntion(this.primerNodoSimple);
//
//    }
//
//    public Nodo recorrerFuntion(Nodo nodo){
//
//        if(nodo.getNext()==null){
//
//            return nodo;
//
//        }else {
//
//            recorrerFuntion(nodo.getNext());
//
//        }
//
//        return nodo;
//
//    }
//

}
