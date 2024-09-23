package guru.springframework;

public abstract class Money {
    protected int amout;

    public abstract Money times(int multiplier);

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money frank(int amount) {
        return new Frank(amount);
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amout == money.amout
                && getClass().equals(money.getClass());
    }
}
