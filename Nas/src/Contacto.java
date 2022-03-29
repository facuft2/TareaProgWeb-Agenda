public class Contacto{
    
    private String nombre;
    private int telefono;
    private String correo;
    
    public Contacto(String nombre, int telefono, String correo){
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getTelefono(){
        return telefono;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public String toString(){
        return "Nombre: " + nombre + "\nTelefono: " + telefono + "\nCorreo: " + correo;
    }


}