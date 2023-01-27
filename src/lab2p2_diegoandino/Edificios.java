
package lab2p2_diegoandino;

public class Edificios {
    
    private int piso;
    private int locales;
    private String direccion;    
    
    public Edificios(int piso, int local, String direc){
        this.piso = piso;
        locales = local;
        direccion = direc;
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
    
    @Override
    public String toString(){
        return "piso: " + piso + " locales: " + locales + " Dirrecion: " + direccion ;
    }
    

    
}
