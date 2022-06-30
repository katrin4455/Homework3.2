public class BmiService {

    public double calculate (double growth, double weight) {

        double Bmi = weight / (growth * growth);

        return Bmi;
    }
}
