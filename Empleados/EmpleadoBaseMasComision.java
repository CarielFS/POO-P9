public class EmpleadoBaseMasComision extends EmpleadoPorComision{
	//Atributos privados
	private float salarioBase;

	//Constructor
	public EmpleadoBaseMasComision(String nombre, String apellido, String numSeguridad, float salarioBase){
		super.EmpleadoPorComision();
		this.salarioBase = salarioBase;
	}

	//Método toString
	public String toString(){
		return super.toString() + "\n\tSalario base: $"+this.salarioBase;
	}

	//setter del atributo privado
	public void setSalarioBase(float salarioBase){
		this.salarioBase = salarioBase;
	}

	//getter del atributo privado
	public float getSalario(){
		return this.salarioBase;
	}
}
