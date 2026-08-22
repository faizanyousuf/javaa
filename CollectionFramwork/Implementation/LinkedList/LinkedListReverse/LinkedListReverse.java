// package LinkedListReverse;
import java.util.LinkedList;
public class LinkedListReverse {
    public static void main(String[] args){
       
        // CustomLinkedList list = new CustomLinkedList();
        // list.add(23);
        // // list.add(352);
        // // list.add(21);
        // list.display();

        // list.reverse();
        // list.display();

        // LinkedList<Integer> li = new LinkedList<>();

        // li.add(24);
        // li.add(45);
        // li.add(65);

        NodeList node1 = new NodeList(4);
        NodeList node2 = new NodeList(35,node1);

        System.out.println(node2.next.val);


    }
    
}

class CustomLinkedList{

    int size;
    Node head;

    void add(int a){
           Node node = new Node(a);
            if(head == null){
                head = node;
            }else{
                Node current = head;
               while(current.next != null){
                    current = current.next;
               }
               current.next = new Node(a);
            }
    }

    void display(){
          if(head == null){
            System.out.println("Empty!");
          }else{
            Node current = head;
            while(current != null){
                System.out.print(current.data+" ");
                current = current.next;
            }
            System.out.println();
          }
    }

    void reverse(){

        Node current = head; 
        Node prev = null;

        while(current != null){
            Node temp = current;
            current = current.next;
            temp.next = prev;
            prev = temp;
        }
        head = prev;
    }


    class Node{
        int data;
        Node next;
        Node(int data){
        this.data = data;
        }
    }
}

class NodeList{
    int val;
    NodeList next;
    NodeList(){}
    NodeList(int val){
        this.val = val;
    }
    NodeList(int val,NodeList next){
        this.val = val;
        this.next = next;
    }
}
