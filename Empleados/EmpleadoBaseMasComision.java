public class EmpleadoBaseMasComision extends EmpleadoPorComision{
	//Atributos privados
	private float salarioBase;

	//Constructor
	public EmpleadoBaseMasComision(String nombre, String apellido, String numSeguridad, int ventasTotales, float tasaComision, float salarioBase){
		super(nombre, apellido, numSeguridad, ventasTotales, tasaComision);
		this.salarioBase = salarioBase;
	}

	//Sobreescritura método toString
	@Override
	public String toString(){
		return super.toString() + "\n\tSalario base: $"+this.salarioBase;
	}

	//Sobreescritura de metodo ingresos
	@Override
	public float ingresos(){
		return super.ingresos() + this.getSalarioBase();
	}

	//setter del atributo privado
	public void setSalarioBase(float salarioBase){
		this.salarioBase = salarioBase;
	}

	//getter del atributo privado
	public float getSalarioBase(){
		return this.salarioBase;
	}
}
