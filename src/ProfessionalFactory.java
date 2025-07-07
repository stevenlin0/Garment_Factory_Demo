// factory class to create professional tops, pants and shoes
class ProfessionalFactory implements GarmentFactory {
    public Tops createTop() { return new ProfessionalTops(); }
    public Pants createPant() { return new ProfessionalPants(); }
    public Shoes createShoes() { return new ProfessionalShoes(); }

    public String toString()
    {
        return "Professional";
    }
}