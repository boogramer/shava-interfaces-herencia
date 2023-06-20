public class CuentaCorriente extends Cuenta implements Tributacion{

	public CuentaCorriente( int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double comision = 0.2;
		return super.saca(valor + comision);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}
	@Override
	public double getValorImpuesto() {
		return super.saldo*.01;
	}
}
