
public class TestReferencias {
	
	public static void main(String[] args) {
		Funcionario funcionario = new Contador();
		funcionario.setNombre("Diego");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
	}
	
}
