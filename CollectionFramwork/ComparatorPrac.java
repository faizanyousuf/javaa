import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class ComparatorPrac {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(34);
        ArrayList<String> li  = new ArrayList<>();
        li.add("man");
        li.add("women");
        li.add("animal");
        li.add("aeroplane");
        li.add("house wife");
        li.add("tommorow");
        
        // li.sort(null);
        // Collections.sort(li);
        // Comparator<String> com = new Comparator<String>() {

        //     @Override
        //    public int compare(String a, String b){
        //             if(a.length() > b.length() ){
        //                    return 1;
        //             }
        //      return -1;
        //    }

        // };

        // Comparator<String> com2 = new Comparator<String>(){
        //     @Override
        //     public int compare(String a, String b){
        //             if(a.charAt(a.length()-1) > b.charAt(b.length()-1)){
        //                 return 1;
        //             }
        //             return -1;
        //     }
        // };
        // System.out.println(li);
        // // li.sort(com);
        // System.out.println(li);

        // String a = "apple";
        // // int in = a.charAt(a.length()-1);
        // // System.out.println(in);

        // li.sort(com2);
        // System.out.println(li);

         ArrayList<Student> students = new ArrayList<>();

         students.add(new Student(23,"faizan"));
        students.add(new Student(34,"danish"));
        students.add(new Student(22, "muheen"));
        students.add(new Student(27, "summaira"));
         
        Comparator<Student> com = new Comparator<Student>(){
            @Override
            public int compare(Student s1 , Student s2){
                if(s1.age > s2.age){
                    return -1;
                }
                return 1;
            }
        };
        System.out.println(students);
        students.sort(com);
        System.out.println(students);
    }
}

class Student{
    int age;
    String name;

    Student(int age , String name){
        this.age = age;
        this.name = name;
    }
  public String toString(){
    String detail = ("name: "+this.name+" age: "+this.age);
    return detail;
  }
}
