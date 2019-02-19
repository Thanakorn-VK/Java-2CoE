import java.io.*;
import java.util.*;

public class Bag
{   
    POTION ad = new POTION();
    ArrayList<POTION> potions;
    private int Max;
    public Bag(){
        potions = new ArrayList<POTION>();
        Max = 5;
    }
    public void getPOTION(){
        if(checkbag()) potions.add(ad);
    }
    public void showBag(){
        System.out.println("------------------ inventory ------------------");
        for(int i = 0 ; i < potions.size() ; i++){
            System.out.println((i+1)+"."+potions.get(i).getnamePotion());
        }
        System.out.println("-----------------------------------------------");
    }
    public boolean checkbag(){
        if(potions.size() < Max) return true;
        return false;
    }
    public int usePOTION(int index){
        int num = potions.get(index-1).gethp();
        potions.remove(index-1);
        return num;
    }
    public int VIP(int num){
        int i;
        i = num/50;
        return Max = Max + i;
    }

}