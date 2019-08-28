package matematyka;

public class Odcinek {

    private Punkt poczatek;
    private Punkt koniec;

    public Odcinek(Punkt p1, Punkt p2) {
        this.poczatek = new Punkt(p1);
        this.koniec = new Punkt(p2);
    }

    public Odcinek(Odcinek o) {
        this.poczatek = new Punkt(o.poczatek);
        this.koniec = new Punkt(o.koniec);
    }

    public void przesun(double dx, double dy) {
        this.poczatek.przesun(dx, dy);
        this.koniec.przesun(dx, dy);

    }

    public boolean rowne(Odcinek odc) {
        return (this.poczatek.rowny(odc.poczatek) && this.koniec.rowny(odc.koniec))
                || (this.poczatek.rowny(odc.koniec) && this.koniec.rowny(odc.poczatek));
    }

    public Punkt getPoczatek() {
        return new Punkt(poczatek);
    }

    public Punkt getKoniec() {
        return new Punkt(koniec);
    }

    public void setPoczatek(Punkt poczatek) {
        this.poczatek = new Punkt(poczatek);
    }

    public void setKoniec(Punkt koniec) {
        this.koniec = new Punkt(koniec);
    }

    @Override
    public String toString() {
        return "(" + this.poczatek + "," + this.koniec + ")";
    }

    public Odcinek kopia() {
        return new Odcinek(this);
    }
}
