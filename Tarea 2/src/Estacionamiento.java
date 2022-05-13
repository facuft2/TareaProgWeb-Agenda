import java.util.ArrayList;

class Estacionamiento{
    private static int lugares;
    private static int costoIngreso;
    private static int costoNoche;

    private static ArrayList<Persona> lugaresOcupados = new ArrayList<Persona>();

    //inicializa el estacionamiento
    public static void inicializar(int lugares, int costoIngreso, int costoNoche){
        Estacionamiento.lugares = lugares;
        Estacionamiento.costoIngreso = costoIngreso;
        Estacionamiento.costoNoche = costoNoche;
        Estacionamiento.lugaresOcupados = new ArrayList<Persona>();
    }

    //entra un auto y se le agrega el costo de la noche
    public static void entra(Auto auto){
        if(Estacionamiento.lugares>0 && Estacionamiento.lugares < 8){
            Estacionamiento.lugares--;
            lugaresOcupados.add(auto.getPropietario());
            auto.getPropietario().setCuenta(auto.getPropietario().getCuenta() + costoIngreso);
            System.out.println("Entra " + auto.getMatricula());
        }else{
            System.out.println("No hay lugares");
        }

    }

    public static void sale(Auto auto) {
        Estacionamiento.lugares++;
        lugaresOcupados.remove(auto.getPropietario());
        System.out.println("Sale " + auto.getMatricula());
        
    }

    public static void nuevoDia(){
        for (Persona per : lugaresOcupados) 
    { 
        per.setCuenta(per.getCuenta() + costoNoche);
    }
}
    
    public static void calcular(){
        for (Persona per : lugaresOcupados) 
    { 
        System.out.println(per.getNombre() + ": " + per.getCuenta());
    }

    }


   

}