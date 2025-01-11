package Builder;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }
    @Override
    // Abstract Method
    public abstract float price();
}