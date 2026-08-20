import java.util.List;
import java.util.ArrayList;

class Musician {
    private String name;
    private int age;
    private List<Instrument> instrument;

    public Musician(String name, int age, List<Instrument> instrument) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty!");
        }

        if (age <= 8) {
            throw new IllegalArgumentException("Age must be older than 8");
        }

        if (instrument == null) {
            throw new IllegalArgumentException("Instrument cannot be null!");
        }

        this.name = name;
        this.age = age;
        this.instrument = new ArrayList<>(instrument);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Instrument> getInstrument() {
        return List.copyOf(instrument);
    }

    // Setters
    public void setName(String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty!");
        }

        this.name = name;
    }

    public void setAge(int age) {

        if (age <= 8) {
            throw new IllegalArgumentException("Age must be older than 8");
        }

        this.age = age;
    }

    public void setInstrument(List<Instrument> instrument) {

        if (instrument == null) {
            throw new IllegalArgumentException("Instrument cannot be null!");
        }

        this.instrument = new ArrayList<>(instrument);
    }

    @Override
    public String toString() { 

        StringBuilder sb = new StringBuilder();

        sb.append("\nName: " + name + "\nAge: " + age + "\nInstruments: ");

        for (Instrument instruments : instrument) {
            sb.append(instruments);
        }

        return sb.toString();
    }
}