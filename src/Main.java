public class Main {
    public static void main(String[] args) {
        BonusMileService service = new BonusMileService();

        int bonus = service.calculate(2350);
        System.out.println(bonus);

        int MinValuesBonus = service.calculate(20);
        System.out.println(MinValuesBonus);
    }
}
