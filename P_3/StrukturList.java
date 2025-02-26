package P_3;

public class StrukturList {
    private Node HEAD; // Deklarasi HEAD

    public StrukturList() {
        this.HEAD = null; // Inisialisasi HEAD sebagai null
    }

    public boolean isEmpty() {
        return HEAD == null; // Mengembalikan true jika list kosong
    }

    	public void addTail(int data) {
    	    Node newNode = new Node(data);

    	    if (isEmpty()) {
    	        HEAD = newNode;
    	    } else {
    	        Node curNode = HEAD;

    	        while (curNode.getNext() != null) {
    	            curNode = curNode.getNext();
    	        }

    	        curNode.setNext(newNode);
    	    }
    	}
    
//    Latihan 4
    public void displayElement() {
    	Node curNode = HEAD;
    	while (curNode != null) {
    		System.out.print(curNode.getData() + " ");
    		curNode = curNode.getNext();
    	}
    }
    
//    Latihan 5
    public void addHead(int data) {
    	Node newNode = new Node(data);
    	if (isEmpty()) {
    		HEAD = newNode;
    	} else {
    		newNode.setNext(HEAD);
    		HEAD = newNode;
    	}
    }
}
