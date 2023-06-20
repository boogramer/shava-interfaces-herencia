public class CuentaAhorros extends Cuenta implements Tributacion {
	
	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}

	@Override
	public double getValorImpuesto() {
		return 0;
	}
}
