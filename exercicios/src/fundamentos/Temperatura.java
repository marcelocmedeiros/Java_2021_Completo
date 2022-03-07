package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        // (°F -32) X 5/9 = °c

        double fahrenheit = 86;
        final double AJUSTE = 32;
        final double FATOR = 5.0/9.0;

        double celsius = (fahrenheit - AJUSTE)* FATOR;
        System.out.println("Celsius = "+celsius+"°");


    }
}
