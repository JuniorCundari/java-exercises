public class Main {
    public static void main(String[] args) {

        int f1 = 0;
        int f2 = 1;

        for (int i = 0; i < 10; i++) {
            System.out.print(f1 + " ");

            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
    }
}
