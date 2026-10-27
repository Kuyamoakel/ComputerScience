public class HeavyOperation extends Operation {
    private int clearingPower;
    private int durabilityCost;

    public HeavyOperation(String name, int batteryCost, int clearingPower, int durabilityCost) {
        super(name, batteryCost);
        this.clearingPower = clearingPower;
        this.durabilityCost = durabilityCost;
    }
    public int getClearingPower() {
        return clearingPower;
    }
    public void setClearingPower(int clearingPower) {
        this.clearingPower = clearingPower;
    }
    public int getDurabilityCost() {
        return durabilityCost;
    }
    public void setDurabilityCost(int durabilityCost) {
        this.durabilityCost = durabilityCost;
    }

    
    @Override
    public void execute(RescueRobot robot, RescueSite site) {

        if (robot.getBattery() < getBatteryCost()) {
            System.out.println("Not Enough Battery");
            return;
        }

        System.out.println("Robot execited " + super.getName() + "!");
        System.out.println("Removed " + clearingPower + " rubble.");
        System.out.println("Robot Took " + durabilityCost + " durability damage.");

        robot.takeDamage(durabilityCost);
        robot.spendBattery(super.getBatteryCost());
        site.removeRubble(clearingPower);
    }

    @Override 
    public void printDetails() {
        System.out.println("----- CLEARING OPERATION -----");
        System.out.println("Name: " + super.getName());
        System.out.println("Battery Cost: " + super.getBatteryCost());
        System.out.println("Clearing Power: " + clearingPower);
        System.out.println("Durability Cost: " + durabilityCost);
        System.out.println("------------------------------");
    }
    
    
    
}
