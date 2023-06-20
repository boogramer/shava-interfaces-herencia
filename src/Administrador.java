package bytebank;

public class Administrador extends Funcionario implements Autenticable {

/*    private String clave;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave) {
        return this.clave.equals(clave);
    */

    public double getBonificacion() {
        return 250;
    }

    private AutenticacionUtil util;

    public Administrador() {
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
