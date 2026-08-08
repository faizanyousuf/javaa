public class Inheritance{
    public static void main(String[] args){
        // Employee e = new Employee("faizan", 242);
        // e.display();
      
        Developer dev = new Developer("faizan", 324, "java");
        dev.show();

        // Executive exe = new Executive("mahkana", 342);
        // exe.makeExeDecision();

        CEO ceo = new CEO("Summaira", 224);
        ceo.makeExeDecision();
        ceo.leadCompany();

    }
}

class Employee{
  protected String name;
  protected int EmpId;
  public Employee(String name,int EmpId){
    this.name = name;
    this.EmpId = EmpId;
 }

 public void display(){
    System.out.printf("name: %s \nEmpId: %d \n",name,EmpId);
 }
}
class Developer extends Employee{
      private String progLanguage;
     
      Developer(String name, int EmpId, String progLang){
        super(name,EmpId);
        this.progLanguage = progLang; 
      }

      public void show (){
      System.out.printf("name: %s \n EmpId: %d\nProgLang: %s\n",name,EmpId,progLanguage);
      }
}

class Executive extends Employee{

    Executive(String name,int EmpId){
        super(name,EmpId);
    }

    public void makeExeDecision(){
        System.out.printf("%s:  is making a decision\n",name);
    }
}

class CEO extends Executive{

    CEO(String name,int EmpId){
     super(name,EmpId);
    }

    public void leadCompany(){
        System.out.printf("%s : is Leading the company\n",name);
    }
}