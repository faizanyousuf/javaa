package doubly;
public class DoublyLinkedList {
    public static void main(String[] args) {
        
        DoublyLinked d1 = new DoublyLinked();
        d1.addAthead(46);
        d1.addAthead(78);
        d1.addAthead(67);
        d1.addAthead(89);
        d1.addAtTail(890);
        d1.displayForward();
        d1.displayBackward();
        d1.size();
    }
}

class DoublyLinked{
         
    Node head = null;
    Node tail = null;

    private int size = 0;

  void  addAthead(int data){
        
    if(head == null){
        head = new Node(data);
        tail = head;
        size++;
    }else{
        Node temp = new Node(data);
        temp.next = head;
        head.prev = temp;
        head = temp;
        size++;
    }

  }

  void addAtTail(int data){
    if(tail == null){
        tail = new Node(data);
        head = tail;
        size++;
    }else{
        Node temp = new Node(data);
        temp.prev = tail;
        tail.next = temp;
        tail = temp;
        size++;
    }
  }

  void displayForward(){
    Node current = head;
    while(current != null){
        System.out.print(current.data+" ");
        current = current.next;
    }
    System.out.println();
  }

  void displayBackward(){
    Node current = tail;
    while(current != null){
        System.out.print(current.data+" ");
        current = current.prev;
    }
    System.out.println();
  }

  void size(){
    System.out.println("The size of the Given Doubly LinkedList is : "+size);
  }

    class Node {
    int data;
    Node next = null;
    Node prev = null;

    Node(int data){
        this.data = data;
    }
}
}


