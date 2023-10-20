import java.util.Scanner;
public class mat1
{
    public static int[][] makeMat()
    {
        System.out.println("Enter the size of the col");
        Scanner sc = new Scanner(System.in);
        int r =  sc.nextInt();
        System.out.println("Enter the size of the row");
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length ; j++) {
                   mat[i][j] = sc.nextInt();
            }
        }
        return mat;
    }

  public static void matDis(int[][] mat)
    {
        for (int i = 0; i < mat.length ; i++) {
            for (int j = 0; j < mat[i].length ; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
         int mat[][] = makeMat();
         matDis(mat);
    }
}