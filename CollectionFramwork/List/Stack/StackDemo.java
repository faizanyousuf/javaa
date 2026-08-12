import java.util.Stack;
public class StackDemo {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<Integer>();

        st.add(45);
        st.add(89);
        st.add(352);
        System.out.println(st);
        st.pop();
        System.out.println(st);

        System.out.println(st.contains(45));
       int index = st.search(45);
       System.out.println(index);
    }
}
