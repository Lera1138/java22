public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMetr = 1.95;
        int weightKg = 50;
        double index = (int) (service.calculate(heightMetr, weightKg));
        System.out.println("Инедкс массы тела = " + index);


//результат 13.0

    }
}