class Circle extends Figure {
    private double r;

    public Circle(double r) throws IllegalArgumentException {
        if (r <= 0) {
            throw new IllegalArgumentException("Invalid circle parameter");
        }
        this.r = r;
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }

    public double calculateCircumference() {
        double answer = 2*Math.PI*r;
        return answer;
    }
}