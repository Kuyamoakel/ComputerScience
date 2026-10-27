import java.util.*;

public class MissionController {
    private ArrayList<Operation> missionPlan;

    public MissionController() {
        this.missionPlan = new ArrayList<>();
    }

    public void prepareMission(OperationPool pool, int numberOfOperations) {
        for (int i = 0; i < numberOfOperations; i++) {
            missionPlan.add(pool.getRandomOperation());
        }
    }

    public void executeMission(RescueRobot robot, RescueSite site) {

        int startingRumbble = site.getRubble();
        int successful = 0;
        int skip = 0;

        System.out.println("----- RESCUE MISSION BEGINS -----");
        System.out.println("Site: " + site.getName());
        System.out.println("Robot | Durability: " + robot.getDurability() + " | Battery: " + robot.getBattery());
        System.out.println("Remaining Rubble: " + site.getRubble());

        while (!missionPlan.isEmpty()) {
            if (robot.getDurability() <= 0 || site.isCleared()) {
                break;
            }

            Operation mission = missionPlan.remove(0);
            mission.printDetails();

            if (robot.getBattery() < mission.getBatteryCost()) {
                System.out.println("Not Enough Battery");
                skip++;
                continue;
            }

            successful++;
            mission.execute(robot, site);
        }

        System.out.println("\n----- MISSION FINISHED -----");
        System.out.println("Robot Final Status -> Durability: " + robot.getDurability() + " | Battery: " + robot.getBattery());
        System.out.println("Remaining Rubble: " + site.getRubble());
        System.out.println("Total Rubble Removed: " + (startingRumbble - site.getRubble()));
        System.out.println("Succesful Operations: " + successful);
        System.out.println("SKipped Operations: " + skip);

        if (site.isCleared() && robot.getDurability() != 0) {
            System.out.println("MISSION COMPLETE");
        } else if (robot.getDurability() <= 0){
            System.out.println("MISSION INCOMPLETE: Robot disabled.");
        } else {
            System.out.println("Mission INCOMPLETE: Operations exhausted.");
        }
    }
}