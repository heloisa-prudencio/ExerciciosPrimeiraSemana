public class Ex3 {
    public static void main(String[] args) {
        Double hp = 2.8;
        Double lp = 4.0;
        Double ha = 0.80;
        Double la = 0.80;

        Double areaP = hp * lp;
        Double areaA = ha * la;

        Double qtdA = areaP / areaA;

        System.out.println("A quantidade de azulejos que devo comprar são " +  qtdA);

    }
}
