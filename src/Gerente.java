public class Gerente extends Funcionario implements Autenticable {

/*    private String clave;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave) {
        return this.clave.equals(clave);
    }*/

    public double getBonificacion() {
        System.out.println("Llamando metodo del Gerente");
        //return this.salario * 0.05 + super.getSalario();
        return 250;
    }

    private AutenticacionUtil util;

    public Gerente() {
        this.util = new AutenticacionUtil();
    }

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);
    }
    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }
}
