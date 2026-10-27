public class RescueSite {
    private String name;
    private int rubble;

    public RescueSite(String name, int rubble) {
        this.name = name;
        this.rubble = rubble;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRubble() {
        return rubble;
    }

    public void setRubble(int rubble) {
        this.rubble = rubble;
    }

    // methods

    public void removeRubble(int amount) {
        rubble = Math.max(0, rubble - amount);
    }

    public boolean isCleared() {
        return rubble <= 0;
    }
}
