public class ChallengeTemperatura {
    public static void main(String[] args) {
        double gradosCelcius = 27;
        double gradosFarenheit = (gradosCelcius * 1.8) + 32;
        System.out.println("La temperatura de " + gradosCelcius + " grados Celcius es equivalente a " + gradosFarenheit
        + " grados Farenheit.");

        int gradosFarenheitEntero = (int) gradosFarenheit;
        System.out.println("La temperatura de los grados Farenheit en valor entero es: " + gradosFarenheitEntero +
                " grados.");
    }
}
