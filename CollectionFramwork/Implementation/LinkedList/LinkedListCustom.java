     import java.util.List; import java.util.ArrayList;
    public class LinkedListCustom{
        public static void main(String[] args){
               ArrayList<Integer> li = new ArrayList<>();
               li.add(45);
               li.add(89);
               li.add(800);
            LinkedListCus list = new LinkedListCus(li);
            // list.display();
            list.addLast(452);
            // list.display();

            list.addFirst(9092);
            // list.display();
            // System.out.println(list.size);

            // LinkedListCus list2 = new LinkedListCus();
            // list2.addFirst(323);
            // list2.display();
            // System.out.println(list2.size);

            list.add(3,35242);
            // list.display();
            // System.out.println(list.size);

                        list.add(0,5743);
                        list.display();
                   System.out.println(list.size);

               
                   list.remove(45);
                   list.remove(5743);
                   list.remove(452);
                   list.display();

                   System.out.println(list.size);
            


        }
    }

    class LinkedListCus{
      
        Node head;
        int size = 0;
public LinkedListCus(){

}
    public LinkedListCus(ArrayList<Integer> size) {
          for(int val : size){
            addLast(val);
          }
    }

    public void addLast(int data){
         Node node = new Node(data);
           if(head == null){
            head = node;
            size++;
           }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = node;
            size++;
           }
    }

    public int remove(int data){
         Node prev = head;
            while(head.data == data){
                head = head.next;
                size--;
            }
            while(prev.next != null){
                if(prev.next.data == data){
                    prev.next = prev.next.next;
                    size--;
                }
                if(prev.next != null){
                prev = prev.next;
                }
            }
            
         
        return 1;
    }
    public void addFirst(int data){
        Node node = new Node(data);

        Node temp = head;
        head = node;
        head.next = temp;
        size++;
    }

    public void add(int index, int data){

        if(index < 0 || index > size ){
            System.out.println("Enter valid index");
        }else{
           
        if(index == 0){
            addFirst(data);
        }else{
            Node node = new Node(data);
            Node prev = head;
            for(int i = 0; i < index -2; i++){
                prev = prev.next;
            }
            Node current = prev.next;
            prev.next = node;
            node.next = current;
            size++;
        }
    }
    }

    public void display(){
              
        Node current = head;
        while(current != null){
            System.out.print(current.data+ " ");
            current = current.next;
        }
        System.out.println();
    }


    class Node {
       int data;
       Node next;
       Node(int data){
        this.data = data;
       }
    }
    }