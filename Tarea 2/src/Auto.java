public class Auto {
    
    public static final String MERCEDEZ_BENZ = "Mercedes_Benz";
    public static final String FIAT = "Fiat";
    public static final String PEUGEOT = "Peugeot";
    public static final String TOYOTA = "Toyota";
    public static final String CHEVROLET = "Chevrolet";

    private String matricula;
    private Persona propietario;
    private String marca;

    public Auto(String marca, String matricula, Persona propietario) {
        this.matricula = matricula;
        this.propietario = propietario;
        this.marca=marca;
    }

public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }
}
