package chapter1.section5.examples;

public class Triangle {
    public static void main(String[] args) {
        double x = Math.sqrt(3.0) / 2.0;
        StdDraw.line(0.1, 0.1, 0.9, 0.1);
        StdDraw.line(0.9, 0.1, 0.5, x);
        StdDraw.line(0.5, x, 0.1, 0.1);
        StdDraw.point(0.5, x / 3.0);
    }

    public static class PlotFilter {

        public static void main(String[] args) {

            // read in bounding box and rescale
            double xmin = StdIn.readDouble();
            double ymin = StdIn.readDouble();
            double xmax = StdIn.readDouble();
            double ymax = StdIn.readDouble();
            StdDraw.setXscale(xmin, xmax);
            StdDraw.setYscale(ymin, ymax);

            // to speed up performance, defer displaying points
            StdDraw.enableDoubleBuffering();

            // plot points, one at a time
            while (!StdIn.isEmpty()) {
                double x = StdIn.readDouble();
                double y = StdIn.readDouble();
                StdDraw.point(x, y);
            }

            // display all the points
            StdDraw.show();

        }
    }
}
