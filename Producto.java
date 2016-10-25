package poo;

public class Producto {

	private double precio;
	private String nombre;
	private int compañia;
	private int IDProducto;
	private int[] UPC = new int[12];
	private int digitoControl;
	
	/**
	 * Inicializa el producto con sus atributos
	 * @param precio Define el precio del producto
	 * @param nombre Define el nombre del producto
	 * @param compañia Define la compañia a la que pertenece el producto
	 * @param IDProducto Identificador del producto
	 * @param digitoControl Basado en una formula
	 */

	public Producto(double precio, String nombre, String compañia, String IDProducto, int digitoControl) {
		this.precio = precio;
		this.nombre = nombre;
		this.compañia = getCompañia(UPC);
		this.IDProducto = getIDProducto(UPC);
		this.digitoControl = control(UPC);
	}

	public int getCompañia(int[] UPC) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < 6; i++) {
			str.append(UPC[i]);
		}
		int codigoCompañia = Integer.parseInt(str.toString());
		return codigoCompañia;
	}

	public int getIDProducto(int[] UPC) {
		StringBuilder str = new StringBuilder();
		for (int i = 6; i < 11; i++) {
			str.append(UPC[i]);
		}
		int identificador = Integer.parseInt(str.toString());
		return identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCompañia() {
		return compañia;
	}

	public int control(int[] UPC) {
		int s = 0, m = 0, digitoFinal = 0;
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				s = s + 3 * UPC[i];
			} else {
				s = s * UPC[i];
			}
		}
		while (s > m) {
			m = m + 10;
		}
		digitoFinal = Math.abs(s - m);
		return digitoFinal;
	}

}