public class SistemaInterno {
    public boolean autenticar(Autenticable funcionario){
        String clave = "pollsfitj";
        boolean puedeIniciarSesion = funcionario.iniciarSesion(clave);
        if (puedeIniciarSesion) {
            System.out.println("Login exitoso");
            return true;
        }
        System.out.println("Error de login");
        return false;
    }
}
