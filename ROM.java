import java.io.*;
import java.util.*;

public class ROM
{
    public static void main(String args[])
    {
        Novice novice = new Novice();
        Wizard wz = new Wizard();
        Knight kn = new Knight();
        Bag bag = new Bag();
        System.out.println("-----Game Strat-----");
        System.out.println("Your HP: "+ novice.getHP());
        System.out.println("Your EXP: "+ novice.getEXP());
        System.out.println("Your LV: "+ novice.getLEVEL());
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------");
        String career="null";
        
        while(novice.getHP() != 0 && wz.getHP() != 0 && kn.getHP() != 0){
            //------------------------
            if(novice.getLEVEL() == 5 && novice.getEXP() == 0){
                int render=5;
                while(render != 1 && render != 2){
                    System.out.println("Prees '1' to Wizard || Prees '2' to Knight");
                    render = sc.nextInt();
                    if(render == 1){
                        wz.setWizard(novice.getHP(),novice.getEXP(),novice.getLEVEL());
                        career = "wizard";
                    }
                    else if(render == 2){
                        kn.setKnight(novice.getHP(),novice.getEXP(),novice.getLEVEL());
                        career = "knight";
                    }
                }
            }
            if(career.equals("null") == true){
                //--------------------------
                System.out.println(" 1 to attack // 2 to hit // 3 open inventory // 99 buy more bag // 0 Eng Game");
                int data = sc.nextInt();
                //--------------------- for novice
                if(data == 1) {
                    novice.att();
                    bag.getItem();
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
                        if(bag.checkitem(num) == 1) novice.heal(bag.useItem(num));// use potion
                        else if(bag.checkitem(num) == 0) novice.bootExp(bag.useItem(num)); // use extboost
                        /*
                        novice.heal(bag.usePOTION(num)); 
                        System.out.println("You are healing +10 HP!!");
                    */
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
                System.out.println("Your are Novice!!");
                System.out.println("Your HP: "+ novice.getHP());
                System.out.println("Your EXP: "+ novice.getEXP());
                System.out.println("Your LV: "+ novice.getLEVEL());
                System.out.println("------------------");
            //---------------------------------
            } // end of novice
            else if(career.equals("wizard") == true){
                while(wz.getHP() != 0){
                    //--------------------------
                    System.out.println(" 1 to attack // 2 to hit // 3 open inventory // 99 buy more bag // 0 Eng Game");
                    int data = sc.nextInt();
                    //--------------------- for wizard
                    if(data == 1) {
                        wz.att();
                        bag.getItem();
                        System.out.println("You get Potion!!");
                    }
                    else if (data == 2) {
                        wz.hit();
                        System.out.println("You are attacked!!");
                    }
                    else if (data == 3) {
                        bag.showBag();
                        System.out.println("prees 1-5 use any potion // prees 9 close bag");
                        int num = sc.nextInt();
                        if(num != 9){
                            if(bag.checkitem(num) == 1) wz.heal(bag.useItem(num));// use potion
                            else if(bag.checkitem(num) == 0) wz.bootExp(bag.useItem(num)); // use extboost
                        }
                    }
                    else if (data == 99) {
                        System.out.println("Wellcome!! Enter your value for buy more bag");
                        System.out.println("50 = 1 slot");
                        int morebag = sc.nextInt();
                        bag.VIP(morebag);
                    }
                    else if (data == 0) {
                        wz.dead();
                    }
                    System.out.println("------------------");
                    System.out.println("Your are Wizard!!");
                    System.out.println("Your HP: "+ wz.getHP());
                    System.out.println("Your EXP: "+ wz.getEXP());
                    System.out.println("Your LV: "+ wz.getLEVEL());
                    System.out.println("------------------");
                    //---------------------------------
                }
            }
            else if(career.equals("knight") == true){
                while(kn.getHP() != 0){
                    //--------------------------
                    System.out.println(" 1 to attack // 2 to hit // 3 open inventory // 99 buy more bag // 0 Eng Game");
                    int data = sc.nextInt();
                    //--------------------- for novice
                    if(data == 1) {
                        kn.att();
                        bag.getItem();
                        System.out.println("You get Potion!!");
                    }
                    else if (data == 2) {
                        kn.hit();
                        System.out.println("You are attacked!!");
                    }
                    else if (data == 3) {
                        bag.showBag();
                        System.out.println("prees 1-5 use any potion // prees 9 close bag");
                        int num = sc.nextInt();
                        if(num != 9){
                            if(bag.checkitem(num) == 1) kn.heal(bag.useItem(num));// use potion
                            else if(bag.checkitem(num) == 0) kn.bootExp(bag.useItem(num)); // use extboost
                        }
                    }
                    else if (data == 99) {
                        System.out.println("Wellcome!! Enter your value for buy more bag");
                        System.out.println("50 = 1 slot");
                        int morebag = sc.nextInt();
                        bag.VIP(morebag);
                    }
                    else if (data == 0) {
                        kn.dead();
                    }
                    System.out.println("------------------");
                    System.out.println("Your are Knight!!");
                    System.out.println("Your HP: "+ kn.getHP());
                    System.out.println("Your EXP: "+ kn.getEXP());
                    System.out.println("Your LV: "+ kn.getLEVEL());
                    System.out.println("------------------");
                    //---------------------------------
                }
            }
            
        }
        System.out.println("-----End Game-----");
    }
    
}