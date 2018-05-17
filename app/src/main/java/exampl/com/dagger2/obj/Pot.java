package exampl.com.dagger2.obj;

public class Pot {
    private Flower flower;

    public Pot(Flower flower) {
       this.flower = flower;
    }

    public String show() {
        return flower.whisper();
    }
}
