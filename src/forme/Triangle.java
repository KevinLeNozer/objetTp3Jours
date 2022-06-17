package forme;

public class Triangle implements Forme{

    private int c;
    private int b;

    public Triangle(int c, int b) {
        this.c = c;
        this.b = b;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Triangle{");
        sb.append("c=").append(c);
        sb.append(", b=").append(b);
        sb.append('}');
        return sb.toString();
    }
}
