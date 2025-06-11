// 6. You are developing a media player application. There is a base class called MediaPlayer, which has methods like play(), pause(), and stop(). The VideoPlayer class inherits from MediaPlayer and adds methods like rewind() and fastForward(). Additionally, there is an interface called Playlist, which defines methods like addSong() and removeSong(). The VideoPlayer class implements the Playlist interface. Implement the classes and demonstrate inheritance with interface by creating objects of the VideoPlayer class and calling its methods as well as the interface methods.

abstract class MediaPlayer {
    abstract void play();
    abstract void pause();
    abstract void stop();

    
}
interface Playlist{
    void addSong();
    void removeSong();
}
class VideoPlayer extends MediaPlayer implements Playlist{
    public void rewind(){
        System.out.println("rewind");

    }
    public void fastForward(){
        System.out.println("fast forward");

    }
    @Override
    public void addSong() {
        System.out.println("add song");
       
    }
    @Override
    public void removeSong() {
        System.out.println("remove song");
        
    }
    @Override
    void play() {
        System.out.println("play media");
        
    }
    @Override
    void pause() {
        System.out.println("pause media");
        
    }
    @Override
    void stop() {
        System.out.println("stop media");
        
    }
    public static void main(String[] args) {
        VideoPlayer v1 = new VideoPlayer();
        v1.play();
        v1.pause();
        v1.stop();
        v1.removeSong();
        v1.addSong();
        v1.fastForward();
        v1.rewind();

    }
}

