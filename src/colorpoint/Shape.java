package colorpoint;

public class Shape {

	private String fillcolor;
	private String linecolor;
	
	public String getFillcolor() {
		return fillcolor;
	}

	public String getLinecolor() {
		return linecolor;
	}

	public void setFillcolor(String fillcolor) {
		this.fillcolor = fillcolor;
	}

	public void setLinecolor(String linecolor) {
		this.linecolor = linecolor;
	}

	public void draw()	{
		System.out.println("구체적인 도형은 상속을 받아 자식클래스에서 구현하세요.");
	}
}
