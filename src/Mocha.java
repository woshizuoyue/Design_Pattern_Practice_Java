public class Mocha extends CondimentDecorator{
    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescripiton() + ", Mocha";
    }

    @Override
    public double cost() {
        return .4 + beverage.cost();
    }
}
