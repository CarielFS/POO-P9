public class Empleado{
	//Atributos privados
	private String nombre;
	private String apellido;
	private String numSeguridad;

	//Constructor
	public Empleado(String nombre, String apellido, numSeguridad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.numSeguridad = numSeguridad;
	}

	//Metodo de ingresos que implementaran las clases hijas
	public abstract float ingresos(){}

	//Metodo toString
	public String toString(){
		return "Empleado:\n\tNombre: "this.apellido + " " + this.nombre + "\n\tSeg. Social: " + this.numSeguridad;
	}
}
