import java.util.LinkedList;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
public class LinkedListPractice {
    public static void main(String[] args){


        List<Integer> list = new LinkedList<>();
        list.add(34);
        list.add(54);
        Collection<Integer> col = new ArrayList<Integer>();
        col.add(89);
        col.add(900);

        list.addAll(col);
        list.set(1,566);
        // ArrayList<Integer> l1 = list.clone();
        list.sort(null);
        System.out.println(list);

        int a = list.get(0);
        System.out.println(a);

    }
}

