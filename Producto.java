package poo;

public class Producto {

	private double precio;
	private String nombre;
	private String compa�ia;
	private String IDProducto;
	private int digitoControl;
	private String UPC;
	private int [] suma= new int[12];
	for (int i=0; i<compa�ia.length(); i++){
		suma[i]=compa�ia.charAt(i);
	}
	for (int i=compa�ia.length(); i<(IDProducto.length()+compa�ia.length());i++){
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
