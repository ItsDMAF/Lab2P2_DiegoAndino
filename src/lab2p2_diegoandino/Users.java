
package lab2p2_diegoandino;

public class Users {
    
    private String nombre;
    private int edad;  
    private String user;
    private String password;
    
    public Users(){
        
    }

    public Users(String nombre, int edad, String user, String pass){
        this.nombre = nombre;
        this.edad = edad;
        this.user = user;
        password = pass;
  
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString(){
        return "nombre: " + nombre + " edad: " + edad + " Usuario: " + user + " Password: " + password;
    }
    
    
}
