package com.junior.ex5;

public class VolumeUnitsConversion {
    public static int litersToCubicCentimeters(int liter) {
        int cubicCentimeters = 1000;

        return  liter * cubicCentimeters;
    }

    public static int cubicMeterToLiters(int cubicMeter) {
        int liters = 1000;

        return cubicMeter * liters;
    }

    public static double cubicMetersToCubicFeet(int cubicMeter) {
        double cubicFeet = 35.32;

        return cubicMeter * cubicFeet;
    }

    public static int USGallonToCubicInches(int USGallon) {
        int cubicInches = 231;

        return USGallon * cubicInches;
    }

    public static int USGallonToLiters(int USGallon) {
        int liters = 3785;

        return USGallon * liters;
    }
}
