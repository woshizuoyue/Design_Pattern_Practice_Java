package Design_Test;

public class Oristrch implements Flyable {

    Flybility fb = new Flybility();
    @Override
    public void fly() {
        fb.fly();
    }

    public int evaluate(String expression){

        int sum = 0;

        for(String summand : expression.split("\\+"))
            sum += Integer.valueOf(summand);

        return sum;
    }
}
