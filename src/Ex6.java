public class Ex6 {
    public static void main(String[] args) {
        Integer num1 = 4;
        Integer num2 = 5;
        Integer num3 = 6;
        Integer num4 = 7;
        Integer num5 = 8;
        Integer num6 = 9;

        Integer media1 = (num1 + num2 + num3)/3;
        Integer media2 = (num4 + num5 + num6)/3;
        Double media3 = (media1 + media2)/2.0;

        System.out.println("A média dos números 4, 5 e 6 é: " + media1);
        System.out.println("A média dos números 7, 8 e 9 é: " + media2);
        System.out.println("A soma das médias é: " + (media1 + media2));
        System.out.println("A média das médias é: " + media3);
    }
}
