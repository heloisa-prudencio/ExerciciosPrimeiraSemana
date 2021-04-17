import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do primeiro funcionário:");
        String nomeFunc1 = sc.nextLine();

        System.out.println("Digite o salário do primeiro funcionário:");
        Double salFunc1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite o nome do segundo funcionário:");
        String nomeFunc2 = sc.nextLine();

        System.out.println("Digite o salário do segundo funcionário:");
        Double salFunc2 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite o nome do terceiro funcionário:");
        String nomeFunc3 = sc.nextLine();

        System.out.println("Digite o salário do terceiro funcionário:");
        Double salFunc3 = sc.nextDouble();
        sc.nextLine();

        Double media = (salFunc1+ salFunc2 + salFunc3)/3.0;

        System.out.println("Esses são os funcionários da empresa:!");
        System.out.println("Funcionário - " + nomeFunc1 +
                ", Salário -  " + salFunc1);
        System.out.println("Funcionário - " + nomeFunc2 +
                ", Salário -  " + salFunc2);
        System.out.println("Funcionário - " + nomeFunc3 +
                ", Salário -  " + salFunc3);

        System.out.println("A média de salários é: " + media);
    }
}