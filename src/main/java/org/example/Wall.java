package org.example;

public class Wall {
    private double width;
    private double height;

    // İki parametreyi de set eden ctor
    public Wall(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    // Getters
    public double getWidth()  { return width; }
    public double getHeight() { return height; }

    // Setters (negatif gelirse 0 yap)
    public void setWidth(double width) {
        this.width = width < 0 ? 0 : width;
    }

    public void setHeight(double height) {
        this.height = height < 0 ? 0 : height;
    }

    // Alan
    public double getArea() {
        return width * height;
    }
}
