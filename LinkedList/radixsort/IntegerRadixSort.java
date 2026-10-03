package radixsort;

public class IntegerRadixSort {
    public static void main(String[] args) {
               
         int[] arr = {453,636,366,356,3466,3466,346,346,346,3434,344,344,775};
        // int[] arr = {34,56,75,74,84};
         
         SinglyLinked l1 = new SinglyLinked();
        l1.addListAtHead(arr);
        System.out.println(".................................Original Array......................\n");
        l1.display();
        SinglyLinked[] buckets = new SinglyLinked[10];
        for(int i = 0; i < buckets.length; i++){
            buckets[i] = new SinglyLinked();
        }

       int maxElement = max(arr);
    //    System.out.println(maxElement);
       for(int expo = 1; maxElement/expo > 0; expo *=10 ){
           for(int i = 0; i < arr.length; i++){
                 int index = (arr[i]/expo)%10;
               buckets[index].addAtTail(arr[i]);
           }
              int k = 0;
           for(SinglyLinked bucket : buckets){
                 Node current = bucket.head;

                 while(current != null){
                    arr[k] = current.data;
                    current = current.next;
                    bucket.head = current;
                    k++;
                 }
                 
           }
       }
      System.out.println(".................................Sorted Array.......................\n");
       for(int i = 0; i< arr.length; i++){
        System.out.print(arr[i]+ " ");
       }
       System.out.println();
        




    }

    static int max(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
