// factory class to create tops, pants and shoes for party
class PartyFactory implements GarmentFactory {
    public Tops createTop() { return new PartyTops(); }
    public Pants createPant() { return new PartyPants(); }
    public Shoes createShoes() { return new PartyShoes(); }

    public String toString()
    {
        return "Party";
    }
}