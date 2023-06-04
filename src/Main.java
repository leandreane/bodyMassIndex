public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        double height = 1.83; // Рост человека в метрах
        int weight = 80; // Вес человека в килограммах

        var bmi = service.calculate(  height, weight);

        System.out.println(" Индекс массы тела "  +  bmi);


    }
}