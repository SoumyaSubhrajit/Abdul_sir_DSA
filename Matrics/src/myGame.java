public class myGame
{
    String name;
    String gender;
    int age;



    public myGame(String name, String gender, int age){
        this.name = name;
        this. gender = gender;
        this.age = age;
        System.out.println("The addhar card of the man is:"+ name+gender+age);
    }
    public static void main(String args[]){
       System.out.println("This is the first programme I done since past few month");
       String myName = "Soumya is a programmer";
       myGame m1 = new myGame("kanha", "male", 23);

    }
}