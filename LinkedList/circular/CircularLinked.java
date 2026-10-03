package circular;

public class CircularLinked {
    public static void main(String[] args) {
        Circular c1 = new Circular();
        c1.addAtHead(45);
        c1.addAtHead(52);
        c1.addAtTail(355);
        c1.addAtHead(89);
        c1.addAtHead(34);
        c1.addAtTail(466);
        c1.display();
    
    }
}

class Circular {

    Node head = null;
    Node tail = null;
    private int size = 0;


    void addAtHead(int data){

       if(head == null){
        head = new Node(data);
        head.next = head;
        tail = head;
       }else{
        Node temp = new Node(data);
        temp.next = head;
        tail.next = temp;
        head = temp;
       }
    }

    void addAtTail(int data){

         if(tail == null){
            tail = new Node(data);
            tail.next = tail;
            head = tail;
         }else{

      Node temp = new Node(data);
           tail.next = temp;
           temp.next = head;
           tail = temp;
         }
    }

    void display(){
        Node current = head;

        do { 
            System.out.print(current.data+" ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
}
