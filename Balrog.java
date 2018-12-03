
/**
 * Write a description of class Balrog here.
 *
 * @author Willen Leal
 * @version 12.03.2018
 */
public class Balrog extends Demon
{
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;
    
    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
       super(MAX_BALROG_HP, MIN_BALROG_HP, MAX_BALROG_STR, MIN_BALROG_STR); 
    }
    
     /**
     * Allows a creature to determine how much damage it is causing in this round of battle
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int damage(){
        
        int totalDamage = super.damage() + super.damage();
        return totalDamage; 
    }
    
}
