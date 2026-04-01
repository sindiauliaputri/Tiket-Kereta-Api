package Model;

public abstract class Kereta {

    protected String namaKereta;

    public Kereta(String namaKereta) {
        this.namaKereta = namaKereta;
    }

    public abstract void jenisKereta();
}