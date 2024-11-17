import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
class Game1{
    int computer_no;
    int count=0;
    public Game1()
    {   Random ran=new Random();
        computer_no =ran.nextInt(1,11);
    }
    public String play(int user_no)
    {
        if(computer_no==user_no)
        {       count++;
            return "you guss right number";

        }
        else if(computer_no>user_no)
        {
            count++;
            return "your number is small";
        }
        else{
            count++;
            return "your number is greater";
        }
    }
        public int score(){
            return count;
    }
}
public class Guss_game {
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     Game1 g=new Game1();
     String c;
     while(true)
     {  System.out.println("guess the computer generated number between the  1 to 10: ");
         int user_no=sc.nextInt();
        c=g.play(user_no);
         System.out.println(c);
        if(Objects.equals(c, "you guss right number"))
        {   System.out.printf("computer choose is:%d\n",g.computer_no);
            System.out.printf("************ your take %d chance ***********",g.score());
            break;
        }
     }

    }
}
