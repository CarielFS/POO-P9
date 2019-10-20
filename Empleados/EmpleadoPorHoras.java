public class EmpleadoPorHoras extends Empleado{
    private float sueldo;int horas;
    public EmpleadoPorHoras(String nombre,String apellido,String numSeguridad,float sueldo,int horas){
        super(nombre, apellido, numSeguridad);
        this.sueldo=sueldo;
        this.horas=horas;
    }
    public void setHoras(int horas){
        this.horas=horas;
    }
    public void setSueldo(float sueldo){
        this.sueldo=sueldo;
    }
    public int getHoras(){
        return horas;
    }
    public float getSueldo(){
        return sueldo;
    }
    @Override
    public float ingresos(){
        if(horas<40){
            return sueldo*horas;
        }else{
            return (float) (40*sueldo+(horas-40)*sueldo*1.5);
	      }
    }
    @Override
    public String toString(){
        return super.toString() +"Ingresos: "+ingresos();
    }
}
