package forme;

public class Triangle implements Forme{

    private int c;
    private int b;

    public Triangle(int c, int b) {
        this.setC(c);
        this.setB(b);
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double calculAir() {
        return (c * b)/2f;
    }

}
