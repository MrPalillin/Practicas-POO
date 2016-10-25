package poo;

import java.util.ArrayList;

public class MaquinaVending {

	private ArrayList<Producto> ListaProductos; // Identificador de linea puede
												// ser el numero de seleccion
	// private final //Preguntar si credencial debe tenerlo la maquina o debe
	// saberlo el usuario

	public MaquinaVending() {
		ListaProductos = new ArrayList<Producto>();
	}

	public void mostrarLista(ArrayList ListaProductos) { // Mostrar lista
															// productos
		for (int i = 0; i < ListaProductos.size(); i++) {
			System.out.println(i + ". " + ((Producto) ListaProductos.get(i)).getNombre());
			System.out.println(new Producto(2, "Nombre", "String", "String", 54).getNombre());
		}

	}

	public int preguntarPrecio(int[] UPC) {
		int precio = -1;
		// for(int i=0;i<ListaProductos.size();i++){ //Preguntar a Félix sobre
		// esta funcion,y como es el identificador de linea
		// if(){

		// }
		// }
		return precio;
	}

	public Producto comprarProducto(String IDProducto, Object TarjetaMonedero) {
		return elemento;
	}

}