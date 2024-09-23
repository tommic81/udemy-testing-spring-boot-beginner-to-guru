package guru.springframework;

public class Dollar {
    private int amout;

    public Dollar(int amount) {
        this.amout = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amout * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        Dollar dollar = (Dollar) o;
        return amout == dollar.amout;
    }

}
