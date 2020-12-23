package Listing02;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class Listing02_02 implements Serializable {
    private static final long serialVersionUID = -246430572668039614L;
    private int liczbaKalorii;
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public Listing02_02() {
        this(0);
    }
    public Listing02_02(int liczbaKalorii) {
        this.liczbaKalorii = liczbaKalorii;
    }

    public int getLiczbaKalorii() {
        return liczbaKalorii;
    }

    public synchronized void addPropertyChangeListener(PropertyChangeListener list1) {
        pcs.addPropertyChangeListener(list1);
    }

    public synchronized void removePropertyChangeListener(PropertyChangeListener list2) {
        pcs.removePropertyChangeListener(list2);
    }

    public synchronized void setLiczbaKalorii(int newLiczbaKalorii) {
        int oldValue = liczbaKalorii;
        liczbaKalorii = newLiczbaKalorii;
        pcs.firePropertyChange("zmiana liczby kalorii", Integer.valueOf(oldValue),
                Integer.valueOf(newLiczbaKalorii));
    }
}
