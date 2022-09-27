public class CurrencyConverter {
    public static void main(String[] args) {
        double dollarValueToday = 5.17;
        double realAmount = 20.00;

        double convertRealToDollar =  realAmount / dollarValueToday ;
        System.out.printf("A cotação do dólar hoje é R$ %.2f", dollarValueToday);
        System.out.println("");
        System.out.printf("R$ %.2f em dólar é: $ %.2f", realAmount, convertRealToDollar);
    }
}
