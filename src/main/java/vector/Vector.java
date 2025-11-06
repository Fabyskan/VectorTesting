package main.java.vector;

public class Vector {
    private double x;
    private double y;

    public Vector() {}

    public Vector(Vector v) {
        if(v == null) {
            throw new IllegalArgumentException("Vector cannot be null");
        }
        this.x = v.x;
        this.y = v.y;
    }

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getMagnitude() {
        return Math.sqrt(x*x + y*y);
    }

    public Vector asNormalized() {
        double magnitude = getMagnitude();
        if(magnitude == 0) {
            throw new IllegalArgumentException("Magnitude is zero");
        }
        return new Vector(x / magnitude, y / magnitude);
    }

    public Vector add(Vector v) {
        if(v == null) {
            throw new IllegalArgumentException("Vector cannot be null");
        }
        return new Vector(this.x + v.x, this.y + v.y);
    }

    public static Vector fromPolar(double angle, double magnitude){
        if(angle < 0 || angle > 2*Math.PI) {
            throw new IllegalArgumentException("Angle out of range");
        }
        if(magnitude < 0) {
            throw new IllegalArgumentException("Magnitude cannot be negative");
        }
        double x = magnitude * Math.cos(angle);
        double y = magnitude * Math.sin(angle);
        return new Vector(x, y);
    }
}
