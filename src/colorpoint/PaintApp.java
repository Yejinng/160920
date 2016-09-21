package colorpoint;

public class PaintApp {
	public static void main(String[] args) {
		Point point = new Point();
		point.setX(2);
		point.setY(5);

		point.show();

		Point point2 = new Point(10, 23);
		point2.show(true); // true써도되고 안써도됨
		point2.show(false);

		Point point3 = new ColorPoint(50, 50, "red");
		point3.show();
		point3.show(false);
		point3.show(true);

		Shape rectangle = new Rectangle();
		rectangle.draw();
		draw(rectangle);

		Shape circle = new Circle();
		circle.draw();

		// Circle circle = new Circle();
		// draw(circle);

		Shape triangle = new Triangle();
		// triangle.draw();
		draw(triangle);
		draw(new Pentagon());

	}
	 public static void draw(Shape shape){
	 shape.draw();
	 }

//	public static void draw(Circle circle) {
//		circle.draw();
//	}
//
//	public static void draw(Rectangle rectangle) {
//		rectangle.draw();
//	}
//
//	public static void draw(Triangle triangle) {
//		triangle.draw();
//	}
}
