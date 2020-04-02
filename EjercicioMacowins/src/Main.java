
public class Main {

	public static void main(String[] args) {
		Venta v1 = new Venta(new Tarjeta(2));
		Camisa x1 = new Camisa(100,new Nuevo());
		Camisa x2 = new Camisa(100,new Liquidacion());
		
		v1.agregarPrenda(x1);
		v1.agregarPrenda(x2);
		System.out.println(v1.ganancia());
		
	}

}
