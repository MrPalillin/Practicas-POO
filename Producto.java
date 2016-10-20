package poo;

public class Producto {

	private double precio;
	private String nombre;
	private String compañia;
	private String IDProducto;
	private int[] UPC = new int[12];
	private int digitoControl;

	public String getCompañia(int[] UPC) {
		String copia = UPC.toString();
		String codigoCompañia = copia.substring(0, 5);
		return codigoCompañia;
	}

	public String getIDProducto(int[] UPC) {
		String copia = UPC.toString();
		String Identificador = copia.substring(6, 10);
		return Identificador;
	}

	public int control(int[] UPC) {
		int s = 0, m = 0, digitoFinal = 0;
		for (int i = 0; i < 6; i++) {
			UPC[i] = compañia.charAt(i);
		}
		for (int i = 6; i < 10; i++) {
			UPC[i] = IDProducto.charAt(i);
		}
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

	public Producto(double precio,String nombre,String compañia,String IDProducto,int digitoControl) {
		this.precio = precio;
		this.nombre = nombre;
		this.compañia = getCompañia(UPC);
		this.IDProducto = getIDProducto(UPC);
		this.digitoControl = control(UPC);
	}
}