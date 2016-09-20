package colorpoint;

public class Circle extends Shape {

	private int radius;
	
	public int getradius() {
		return radius;
	}
	public void setradius(int radius) {
		this.radius = radius;
	}
	@Override
	public void draw() {
		super.draw();
		System.out.println("원을 그렸습니다.");
	}

	
}
