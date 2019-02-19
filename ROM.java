import java.io.*;
import java.util.*;

public class ROM
{
    public static void main(String args[])
    {
        Novice novice = new Novice();
        Bag bag = new Bag();
        System.out.println("-----Game Strat-----");
        System.out.println("Your HP: "+ novice.getHP());
        System.out.println("Your EXP: "+ novice.getEXP());
        System.out.println("Your LV: "+ novice.getLEVEL());
        System.out.println(" 1 to attack // 2 to hit // 3 open inventory // 99 buy more bag // 0 Eng Game");
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------");

        while(novice.getHP() != 0){
            int data = sc.nextInt();
            if(data == 1) {
                novice.att();
                bag.getPOTION();
                System.out.println("You get Potion!!");
            }
            else if (data == 2) {
                novice.hit();
                System.out.println("You are attacked!!");
            }
            else if (data == 3) {
                bag.showBag();
                System.out.println("prees 1-5 use any potion // prees 9 close bag");
                int num = sc.nextInt();
                if(num != 9){
                    novice.heal(bag.usePOTION(num));
                    System.out.println("You are healing +10 HP!!");
                }
            }
            else if (data == 99) {
                System.out.println("Wellcome!! Enter your value for buy more bag");
                System.out.println("50 = 1 slot");
                int morebag = sc.nextInt();
                bag.VIP(morebag);
            }
            else if (data == 0) {
                novice.dead();
            }
            System.out.println("------------------");
            System.out.println("Your HP: "+ novice.getHP());
            System.out.println("Your EXP: "+ novice.getEXP());
            System.out.println("Your LV: "+ novice.getLEVEL());
            System.out.println("------------------");
        }
        System.out.println("-----End Game-----");
    }
    
}