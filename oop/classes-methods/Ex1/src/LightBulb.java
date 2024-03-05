public class LightBulb {
    String color;
    String electricTension;
    boolean working;
    
    void turnOnLamp() {
        working = true;
    }

    void turnOffLamp() {
        working = false;
    }

    void showStatus() {
        if (working) {
            System.out.println("Lâmpada ligada");
        } else {
            System.out.println("Lâmpada desligada");
        }
    }

    void changeStatus() {
        if (working) {
            turnOffLamp();
        } else {
            turnOnLamp();
        }
    }
}
