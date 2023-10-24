import java.util.Scanner;

public class Lower_Triangonal_row_major {
    static int r;
    static int c;
  static int[][] createArray(){
      System.out.println("Enter the size of an row!");
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
      return  arr;
  }
  static void display(int[][] arr){
      for (int i = 0; i < r ; i++) {
          for (int j = 0; j < c; j++) {
              System.out.print(arr[i][j]+ " ");
          }
          System.out.println();
      }
  }
    public static void main(String[] args) {
        int[][] arr = createArray();
        display(arr);
    }
}
