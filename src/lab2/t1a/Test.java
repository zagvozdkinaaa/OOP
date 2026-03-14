package lab2.t1a;

public class Test {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(4, 3);
        Sphere sphere = new Sphere(4);
        Cube cube = new Cube(4);

        System.out.println(cylinder.surfaceArea());
        System.out.println(sphere.surfaceArea());
        System.out.println(cube.surfaceArea());

        System.out.println(cylinder.volume());
        System.out.println(sphere.volume());
        System.out.println(cube.volume());
    }
}
