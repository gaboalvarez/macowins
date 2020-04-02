public abstract class Prenda {
	double precioBase;
	Estado estadoPrenda;
	Prenda(double precioBase, Estado estadoPrenda){
		this.precioBase = precioBase;
		this.estadoPrenda = estadoPrenda;
	}
	double getPrecio() {
		return estadoPrenda.calcularPorcentaje(precioBase);
	}
	Prenda getTipo(){
		return this;
	}
}
class Saco extends Prenda{
	Saco(double precioBase, Estado estadoPrenda){
		super(precioBase,estadoPrenda);
	}
}
class Pantalon extends Prenda{
	Pantalon(double precioBase, Estado estadoPrenda){
		super(precioBase,estadoPrenda);
	}
}
class Camisa extends Prenda{
	Camisa(double precioBase, Estado estadoPrenda){
		super(precioBase,estadoPrenda);
	}
}