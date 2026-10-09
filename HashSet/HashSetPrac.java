import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class HashSetPrac {
    public static void main(String[] args) {
        Set <Integer> set = new HashSet<>();
        List <Integer> list = new ArrayList<>();
        list.add(20);
        list.add(42);
        list.add(244);
        set.add(30);
        set.add(24);
        set.add(54);
        Object[] arr = set.toArray();

        set.remove(30);

//        for(Object obj : arr){
//            System.out.println(obj);
//        }
//        System.out.println(set.contains(30));

        Set<Integer> set2 = new HashSet<>();
        set2.addAll(list);
//        System.out.println(set2);


         Iterator<Integer> itr = set.iterator();

         while(itr.hasNext()){
//             System.out.print(itr.next().hashCode()+" ");
             int token = itr.next();
             token = token*10;
             System.out.println(token);
         }

        System.out.println(set);

//        System.out.println(set.equals(set2));
//        System.out.println(set.hashCode()+" "+ set2.hashCode());


//        System.out.println(set);
    }
}