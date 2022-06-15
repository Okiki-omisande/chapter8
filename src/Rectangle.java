public class Rectangle {
    float length = 1;
    float width = 1;

    public Rectangle(){
        System.out.printf(" default length : %.1f, default width : %.1f%n", length,width);
    }
    public void setRectangle(float length, float width){
        if (length <= 0.0 || length > 20.0)
            throw new IllegalArgumentException("length (" + length + ") should be greater than 0.0 and less than 20.0");
        if (width <= 0.0 || width > 20.0)
            throw  new IllegalArgumentException("width (" + width + ") should be greater than 0.0 and less than 20.0");

        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float getPerimeter(float length, float width){
        return (2 * length) + width;
    }

    public float getArea(float length, float width){
        return length * width;
    }
}
