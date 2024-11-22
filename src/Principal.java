import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();
        int opcion = 0;
        String menu = """
                    
                    ****** Bienvenidos al conversor de monedas *********
                    
                          Elija una de las siguientes opciones:
                    
                    1- Dolar  =========> Peso argentino
                    2- Peso argentino  =========> Dolar
                    3- Dolar  =========> Real brasileño
                    4- Real brasileño  =========> Dolar
                    5- Dolar =========> Peso colombiano
                    6- Peso colombiano =========> Dolar
                    7- Salir
                               """;

        while(opcion != 7) {

            System.out.println(menu);
            try {
                opcion = Integer.parseInt(lectura.nextLine());
            }
            catch (NumberFormatException e){
                System.out.println("Solo ingrese números");
                System.out.println(e.getMessage());
            }

            switch (opcion){

                case 1:
                    ConvertirMoneda.convertir("USD","ARS", consultaMoneda,lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS","USD", consultaMoneda,lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD","BRL", consultaMoneda,lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL","USD", consultaMoneda,lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD","COP", consultaMoneda,lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP","USD", consultaMoneda,lectura);
                    break;
                case 7:
                    System.out.println("Finalizando el programa...");
                    break;
                default:
                    System.out.println("Opcion no válida");
                    break;

            }
            lectura.nextLine();
        }
    }
}
