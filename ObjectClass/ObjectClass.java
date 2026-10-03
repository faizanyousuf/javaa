    public class ObjectClass{

        public static void main(String[] args){
              Laptop l = new Laptop();
              l.model = "lenovo";
              l.price = 100000;

              Laptop l1 = new Laptop();
               l1.model = "lenovo";
               l1.price = 100000;
            
               System.out.println(l.hashCode());
             System.out.println(l1.hashCode());

             
            System.out.println(l.equals(l1));
            
        }
    }

    class Laptop{
         String model;
         int price;


         public boolean equals(Object that){
              
             Laptop obj = (Laptop)that;
             if(this.model.equals(obj.model)){
                return true;
             }
             else{
                return false;
             }
         }

         public int hashCode(){

             return this.price;
         }
    }