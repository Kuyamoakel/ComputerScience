public class Main {
    public static void main(String[] args) {
        
        RescueRobot robot = new RescueRobot(50, 5);
        RescueSite rescuesite = new RescueSite("Collapse Tunnel", 100);

        OperationPool pool = new OperationPool();

        MissionController mc = new MissionController();

        mc.prepareMission(pool, 5);
        mc.executeMission(robot, rescuesite);
    }
}
