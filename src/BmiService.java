import java.lang.module.FindException;

public class BmiService {
    public double calculate(double heightMetr, int weightKg) {
        double bmi = weightKg / Math.pow(heightMetr, 2);
        return bmi;


    }
}

