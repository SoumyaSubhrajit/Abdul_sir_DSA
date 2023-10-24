import java.util.Scanner;

public class Lower_Triangonal_row_major {
    static int[] rowMajor;
    static int r;
    static int c;

    // Creating a 2D matrix.
    static int[][] createArray() {
        System.out.println("Enter the size of a row!");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        System.out.println("Enter the size of column!");
        c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    // Displaying the lower triangular portion of the 2D matrix.
    static void display(int[][] arr) {
         rowMajor = new int[r*(r+1)/2];
         int rowIndex =  0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
            {
                if (i >= j)
                {
                    System.out.print(arr[i][j] + " ");
                    rowMajor[rowIndex] = arr[i][j];
                    rowIndex++;
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] arr = createArray();
        display(arr);
        for(int element: rowMajor)
        {
            System.out.print(element+ " ");
        }


    }
}
