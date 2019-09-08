package Song;

public class Main {
    public static void main(String[] args) {
        Song song = new Song(); ////tạo đối tượng mới
        song.name = "Name 1";
        updateName(song);
        System.out.println("Name: " + song.name);
//        Video video = new Video();
//        song.showInfo();
//
//        song.name = "Ngo The Tu";
//        video.name = "Video 1" ;
//        System.out.println("name of song: " + song.name);
//        System.out.println("video of song: " + video.name);
    }
    public static void updateName(Song testSong){
        testSong.name = "Test";
    }
}
