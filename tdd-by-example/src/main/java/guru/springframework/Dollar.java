package guru.springframework;

public class Dollar {
    int amout;

    public Dollar(int amount) {
        this.amout = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amout * multiplier);
    }
}
