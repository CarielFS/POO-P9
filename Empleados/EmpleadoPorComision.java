public class EmpleadoPorComision extends Empleado{
	private int ventasTotales;
	private float tasaComision;

	public EmpleadoPorComision(String nombre, String apellido, String numSeguridad, int ventasTotales, float tasaComision){
		super(nombre, apellido, numSeguridad);
		this.ventasTotales = ventasTotales;
		this.tasaComision = tasaComision;
	}

  @Override
  public float ingresos(){
    return (ventasTotales*tasaComision);
  }

	@Override
	public String toString(){
		return super.toString() + "\n\tVentas totales: $" + ventasTotales + "\n\tTasa de comsión: " + tasaComision;
	}
}
