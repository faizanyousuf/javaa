import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class ArrayListPrac {
    public static void main(String[] args) {
        //int[] arr = new int[20]; fixed size array;
        ArrayListPrac arr = new ArrayListPrac();//Shows warning because of raw use of arralist, we need to mention the type.

        ArrayList<Integer> arr1 = new ArrayList<>();
        
        List<Integer> list = new ArrayList<>();

        arr1.add(20);
        arr1.add(30);
        arr1.add(50);
        System.out.println(arr1);
        list.add(300);
        list.addAll(0,arr1);
        System.out.println(list);
        list.addAll(arr1);
        System.out.println(list);

        list.add(2,4000);
                System.out.println(list);
       int size = list.size();
       System.out.println(size);
       System.out.println(list.isEmpty());

       ArrayList<Integer> li = new ArrayList<>();
       li.add(40);
       li.add(29);
        //int [] arr2 = {2,42,42,522,521,989};
        //li.addAll(arr2); because int[] is not a collection
        Integer[] arr2 = {3,5,52,5,62};
        System.out.println(li);
        li.addAll(Arrays.asList(arr2));
        System.out.println(li);

        boolean b = li.contains(5);
        boolean be = li.contains(2000);
        System.out.println(b+" ,"+be);

        System.out.println(li);
        int findex = li.indexOf(5);
        int lindex = li.lastIndexOf(5);
        System.out.printf("%d, %d\n",findex,lindex);
    }
}
