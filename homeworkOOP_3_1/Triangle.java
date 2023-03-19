class Triangle extends Figure {
private double a, b, c;

public Triangle(double a, double b, double c) throws IllegalArgumentException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Invalid triangle parameters");
        }
        if (a + b <=c|| b+c<=a||c<=0) {
            throw new IllegalArgumentException("Triangle inequality does not hold");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        }

        public static boolean isValid(double a, double b, double c) {
                return a + b > c && a + c > b && b + c > a;
        }

        public double getPerimeter() {
        return a + b + c;
        }

        public double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
        @Override
        public String toString() {
                return String.format("%s\nArea: %.2f\nPerimeter: %.2f", getClass().getSimpleName(), getArea(), getPerimeter());
        }
}