package geekbrains.lesson2;

public class Main {

    public static void main(String args[]) {
        invertArray();
        filledArray();
        arrayMultiplyBy2();
        matrixDiagonalFill();
        //arrayMinMax();

    }

    public static void invertArray() {
        int[] arr = {0, 1, 0, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] += 1;
            } else {
                arr[i] -= 1;
            }
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void filledArray() {
        int[] array = new int[8];
        int element = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = element;
            element += 3;
            System.out.println(array[i]);
        }
        System.out.println();
    }

    public static void arrayMultiplyBy2() {

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            } else {
                arr[i] += 0;
            }
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void matrixDiagonalFill() {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - 1 - i] = 1;
        }

            for (int[] ints : matrix) {
                for(int anInt : ints) {
                    System.out.print (anInt + " , ");
                }
                System.out.println();

            }
            System.out.println();

        }
}





