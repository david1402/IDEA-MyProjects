public class Ice extends Decorator {

    private static int AMOUNT_COST = 3;

    public Ice ( Costable beverage){
        super(beverage);
    }

    public int cost(){
        return beverage.cost() + AMOUNT_COST;
    }
}
