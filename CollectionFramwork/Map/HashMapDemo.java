import java.util.HashMap;
 import java.util.Map;
 import java.util.Set;
public class HashMapDemo{
    public static void main(String[] args) {
        

        Map<Integer,String> map = new HashMap<>();
        // map.(101,"faizan");
        map.put(101,"faizan");
        map.put(102, "mahkana");
        map.put(103,"muheen");

        System.out.println(map);
        System.out.println(map.get(103));
        System.out.println(map);

        System.out.println(map.containsKey(103));
        System.out.println(map.containsValue("Faizan".toLowerCase()));

        Set<Integer> list = map.keySet();
        System.out.println(list);

        for(int i : list){
            System.out.println(map.get(i));
        }

    Set<Map.Entry<Integer,String>>  entries = map.entrySet();
    System.out.println(entries);
    }
}