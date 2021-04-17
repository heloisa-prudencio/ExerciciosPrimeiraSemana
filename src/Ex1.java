import java.sql.PseudoColumnUsage;

public class Ex1 {
    public static void main(String[] args) {
        Double tempC = 24.0;
        Double tempK = tempC + 273.15;
        Double tempRe =  tempC * 0.8;
        Double tempRa =  tempC * 1.8 + 32 + 459.67;
        Double tempF =  tempC * 1.8 + 32;

        System.out.println("A temperatura em Celsius é " + tempC + " °C");
        System.out.println("A temperatura em Kelvin é " + tempK + " ºK");
        System.out.println("A temperatura em Réaumur é " + tempRe + " ºRe");
        System.out.println("A temperatura em Rankine é " + tempRa + " ºR");
        System.out.println("A temperatura em Fahrenheit é " + tempF + " ºF");
    }

}
