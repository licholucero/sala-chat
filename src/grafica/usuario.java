
package grafica;

public class usuario {
    private String usuario;
    private String password;

    public usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "El usuario es: " + usuario + ",y su password es: " + password ;
    }
    
}
