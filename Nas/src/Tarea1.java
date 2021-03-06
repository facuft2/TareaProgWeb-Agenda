import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class Tarea1 {

    public static void main(String[] args) {
        char opcion;
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        ArrayList<Contacto> contactos = new ArrayList<Contacto>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Quieres ingresar un nuevo contacto o consultar un contacto existente?");
            System.out.println("Ingrese I para un nuevo contacto");
            System.out.println("Ingrese C para consultar un contacto");
            System.out.println("Ingrese S para salir");
            opcion = sc.next().charAt(0);
            switch (opcion) {
                case 'i':
                case 'I':
                    System.out.println("Ingrese su nombre");
                    String nombre = sc.next();
                    if (nombre == null) {
                        System.out.println("El nombre no puede ser nulo");
                    } else {
                        System.out.println("Ingrese su telefono");
                        int telefono = sc.nextInt();
                        if (telefono == 0) {
                            System.out.println("El telefono no puede ser nulo");
                        } else {
                            System.out.println("Ingrese su correo (opcional)");
                            String correo = sc.next();
                            if (correo == null) {
                                Contacto contacto = new Contacto(nombre, telefono, correo);
                                contactos.add(contacto);
                            } else {
                                Matcher mather = pattern.matcher(correo);
                                if (mather.matches()) {
                                    System.out.println("El contacto se ha agregado correctamente");
                                    Contacto contacto = new Contacto(nombre, telefono, correo);
                                    contactos.add(contacto);
                                } else {
                                    System.out.println("El correo ingresado no es valido");
                                }
                            }

                        }

                    }
                    break;

                case 'c':
                case 'C':
                    System.out.println("Ingrese su nombre");
                    String nombre2 = sc.next();
                    if (nombre2 == null) {
                        System.out.println("Ingrese un nombre para buscar");
                    } else {
                        for (int i = 0; i < contactos.size(); i++) {
                            if (contactos.get(i).getNombre().equals(nombre2)) {
                                System.out.println(contactos.get(i).toString());
                            } else {
                                System.out.println("El contacto no existe");
                            }
                        }
                    }
                    break;
                case 's':
                case 'S':
                    System.out.println("Gracias por usar nuestra agenda");
                    ;
                    break;
                default:
                    System.out.println("Comando no reconocido");
                    break;
            }
        } while (opcion != 's' && opcion != 'S');

    }
}
