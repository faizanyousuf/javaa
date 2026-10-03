// package doublycircular;
public class DoublyCircular{
    public static void main(String[] args) {
         DoublyCir dc1 = new DoublyCir();
         int[] arr = {32,35,34,5634,5,5634,56,45,57};
         dc1.addAtHead(arr);
         dc1.display();
         dc1.displayStartFrom(4);
    }
}

class Node {
    int data;
    Node next = null;
    Node prev = null;

    Node (int data){
        this.data = data;
    }
}

class DoublyCir{
      Node head = null;
      Node tail = null;

      void addAtHead(int data){
        if(head == null){
            head = new Node(data);
            tail = head;
            head.next = head;
            head.prev = head;
       }else{
        Node temp = new Node(data);
        temp.next = head;
        head.prev = temp;
        tail.next = temp;
        temp.prev = tail;
        head = temp;
       }
      }

      void addAtHead(int[] arr){
        for(int i = 0; i < arr.length;i++){
            addAtHead(arr[i]);
        }
      }

     void display(){
        Node current = head;
        do{
            System.out.print(current.data+" ");
            current = current.next;
        }while(current != head);
        System.out.println();
     }

     void displayStartFrom(int data){
        for(int i = 1;i < data; i++){
            head = head.next;
        }
        display();
     }

}