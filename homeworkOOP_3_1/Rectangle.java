class Rectangle extends Figure {
    private double a, b;

    public Rectangle(double a, double b) throws IllegalArgumentException {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Invalid rectangle parameters");
        }
        this.a = a;
        this.b = b;
    }

    public double getPerimeter() {
        return 2 * (a + b);
    }

    public double getArea() {
        return a * b;
    }
    public String toString() {
        return String.format("%s\nArea: %.2f\nPerimeter: %.2f", getClass().getSimpleName(), getArea(), getPerimeter());
    }
}