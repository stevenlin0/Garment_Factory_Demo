// factory class to create tops, pants and shoes for casual
class CasualFactory implements GarmentFactory {
    public Tops createTop() { return new CasualTops(); }
    public Pants createPant() { return new CasualPants(); }
    public Shoes createShoes() { return new CasualShoes(); }

    public String toString()
    {
        return "Casual";
    }
}