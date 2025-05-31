public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);
        Point p3 = new Point(2, 2);

        PolyLine polyline1 = new PolyLine(p1, p2, p3);
        PolyLine polyline2 = new PolyLine(new Point(0, 0), new Point(1, 1), new Point(2, 2));
        PolyLine polyline3 = new PolyLine(p1, p3);

        System.out.println("polyline1.equals(polyline2): " + polyline1.equals(polyline2)); // true
        System.out.println("polyline1.equals(polyline3): " + polyline1.equals(polyline3)); // false

        System.out.println("Длина polyline1: " + polyline1.length());
        System.out.println("Длина polyline3: " + polyline3.length());
    }
}
