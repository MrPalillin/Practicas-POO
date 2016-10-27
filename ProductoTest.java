package poo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductoTest {
	
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
	
	public ProductoTest(double precio, String nombre, int compañia, int IDProducto, int digitoControl,int[] UPC,int cantidad) {
		this.precio = precio;
		this.nombre = nombre;
		this.compañia = testGetCompañia(UPC);
		this.IDProducto = testGetIDProducto(UPC);
		this.digitoControl = testControl(UPC);
		this.UPC=UPC;
		this.cantidad=cantidad;
	}

	@Test
	public void testSetCantidad(int cantidad) {
		this.cantidad=cantidad;
		cantidad=5;
		assertEquals("Elemento correcto",5,cantidad);
		cantidad=-1;
		assertNotEquals("Elemento incorrecto",5,cantidad);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSetCantidadError(int cantidad) {
		this.cantidad=cantidad;
		cantidad=5;
		assertEquals("Elemento correcto",5,cantidad);
		cantidad=-1;
		assertNotEquals("Elemento incorrecto",5,cantidad);
	}

	@Test
	public int testGetCompañia(int[] UPC) {
		fail("Not yet implemented");
		return compañia;
	}

	@Test
	public int testGetIDProducto(int[] UPC) {
		fail("Not yet implemented");
		return IDProducto;
	}

	@Test
	public void testGetNombre() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPrecio() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUPC() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCantidad() {
		fail("Not yet implemented");
	}

	@Test
	public int testControl(int[] UPC) {
		fail("Not yet implemented");
		return digitoControl;
	}

}
