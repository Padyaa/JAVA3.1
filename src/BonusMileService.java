public class BonusMileService {
    public int calculate(int price) {
        int miles = 20;
        int bonus = price / miles;

        return bonus;
    }
}
