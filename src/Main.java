public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(77, 1.77);
        System.out.println(bmi);

    }
}