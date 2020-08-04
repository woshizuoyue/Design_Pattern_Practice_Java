public class Whip extends CondimentDecorator{
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescripiton() + ", Whip";
    }

    @Override
    public double cost() {
        return .6 + beverage.cost();
    }
}
