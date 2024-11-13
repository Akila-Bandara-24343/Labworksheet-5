public class MathOperations {
    private static double pi = 3.14159;

    public static double getPi() {
        return pi;
    }

    public static void setPi(double pi) {
        MathOperations.pi = pi;
    }

    static double calculateCircleArea(double radius){
        double area = pi * radius * radius;
        return area;
    }
    static double calculateSquareArea(double side_length){
        double area = side_length * side_length;
        return area;
    }
}
