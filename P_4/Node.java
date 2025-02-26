package P_4;

import P_4.Node;

public class Node {
    private double data;
    private Node next;

//    Inisialisasi Node
    public Node(double data) {
        this.data = data;
        this.next = null;
    }

//    Setter dan Getter
    public void setData (int data) {
        this.data = data;
    }

    public double getData() {
        return data;
    }
    
    public void setNext (Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}