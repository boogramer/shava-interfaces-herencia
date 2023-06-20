public class TestTributacion {

    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(222, 333);
        cc.deposita(100.0);
        System.out.println(cc.getSaldo());

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadoreDeImpuesto calc = new CalculadoreDeImpuesto();

        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImpuesto());
    }

}