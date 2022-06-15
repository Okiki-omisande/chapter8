public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.printf("Area of rectangle with length 16 and width 8 = %.1f%n", rectangle.getArea(16,8));
        System.out.printf("Perimeter of rectangle with length 12 and width 4 = %.1f%n", rectangle.getPerimeter(12,4));

        try {
            rectangle.setRectangle(70,66);
        }
        catch (IllegalArgumentException e){
            System.out.printf("Exception: %s%n",e);
        }
    }
}
