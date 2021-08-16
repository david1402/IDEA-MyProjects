public class MainDrink {
    public static void main(String[] args) {
// in original program without these interim variables
    Costable coffee = new Coffee() ;
    Costable coffeeIce = new Ice(coffee);
    Costable vanillavanilla = new Vanilla(new Vanilla(coffeeIce));
    Costable coffeeIcevanillaIce =  new Ice (vanillavanilla);

        int costen = new Ice(coffee).cost();

    System.out.println("Coffee costs "+coffee.cost());
    System.out.println("Coffee with ice costs "+costen);
    System.out.println("Coffee with ice and vanilla and ice and vanilla costs "+coffeeIcevanillaIce.cost());

}}
