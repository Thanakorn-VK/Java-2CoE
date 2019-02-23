import java.io.*;
import java.util.*;

public class Novice
{   
    private int HP;
    private int EXP;
    private int LEVEL;

    public Novice(){
        HP = 500;
        EXP = 0;
        LEVEL = 1;
    }
    public void att(){
        EXP = EXP + 1;
        //if (EXP >= 5)
        while(EXP >= 5){
            LEVEL = LEVEL + 1;
            HP = HP + 100;
            EXP-= 5; // EXP = EXP - 5;
        }
    }
    public void dead(){
        HP = 0;
    }
    public void heal(int heal){
        HP += heal;
    }
    public void hit(){
        HP = HP - 50;
    }
    public void bootExp(int boot){
        EXP = EXP + boot;
        while(EXP >= 5){
            LEVEL = LEVEL + 1;
            HP = HP + 100;
            EXP-= 5; // EXP = EXP - 5;
        }
    }

    // ----------------------------------------------
    public int getHP(){
        return HP;
    }

    public int getEXP(){
        return EXP;
    }

    public int getLEVEL(){
        return LEVEL;
    }
    /*public void getSkill(){

    }*/
    public void setHP(int hp){
        HP = hp;
    }

    public void setEXP(int exp){
        EXP = exp;
    }

    public void setLEVEL(int level){
        LEVEL = level;
    }
}