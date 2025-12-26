public class Sierpinski {
	
	public static void main(String[] args) {
		sierpinski(Integer.parseInt(args[0]));
	}
	
	public static void sierpinski (int n) {
		double x1 = 0.0;
		double y1 = 0.0;
		double x2 = 1.0;
		double y2 = 0.0;
		double x3 = 0.5;
		double y3 = Math.sqrt(3.0) / 2.0;
		StdDraw.clear(StdDraw.WHITE);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledPolygon(new double[] { x1, x2, x3 }, new double[] { y1, y2, y3 });
		sierpinski(n, x1, x2, x3, y1, y2, y3);
	}
	
	private static void sierpinski(int n, double x1, double x2, double x3,
		                                 double y1, double y2, double y3) {
		if (n <= 0) {
			return;
		}
		double x12 = (x1 + x2) / 2.0;
		double y12 = (y1 + y2) / 2.0;
		double x23 = (x2 + x3) / 2.0;
		double y23 = (y2 + y3) / 2.0;
		double x31 = (x3 + x1) / 2.0;
		double y31 = (y3 + y1) / 2.0;
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledPolygon(new double[] { x12, x23, x31 }, new double[] { y12, y23, y31 });
		sierpinski(n - 1, x1, x12, x31, y1, y12, y31);
		sierpinski(n - 1, x12, x2, x23, y12, y2, y23);
		sierpinski(n - 1, x31, x23, x3, y31, y23, y3);
	}
}
