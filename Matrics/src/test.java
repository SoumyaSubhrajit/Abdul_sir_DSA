public class test {
    static int i;
    static int j;
    public static void main(String[] args) {
        int k = 10;
        System.out.println(k);
        test t1 = new test();
        t1.test();
    }
    public void test(){
        System.out.println(i);
        /*System.out.println(t1.i);*/
        System.out.println(test.j);
    }
}
