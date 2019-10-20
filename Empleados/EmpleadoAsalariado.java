public class EmpleadoAsalariado extends Empleado{
	//private fields
	private float salarioSemanal;

	//constructor method
	public EmpleadoAsalariado(String nombre, String apellido, String numSeguridad, float salarioSemanal){
		super.Empleado(String nombre, String apellido, String numSeguridad);
		this.salarioSemanal = salarioSemanal;
	}

	//Accessor for nombre
	public String getNombre(){
		return nombre;
	}

	//Accessor for apellido
	public String getApellido(){
		return nombre;
	}

	//Accessor for numSeguridad
	public String getNumSeguridad(){
		return nombre;
	}

	//Accessor for salarioSemanal
	public String getSalarioSemanal(){
		return salarioSemanal;
	}

	//Accessor for ingresos
	public abstract float ingresos(float salarioSemanal){
		this.salarioSemanal = salarioSemanal;
		return salarioSemanal;
	}

	//Data method
	public String toString(){
		return super.toString() + "\n\tSalario Semanal: $" + this.getSalarioSemanal();
	}
}
