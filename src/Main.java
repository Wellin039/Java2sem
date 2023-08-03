import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double aX, bX, cX, aY, bY, cY;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira os lados do triangulo X");
        aX = teclado.nextDouble();
        bX = teclado.nextDouble();
        cX = teclado.nextDouble();

        System.out.println("Insira os lados do triangulo Y");
        aY = teclado.nextDouble();
        bY = teclado.nextDouble();
        cY = teclado.nextDouble();

        double p = (aX + bX + cX) / 2;
        double areaX = Math.sqrt(p * (p - aX) * (p - bX) * (p - cX));

        double p2 = (aY + bY + cY) / 2;
        double areaY = Math.sqrt(p2 * (p2 - aY) * (p2 - bY) * (p2 - cY));

        System.out.printf("Area do triangulo X: %4f%n", areaX);
        System.out.printf("Area do triangulo Y: %4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("O triangulo X tem o maior lado");
        } else {
            System.out.println("O triangulo Y tem o maior lado");
        }

        teclado.close();
    }
}