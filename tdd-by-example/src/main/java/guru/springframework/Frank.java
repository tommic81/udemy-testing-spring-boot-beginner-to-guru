package guru.springframework;

public class Frank {
    private int amout;

    public Frank(int amount) {
        this.amout = amount;
    }

    public Frank times(int multiplier) {
        return new Frank(amout * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        Frank frank = (Frank) o;
        return amout == frank.amout;
    }
}
