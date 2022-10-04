package lib.br.unicap.edi.ana;

public class Stack<T> {
    private LSENode<T> top;

    public boolean isEmpty() {
        if (this.top == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(T content) {
        LSENode<T> node = new LSENode(content);
        node.setNext(this.top);
        this.top = node;
    }

    public T pop() {
        LSENode<T> node = this.top;
        this.top = this.top.getNext();
        return node.getContent;
    }

    public boolean isFull() {
        return false;
    }

}