import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        SongRepository repository = new InMemorySongRepository();

        Song song1 = new Song(
        "Goodness Of God",
        "Bethel Music",
                MusicalKey.C
        );

        Song song2 = new Song (
            "Mangha",
            "Bethel Tagalog",
            MusicalKey.A
        );


        repository.save(song1);
        repository.save(song2);


        Song selectedSong = repository.findById(song1.getId());
        Song selectedSong2 = repository.findById(song2.getId());

        WorshipSet sunday = new WorshipSet("Sunday Service", LocalDate.now().plusDays(5));
        WorshipSet sunday2 = new WorshipSet("October Praise", LocalDate.of(2026, 12, 25));

        sunday.addSetSongs(selectedSong, MusicalKey.D);
        sunday2.addSetSongs(selectedSong2, MusicalKey.A_Sharp);

        song1.displayInfo();
        song2.displayInfo();
        

        sunday.displaySet();
        sunday2.displaySet();



        
    }
}