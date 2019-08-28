package matematyka;

import java.util.Scanner;

public class PrzesuniecieOdcinka {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "cp1250");
        
        System.out.print("Podaj pierwszą współrzędną punktu a: ");
        double x1 = scanner.nextDouble();
        
        System.out.print("Podaj drugą współrzędną punktu a: ");
        double y1 = scanner.nextDouble();
        
        System.out.print("Podaj pierwszą współrzędną punktu b: ");
        double x2 = scanner.nextDouble();
        
        System.out.print("Podaj pierwszą współrzędną punktu b: ");
        double y2 = scanner.nextDouble();
        
        Punkt a = new Punkt(x1,y1);
        Punkt b = new Punkt(x2,y2);
        
        System.out.println("Punkt a: " + a);
        
        System.out.println("Punkt: " + b);
      
        Odcinek odc = new Odcinek(a,b);
        
        System.out.println("Odcinek o końcach w punktach a i b: " + odc);
        
        odc.przesun((b.getX()-a.getX()), (b.getY()-a.getY()));
        
        System.out.println("Odcinek przesunięty tak, aby jego początek był w punkcie b: " + odc);
        
        System.out.println("Czy pierwszy koniec przesuniętego odcinka jest równy punktowi b? " + odc.getPoczatek().rowny(b));
    }
    
}
