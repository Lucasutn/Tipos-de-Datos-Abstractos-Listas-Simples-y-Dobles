package Ejercicio1;

import javax.swing.*;

public class ListDouble {

    private Nodo primerNodo;

    public Nodo getPrimerNodo() {
        return primerNodo;
    }

    public ListDouble(Nodo primerNodo) {
        this.primerNodo = primerNodo;
    }

    public ListDouble() {
    }


    public void agregar(String num) {

        Nodo n1 = new Nodo(num);

        if (this.primerNodo == null) {

            n1.setID(0);
            n1.setNext(n1);
            n1.setBack(n1);
            this.primerNodo = n1;

        } else {

            recorrerYAgregar(this.primerNodo, n1);


        }

    }

    /**
     * funcion encapsulada en agregar()
     */
    private void recorrerYAgregar(Nodo nodo, Nodo n1) {

        if (nodo.getNext() == this.primerNodo) {
            n1.setBack(nodo);
            n1.setNext(this.primerNodo);
            nodo.setNext(n1);
            n1.setID(nodo.getID() + 1);
            this.primerNodo.setBack(n1);

        } else {

            recorrerYAgregar(nodo.getNext(), n1);

        }


    }

    /**
     * funcion para agregar un nuevo nodo el la posicion solicitada de 0 a n
     */
    public void agregarNodo(Nodo newNodo, int id) {
        Nodo aux = this.primerNodo;
        addNodo(newNodo, id, aux);
    }

    /**
     * funcion encapsulada en {@link}
     */
    private void addNodo(Nodo newNodo, int id, Nodo nodo) {


        if (id == 0) {

            newNodo.setNext(nodo);
            nodo.setBack(newNodo);
            this.primerNodo = newNodo;
            setIDList(nodo, id);
            return;

//            nodo.getBack().setNext(newNodo);
//            newNodo.setNext(nodo);
//            newNodo.setBack(nodo.getBack());
//            nodo.setBack(newNodo);
//            nodo.setID(id);
//
//            setIDList(newNodo,id);

        } else if (nodo.getID() == id) {

            nodo.getBack().setNext(newNodo);
            newNodo.setBack(nodo.getBack());
            newNodo.setNext(nodo);
            nodo.setBack(newNodo);
            setIDList(newNodo, id - 1);

            return;
        }
        addNodo(newNodo, id, nodo.getNext());


    }

    /**
     * Funcion para aumentar el ID++
     */
    private void setIDList(Nodo nodo, int id) {

        nodo.setID(id + 1);

        if (nodo.getNext() != null) {

            setIDList(nodo.getNext(), ++id);
        }

//        if(nodo.getNext()!= null) {
//            nodo.getNext().setID(id + 1);
//            setIDList(nodo.getNext(),id++);
//        }


    }


    public void imprimir() {
        recorrerEImprimir(this.primerNodo);
    }

    public void recorrerEImprimir(Nodo nodo) {

        if (nodo.getNext() == this.primerNodo) {
            System.out.println(nodo.getData());

        } else {

            System.out.println(nodo.getData());

            recorrerEImprimir(nodo.getNext());

        }

    }

    /**
     *
     * Metodo que permite buscar un nombre o data enviando una posicion o indice
     * Utilizo una funcion recursiva dentro del try catch que permite iterar en caso de que se ingrese un caracter o un simbolo
     * en dicho caso reinicia el parametro ind asignando -1, lo que permite que el while itere*/

    public String buscarNombre(int ind){


        try {
            while (this.primerNodo.getBack().getID() < ind || ind < 0) {

                ind = Integer.parseInt(JOptionPane.showInputDialog(null, "Fuera de rango Ingrese un nuevo indice: "));
            }
        }catch (NumberFormatException number){

            ind=-1;

            return buscarNombre(ind);


        }


        return buscarNombreBis(ind);

    }
    private String buscarNombreBis(int indice){

        Nodo nodo = this.primerNodo;

        while(nodo.getID()!=indice){

                nodo=nodo.getNext();

        }

        return nodo.getData();


//        if(this.primerNodo.getID()==indice){
//
//            return this.primerNodo.getData();
//
//        }else{
//
//        }

    }



    /**
     * Borrar un elemento del arreglo recibiendo como parametro un indice*/

    public void borrar(int indice){

        Nodo nodo = this.primerNodo;

        while(nodo.getID()!=indice){

            nodo=nodo.getNext();

        }

        if(nodo==this.primerNodo){

            nodo.getNext().setBack(this.primerNodo.getBack());
            nodo.getBack().setNext(this.primerNodo.getNext());

            this.primerNodo=nodo.getNext();

            setIDLess(this.primerNodo);

        }else if(nodo.getNext()==this.primerNodo){


            nodo.getBack().setNext(this.primerNodo);
            this.primerNodo.setBack(nodo.getBack());

            setIDLess(nodo);
        }else {

            nodo.getNext().setBack(nodo.getBack());
            nodo.getBack().setNext(nodo.getNext());
            setIDLess(nodo);

        }

        
    }

    /**
     * */
    private void setIDLess(Nodo nodo) {

        nodo.setID(nodo.getID()-1);

        while (nodo.getNext() != this.primerNodo) {

            nodo=nodo.getNext();

            nodo.setID(nodo.getID()-1);
        }

//        if(nodo.getNext()!= null) {
//            nodo.getNext().setID(id + 1);
//            setIDList(nodo.getNext(),id++);
//        }


    }


//    public void recorrer(){
//
//        recorrerFuntion(this.primerNodo);
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
