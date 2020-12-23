package Listing02;

import java.io.Serializable;

public class Listing02_01 implements Serializable {
    private static final long serialVersionUID = 306122450520221444L;
    private int liczbaKalorii;

    public Listing02_01() {
        this(0);
    }
    public Listing02_01(int liczbaKalorii) {
        this.liczbaKalorii = liczbaKalorii;
    }

    public int getLiczbaKalorii() {
        return liczbaKalorii;
    }

    public void setLiczbaKalorii(int liczbaKalorii) {
        this.liczbaKalorii = liczbaKalorii;
    }
}
