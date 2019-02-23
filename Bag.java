import java.io.*;
import java.util.*;

public class Bag
{   
    Item item = new Item();
    //HPPotion hppotion = new HPPotion();
    //Bootexp bootexp = new Bootexp();
    Random random = new Random(); 
    ArrayList<Item> items;
    private int Max;
    public Bag(){
        items = new ArrayList<Item>();
        Max = 5;
    }
    public boolean checkbag(){
        if(items.size() < Max) return true;
        return false;
    }
    public void getItem(){
        int number;
        number = random.nextInt(2);
        if(number == 0){ //get HPPotion
            if(checkbag()) items.add(new HPPotion());
        }
        else if(number == 1){ // get Bootexp
            if(checkbag()) items.add(new Bootexp());
        }
    }
    public void showBag(){ 
        System.out.println("------------------ inventory ------------------");
        for(int i = 0 ; i < items.size() ; i++){
            System.out.println((i+1)+"."+items.get(i).getName());
        }
        System.out.println("-----------------------------------------------");
    }
    public int useItem(int index){
        int number = items.get(index-1).getProperty();
        items.remove(index-1);
        return number;
    }
    public int checkitem(int index){
        if(items.get(index-1).getName().equals("Potion") == true) return 1; // usepotion
        return 0; // useexppotion
    }

    public int VIP(int num){
        int i;
        i = num/50;
        return Max = Max + i;
    }
    //POTION ad = new POTION();
    //ArrayList<POTION> potions;
    //private int Max;
    /*public Bag(){
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
    */

}