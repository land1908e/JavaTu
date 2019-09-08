package Song;

public abstract class Audio {
    String name;
    String type;    ////the loai
    int duration;   ////thoi luong
    String quality; ///chat luong

    abstract void play();

    void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Duration: " + duration);
        System.out.println("Quality: " + quality);
    }
}

