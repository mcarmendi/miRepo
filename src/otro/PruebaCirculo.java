package otro;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

import pruebaCirculo.Circle;

public class PruebaCirculo {
	public static void main(String[] args) {
		Circle circulo = new Circle(37, 43, 2.5);
		String salida = "La coordenada X es " + circulo.getX() + "\nLa coordenada Y es " + circulo.getY()
				+ "\nEl radio es " + circulo.getRadio();
		circulo.setX(35);
		circulo.setY(20);
		circulo.setRadio(4.25);
		salida += "\n\nLa nueva ubicación y el radio del círculo son\n" + circulo.toString();
		DecimalFormat dosDigitos = new DecimalFormat("0.00");
		salida += "\nEl diámetro es " + dosDigitos.format(circulo.obtenerDiametro());
		salida += "\nLa circunferencia es " + dosDigitos.format(circulo.obtenerCircunferencia());
		salida += "\nEl área es " + dosDigitos.format(circulo.obtenerArea());
		JOptionPane.showMessageDialog(null, salida);
		System.exit(0);
	} // fin de main
} // fin de la clase PruebaCirculo
