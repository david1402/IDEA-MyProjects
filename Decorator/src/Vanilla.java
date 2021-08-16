public class Vanilla extends Decorator {
    private static int AMOUNT_COST = 1;

    public Vanilla(Costable beverage ){
        super(beverage);
    }
    public int cost(){
        return beverage.cost()+AMOUNT_COST;
    }
}

