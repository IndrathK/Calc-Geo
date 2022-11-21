import java.util.Locale;
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        System.out.printf("Triangulo = %.3f%n ", (A * C) / 2);
        System.out.printf("Area do circulo = %.3f%n ", 3.14159 * C * C);
        System.out.printf("Area do trapezio = %.3f%n ", ((A + B) * C) / 2);
        System.out.printf("Area do quadrado = %.3f%n ", B * B);
        System.out.printf("Area do retangulo = %.3f%n ", A * B);


    sc.close();
    }
}
