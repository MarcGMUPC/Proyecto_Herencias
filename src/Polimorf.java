public class Polimorf {
}

public class Figura() {
    public double lado1;
    public double lado2;
    public double r;


}

public class Rectangle extends Figura{

    private double l1;
    private double l2;

    public Rectangle () {

    }
    public Rectangle(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public double area() { return this.l1 * this.l2; }

    public static double suma (Figura[] v) {
        double ret = 0;
        for (Figura f: v) {
            ret+= f.area();
        }
        return ret;
    }

}

public static void main(String[] args) {
    Figura[] v = new Figura[3];

    Figura f = new Cercle(=5);
}