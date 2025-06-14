abstract class Draw {
    abstract double calculateVolume();
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Cube extends Draw {
    double side;
    Cube(double side) { this.side = side; }
    double calculateVolume() { return side * side * side; }
    double calculateArea() { return 6 * side * side; }
    double calculatePerimeter() { return 12 * side; }
}

class Cuboid extends Draw {
    double l, w, h;
    Cuboid(double l, double w, double h) { this.l = l; this.w = w; this.h = h; }
    double calculateVolume() { return l * w * h; }
    double calculateArea() { return 2 * (l*w + w*h + h*l); }
    double calculatePerimeter() { return 4 * (l + w + h); }
}

class Cylinder extends Draw {
    double r, h;
    Cylinder(double r, double h) { this.r = r; this.h = h; }
    double calculateVolume() { return Math.PI * r * r * h; }
    double calculateArea() { return 2 * Math.PI * r * (r + h); }
    double calculatePerimeter() { return 2 * Math.PI * r; }
}

public class DrawDemo {
    public static void main(String[] args) {
        Draw cube = new Cube(5);
        Draw cuboid = new Cuboid(4, 3, 2);
        Draw cylinder = new Cylinder(3, 6);
        System.out.println(cube.calculateVolume());
        System.out.println(cube.calculateArea());
        System.out.println(cube.calculatePerimeter());
        System.out.println(cuboid.calculateVolume());
        System.out.println(cuboid.calculateArea());
        System.out.println(cuboid.calculatePerimeter());
        System.out.println(cylinder.calculateVolume());
        System.out.println(cylinder.calculateArea());
        System.out.println(cylinder.calculatePerimeter());
    }
}