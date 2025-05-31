import java.util.Arrays;

class PolyLine {
    Point[] points;

    public PolyLine(Point... points) {
        this.points = points;
    }

    public double length() {
        double sum = 0, len1, len2;

        for (int i = 1; i < points.length; i++) {
            len1 = points[i].x - points[i - 1].x;
            len2 = points[i].y - points[i - 1].y;
            sum += Math.sqrt(len1 * len1 + len2 * len2);
        }

        return sum;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PolyLine polyLine = (PolyLine) obj;
        return Arrays.equals(points, polyLine.points);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points);
    }
}


