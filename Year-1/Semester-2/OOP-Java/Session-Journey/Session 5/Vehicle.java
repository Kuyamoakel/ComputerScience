abstract class Vehicle {
    private int fuelLevel;

    // constructor
    public Vehicle(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    // setter
    public void setFuel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    // getter
    public int getFuel() {
        return fuelLevel;
    }

    public abstract void start();

    public void stop() {
        System.out.println("The Vehicle Stop!");
    }

    public void displayFuel () {
        System.out.println("FuelLevel " + fuelLevel + "%");
    }
} 

class Car extends Vehicle {
    public Car(int fuelLevel) {
        super(fuelLevel);
    }

    @Override
    public void start() {
        System.out.println("The Car is turning on, Rowr!!!");
        displayFuel();
    }
}

class Truck extends Vehicle {
    public Truck(int fuelLevel) {
        super(fuelLevel);
    }

    @Override
    public void start(){
        System.out.println("The Truck is Turning on it's Engine!");
        displayFuel();
    }
}

class Bike extends Vehicle {
    public Bike(int fuelLevel) {
        super(fuelLevel);
    }
    @Override
    public void start() {
        System.out.println("The Engine of the Bike is Getting Angry!");
        displayFuel();
    }
}

class Main {
    public static void main(String[] args) {
        
        Vehicle car = new Car(65);
        Vehicle truck = new Truck(80);
        Vehicle bike = new Bike(90);

        car.start();
        truck.start();
        bike.start();

        car.stop();
        truck.stop();
        bike.stop();
    }
}