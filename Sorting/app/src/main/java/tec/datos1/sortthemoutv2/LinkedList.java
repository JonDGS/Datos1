package tec.datos1.sortthemoutv2;

public class LinkedList {
    private Nodo head;
    private  Nodo tail;
    private int large;

    public LinkedList(){
        this.head = null;
        this.tail = null;
        this.large = 0;
    }
    public Nodo getHead() {
        return head;
    }
    public void setHead(Nodo head) {
        this.head = head;
    }
    public Nodo getTail() {
        return tail;
    }
    public void setTail(Nodo tail) {
        this.tail = tail;
    }
    public int getLarge() {
        return large;
    }
    public void setLarge(int large) {
        this.large = large;
    }
    public void add(int dato){
        large ++;
        if(this.head == null){
            this.head = new Nodo(dato);
            this.tail = head;
        }else{
            Nodo temp = this.tail;
            temp.setNext(new Nodo(dato));
            this.tail = temp.getNext();
        }
    }
    public void deleteAll() {
        this.head.setNext(null);
        this.head = null;
        this.setLarge(0);
    }
    public int getNodo(int i) {
        int cont = 0;
        Nodo temp = this.head;
        while(cont < i) {
            temp = temp.getNext();
            cont ++;
        }
        return temp.getDato();
    }
}
