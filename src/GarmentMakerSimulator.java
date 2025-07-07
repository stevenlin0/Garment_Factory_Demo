/*
This Java project simulates themed garment sets—tops, pants, and shoes—using the Abstract Factory design pattern.
It ensures only matching items (e.g., Professional, Casual, Party) are grouped together.
The design supports easy extension without modifying existing code.
 */

// driver class to test the Abstract Factory Pattern
public class GarmentMakerSimulator {
    public static void main(String[] args) {
        simulate(new ProfessionalFactory());
        simulate(new CasualFactory());
        simulate(new PartyFactory());
    }

    // this method simulates the process of a concrete garment making class (which implements garment factory interface)
    // in producing its own products
    public static void simulate(GarmentFactory factory) {
        System.out.println("Garments for " + factory.toString() + ":");
        System.out.println("- " + factory.createTop().getDescription());  //create top
        System.out.println("- " + factory.createPant().getDescription());  //create pant
        System.out.println("- " + factory.createShoes().getDescription());  //create shoes
        System.out.println();
    }
}