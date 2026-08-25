import java.util.List;
import java.util.ArrayList;

public class SetLibrary {
    private String label;
    private List<WorshipSet> sets;

    public SetLibrary(String label, List<WorshipSet> sets) {
        
        if (label == null || label.isBlank()) {
            throw new IllegalArgumentException("Label cannot be empty!");
        }
        
        if (sets == null) {
            throw new IllegalArgumentException("sets must not be null!");
        }
        
        this.label = label;
        this.sets = new ArrayList<>(sets); // defesive copying
    }

    public String getLabel() {
        return label;
    }

    public List<WorshipSet> getSets() {
        return List.copyOf(sets);
    }

    public void setLabel(String label) {

        if (label == null || label.isBlank()) {
            throw new IllegalArgumentException("Label cannot be empty!");
        }

        this.label = label;
    }

    public void setSets(List<WorshipSet> sets) {

        if (sets == null) {
            throw new IllegalArgumentException("sets must not be null!");
        }

        this.sets = new ArrayList<>(sets);
    }

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();

        sb.append("Label: " + label);

        for (int i = 0; i < sets.size(); i++) {
            sb.append((i+1) + ". ").append(sets.get(i) + "\n\n");
        }

        return sb.toString();
    }
}
