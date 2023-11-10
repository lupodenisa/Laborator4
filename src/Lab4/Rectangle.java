package Lab4;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int calculareArea() {
        return width * length;
    }

    public int calcularePerimeter() {
        return 2 * (width + length);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(8, 8);
        System.out.println("Lungimea este: " + rectangle.getWidth());
        System.out.println("Latimea este: " + rectangle.getLength());
        System.out.println("Aria este: " + rectangle.calculareArea());
        System.out.println("Perimetru este: " + rectangle.calcularePerimeter());
    }
}
