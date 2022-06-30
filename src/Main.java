public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();

        double p = service.calculate(1.7,78);
        if (p > 25) {
            System.out.println("Булочки под запретом!");
        } else {
            System.out.println("Все в норме!");
        }
    }
}
