import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner teclado = new Scanner(System.in);
		System.out.println("         REGISTRO DE EMPLEADO");
        System.out.println("==========================================");

        // --- 1. RECOLECCIÓN DE DATOS DEL EMPLEADO (ATRIBUTOS PROPIOS) ---
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = teclado.nextLine();
        
        System.out.print("Cual es el cargo de " + nombre + ": ");
        String cargo = teclado.nextLine();

        // --- 2. RECOLECCIÓN DE DATOS PARA EL COMPONENTE SALARIO ---
        System.out.println("\n--- Datos de Salario ---");
        System.out.print("Cual es el Salario Base: ");
        double salarioBase = teclado.nextDouble();
        teclado.nextLine(); // Limpiar el buffer
        
        System.out.print("Cuales son los Beneficios Fijos: ");
        double beneficiosFijos = teclado.nextDouble();
        teclado.nextLine(); // Limpiar el buffer
        
        // --- 3. RECOLECCIÓN DE DATOS PARA EL COMPONENTE DEPARTAMENTO ---
        System.out.println("\n--- Datos de Departamento ---");
        System.out.print("Nombre del Departamento: ");
        String nombreDpto = teclado.nextLine();
        
        System.out.print("Presupuesto Anual del Departamento: ");
        double presupuestoAnual = teclado.nextDouble();
        teclado.nextLine(); // Limpiar el buffer (IMPORTANTE!)

        
        // =================================================================
        //                 LA CLAVE DE LA COMPOSICIÓN (ENSAMBLAJE)
        // =================================================================
        
        // 4. CONSTRUIR LOS OBJETOS COMPONENTES (Usando los constructores con parámetros definidos)
        
        // Creamos el objeto Salario, pasándole los datos recolectados (salarioBase y beneficiosFijos)
        Salario componenteSalario = new Salario(salarioBase, beneficiosFijos);
        
        // Creamos el objeto Departamento, pasándole los datos recolectados (nombreDpto y presupuestoAnual)
        Departamento componenteDpto = new Departamento(nombreDpto, presupuestoAnual);
        
        
        // 5. CONSTRUIR EL OBJETO PRINCIPAL (EMPLEADO)
        
        // Le pasamos al Empleado sus atributos propios (nombre, cargo) y los OBJETOS
        // ya construidos (componenteSalario y componenteDpto).
        Empleado empleado1 = new Empleado(nombre, cargo, componenteSalario, componenteDpto);
        
        
        // 6. Ejecutar la funcionalidad
        System.out.println("\n==========================================");
        empleado1.mostrarDetallesNomina();
        System.out.println("==========================================");
        
        // Cerrar el Scanner al terminar el programa
        teclado.close();
	}
}
