// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.LinkedList;
public class BucketSort {
    public static void main(String[] args) {

        int[] arr = { 45, 35, 25, 35, 25, 52, 42, 45, 45, 10, 9, 4, 29 };
        //  int[] arr = {9,4,6,7,8,2,3};

        // int maxValue = 100;
        // int range = 10;
        // int numOfBuckets = maxValue / range;
        // ArrayList<LinkedList<Integer>> buckets = new ArrayList<>(numOfBuckets);
        // for (int i = 0; i < maxValue / range; i++) {
        //     buckets.add(new LinkedList<>());
        // }
        // // inserting data................................
        // for (int value : arr) {
        //     int index = value / 10;
        //     buckets.get(index).add(value);
        // }

        // // sorting each bucket.................................
        // for (LinkedList<Integer> bucket : buckets) {

        //     Collections.sort(bucket);

        // }

        // for (int i = 0; i < numOfBuckets; i++) {
        //     for (int value : buckets.get(i)) {
        //         System.out.print(value + " ");
        //     }
        // }
        // System.out.println();


        // bucket sort using user defined methods Linked List............
        SinglyLink s1 = new SinglyLink();
        // s1.addAtHead(45);
        // s1.display();
        s1.addListAtHead(arr);
        s1.display();
 
        SinglyLink[] buckets = new SinglyLink[max(arr)+1];
        for(int i = 0;i < buckets.length; i++){
            buckets[i] = new SinglyLink();
        }
       // Adding elements to Buckets
        for(int i = 0;i < arr.length; i++){
            buckets[arr[i]].addAtHead(arr[i]);
        }
        
        int k = 0;

        for(SinglyLink bucket : buckets){
             Node head = bucket.head;
            Node current  = head;
          while(current != null){
            arr[k] = current.data;
            current = current.next;
            k++;
          }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }

   static int max(int[] arr){
         int max = arr[0];
             for(int i = 1;i < arr.length;i++){
                if(arr[i] > max){
                    max = arr[i];
                }
             }
         return max;
    }
}

class SinglyLink {

    Node head = null;
    private int size = 0;

    void addAtHead(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    void addListAtHead(int[] list){

        for(int i = 0; i < list.length; i++){
            addAtHead(list[i]);
        }
    }

    void display() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data+" ---> ");
            current = current.next;
        }
        System.out.println();
    }
}

class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }