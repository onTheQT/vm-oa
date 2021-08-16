package shape;

public class Square extends Shape {
    private final Double side;

    public Square(Double side) {
        this.side = side;
    }

    @Override
    public Double area() {
        return this.side * this.side;
    }
}
