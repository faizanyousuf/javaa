//package Enums;



public class EnumTest {

    enum Laptop{
        Macbook(200,"2021"),Hp(200,"2024"),Dell(244,"2025");
        int price;
        String modelYear;
        Laptop(int price, String modelYear){
            this.price = price;
            this.modelYear = modelYear;
        }
    }
    public static void main(String[] args){
        System.out.println(Laptop.Hp.ordinal());
        Laptop l1 =  Laptop.Macbook;
        System.out.println(l1.price);
    }
}


