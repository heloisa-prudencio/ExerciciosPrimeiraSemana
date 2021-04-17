import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nomeAluno = sc.nextLine();

        System.out.println("Digite sua Primeira Nota:");
        Integer nota1 = sc.nextInt();

        System.out.println("Digite sua Segunda Nota:");
        Integer nota2 = sc.nextInt();

        System.out.println("Digite sua Terceira Nota:");
        Integer nota3 = sc.nextInt();

        System.out.println("Digite sua Quarta Nota:");
        Integer nota4 = sc.nextInt();

        Double media = (nota1 + nota2 + nota3 + nota4)/4.0;

        System.out.println("Olá " + nomeAluno + "!");
        System.out.println("Sua média é: " + media);
    }
}