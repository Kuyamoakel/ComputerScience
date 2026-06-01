import java.util.ArrayList;

public class Studyhour {
    ArrayList<Record> record = new ArrayList<>();

    public void insertWork(String topic, String category, int hours) {
        Record newRecord = new Record(topic, category, hours);
        record.add(newRecord);
    }

    public void viewWork() {
        for (Record records : record){
            System.out.println(records);
        }
    }
}