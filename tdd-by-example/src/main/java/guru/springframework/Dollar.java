package guru.springframework;

public class Dollar {
    int amout;

    public Dollar(int amount) {
        this.amout = amount;
    }

    public void times(int multiplier) {
        amout = amout * multiplier;
    }
}
