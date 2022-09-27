
import java.io.File;
import java.util.Scanner;

public class MainFile {

    public static void main(String[] args) {

        String directorio = pedirDatos();
        
        try {

            File file = new File(directorio);
            String[] archivos = file.list();
            imprimirDatos(archivos, file);
            
        } catch (Exception NullPointerException) {
            System.out.println("La direccion no existe o es incorrecta");
            main(args);
        }

    }

    public static String pedirDatos() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce directorio ");
        return scanner.nextLine();
    }

    public static void imprimirDatos(String[] archivos, File file) {

        System.out.println("Ficheros en el directorio actual: " + archivos.length);

        for (String archivo : archivos) {
            File file2 = new File(file, archivo);
            System.out.println("Nombre: " + archivo + " , "
                    + "¿Es Fichero? " + file2.isFile() + " , "
                    + "¿Es Directorio? " + file2.isDirectory());
        }

    }

}
