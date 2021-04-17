import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");

        Integer numero = sc.nextInt();

        System.out.println("O número sucessor é: " + (numero + 1));
        System.out.println("O número antecessor é: " + (numero - 1));

    }
}
