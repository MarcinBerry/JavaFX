package Listing02;

public class Listing02_02Main {
    public static void main(String[] args) {
        Listing02_02 smok = new Listing02_02();
        smok.addPropertyChangeListener(evt -> {
            Integer newValue = (Integer) evt.getNewValue();
            System.out.println(newValue);
        });
        for(int i = 0; i < 11; i++)
            smok.setLiczbaKalorii(i*1000);
    }
}
