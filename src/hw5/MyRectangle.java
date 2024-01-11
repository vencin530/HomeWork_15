package hw5;

public class MyRectangle {
	private double width, depth;

	public void setWidth(double width) {
		if (width > 0)
			this.width = width;
	}

	public void setDepth(double depth) {
		if (depth > 0)
			this.depth = depth;
	}

	public double getArea() {
		return this.width * this.depth;
	}

	public MyRectangle() {
	}

	public MyRectangle(double width, double depth) {
		setWidth(width);
		setDepth(depth);
	}

}
