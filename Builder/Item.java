package Builder;

public interface Item {
    // An item waiting to be implemented has these three characteristics.
    public String name();
    public Packing packing();
    public float price();
}