public class Circle extends Shape{
    private double r;

    public Circle(double r){
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.r;
    }

    @Override
    public double area() {
        return Math.PI * this.r * this.r;
    }
}
