package de.telran;

public class Point2D {
    double x;
    double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getAngleRads() {
        double res = Math.atan2(y, x);
        return res < 0 ? res + 2 * Math.PI : res;
    }
}
