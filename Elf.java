
/**
 * Write a description of class Elf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random;

public class Elf extends Creature 
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;

    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        super(
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP,    
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR
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
        
        if (chanceTenPercent <= 10 && chanceTenPercent >= 1)
        {
            return (damage * 2);
        }
        
        return damage;
    }
    
}
