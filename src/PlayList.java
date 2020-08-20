import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayList implements Playable {

    private String name;
    private PlayListType type;
    private List<Playable> tracks = new ArrayList<>();


    public PlayList(String name) {
        type = PlayListType.SEQUENCE;
        this.name = name;
    }


    public void addTrack(Playable track) {
        tracks.add(track);
    }


    public void setType(PlayListType type) {
        this.type = type;
    }


    public String getName() {
        return name;
    }


    @Override
    public void play() {
        System.out.println("***** Playlist \"" + getName() + "\": (Type:" + type + ")");
        switch (type) {
            case SEQUENCE:
                playSequence();
                System.out.println("*****_______________");
                break;
            case RANDOMLY:
                playRandomly();
                System.out.println("*****_______________");
                break;
            case LOOP:
                playLoop();
                System.out.println("*****_______________");
                break;
        }
    }


    private void playSequence() {
        for (Playable track : tracks)
            track.play();
    }


    private void playRandomly() {
        List<Playable> tracksRandom = tracks;
        Collections.shuffle(tracksRandom);
        for (Playable track : tracksRandom)
            track.play();
    }


    private void playLoop() {
        for (int i = 0; i < 10; i++) {
            for (Playable track : tracks)
                track.play();
        }
    }
}
