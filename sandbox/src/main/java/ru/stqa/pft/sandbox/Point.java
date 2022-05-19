package ru.stqa.pft.sandbox;

public class Point {
    public static double x1, y1, x2, y2;

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();

        p1.x1 = -2;
        p1.y1 = 4;
        p2.x2 = 6;
        p2.y2 = 8;

        System.out.println("Рассточние между двумя точками на плоскости (" + "-2;4" + "и" + "6;8) = " + distance(p1,p2));
    }


    public static double distance(Point p1, Point p2) {
        double d = Math.sqrt(p2.x2 - p1.x1) * (p2.x2 - p1.x1) + (p2.y2 - p2.y1) * (p2.y2 - p2.y1);
        return d;
        }

}