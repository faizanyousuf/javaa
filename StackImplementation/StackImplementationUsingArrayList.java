import java.util.ArrayList;

public class StackImplementationUsingArrayList{
    public static void main(String[] args){
      
        Stack<Integer> st = new Stack<>(5);
        st.push(30);
        st.push(40);
        st.push(90);
        System.out.println(st.size());
        st.display();
        st.pop();
        st.display();
        int top = st.peek();
        System.out.println(top);
        System.out.println(st.isEmpty());
        System.out.println(st.size());


       
        Stack <String> st1 = new Stack<>(6);
        st1.push("faizan");
        st1.push("mahkana");
        st1.push("muheen");
        st1.display();

    }
}

class Stack<T>{
    private int size = 0;
    ArrayList<T> stack;

    Stack(int size){
     stack = new ArrayList<>(size);
    }
    
    void push(T element){
        stack.add(element);
        size++;
    }

    void pop(){
        if(stack.isEmpty() == true){
            System.out.println("Stack is Empty!");
        }else{
            stack.remove(stack.size()-1);
            size--;
        }
    }

    void display(){
        for(int i = stack.size()-1; i >= 0; i--){
            System.out.println("| "+ stack.get(i)+ " |");
        }
        System.out.println(" ____");
        System.out.println();
    }

    T peek(){
        return stack.getLast();
    }

    boolean isEmpty(){
       return (size == 0);
    }

    int size(){
        return size;
    }

}