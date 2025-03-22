package DecoratorPattern;

public interface Coffee
{
    int cost();
}

class SimpleCoffee implements Coffee {
    @Override
    public int cost() {
        return 5;
    }
}


class ColdCoffee implements Coffee {
    @Override
    public int cost() {
        return 20;
    }
}

class CoffeeDecorator implements Coffee{

    Coffee coffee;

    CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return coffee.cost();
    }
}

class Milk extends CoffeeDecorator {

    Milk(Coffee coffee) {
        super(coffee);
    }

    public int cost() {
        return super.cost() + 5;
    }

}

class Sugar extends CoffeeDecorator {

    Sugar(Coffee coffee) {
        super(coffee);
    }
    public int cost() {
        return super.cost() + 2;
    }

}
class Main{
    public static void main(String[] args) {

        System.out.println("------ for simple coffee-------");

        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.cost());
        System.out.println("------ With Milk-------");
        coffee = new Milk(coffee);
        System.out.println(coffee.cost());
        System.out.println("------ With Sugar-------");
        coffee = new Sugar(coffee);
        System.out.println(coffee.cost());

        System.out.println("------ for Cold coffee-------");
        coffee = new ColdCoffee();
        System.out.println(coffee.cost());
        System.out.println("------ With Milk-------");
        coffee = new Milk(coffee);
        System.out.println(coffee.cost());
        System.out.println("------ With Sugar-------");
        coffee = new Sugar(coffee);
        System.out.println(coffee.cost());


    }
}
