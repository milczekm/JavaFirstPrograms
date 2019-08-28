package matematyka;

public class PorownywanieOdcinkowIKol {

    static boolean rowne(Punkt p1, Punkt p2) {
        return ((p1.getX() == p2.getX()) && (p1.getY() == p2.getY()));
    }

    static boolean rowne(Kolo k1, Kolo k2) {
        return ((k1.getPromien() == k2.getPromien()) && rowne(k1.getSrodek(), k2.getSrodek()));
    }

    static boolean rowne(Odcinek odc1, Odcinek odc2) {
        return ((rowne(odc1.getPoczatek(), odc2.getPoczatek()) && rowne(odc1.getKoniec(), odc2.getKoniec()))
                || (rowne(odc1.getKoniec(), odc2.getPoczatek()) && rowne(odc1.getPoczatek(), odc2.getKoniec())));
    }

    public static void main(String[] args) {

        Punkt p1 = new Punkt(3, 4);
        Punkt p2 = new Punkt(3, 4);
        Punkt p3 = new Punkt(3, 8);
        Punkt p4 = new Punkt(4, 6);
        Punkt p5 = new Punkt(8, 8);
        Punkt p6 = new Punkt(3, 4);
        Punkt p7 = new Punkt(4, 6);
        Punkt p8 = new Punkt(4, 6);

        double promien1 = 4;
        double promien2 = 4;
        double promien3 = 5;
        double promien4 = 9;

        Kolo k1 = new Kolo(p1, promien1);
        Kolo k2 = new Kolo(p2, promien2);
        Kolo k3 = new Kolo(p3, promien3);
        Kolo k4 = new Kolo(p4, promien4);

        System.out.println("Koła k1 i k2 są równe: " + rowne(k1, k2));
        System.out.println("Koła k3 i k4 są równe: " + rowne(k3, k4));

        Odcinek o1 = new Odcinek(p1, p3);
        Odcinek o2 = new Odcinek(p2, p4);
        Odcinek o3 = new Odcinek(p1, p7);
        Odcinek o4 = new Odcinek(p2, p8);

        System.out.println("Odcinki o1 i o2 są równe: " + rowne(o1, o2));
        System.out.println("Odcinki o3 i o4 są równe: " + rowne(o3, o4));

        System.out.println("Odcinki o1 i o4 są równe: " + o1.rowne(o4));
        System.out.println("Odcinki o3 i o2 są równe: " + o3.rowne(o2));

    }

}
