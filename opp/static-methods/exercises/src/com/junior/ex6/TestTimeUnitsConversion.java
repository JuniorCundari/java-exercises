package com.junior.ex6;

public class TestTimeUnitsConversion {
    public static void main(String[] args) {
        showResults(TimeUnitsConversion.minutesToSeconds(50));

        showResults(TimeUnitsConversion.hoursToMinutes(50));

        showResults(TimeUnitsConversion.daysToHours(50));

        showResults(TimeUnitsConversion.weeksToDays(50));

        showResults(TimeUnitsConversion.monthsToDays(50));

        showResults(TimeUnitsConversion.yearsToDays(50));
    }

    static void showResults(double result) {
        System.out.println(result);
    }
}
