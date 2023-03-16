
public abstract class Funcionario {

	private String nombre;
	private String documento;
	private double salario;
	private int tipo;
	
	//Constructor
	public Funcionario() {
		
	}
	
	
	// Metodos getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getTipo() {
		return tipo;
	}

	public abstract double getBonificacion();

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
}
