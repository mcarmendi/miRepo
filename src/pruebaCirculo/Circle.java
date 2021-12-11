package pruebaCirculo;

public class Circle {
	private static final double CERO = 0.0;
	private int x;
	private int y;
	private double radio;

	// constructor
	public Circle() {
	}

	// constructor
	public Circle(int valorX, int valorY, double valorRadio) {
		x = valorX;
		y = valorY;
		setRadio(valorRadio);
	}

	public double obtenerDiametro() {
		return 2 * radio;
	}

	public double obtenerCircunferencia() {
		return Math.PI * obtenerDiametro();
	}

	public double obtenerArea() {
		return Math.PI * radio * radio;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}
	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		if (radio < CERO) {
			this.radio = CERO;
		} else {
			this.radio = radio;
		}
	}

	@Override
	public String toString() {
		return "Centro = [" + x + ", " + y + "]; Radio = " + radio;
	}
}
