import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double a, cm;

        System.out.println("Escreva os metros");
        a = sc.nextDouble();

        cm = a*100;

        System.out.println("O resultado é " + cm);
    }
}
