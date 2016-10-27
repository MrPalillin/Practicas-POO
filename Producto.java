package poo;

/**
 * 
 * @author dandevi
 * @author dancres
 */

public class Producto {
	
	private double precio;
	private String nombre;
	private int compañia;
	private int IDProducto;
	private static int[] UPC = new int[12];
	private int digitoControl;
	private int cantidad;
	
	/**
	 * Inicializa el producto con sus atributos
	 * @param precio Define el precio del producto
	 * @param nombre Define el nombre del producto
	 * @param compañia Define la compañia a la que pertenece el producto
	 * @param IDProducto Identificador del producto
	 * @param digitoControl Basado en una formula
	 * @param UPC Codigo de barras del producto
	 */

	public Producto(double precio, String nombre, int compañia, int IDProducto, int digitoControl,int[] UPC,int cantidad) {
		this.precio = precio;
		this.nombre = nombre;
		this.compañia = getCompañia(UPC);
		this.IDProducto = getIDProducto(UPC);
		this.digitoControl = control(UPC);
		this.UPC=UPC;
		this.cantidad=cantidad;
	}
	
	/**
	 * Para modificar la cantidad de los productos
	 * @param cantidad 
	 */
	public void setCantidad(int cantidad){
		this.cantidad=cantidad;
	}
	
	/**
	 * 
	 * @param UPC
	 * @return Codigo de la compañia
	 */

	public static int getCompañia(int[] UPC) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < 6; i++) {
			str.append(UPC[i]);
		}
		int codigoCompañia = Integer.parseInt(str.toString());
		return codigoCompañia;
	}
	
	/**
	 * 
	 * @param UPC
	 * @return Identificador del producto
	 */

	public static int getIDProducto(int[] UPC) {
		StringBuilder str = new StringBuilder();
		for (int i = 6; i < 11; i++) {
			str.append(UPC[i]);
		}
		int identificador = Integer.parseInt(str.toString());
		return identificador;
	}
	
	/**
	 * 
	 * @return Nombre del producto
	 */

	public String getNombre() {
		return nombre;
	}
	
	/**
	 * 
	 * @return Precio del producto
	 */

	public double getPrecio() {
		return precio;
	}
	
	/**
	 * 
	 * @return Codigo UPC del producto
	 */
	
	public static int[] getUPC(){
		return UPC;
	}
	
	/**
	 * 
	 * @return Cantidad del producto a la venta
	 */
	
	public int getCantidad(){
		return cantidad;
	}
	
	/**
	 * 
	 * @param UPC
	 * @return Codigo de control del producto
	 */

	public static int control(int[] UPC) {
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