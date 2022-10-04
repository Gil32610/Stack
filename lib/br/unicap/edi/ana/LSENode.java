package lib;

public class LSENode<T> {
    private LSENode<T> next;
    private T content;

    public LSENode(T content) {
        this.content = content;
    }

    public LSENode getNext() {
        return this.next;
    }

    public void setNext(LSENode next) {
        this.next = next;
    }

    public T getContent() {
        return this.content;
    }

    public void setContent(T content) {
        this.content = content;
    }

}
