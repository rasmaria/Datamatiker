package Triangle;

public class TriangleMain {
    public static void main(String[] args) {
Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

        double triangleAArea = triangleA.findArea();
        double triangleBArea = triangleB.findArea();

        System.out.println(triangleAArea);
        System.out.println(triangleBArea);

        System.out.println(triangleA.sideLenThree);
        System.out.println(triangleB.base);
        System.out.println(Triangle.numOfSides);
    }
}
