public class Array_representation_of_Smatrix {

    // Saving the non-zero element in a new array.
    static int[] savingNonZeroNumbers(int[][] mat,int[] matValue,  int row, int col){
        int initialvalue = 0;
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                if(mat[i][j] !=0)
                {
                   matValue[initialvalue] = mat[i][j];
                   initialvalue++;
                }
            }
        }
        return  matValue;
    }

    // Calculating non-zero in the original array.
    static  int calNonZero(int[][] mat, int row, int col){
        int nonZeroCount=0;
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                if(mat[i][j] !=0)
                {
                    nonZeroCount++;
                }
            }
        }
        return nonZeroCount;
    }
    public static void main(String[] args) {
        // Creating a 2D mat of giving data "NO USER INPUT"
       int[][] sparseMatrix = {
               {0,0,3,0,4},
               {0,0,5,7,0},
               {0,0,0,0,0},
               {0,2,6,0,0}
       };
        int row = sparseMatrix.length;
        int col = sparseMatrix[0].length;

        int nonZeroCount = calNonZero(sparseMatrix, row, col);

        // We have to create array for saving the non-zero numbers.

        int[] Values = new int[nonZeroCount];
        int[] nonZeroValues = savingNonZeroNumbers(sparseMatrix, Values, row, col );

        for(int ele: nonZeroValues)
        {
            System.out.print(ele+" ");
        }
    }
}
