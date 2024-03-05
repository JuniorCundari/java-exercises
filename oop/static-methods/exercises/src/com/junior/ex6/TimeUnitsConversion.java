package com.junior.ex6;

public class TimeUnitsConversion {
    public static int minutesToSeconds(int minutes) {
        int seconds = 60;

        return minutes * seconds;
    }

    public static int hoursToMinutes(int hours) {
        int minutes = 60;

        return hours * minutes;
    }

    public static int daysToHours(int days) {
        int hours = 60;

        return days * hours;
    }

    public static int weeksToDays(int weeks) {
        int days = 7;

        return weeks * days;
    }

    public static int monthsToDays(int months) {
        int days = 30;

        return months * days;
    }

    public static double yearsToDays(int years) {
        double days = 365.25;

        return years * days;
    }
}
