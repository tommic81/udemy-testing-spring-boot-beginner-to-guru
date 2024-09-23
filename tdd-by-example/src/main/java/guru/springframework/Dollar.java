package guru.springframework;

public class Dollar extends Money{


    public Dollar(int amount) {
        this.amout = amount;
    }

    public Money times(int multiplier) {
        return new Dollar(amout * multiplier);
    }
}
