import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertirMoneda {


    public static void convertir (String monedaBase, String monedaObjetivo, ConsultaMoneda consultaMoneda, Scanner lectura) {
        double monto;
        double montoconvertido;

        Monedas monedas = consultaMoneda.BusquedaDeMoneda(monedaBase, monedaObjetivo);
        System.out.println("ingrese la cantidad de " + monedaBase);
        try {
            monto = Double.parseDouble(lectura.nextLine());
            montoconvertido = monto * monedas.conversion_rate();
            System.out.println("\n"+monto + " " + monedaBase + " es igual a  " + montoconvertido + " " + monedaObjetivo);
        }
        catch (Exception e){
            System.out.println("Solo se pueden ingresar números");
            System.out.println(e.getMessage());
        }

    }
}
