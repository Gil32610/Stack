package br.unicap.edi.ana;

public class Stack<T> {

    private LSENode<T> topo;

    public boolean isEmpty() {
        if (this.topo == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(T valor) {  // inserir no início (topo)
        LSENode novo = new LSENode(valor);
        novo.setProx(this.topo);
        this.topo = novo;
    }

    public boolean isFull() {
        return false;
    }

    public T pop() {
        LSENode<T> aux = this.topo;
        this.topo = this.topo.getProx();
        return aux.getInfo();
    }

    public T top() {
        return this.topo.getInfo();
    }
}
