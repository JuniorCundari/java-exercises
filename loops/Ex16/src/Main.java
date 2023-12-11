public class Main {
    public static void main(String[] args) {

        int f1 = 0;
        int f2 = 1;

        while (f1 <= 500) {
            System.out.print(f1 + " ");

            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
    }
}