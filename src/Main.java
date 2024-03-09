public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double weight = 98;
        double hight = 1.87;
        int bmi = service.calculate(weight, hight);

        System.out.println(bmi);

    }
}
