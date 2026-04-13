package pruebaCirculo;

public class Circle implements IFiguraGeometrica {
	/**
	 * 
	 */
	private static final double CERO = 0.0;
	private int x;
	private int y;
	private double radio;

	
	// constructor
	public Circle(int valorX, int valorY, double valorRadio) {
		x = valorX;
		y = valorY;
		setRadio(valorRadio);
	}

	public void setX(int valorX) {
		x = valorX;
	}

	public int getX() {
		return x;
	}

	public void setY(int valorY) {
		y = valorY;
	}

	public int getY() {
		return y;
	}

	public void setRadio(double valorRadio) {
		radio = (valorRadio < CERO ? 0.0 : valorRadio);
	}

	public double getRadio() {
		return radio;
	}

	public double getDiametro() {
		return 2 * radio;
	}

	public double getCircunferencia() {
		return Math.PI * getDiametro();
	}

	@Override
	public double getArea() {
		return Math.PI * radio * radio;
	}

	@Override
	public String toString() {
		return "Centro = [" + x + ", " + y + "]; Radio = " + radio;
	}
}