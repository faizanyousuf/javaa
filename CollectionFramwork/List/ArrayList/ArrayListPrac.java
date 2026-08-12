package List.ArrayList;
import java.util.ArrayList;
import java.util.List;
public class ArrayListPrac {
    public static void main(String[] args) {
        int[] arr = new int[20]; //fixed size array;
        arr[0]=49;
        arr[1]= 28;
        arr[2] =300;
    //     ArrayListPrac arr = new ArrayListPrac();//Shows warning because of raw use of arralist, we need to mention the type.

    //     ArrayList<Integer> arr1 = new ArrayList<>();
        
    //     List<Integer> list = new ArrayList<>();

    //     arr1.add(20);
    //     arr1.add(30);
    //     arr1.add(50);
    //     System.out.println(arr1);
    //     list.add(300);
    //     list.addAll(0,arr1);
    //     System.out.println(list);
    //     list.addAll(arr1);
    //     System.out.println(list);

    //     list.add(2,4000);
    //             System.out.println(list);
    //    int size = list.size();
    //    System.out.println(size);
    //    System.out.println(list.isEmpty());

    //    ArrayList<Integer> li = new ArrayList<>();
    //    li.add(40);
    //    li.add(29);
    //     //int [] arr2 = {2,42,42,522,521,989};
    //     //li.addAll(arr2); because int[] is not a collection
    //     Integer[] arr2 = {3,5,52,5,62};
    //     System.out.println(li);
        // li.addAll(Arrays.asList(arr2));
    //     System.out.println(li);

    //     boolean b = li.contains(5);
    //     boolean be = li.contains(2000);
    //     System.out.println(b+" ,"+be);

    //     System.out.println(li);
    //     int findex = li.indexOf(5);
    //     int lindex = li.lastIndexOf(5);
    //     System.out.printf("%d, %d\n",findex,lindex);

    //     System.out.println(li.set(4,500));
    //     System.out.println(li);

    //     // int item = li.set(6,800);
    //     Integer item = li.set(6,900);
    //     System.out.println(item);
    //     System.out.println(li);

    ArrayList<Integer> list = new ArrayList<>();
    list.add(45);
    list.add(80);
    list.add(42);

    list.sort(null);
    
    System.out.println(list);
     List<Integer> li = new ArrayList<>();
     li.add(45);
     li.add(80);
    //  li.add(990);
    boolean b = list.containsAll(li);
    System.out.println(b);

    Object[] arr1 =  list.toArray();
    for(Object val : arr1){
        System.out.println(val);
    }
    System.out.println(arr1);
    }
}
