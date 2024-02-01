public class Main {
    public static void main(String[] args) {

        int[] A = {98, 12, 34, 66, 100};

//  Selection Sort -> complexity O(N²)
//        for (int i = 0; i < A.length - 1; i++) {
//            int min = i;
//
//            for (int j = i + 1; j < A.length; j++) {
//                if (A[j] < A[min]) {
//                    min = j;
//                }
//            }
//
//            int temp = A[min];
//            A[min] = A[i];
//            A[i] = temp;
//        }
//
//        for (int a : A) {
//            System.out.print(a + " ");
//        }
// --------------------------------------------

//  Bubble Sort -> complexity O(N²)
//        int temp;
//        boolean swapped;
//
//        for (int i = 0; i < A.length - 1; i++) {
//            swapped = false;
//
//            for (int j = 0; j < A.length - i - 1; j++) {
//                if (A[j] > A[j + 1]) {
//                    temp = A[j];
//                    A[j] = A[j + 1];
//                    A[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//
//            if (!swapped) {
//                break;
//            }
//        }
//
//        for (int a : A) {
//            System.out.print(a + " ");
//        }
// ----------------------------------------------

//  Insertion Sort -> O(N²)
        for (int i = 1; i < A.length; i++) {
            int key = A[i];
            int j = i - 1;

            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j = j - 1;
            }

            A[j + 1] = key;
        }

        for (int a : A) {
            System.out.print(a + " ");
        }
// --------------------------------------------
    }
}