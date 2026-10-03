public class StackImplementationUsingLinkedList {
    public static void main(String[] args) {
      
    Stack<String> st = new Stack<>();
    st.push("mahkana");
    st.push("summaira");
    st.push("faizan");
    st.display();
    st.pop();
    st.display();
    
    }
}

class Stack<T> {
    Node top;
    private int size;

    Stack() {
        top  = null;
        size = 0;
    }

    void push(T element) {
        Node temp = new Node(element);
        temp.next = top;
        top = temp;
        size++;
    }

    void pop() {
        if(top == null){
        System.out.println("Stack is empty!");
        }else{
        top = top.next;
        size--;
        }
    }

    void display(){
        Node current = top;
        while(current != null){
            System.out.println("| "+ current.data+" |");
            current = current.next;
        }
        System.out.println(" ___________\n");
    }

    class Node {
        T data;
        Node next = null;
        Node(T data){
            this.data = data;
        }
    }
}
