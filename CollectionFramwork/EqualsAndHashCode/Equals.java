// package EqualsAndHashCode;

public class Equals {
    public static void main(String[] args){

           Student s1 = new Student("faizan",25,2025);
           Student s2 = new Student("mahkana", 23, 2025);

        // Student s2 = s1;

           System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode()+ "\n"+ s2.hashCode());
    }
}

class Student{
    String name;
    int age;
    int RollNo;

    Student(String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.RollNo = rollNo;
    }

     @Override
    public boolean equals(Object obj){

        if(this == obj){
            return true;
        }
        Student other = (Student) obj;
         
        if(this.RollNo == other.RollNo){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode(){
        
        return this.age;
    }


}
