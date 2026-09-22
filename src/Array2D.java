public class Array2D {
    public static void main(String[] args) {
        int[] marks = {80, 90, 75, 88}; //1D ARRAY Intialization
        for (int mark : marks) {
            System.out.println(mark);
        }
        int[][] matrix = { //2D Array Intialization
                {1, 2},
                {3, 4}
        };
        System.out.println("2D array value: " + matrix[1][0]);
        for (int i = 0; i < matrix.length; i++) { //nested for loop
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        }
    }


