
public class Empleado {
	private String nombre;
	private String cargo;
	private Salario salario;
	private Departamento dpto;
	
	
	public Empleado(String nombre, String cargo,Salario salario, Departamento dpto) {
	    this.nombre = nombre;
	    this.cargo = cargo;
	    this.salario = new Salario(5000, 1500); 
	    this.dpto = new Departamento("Deposito", 1000);
	}
	
	
	public void mostrarDetallesNomina() {
		System.out.println("---Nomina del empleado ---");
		System.out.println("Nombre: " + nombre + "\nCargo: " + cargo + 
				"\nDepartamento " + dpto.departamento() + "\nSueldo: " + salario.calcularSueldoNeto() );
	}
}
