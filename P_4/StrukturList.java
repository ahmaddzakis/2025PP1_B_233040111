package P_4;

public class StrukturList {
    private Node HEAD; // Deklarasi HEAD

    public StrukturList() {
        this.HEAD = null; // Inisialisasi HEAD sebagai null
    }

    public boolean isEmpty() {
        return HEAD == null; // Mengembalikan true jika list kosong
    }

    public void addTail(double data) {
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
    public void addHead(double data) {
    	Node newNode = new Node(data);
    	if (isEmpty()) {
    		HEAD = newNode;
    	} else {
    		newNode.setNext(HEAD);
    		HEAD = newNode;
    	}
    }
    
    public void addMid(double data, int position) {
   	 Node posNode = null, curNode = null;
   	 int i = 0;
   	 Node newNode = new Node(data);
   	 
   	 if (HEAD == null) {
   		 HEAD = newNode;
   	 } else {
   		 curNode = HEAD;
   		 if (position == 1) {
   			 newNode.setNext(curNode);
   			 HEAD = newNode;
   		 } else {
   			i = 1;
   			 while(curNode != null && i < position) {
   				 posNode = curNode;
   				 curNode = curNode.getNext();
   				 i++;
   			 }
   			 posNode.setNext(newNode);
   			 newNode.setNext(curNode);
   		 }
   	  }
    }
}
