public class FuelCalculator {


    public static void main(String[] args) {
        double travelTime = 1.5;
        double averageSpeed = 40.00;
        double distance;
        double litersUsed;

        distance = travelTime * averageSpeed;
        litersUsed = distance/12;

        System.out.println("Sua velocidade média foi: " + averageSpeed + " km/h");
        System.out.println("Seu tempo gasto foi: " + travelTime + " hora(s)");
        System.out.println("Sua distância percorrida foi: " + distance + " km");
        System.out.printf("A quantidade de litros utilizados foi: %.2f L", litersUsed);
    }

}
