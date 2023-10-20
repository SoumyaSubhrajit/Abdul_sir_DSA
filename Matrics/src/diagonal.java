import java.util.Scanner;

public class diagonal
{
    static int r;
   static  int c;
  static int[][] makeMat()
  {
      System.out.println("Enter the size of the row");
      Scanner sc = new Scanner(System.in);
       r = sc.nextInt();
      System.out.println("Enter the size of the col");
       c = sc.nextInt();
      int[][] mat = new int[r][c];
      for (int i = 0; i < r; i++) {
          for (int j = 0; j < c; j++) {
              if (i == j) {
                  mat[i][j] = sc.nextInt();
              }
          }
      }
      return mat;
  }

 static void matDis(int[][] mat)
  {
      for (int i = 0; i < r; i++) {
          for (int j = 0; j < c; j++) {
                  System.out.print(mat[i][j]+" ");
          }
          System.out.println();
      }
  }

  public static void main(String args[])
  {
      int[][] mat = makeMat();
      matDis(mat);
  }
}
// Gave a 2d array and find the diagonal element.
// He want to set for the only diagonal mat not allowing the user input and just for the diagonal and all are zeros.