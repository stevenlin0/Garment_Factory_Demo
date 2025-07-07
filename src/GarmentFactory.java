// garment factory interface to create implementation for any type of garment factory
// which will produce tops, pants and shoes for any occasion
public interface GarmentFactory {
    Tops createTop();
    Pants createPant();
    Shoes createShoes();

    String toString();
}