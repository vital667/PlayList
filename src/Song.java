public class Song implements Playable {

    private String author;
    private String name;

    public Song(String author, String name) {
        this.author = author;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println("Play song: " + author + " \"" + name + "\"");
    }
}
