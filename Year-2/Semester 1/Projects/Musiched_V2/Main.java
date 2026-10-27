import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        InMemorySongRepository songs = new InMemorySongRepository();

        Song song1 = new Song("Goodness Of God", "Bethel Music", MusicalKey.C);
        Song song2 = new Song("Living Hope", "Phil Wickham", MusicalKey.G);

        songs.save(song1);
        songs.save(song2);
        

        for (Song song : songs.findAll()) {
            song.displayInfo();
        }
        
    }
}