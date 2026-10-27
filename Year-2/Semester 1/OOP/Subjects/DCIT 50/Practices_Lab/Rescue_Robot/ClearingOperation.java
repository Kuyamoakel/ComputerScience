public class ClearingOperation extends Operation{
    private int clearingPower;

    public ClearingOperation(String name, int batteryCost, int clearingPower) {
        super(name, batteryCost);
        this.clearingPower = clearingPower;
    }

    public int getClearingPower() {
        return clearingPower;
    }

    public void setClearingPower(int clearingPower) {
        this.clearingPower = clearingPower;
    }

   
    @Override
    public void execute(RescueRobot robot, RescueSite site) {

        if (robot.getBattery() < getBatteryCost()) {
            System.out.println("Not Enough Battery");
            return;
        }

        System.out.println("Robot executed " + super.getName() + "!");
        System.out.println("Removed " + clearingPower + " rubble.");

        robot.spendBattery(super.getBatteryCost());
        site.removeRubble(clearingPower);
    }

    @Override 
    public void printDetails() {
        System.out.println("----- CLEARING OPERATION -----");
        System.out.println("Name: " + super.getName());
        System.out.println("Battery Cost: " + super.getBatteryCost());
        System.out.println("Clearing Power: " + clearingPower);
        System.out.println("------------------------------");
    }
    
}
