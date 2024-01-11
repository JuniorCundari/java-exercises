import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int citiesNumbers = 5;
        int highestAccidentRate = Integer.MIN_VALUE, lowerAccidentRate = Integer.MAX_VALUE;
        int highestAccidentCityCode = 0, lowerAccidentCityCode = 0;
        int totalVehicles = 0, totalAccidents = 0;
        int citiesWithLessThan2000 = 0;

        for (int i = 0; i < citiesNumbers; i++) {
            System.out.print("Código da cidade: ");
            int cityCode = scan.nextInt();

            System.out.print("Número de veículos de passeio (em 1999): ");
            int numberVehicles = scan.nextInt();

            System.out.print("Número de acidentes de trânsito com vítimas (em 1999): ");
            int numberAccidents = scan.nextInt();

            totalVehicles += numberVehicles;
            totalAccidents += numberAccidents;

            if (numberVehicles <= 2000) {
                citiesWithLessThan2000++;
            }

            if (numberAccidents > highestAccidentRate) {
                highestAccidentRate = numberAccidents;
                highestAccidentCityCode = cityCode;
            }

            if (numberAccidents < lowerAccidentRate) {
                lowerAccidentRate = numberAccidents;
                lowerAccidentCityCode = cityCode;
            }
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Maior índice de acidentes: " + highestAccidentRate + " Cidade: " + highestAccidentCityCode);
        System.out.println("Menor índice de acidentes: " + lowerAccidentRate + " Cidade: " + lowerAccidentCityCode);
        System.out.println("Média total de veículos nas cidades: " + (totalVehicles / citiesNumbers));

        if (citiesWithLessThan2000 > 0) {
            System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio: " + (totalAccidents / citiesWithLessThan2000));
        } else {
            System.out.println("Nenhuma cidade tem menos de 2.000 veículos de passeio.");
        }
    }
}
