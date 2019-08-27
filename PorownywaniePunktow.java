package matematyka;

import java.util.Scanner;

public class PorownywaniePunktow {

    static boolean rowne(Punkt p1, Punkt p2) {
        return ((p1.getX() == p2.getX()) && (p1.getY() == p2.getY()));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "cp1250");

        System.out.print("Podaj współrzędną x pierwszego punktu: ");
        double x1 = scanner.nextDouble();

        System.out.print("Podaj współrzędną y pierwszego punktu: ");
        double y1 = scanner.nextDouble();

        System.out.print("Podaj współrzędną x drugiego punktu: ");
        double x2 = scanner.nextDouble();

        System.out.print("Podaj współrzędną y drugiego punktu: ");
        double y2 = scanner.nextDouble();

        Punkt p1 = new Punkt(x1, y1);
        Punkt p2 = new Punkt(x2, y2);

        if (p1 == p2) {
            System.out.println("To jest ten sam punkt.");
        } else {
            System.out.println("To są dwa różne punkty.");
        }

        System.out.println("Poniżej wynik, gdy nie porównujemy za pomocą znaku '==' ");

        if (rowne(p1, p2)) {
            System.out.println("To jest ten sam punkt.");
        } else {
            System.out.println("To są dwa różne punkty.");
        }

    }

}
