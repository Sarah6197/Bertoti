package calculator;

public class Calculator {
	public double sum(double x, double y, double z) {
		return x + y + z;
	}

	public double sub(double x, double y, double z) {
		return x - y - z;
	}

	public double mult(double x, double y, double z) {
		return x * y * z;
	}

	public double div(double x, double y, double z) {
		if (y == 0 && z == 0) {
			return 0;
		}
		return (x / y) / z;
	}
}