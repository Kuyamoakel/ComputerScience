public class Instrument {
    String name;
    String type;

    public Instrument(String name, String type) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be empty!");
        }

        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException("Type must not be empty!");
        }

        this.name = name;
        this.type = type;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    // Setters

    public void setName(String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be empty!");
        }
        this.name = name;
    }

    public void setType(String type) {

        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException("Type must not be empty!");
        }
        this.type = type;
    }

    @Override
    public String toString() {
        return "\n - " + name + " (" + type + ")";
    }
}