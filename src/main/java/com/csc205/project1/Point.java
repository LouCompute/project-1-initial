package com.csc205.project1;
/*
Complete the following programming assignment:

-Design & implement a class called Point that represents a location in the Cartesian plane.
-Include (at a minimum) the following methods:
1) A constructor that takes x and y coordinates as double arguments
2) setX(double x), setY(double y) - standard setters
3) getX(), getY() - standard getters
4) setPoint(double x, double y) - set the coordinates of the point.
5) shiftX(double n), shiftY(double n) - shift a point by a given amount along one of the axes.
6) distance(Point p2) - finds the distance to point p2.
7) rotate(double angle) - rotates the point by a specified (radian) angle around the origin. The formula for rotation is as follows:
x′=xcos(θ)−ysin(θ)
y′=xsin(θ)+ycos(θ)

-The code should work with the following unit tests:

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    @Test
    void setPoint() {

        // Setup
        double expectedX = 5;
        double expectedY = 5;
        Point point = new Point(expectedX, expectedY);

        // Exercise
        double x = point.getX();
        double y = point.getY();

        // Assert
        assertEquals(expectedX, x);
        assertEquals(expectedY, y);
    }

    @Test
    void shiftX() {

        // Setup
        double expectedX = 6;
        Point point = new Point(5, 5);

        // Exercise
        point.shiftX(1);
        double x = point.getX();

        // Assert
        assertEquals(expectedX, x);

    }

    @Test
    void shiftY() {

        // Setup
        double expectedY = 6;
        Point point = new Point(5, 5);

        // Exercise
        point.shiftY(1);
        double y = point.getY();

        // Assert
        assertEquals(expectedY, y);
    }

    @Test
    void distance() {

        // Setup
        double expectedDistance = 5;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3,4);

        // Exercise

        double distance = point1.distance(point2);

        // Assert
        assertEquals(expectedDistance, distance);
    }

    @Test
    void rotate() {

        // Setup
        double expectedX = -5;
        double expectedY = 5;
        Point point = new Point(5, 5);

        // Exercise
        point.rotate(Math.PI / 2.0);
        double x = point.getX();
        double y = point.getY();

        // Assert
        assertEquals(expectedX, x);
        assertEquals(expectedY, y);
    }
}
 */

public class Point {

    private double x;
    private double y;

    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Set the coordinates of the point
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Shift the point along the x-axis
    public void shiftX(double n) {
        this.x += n;
    }

    // Shift the point along the y-axis
    public void shiftY(double n) {
        this.y += n;
    }

    // Calculate distance to another point
    public double distance(Point p2) {
        double deltaX = this.x - p2.getX();
        double deltaY = this.y - p2.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // Rotate the point around the origin by a specified angle in radians
    public void rotate(double angle) {
        double newX = this.x * Math.cos(angle) - this.y * Math.sin(angle);
        double newY = this.x * Math.sin(angle) + this.y * Math.cos(angle);
        this.x = newX;
        this.y = newY;
    }
}
