package Lesson1;

public class Shape {
    private Double width;
    private Double height;

    public Shape(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void showShape() {
        System.out.println("Ширина= " + width);
        System.out.println("Высота= " + height);
    }
}


