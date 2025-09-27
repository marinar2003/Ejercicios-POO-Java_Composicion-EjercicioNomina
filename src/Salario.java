

public class Salario {
	private double salarioBase,beneficiosFijos;
	
	
	  public Salario(double salarioBase, double beneficiosFijos) {
	        this.salarioBase = salarioBase;
	        this.beneficiosFijos = beneficiosFijos;
	    }
	
	public double calcularSueldoNeto() {
		double suma = 0;
		return suma= salarioBase + beneficiosFijos;
	}

}
