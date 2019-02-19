import java.io.*;
import java.util.*;

public class POTION
{   
    private String Potion;
    private int PotionHP;
    
    public POTION(){
        Potion = "POTION";
        PotionHP = 10;
    }

    public String getnamePotion(){
        return Potion;
    }
    
    public int gethp(){
        return PotionHP;
    }
}