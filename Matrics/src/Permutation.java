/*
import java.util.Scanner;

public class Permutation {
    static int A[] = new int[len];
    static  char[] res = new char[len];
   static void perm(char[] ch, int k)
   {

        if(ch[k] == ch.length)
        {
            res[k] = (char) ch.length;
            System.out.println(res);
        }
        else{
            for (int i = 0; i < ch.length ; i++) {
                if(A[i]==0)
                {
                    res[k] = ch[i];
                    A[i]=1;
                    perm(ch,k+1);
                }
            }
        }
   }
  public static void main()
  {
      System.out.println("Enter the String");
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      char ch[] = str.toCharArray();
      int length = ch.length;
      perm(ch, 0,  length);
  }
}
*/
