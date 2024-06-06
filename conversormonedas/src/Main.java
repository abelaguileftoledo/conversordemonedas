import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String... args) throws IOException, InterruptedException {


        double amount = 0; // Cantidad a convertir
        ExchangeRate conversion = new ExchangeRate();

        Scanner lectura = new Scanner(System.in);

        int opcion = 0;

        Scanner pesos = new Scanner(System.in);

        while (opcion != 7) {
            System.out.println("******************************");
            System.out.println("Bienvenido al conversor de Monedas");
            System.out.println("******************************");
            System.out.println("""
                    Seleccione la opción deseada\n
                    1- Convertir dólares a pesos Argentinos
                    2- Convertir de peso argentino a dólar
                    3- Convertir de dólar a real brasileño
                    4- Convertir de real brasileño a dólar
                    5- Convertir de dólar a peso colombiano
                    6- Convertir de peso colombiano a dolar
                    7- Salir del conversor""");

            System.out.print("Ingresa una opción: ");
            opcion = lectura.nextInt();
            switch (opcion) {


                case 1:

                    System.out.println("Ingrese la cantidad de dólares que desea convertir a peso argentino: ");

                    double tipo_moneda = pesos.nextDouble();
                    conversion.pairConversion("USD", "ARS", tipo_moneda);
                    break;


                case 2:
                    System.out.println("Ingrese la cantidad de pesos Argentinos que desea convertir a dolares: ");
                    double tipoMoneda1 = pesos.nextDouble();
                    conversion.pairConversion("ARS", "USD", tipoMoneda1);
                    break;

                case 3:
                    System.out.println("Ingrese la cantidad de dólares a real brasileño que desea convertir");
                    double tipoMoneda2 = pesos.nextDouble();
                    conversion.pairConversion("USD", "BRL", tipoMoneda2);
                    break;

                case 4:
                    System.out.println("Ingrese la cantidad de reales brasileños que desea convertir a dólar");
                    double tipoMoneda3 = pesos.nextDouble();
                    conversion.pairConversion("BRL", "USD", tipoMoneda3);
                    break;

                case 5:
                    System.out.println("Ingrese la cantidad de dólares que desea convetir a pesos colombiano");
                    double tipoMoneda4 = pesos.nextDouble();
                    conversion.pairConversion("USD", "COP", tipoMoneda4);
                    break;

                case 6:
                    System.out.println("Ingrese la cantidad de pesos colombianos  que desea convertir a dólares");
                    double tipoMoneda5 = pesos.nextDouble();
                    conversion.pairConversion("COP", "USD", tipoMoneda5);
                    break;

                default:
            }

        }

    }
}
