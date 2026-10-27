public abstract class Operation {
    private String name;
    private int batteryCost;

    public Operation(String name, int batteryCost) {
        this.name = name;
        setBatteryCost(batteryCost);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getBatteryCost() {
        return batteryCost;
    }

    public void setBatteryCost(int batteryCost) {

        if (batteryCost < 0) {
            throw new IllegalArgumentException("Battery Cost must not be negative");
        }
        this.batteryCost = batteryCost;
    }

    // methods
    public abstract void execute(RescueRobot robot, RescueSite site);
    public abstract void printDetails();
}
