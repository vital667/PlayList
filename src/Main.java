public class Main {

    public static void main(String[] args) {
PlayList playList = new PlayList("Main playlist");

playList.addTrack(new Movie("Casablanca"));
playList.addTrack(new Song("The Beatles","Yesterday"));

PlayList innerPlayList = new PlayList("SubPlayList");
innerPlayList.addTrack(new Movie("Killer"));
innerPlayList.addTrack(new Song("Metallica","Nothing Else Matter"));
innerPlayList.addTrack(new Movie("Santa Barbara"));

innerPlayList.setType(PlayListType.RANDOMLY);

playList.addTrack(innerPlayList);

playList.addTrack(new Movie("Casablanka"));

playList.play();


    }
}
