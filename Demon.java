
/**
 * Write a description of class Demon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random; 

public class Demon extends Creature
{
    private static final int MAX_DEMON_HP = 30;
    private static final int MIN_DEMON_HP = 10;
    private static final int MAX_DEMON_STR = 18;
    private static final int MIN_DEMON_STR = 5;

    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        super(
            Randomizer.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP,    
            Randomizer.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR
        );  
    }
    
    public Demon(int maxHp, int minHp, int maxStr, int minStr)
    {
      super(
            Randomizer.nextInt(maxHp-minHp)+minHp,    
            Randomizer.nextInt(maxStr-minStr)+minStr
        );    
    
    }
    
     /**
     * Allows a creature to determine how much damage it is causing in this round of battle
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int damage(){
        
        Random rand = new Random();
        
        int chanceTenPercent = rand.nextInt(100) + 1; 
        int damage = super.damage();
        
        if (chanceTenPercent <= 5 && chanceTenPercent >= 1)
        {
            return (damage + 50);
        }
        
        return damage;
    }

    
}
