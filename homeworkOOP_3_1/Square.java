class Square extends Figure {
    private double a;

    public Square(double a) throws IllegalArgumentException {
        if (a <= 0) {
            throw new IllegalArgumentException("Invalid square parameter");
        }
        this.a = a;
    }

    public double getPerimeter() {
        return 4 * a;
    }

    public double getArea() {
        return a * a;
    }
    @Override
    public String toString() {
        return String.format("Square\nArea: %.2f\nPerimeter: %.2f\n", getArea(), getPerimeter());
    }
}