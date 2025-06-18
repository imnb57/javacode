abstract class Instrument {
    abstract void playSound();
}

class Piano extends Instrument {
    @Override
    public void playSound() {
        System.out.println("Piano plays a soothing melody.");
    }
}

class Guitar extends Instrument {
    @Override
    public void playSound() {
        System.out.println("Guitar strums vibrant chords.");
    }
}

class Violin extends Instrument {
    @Override
    public void playSound() {
        System.out.println("Violin plays a graceful tune.");
    }

    
}
public class MainInstrument{
    public static void main(String[] args) {
        Instrument piano = new Piano();
        Instrument guitar = new Guitar();
        Instrument violin = new Violin();

        piano.playSound();
        guitar.playSound();
        violin.playSound();
    }
}
