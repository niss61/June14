abstract class ShapeQ4 {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class CircleQ4 extends ShapeQ4 {
    double radius;
    CircleQ4(double radius) {
        this.radius = radius;
    }
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class RectangleQ4 extends ShapeQ4 {
    double length, width;
    RectangleQ4(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double calculateArea() {
        return length * width;
    }
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class TriangleQ4 extends ShapeQ4 {
    double a, b, c;
    TriangleQ4(double a, double b, double c) {
        this.a = a; this.b = b; this.c = c;
    }
    double calculateArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    double calculatePerimeter() {
        return a + b + c;
    }
}

public class ShapeHierarchyDemo {
    public static void main(String[] args) {
        ShapeQ4 circle = new CircleQ4(5);
        ShapeQ4 rectangle = new RectangleQ4(4, 6);
        ShapeQ4 triangle = new TriangleQ4(3, 4, 5);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());
    }
}