import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Venta {
	List<Prenda> prendasDeLaVenta = new ArrayList<>();
	FormaPago tipoPago;
	void agregarPrenda(Prenda x) {
		prendasDeLaVenta.add(x);
	}
	Venta(FormaPago tipoPago){
		this.tipoPago = tipoPago;
	}
	double ganancia() {
		return tipoPago.recargo(prendasDeLaVenta);
	}
	List<Prenda> prendas(){
		return prendasDeLaVenta.stream().map(prenda -> prenda.getTipo()).collect(Collectors.toList());
	}
	long cantidad() {
		return prendasDeLaVenta.size();
	}
}
interface FormaPago{double recargo(List<Prenda> prendasDeLaVenta);}
class Efectivo implements FormaPago{
	public double recargo(List<Prenda> prendasDeLaVenta) {
		return (prendasDeLaVenta.stream().mapToDouble(prenda -> prenda.getPrecio()).sum());
	}
}
class Tarjeta implements FormaPago{
	int cuotas;
	int coef;
	Tarjeta(int cuotas){
		this.cuotas = cuotas;
		this.coef = coef;
	}
	public double recargo(List<Prenda> prendasDeLaVenta) {
		return (prendasDeLaVenta.stream().mapToDouble(prenda -> prenda.getPrecio()).sum())+(cuotas*coef + (prendasDeLaVenta.stream().mapToDouble(prenda -> prenda.getPrecio()*0.01).sum()));
	}
}




