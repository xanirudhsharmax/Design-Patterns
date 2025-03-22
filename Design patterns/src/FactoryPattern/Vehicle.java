package FactoryPattern;


public interface Vehicle {
    public void drive();
}

class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("I am driving a car");
    }
}

class Bike implements Vehicle {

    @Override
    public void drive() {
        System.out.println("I am driving a bike");
    }
}

class factory {
    public static Vehicle getVehicle(String name){
        if (name.equals("car")){
            return new Car();
        }else if(name.equals("bike")){
            return new Bike();
        }else{
            throw new RuntimeException("no vehicle found with name" + name);
        }
    }
}

class Main {
    public static void main(String[] args) {

        Vehicle car = factory.getVehicle("car");
        car.drive();

        Vehicle bike  = factory.getVehicle("bike");
        bike.drive();
    }
}