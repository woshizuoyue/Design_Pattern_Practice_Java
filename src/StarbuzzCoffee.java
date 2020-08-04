public class StarbuzzCoffee {
    public static void main(String[] args){

        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescripiton() + " $" + beverage1.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescripiton() + " $" + beverage2.cost());
    }
}
