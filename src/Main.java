public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line line1 = new Line(p1, p2);
        Line line2 = new Line(new Point(1, 2), new Point(3, 4));

        System.out.println("line1 equals line2: " + line1.equals(line2)); // true


        try {
            Line line3 = (Line) line1.clone();
            System.out.println("Cloned line: " + line3);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
