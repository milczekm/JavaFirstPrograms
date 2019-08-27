package matematyka;

public class MaksymalnaZPieciu {

    public static void main(String[] args) {

        System.out.println(max5(4, 66, 7, 8, 9));

    }

    static int max5(int a, int b, int c, int d, int e) {
        return Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);
    }

}
