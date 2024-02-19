public class Ex1 {
    public static void main(String[] args) {

        LightBulb product1 = new LightBulb();

        product1.brand = "Ouro Lux";
        product1.lampType = "LED";
        product1.lampShape = "Bolinha";
        product1.power = 4;
        product1.color = "Branca";
        product1.electricTension = "Bivolt";
        product1.wiFi = true;
        product1.price = 4.90;

        System.out.println(product1.brand);
        System.out.println(product1.lampType);
        System.out.println(product1.lampShape);
        System.out.println(product1.power);
        System.out.println(product1.color);
        System.out.println(product1.electricTension);
        System.out.println(product1.wiFi);
        System.out.println(product1.price);
    }
}