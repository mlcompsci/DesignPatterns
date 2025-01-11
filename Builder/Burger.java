package Builder;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    // Abstract Method waiting to be implemented
    public abstract float price();
}