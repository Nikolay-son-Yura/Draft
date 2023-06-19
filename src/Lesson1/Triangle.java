package Lesson1;

public class Triangle extends Shape {
    private String style;

    public Triangle(Double width, Double height, String style) {
        super(width, height);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public double area() {
        return getHeight() * getWidth() / 2;
    }


    @Override
    public void showShape() {
//        return super.showShape() + getStyle();;
}
    }

