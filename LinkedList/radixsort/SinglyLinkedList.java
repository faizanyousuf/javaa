package radixsort;
public class SinglyLinkedList {
    public static void main(String[] args) {

        SinglyLinked l1 = new SinglyLinked();
        // l1.addAtHead(45);
        // l1.size();
        // l1.display();
        // l1.addAtHead(45);
        // l1.addAtHead(64);
        // l1.addAtHead(89);
        l1.addAtTail(100);
        // l1.addListAtHead(arr);
        l1.addAtTail(200);
        // l1.display();
        // l1.size();
        // l1.delete(64);
        // l1.display();
        // l1.delete(100);
        // l1.delete(200);
        // l1.display();
        // l1.size();
        // l1.addAtHead(78);
        // l1.addAtTail(878);
        // l1.display();
        // l1.size();
        // l1.delete(799);
        // l1.addAtPosition(3, 500);
        // l1.addAtHead(data);
        // l1.addAtPosition(1, 19199);
        // l1.addAtPosition(8, 898989);
        // l1.size();
        l1.display();
        // l1.sort();
        l1.display();
        // l1.size();

    }
}

class Node {
    int data;
    Node next = null;

    Node(int data) {
        this.data = data;
    }
}

class SinglyLinked {
    private int size = 0;
    Node head = null;
    Node tail = null;

    void addAtHead(int data) {
        if (head == null) {
            head = new Node(data);
            size++;
        } else {
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            size++;
        }
    }

     void addListAtHead(int[] list){

        for(int i = 0; i < list.length; i++){
            addAtHead(list[i]);
        }
    }

    void addAtTail(int data) {
        if (head == null) {
            head = new Node(data);
            size++;
        } else {
            Node current = head;
            Node next = current.next;
            while (next != null) {
                current = next;
                next = current.next;
            }
            Node temp = new Node(data);
            current.next = temp;   
            size++;
        }
    }

    void delete(int element) {
        
        boolean deleted = false;
        if(head == null){
      System.out.println("Nothing to Delete!");
        }else if(head.data == element) {
            head = head.next;
            deleted = true;
            size--;
        } else {
            Node current = head;
            Node previous;
            Node next = current.next;
            while (next != null) {
                previous = current;
                current = next;
                next = current.next;
                if (current.data == element) {
                    previous.next = current.next;
                    deleted = true;
                    size--;
                    break;
                }
            }
        }
        if(!deleted){
        System.out.println("the element was not found!");
        }
    }

    void display() {
        if (head == null) {
            System.out.println("LinkedList is Empty!");
        } else {
            Node current = head;
            Node next;
            do {
                System.out.print(current.data + " ");
                next = current.next;
                current = next;
            } while (next != null);
            System.out.println();
        }
    }

    void size() {
        // if (head == null) {
        //     System.out.println("The size of the LinkedList is : 0");
        // } else {
        //     int count = 1;
        //     Node current = head;
        //     Node next = current.next;
        //     while (next != null) {
        //         count++;
        //         current = next;
        //         next = current.next;
        //     }
        //     System.out.println("The size of the LinkedList is : " + count);
        // }
        System.out.println("the size of the linkedList is : "+ size);
    }

    void addAtPosition(int position,int data){

        if(position >= 1 && position <= size + 1){
           if(position == 1){
            addAtHead(data);
           }else if(position == size + 1){
            addAtTail(data);
           }else{
            
            Node current = head;
            Node previous = current;
            for(int i = 1; i < position;i++){
                previous = current;
                current = current.next;
            }
            previous.next = new Node(data);
            previous.next.next = current;
            size++;
           }
        }
    }

    void sort(){

        Node pointer = head;
        // Node current = pointer.next;


       while(pointer != null){
       Node current = pointer.next;
          while(current != null){
              if(current.data < head.data){
                Node temp  = new Node(current.data);
                pointer.next = current.next;
                temp.next = head;
                head = temp;
            }
            current = current.next;
              pointer = pointer.next;
          }
       }



    }

}