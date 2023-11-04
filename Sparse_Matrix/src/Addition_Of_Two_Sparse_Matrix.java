public class Addition_Of_Two_Sparse_Matrix {

    // Adding the 2 sparse matrix.
    static int[] addingSparseMat(int[] arr1, int[] arr2, int[] res, int num1, int num2)
    {
        int i = 0, j=0, k = 0;
        while(i< num1 && j<num2)
        {
            if(arr1[i] > arr2[j])
            {
                res[k++] = arr2[j++];
            }
            else if(arr1[i] < arr2[j])
            {
                res[k++] = arr1[i++];
            }
            else{
                if(arr1[j] > arr2[j])
                {
                    res[k++] = arr2[j++];
                }
                else if((arr1[j] < arr2[j]))
                {
                    res[k++] = arr1[j++];
                }
                else{
                    res[k] = arr1[i++];
                    res[k++] = arr2[j++];
                }
            }
        }
        return res;
    }



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
        int[][] mat1 =   {
                {0, 0, 3, 0, 4},
                {0, 0, 5, 7, 0},
                {0, 0, 0, 0, 0},
                {0, 2, 6, 0, 0}
        };
        int[][] mat2 = {
                {0, 8, 0, 1, 0},
                {0, 0, 2, 0, 0},
                {0, 0, 9, 4, 0},
                {0, 5, 0, 0, 10}
        };

        int row = mat1.length;
        int col= mat1[0].length;

        // Calculate the number of non-zero element in both matrix.
        int nonZeroMat1 = calNonZero(mat1, row, col);
        int nonZeroMat2 =  calNonZero(mat2, row,col);

        // If the dimension of the two matrix are same then no need be take another value.

        int[] value1 = new int[nonZeroMat1];
        int[] value2 = new int[nonZeroMat2];

        int[] nonZeroValue1 = savingNonZeroNumbers(mat1, value1, row, col);
        int[] nonZeroValue2 = savingNonZeroNumbers(mat2, value2, row, col);

        // Taking the final array to store the adding data of the two matrixs..
        int[] res1 = new int[nonZeroMat1+nonZeroMat2];

         int res2[] = addingSparseMat(nonZeroValue1, nonZeroValue2,res1, nonZeroMat1, nonZeroMat2);

         for(int ele: res2) {
             if (ele != 0) {
                 System.out.print(ele + " ");
             }
         }

    }
}
