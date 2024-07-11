import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Complejo complejo1,complejo2, complejoRespuesta;

        double real, imag;

        complejo1 = new Complejo(12,2);

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca la parte real del número complejo: ");
        real = scanner.nextDouble();
        System.out.println("Introduzca la parte imaginaria del número complejo: ");
        imag =scanner.nextDouble();


        complejo2 = new Complejo(real,imag);

        complejo1.Suma(complejo2);
        complejoRespuesta = Complejo.SumaComplejos(complejo1, complejo2);

        System.out.println("Complejo 1: "+complejo1);
        System.out.println("Complejo 2: "+complejo2);
        System.out.println("Complejo 3: "+complejoRespuesta);
        

    }
}
