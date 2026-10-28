// import java.util.List;
import java.time.LocalDate;
// import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        SongRepository repository = new InMemorySongRepository();
        SongService songService = new SongService(repository);

        Song song1 = songService.registerSong(
            "Goodness Of God",
            "Bethel Music",
            MusicalKey.C
        );

        Song song2 = songService.registerSong (
            "Mangha",
            "Bethel Tagalog",
            MusicalKey.A
        );

        Song selectedSong = songService.getSong(song1.getId());
        Song selectedSong1 = songService.getSong(song2.getId());


        WorshipSet concert = new WorshipSet("Concert", LocalDate.of(2026, 11, 1));

        concert.addSetSongs(selectedSong, MusicalKey.A);
        concert.addSetSongs(selectedSong1, MusicalKey.G);

        concert.displaySet();
        
        System.out.println(concert.containsSong(song1.getId()));
        concert.changeSongKey(song1.getId(), MusicalKey.B);
        
        concert.displaySet();
        
        concert.removeSong(song1.getId());
        
        concert.displaySet();



    }
}