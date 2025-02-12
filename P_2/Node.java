package P_2;

public class Node {
    private int nilai;
    private Node next;

//    Inisialisasi Node
    public Node(int nilai) {
        this.nilai = nilai;
    }

//    Setter dan Getter
    public void setNilai (int nilai) {
        this.nilai = nilai;
    }

    public int getNilai() {
        return nilai;
    }
    
    public void setNext (Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}