package poo;

public class Producto {

	private double precio;
	private String nombre;
	private String compañia;
	private String IDProducto;
	private int digitoControl;
	private String UPC;
	private int [] suma= new int[12];
	for (int i=0; i<compañia.length(); i++){
		suma[i]=compañia.charAt(i);
	}
	for (int i=compañia.length(); i<(IDProducto.length()+compañia.length());i++){
		suma[i]=IDProducto.charAt(i);
	}
	private int s=0;
	for(int i=0;i<suma.length();i++){
		if (i%2==0){
			suma[i]=suma[i]*3;
		}
		s=s+suma[i];
	}
	
}
