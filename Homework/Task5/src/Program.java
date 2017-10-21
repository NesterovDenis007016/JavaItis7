import java.util.Scanner;

public class Program {

    public static double integrateSin2xmidl(double a, double b, int n) {
        double result = 0;
        double deltaX = Math.abs(b - a) / n;
        for (double x = a; x <= b; x = x + 2 * deltaX) {
            result = result + ((deltaX)/3 * ( Math.sin(a) + 4 * Math.sin(a + deltaX) + Math.sin(a + 2 * deltaX))) * deltaX;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // границы инегрирования
        double a, b;

        // количество разбиений
        int n;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        n = scanner.nextInt();


        double result = integrateSin2xmidl(a, b, n);
        System.out.println(result);
    }
}
