package tec.datos1.sortthemoutv2;

public class Nodo {
    private Nodo next;
    private Nodo prev;
    private int dato;
    public Nodo(int dato){
        this.dato = dato;
        this.next = null;
        this.prev = null;
    }
    public Nodo getNext() {
        return next;
    }
    public void setNext(Nodo next) {
        this.next = next;
    }
    public Nodo getPrev() {
        return prev;
    }
    public void setPrev(Nodo prev) {
        this.prev = prev;
    }
    public int getDato() {
        return dato;
    }
    public void setDato(int dato) {
        this.dato = dato;
    }
}
