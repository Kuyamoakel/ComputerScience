import java.util.*;

public class OperationPool {
    private ArrayList<Operation> operations;
    private Random random;
    
    public OperationPool() {
        this.operations = new ArrayList<>();;
        this.random = new Random();

        operations.add(new ClearingOperation("Sweep Debris", 1, 10));
        operations.add(new ClearingOperation("Lift Concrete", 2, 20));
        operations.add(new ClearingOperation("Drill Passage", 3, 35));
        operations.add(new ClearingOperation("Push Rocks", 1, 12));
        operations.add(new ClearingOperation("Cut Steel",2, 15));

        operations.add(new MaintenanceOperation("Solar Recharge", 0, 0, 3));
        operations.add(new MaintenanceOperation("Solar Recharge", 2, 15, 0));
        operations.add(new MaintenanceOperation("Solar Recharge", 5, 30, 0));
        operations.add(new MaintenanceOperation("Solar Recharge", 2, 10, 2));
        operations.add(new MaintenanceOperation("Solar Recharge", 1, 0, 5));

        operations.add(new HeavyOperation("Hydraulic Smah", 3, 40, 15));
        operations.add(new HeavyOperation("Hydraulic Smah", 5, 60, 25));
        operations.add(new HeavyOperation("Hydraulic Smah", 3,50, 35));
    }
    
    public Operation getRandomOperation() {
        return operations.get(random.nextInt(operations.size()));
    }
}