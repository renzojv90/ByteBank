
public class Gerente extends Funcionario implements Autenticable {
	

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean iniciarSesion(String clave) {
		return false;
	}
	@Override
	public double getBonificacion() {
		return super.getSalario() + this.getSalario() * 0.05;
	}
	
	
	
	/*public boolean autenticar(int contraseña) {
	    if (this.contraseña == contraseña) {
	        return true;
	    } else {
	        return false;
	    }
	}
	*/
}
