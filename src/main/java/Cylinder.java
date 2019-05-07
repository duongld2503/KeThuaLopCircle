public class Cylinder extends Circle {
    private double heigh;

    public Cylinder(double radius, String color, double heigh) {
        super(radius, color);
        this.heigh = heigh;
    }

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }

    public double getVolume(double radius, double heigh) {
        return super.getArea(radius)*heigh;
    }

    @Override
    public String toString() {
        return "Cylinder with radius: " + this.getRadius()
                + " heigh: " + this.getHeigh()
                +" volume " + getVolume(this.getRadius(),this.getHeigh())
                +" is subclass of: " + super.toString();
    }
}
