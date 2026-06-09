abstract class Food {
    
    abstract void prepare();
    abstract double getPrice();
    abstract String getName();

    void order() {
        System.out.println("Food Ordered!");
    }

    void serve() {
        System.out.println("Food Served!");
    }
}

class Burger extends Food {

    @Override
    public void prepare() {
        System.out.println("Preparing Burger...");
    }

    @Override
    public double getPrice() {
        return 75.0;
    }

    @Override
    public String getName() {
        return "Burger";
    }
}

class Spaghetti extends Food {

    @Override
    public void prepare() {
        System.out.println("Preparing Spaghetti...");
    }
    
    @Override
    public double getPrice() {
        return 90.0;
    }

    @Override
    public String getName() {
        return "Spaghetti";
    }
}

class Alaking extends Food {

    @Override
    public void prepare() {
        System.out.println("Preparing Alaking...");
    }

    @Override
    public double getPrice() {
        return 110.0;
    }

    @Override
    public String getName() {
        return "Alaking";
    }
}

class Fries extends Food {

    @Override
    public void prepare() {
        System.out.println("Preparing Fries...");
    }

    @Override
    public double getPrice() {
        return 100.0;
    }

    @Override
    public String getName() {
        return "Fries";
    }
}

public class Restaurant {
    public static void main(String[] args) {


        Food[] foods = {
            new Burger(),
            new Spaghetti(),
            new Alaking(),
            new Fries()
        };

        for (Food food : foods) {
            System.out.println("Food: " + food.getName());
            System.out.println("Food Price: ₱" + food.getPrice());
            food.order();
            food.prepare();
            food.serve();
            System.out.println();
        }
    }
}