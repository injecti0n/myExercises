package new_ex;

/*
# inject0r
# RectAngleUtils
# Exercises for beginners
*/

public class RectAngleUtils {
	private double width;
	private double height;
	private String message;

	// getWidth - setWidth
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	// getWidth - setWidth

	// getHeight - setHeight
	public double getheight() {
		return height;
	}

	public void setheight(double height) {
		this.height = height;
	}
	// getHeight - setHeight

	public double getArea(double width,double height) {
		this.width = width;
		this.height = height;
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width * height);
	}

}