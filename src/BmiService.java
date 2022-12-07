public class BmiService {
    public double calculate(double mass, double hight) {
        double result = (mass / hight / hight);
        return result;
    }
}
