package Latihan;

public class AeroPlan extends Vehicle {
    public void walk() {
        System.out.println("Aeroplan is Flying");
    }
    
    public void fuel() {
        System.out.println("Bensin Penuh!!");
    }
    
    public static void main (String [] args){
        AeroPlan gagak = new AeroPlan();
        gagak.function();
        gagak.fuel();
        gagak.walk();
    }
}
