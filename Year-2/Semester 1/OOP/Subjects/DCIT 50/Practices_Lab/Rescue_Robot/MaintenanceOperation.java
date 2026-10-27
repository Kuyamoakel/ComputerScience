public class MaintenanceOperation extends Operation{ 
    private int repairAmount;
    private int batteryRestore;

    public MaintenanceOperation(String name, int batteryCost, int repairAmount, int batteryRestore) {
        super(name, batteryCost);
        this.repairAmount = repairAmount;
        this.batteryRestore = batteryRestore;
    }

    public int getRepairAmount() {
        return repairAmount;
    }

    public void setRepairAmount(int repairAmount) {
        this.repairAmount = repairAmount;
    }

    public int getBatteryRestore() {
        return batteryRestore;
    }

    public void setBatteryRestore(int batteryRestore) {
        this.batteryRestore = batteryRestore;
    }

    @Override
    public void execute(RescueRobot robot, RescueSite site) {

        if (robot.getBattery() < getBatteryCost()) {
            System.out.println("Not Enough Battery");
            return;
        }

        System.out.println("Robot executed " + super.getName() + "!");
        System.out.println("Repaired " + repairAmount + " durability.");
        System.out.println("Restored " + batteryRestore + " battery.");

        robot.spendBattery(super.getBatteryCost());
        robot.recharge(batteryRestore);
        robot.repair(repairAmount);
    }

    @Override 
    public void printDetails() {
        System.out.println("----- MAINTENANCE OPERATION -----");
        System.out.println("Name: " + super.getName());
        System.out.println("Battery Cost: " + super.getBatteryCost());
        System.out.println("Repair Amount: " + repairAmount);
        System.out.println("Battery Restore: " + batteryRestore);
        System.out.println("------------------------------");
    }
    
    
}
