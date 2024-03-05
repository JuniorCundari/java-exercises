package com.junior.ex5;

public class TestVolumeUnitsConversion {
    public static void main(String[] args) {
        showResult(VolumeUnitsConversion.litersToCubicCentimeters(10));

        showResult(VolumeUnitsConversion.cubicMeterToLiters(10));

        showResult(VolumeUnitsConversion.cubicMetersToCubicFeet(10));

        showResult(VolumeUnitsConversion.USGallonToCubicInches(10));

        showResult(VolumeUnitsConversion.USGallonToLiters(10));
    }

    static void showResult(double calculate) {
        System.out.println(calculate);
    }
}
