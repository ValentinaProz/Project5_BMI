public class BmiService {

    public int calculate(double weightKg, double hightM) {
        double result = weightKg / (hightM * hightM);
        int bmi = (int) result;
        return bmi;
    }
}
