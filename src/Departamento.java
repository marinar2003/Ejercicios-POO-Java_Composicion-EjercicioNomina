

public class Departamento {
	private String nombre;
	private double presupuestoAnual;
	
	  public Departamento(String nombre, double presupuestoAnual) {
	        this.nombre = nombre;
	        this.presupuestoAnual = presupuestoAnual;
	    }
	
	public String departamento() {
		return nombre;
	}
	
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Presupuesto anual: " + presupuestoAnual);
	}

}
