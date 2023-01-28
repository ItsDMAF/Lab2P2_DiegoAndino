
package lab2p2_diegoandino;

public class Edificios {
    
    private int piso;
    private int locales;
    private String direccion;  
    private String estado;
    private String dueño;
    
    public Edificios(int piso, int local, String direc){
        this.piso = piso;
        locales = local;
        direccion = direc;
        this.estado = estado;
        this.dueño = dueño;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getLocales() {
        return locales;
    }

    public void setLocales(int locales) {
        this.locales = locales;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
    
    @Override
    public String toString(){
        return "piso: " + piso + " locales: " + locales + " Dirrecion: " + direccion +
                " estado: " + " Dueño: " + dueño;
    }
    

    
}
