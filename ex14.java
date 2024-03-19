// 4) Napisz program obliczający wskaźnik masy ciała (BMI). BMI masa/wzrost

public class Ex14 {

    public static void main(String[] args) {
        final double weight = 40;
        final double heightInMeters = 1.5;
        final double BMI = Math.round((weight / (heightInMeters * heightInMeters)) * 10) / 10.0;

        if ((weight <= 0 || weight > 300 )|| (heightInMeters <= 0 || heightInMeters > 3)) {
            System.out.println("Podaj prawidłowe liczby");
        } else if (BMI > 0 && BMI < 18.5) {
            System.out.println("Twoje BMI to " + BMI + " Masz niedowagę");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("Twoje BMI to " + BMI + " Masz prawidłową wagę");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("Twoje BMI to " + BMI + " Masz nadwagę");
        } else if (BMI >= 30 && BMI < 35) {
            System.out.println("Twoje BMI to " + BMI + " Otyłość I stopnia");
        } else if (BMI >= 35 && BMI < 40) {
            System.out.println("Twoje BMI to " + BMI + " Otyłość II stopnia");
        } else if (BMI >= 40) {
            System.out.println("Twoje BMI to " + BMI + " Otyłość III stopnia");
        }
    }
}