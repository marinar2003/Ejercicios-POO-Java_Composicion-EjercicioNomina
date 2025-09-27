
public class Empleado {
	private String nombre;
	private String cargo;
	private Salario salario;
	private Departamento dpto;
	
	
	public Empleado(String nombre, String cargo, Salario s, Departamento d) {
	    this.nombre = nombre;
	    this.cargo = cargo;
	    this.salario = s; // s es un objeto Salario
	    this.dpto = d;    // d es un objeto Departamento
	}
	
	
	public void mostrarDetallesNomina() {
		System.out.println("---Nomina del empleado ---");
		System.out.println("Nombre: " + nombre + "\nCargo: " + cargo + 
				"\nDepartamento " + dpto.departamento() + "\nSueldo: " + salario.calcularSueldoNeto() );
	}
}
