

public abstract class Decorator implements Costable {

    protected Costable beverage;

    public Decorator (Costable beverage){
        super();
        this.beverage=beverage;
    }
    public abstract int cost();
}
