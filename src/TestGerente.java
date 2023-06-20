package bytebank;
public class TestGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		// gerente.setSalario(5000);
		// Funcionario gerente = new Funcionario();
		gerente.setSalario(6000);
		gerente.setClave("AluraCursosOnLine");
		gerente.setTipo(1);
		System.out.println("Su salario como gerente es: " + gerente.getSalario());
		System.out.println("Su bonificacion mas su salario  que le corresponde como gerente es: " + gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("AluraCursosOnLine")); // clave erronea puesta a proposito
	}
	
}
