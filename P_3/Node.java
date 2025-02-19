package P_3;

import P_3.Node;

public class Node {
    private int data;
    private Node next;

//    Inisialisasi Node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

//    Setter dan Getter
    public void setData (int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
    
    public void setNext (Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}