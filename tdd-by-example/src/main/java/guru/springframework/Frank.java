package guru.springframework;

public class Frank extends Money{

    public Frank(int amount) {
        this.amout = amount;
    }

    public Frank times(int multiplier) {
        return new Frank(amout * multiplier);
    }
}
