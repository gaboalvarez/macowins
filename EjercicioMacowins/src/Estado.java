public abstract class Estado {
	double calcularPorcentaje(double precioBase) {
		return precioBase;
	}
}
class Nuevo extends Estado{
	@Override
	double calcularPorcentaje(double precioBase) {
		return precioBase;
	}
}
class Liquidacion extends Estado{
	@Override
	double calcularPorcentaje(double precioBase) {
		return precioBase/2;
	}
}
class Promocion extends Estado{
	double descuento;
	Promocion(double descuento){
		this.descuento = descuento;
	}
	@Override
	double calcularPorcentaje(double precioBase) {
		return precioBase-descuento;
	}
}