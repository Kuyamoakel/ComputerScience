public class RescueRobot {
    private int durability;
    private int battery;

    public RescueRobot(int durability, int battery) {
        this.durability = durability;
        this.battery = battery;
    }

    public int getDurability() {
        return durability;
    }

    public int getBattery() {
        return battery;
    }

    // methods
    public void takeDamage(int amount) {
        durability = Math.max(0, durability - amount);
    } 

    public void repair(int amount) {
        durability += amount;
    }

    public void spendBattery(int amount) {
        battery = Math.max(0, battery - amount);
    }

    public void recharge(int amount) {
        battery += amount;
    }
    
}
