package guru.springframework;

public class Money {
    protected int amout;

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amout == money.amout
                && getClass().equals(money.getClass());
    }
}
