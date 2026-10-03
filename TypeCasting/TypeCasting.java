    public class TypeCasting{

        public static void main(String[] args){
 

            // A obj1 = new A();
            // obj1.show();

            // A obj2 = new B();
            // obj2.show2();

            // A obj2 = new B();
            
            // B newObj = (B)obj2;
            // newObj.show2();

            // B obj = (B)new A();
            // obj.show2();


            String str = "13";
             int num = 232;

            //  String s = String.valueOf(num);
            //  System.out.println(s);
            // int num = String.valueOf(str);

          
        }
    }

    class A {

        void show(){
            System.out.println("in show A");
        }
    }

    class B extends A {

        void show2 (){
            System.out.println("in show B");
        }
    }