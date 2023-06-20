public class TestSistemaInterno {
    public static void main(String[] args) {
        SistemaInterno sistema = new SistemaInterno();
        Gerente gerente1 = new Gerente();
        Administrador admin = new Administrador();

        gerente1.setClave("xd");
        admin.setClave("pollsfitj");
        //gerente1.iniciarSesion("pollas");
        //admin.iniciarSesion("admin01");

        sistema.autenticar(gerente1);
        sistema.autenticar(admin);
    }
}
