public class AreaCalculator {
    static double calculateRectangleArea(double length,double width){
        double area = length * width;
        return area;
    }
    static double calculateSquareArea(double sideLength){
        double area = sideLength * sideLength;
        return area;
    }

    public static void main(String[] args) {
        double rectangleLength = 5;
        double rectangleWidth = 8;
        double squareSideLength = 4;

        System.out.println("Area of rectangle : "+calculateRectangleArea(rectangleLength,rectangleWidth));
        System.out.println("Area of rectangle : "+calculateSquareArea(squareSideLength));

    }
}
