// driver class to test the Abstract Factory Pattern
public class GarmentMakerSimulator {
    public static void main(String[] args) {
        simulate("Professional", new ProfessionalFactory());
        simulate("Casual", new CasualFactory());
        simulate("Party", new PartyFactory());
    }

    // this method simulates the process of a concrete garment making class (which implements garment factory interface)
    // in producing its own products
    public static void simulate(String type, GarmentFactory factory) {
        System.out.println("Garments for " + factory.toString() + ":");
        System.out.println("- " + factory.createTop().getDescription());
        System.out.println("- " + factory.createPant().getDescription());
        System.out.println("- " + factory.createShoes().getDescription());
        System.out.println();
    }
}