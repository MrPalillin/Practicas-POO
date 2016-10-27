package poo;

import java.util.ArrayList; //La tarjeta comprueba la credencial para el tipo de operacion,y la permite si coincide
import java.util.Scanner;

import fabricante.externo.tarjetas.TarjetaMonedero;

/**
 * 
 * @author daniel
 * @author dancres
 */

public class MaquinaVending {

	private ArrayList<Producto> huecosMaquina = new ArrayList<Producto>();
	private Scanner in = new Scanner(System.in);
	private TarjetaMonedero tarjeta = new TarjetaMonedero("A156Bv09_1zXo894", 10.0);

	public MaquinaVending(ArrayList<Producto> huecosMaquina) {
		this.huecosMaquina = huecosMaquina;
	}

	private int[] UPC0 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1, Producto.control(Producto.getUPC()) };
	private int[] UPC1 = { 5, 4, 6, 6, 9, 1, 2, 8, 3, 8, 5, Producto.control(Producto.getUPC()) };
	private int[] UPC2 = { 1, 2, 3, 4, 5, 6, 9, 9, 9, 7, 6, Producto.control(Producto.getUPC()) };
	private int[] UPC3 = { 6, 4, 8, 2, 8, 1, 5, 4, 2, 5, 2, Producto.control(Producto.getUPC()) };
	private int[] UPC4 = { 7, 7, 7, 4, 5, 1, 8, 2, 5, 1, 2, Producto.control(Producto.getUPC()) };
	private int[] UPC5 = { 7, 7, 7, 4, 5, 1, 1, 6, 4, 5, 2, Producto.control(Producto.getUPC()) };
	private int[] UPC6 = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, Producto.control(Producto.getUPC()) };
	private int[] UPC7 = { 9, 9, 9, 9, 9, 9, 8, 7, 6, 5, 4, Producto.control(Producto.getUPC()) };
	private int[] UPC8 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, Producto.control(Producto.getUPC()) };
	private int[] UPC9 = { 1, 7, 5, 6, 4, 1, 1, 1, 1, 1, 2, Producto.control(Producto.getUPC()) };
	private int[] UPC10 = { 0, 4, 0, 4, 5, 1, 5, 1, 8, 2, 2, Producto.control(Producto.getUPC()) };

	Producto palmeraAvellanas = new Producto(1.00, "Palmera Avellanas", Producto.getCompañia(Producto.getUPC()),
			Producto.getIDProducto(Producto.getUPC()), Producto.control(Producto.getUPC()), UPC0, 5);
	Producto palmeraChocolate = new Producto(1.05, "Palmera Chocolate", Producto.getCompañia(Producto.getUPC()),
			Producto.getIDProducto(Producto.getUPC()), Producto.control(Producto.getUPC()), UPC1, 6);
	Producto cocaLoca = new Producto(1.20, "Coca-Loca", Producto.getCompañia(Producto.getUPC()),
			Producto.getIDProducto(Producto.getUPC()), Producto.control(Producto.getUPC()), UPC2, 1);
	Producto bollitosPrimavera = new Producto(2.50, "Bollitos De Primavera", Producto.getCompañia(Producto.getUPC()),
			Producto.getIDProducto(Producto.getUPC()), Producto.control(Producto.getUPC()), UPC3, 9);
	Producto gonettes = new Producto(1.40, "Gonettes", Producto.getCompañia(Producto.getUPC()),
			Producto.getIDProducto(Producto.getUPC()), Producto.control(Producto.getUPC()), UPC4, 4);
	Producto zumoNaranja = new Producto(0.80, "Zumo de Naranja", Producto.getCompañia(Producto.getUPC()),
			Producto.getIDProducto(Producto.getUPC()), Producto.control(Producto.getUPC()), UPC5, 1);
	Producto moritos = new Producto(1.00, "Moritos", Producto.getCompañia(Producto.getUPC()),
			Producto.getIDProducto(Producto.getUPC()), Producto.control(Producto.getUPC()), UPC6, 2);
	Producto zumoPiña = new Producto(1.00, "Zumo de Piña", Producto.getCompañia(Producto.getUPC()),
			Producto.getIDProducto(Producto.getUPC()), Producto.control(Producto.getUPC()), UPC7, 8);
	Producto bolsaPatatas = new Producto(0.45, "Bolsa de patatas", Producto.getCompañia(Producto.getUPC()),
			Producto.getIDProducto(Producto.getUPC()), Producto.control(Producto.getUPC()), UPC8, 9);
	Producto agua = new Producto(0.30, "Agua mineral", Producto.getCompañia(Producto.getUPC()),
			Producto.getIDProducto(Producto.getUPC()), Producto.control(Producto.getUPC()), UPC9, 7);
	Producto aguarius = new Producto(0.75, "Aguarius", Producto.getCompañia(Producto.getUPC()),
			Producto.getIDProducto(Producto.getUPC()), Producto.control(Producto.getUPC()), UPC10, 5);
	
	/**
	 * 
	 * @param huecosMaquina Representa los compartimentos de la maquina
	 * @return huecosMaquina Los compartimentos cargados
	 */

	public ArrayList<Producto> rellenaMaquina(ArrayList<Producto> huecosMaquina) {
		huecosMaquina.add(palmeraAvellanas); // 1
		huecosMaquina.add(palmeraChocolate); // 2
		huecosMaquina.add(cocaLoca); // 3
		huecosMaquina.add(bollitosPrimavera); // 4
		huecosMaquina.add(gonettes); // 5
		huecosMaquina.add(zumoNaranja); // 6
		huecosMaquina.add(zumoNaranja); // 7
		huecosMaquina.add(moritos); // 8
		huecosMaquina.add(zumoPiña); // 9
		huecosMaquina.add(bolsaPatatas); // 10
		huecosMaquina.add(agua); // 11
		huecosMaquina.add(aguarius); // 12
		huecosMaquina.add(agua); // 13
		return huecosMaquina;
	}

	/**
	 * 
	 * @param huecosMaquina
	 * Representa los compartimentos para los productos
	 */
	public void mostrarLista(ArrayList<Producto> huecosMaquina) {
		for (int i = 0; i < huecosMaquina.size(); i++) {
			System.out.println(i + 1 + ". " + huecosMaquina.get(i).getNombre());
		}

	}

	/**
	 * 
	 * @param UPC
	 *            Codigo de barras del producto
	 * @return DEvuelve el precio de un producto
	 */
	public double preguntarPrecio() {
		double precio = -1;
		int i = -1;
		System.out.print("Esciba el producto a consultar: ");
		while (i < 1 || i > 30) {
			i = in.nextInt();
			if (i < 1 || i > 30) {
				System.out.println("Codigo incorrecto,vuelva a introducirlo");
			}
		}
		if (huecosMaquina.get(i - 1) == null || huecosMaquina.get(i - 1).getCantidad() == 0) {
			System.out.println("No existen elementos en ese espacio");
		} else {
			precio = huecosMaquina.get(i).getPrecio();
			System.out.println("Precio del producto nº " + huecosMaquina.get(i).getNombre() + " : "
					+ huecosMaquina.get(i).getPrecio());

		}
		return precio;
	}
	
	/**
	 * 
	 * @param tarjeta La tarjeta utilizada para comprar
	 * @return pedido El producto comprado
	 */
	public Producto comprarProducto(TarjetaMonedero tarjeta) {
		int i = -1;
		Producto pedido=null;
		System.out.print("Escriba el elemento a comprar: ");
		while (i < 1 || i > 30) {
			i = in.nextInt();
			if (i < 1 || i > 30) {
				System.out.println("Codigo incorrecto,vuelva a introducirlo");
			}
		}
		if (huecosMaquina.get(i - 1) == null || huecosMaquina.get(i - 1).getCantidad() == 0 ) {
			System.out.println("No existen elementos en ese espacio");
		}else if(tarjeta.getSaldoActual()<huecosMaquina.get(i-1).getPrecio()){
			System.out.println("No se dispone de saldo suficiente para efectuar la operacion. Cancelando compra");
			pedido=null;
		} else {
			pedido = huecosMaquina.get(i - 1);
			huecosMaquina.get(i-1).setCantidad(huecosMaquina.get(i-1).getCantidad()-1);
			if(huecosMaquina.get(i-1).getCantidad()==0){
				huecosMaquina.remove(i-1);
			}
			tarjeta.descontarDelSaldo("6Z1y00Nm31aA-571", huecosMaquina.get(i-1).getPrecio());
		}
		return pedido;
	}

}