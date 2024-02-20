import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        LightBulb lightBulb = new LightBulb();

        lightBulb.color = "Branca";
        lightBulb.electricTension = "Bivolt";

        lightBulb.turnOffLamp();
        lightBulb.showStatus();
        lightBulb.changeStatus();
        lightBulb.showStatus();
    }
}