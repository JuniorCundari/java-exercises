public class Main {
    public static void main(String[] args) {

        int count = 0;

        double countryA = 80000;
        double countryB = 200000;

        while (countryA < countryB) {
            countryA += countryA * 0.03;
            countryB += countryB * 0.015;

            count++;
        }

        System.out.printf("O país A terá a população de: %.0f %n", countryA);
        System.out.printf("O país B terá a população de: %.0f %n", countryB);
        System.out.println("País A ultrapassará ou igualará o país B em " + count + " anos");
    }
}