package Song;

public class Song extends Audio {
    String artis;
    String album;

    @Override
    void play() {
        System.out.println("Play Song.....");
    }

    @Override
    void showInfo() {
        super.showInfo(); ////super---goi den lop cha
        System.out.println("artis: " + artis);
        System.out.println("album: " + album);
    }
}
