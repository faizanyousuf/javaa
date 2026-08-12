package Implementation.ArrayList;
public class ArrayListImple{
    public static void main(String[] args){

        ArrayListCustom array = new ArrayListCustom();
        array.add(4);
        array.add(8);
        array.add(89);
        array.display();
        array.printCapacity();
        array.add(7);
        array.printCapacity();
        array.display();
    }
}

class ArrayListCustom{
    Integer [] arr;
    private int size;
    private int capacity;

    ArrayListCustom(){
        arr = new Integer[10];
        this.size = 0;
        this.capacity = 10;
    }
    ArrayListCustom(int initialCapacity){
        arr = new Integer[initialCapacity];
        this.size = 0;
        this.capacity = initialCapacity;
    }

    void add(Integer a){
        if(size == capacity){
            Integer[] temp = arr;
            arr = new Integer[(int)(this.capacity*1.5)]; 
            this.capacity = ((int)(capacity*1.5));
           for(int i = 0; i < size; i++){
                arr[i] = temp[i];
           }
        }
        arr[size] = a;
        size++;
    }

    //display

    void display(){
        System.out.print("[");
        for(int i = 0; i < this.size; i++){
            System.out.printf(" %d,",arr[i]);
        }
        System.out.println("]");
    }

    void printCapacity(){
        System.out.println("Capacity : "+ this.capacity);
    }

} 