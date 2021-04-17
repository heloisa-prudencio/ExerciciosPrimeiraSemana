import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Integer numero;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informar um número: ");
        numero = scanner.nextInt();

        Integer multiplicador = 1;
        while(multiplicador <= 10)
        {
            Integer resultado = numero * multiplicador;
            System.out.println(resultado);
            multiplicador++;
        }
    }
}

