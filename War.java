import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Willen Leal
 * @version 11.26.2018
 */
public class War
{
    ArrayList<Creature> army1;
    ArrayList<Creature> army2;
    Random rand;
    
   
    
    
    
    


    /**
     * Constructor for objects of class War
     */
    public War()
    {  
       rand = new Random();
       army1 = new ArrayList<Creature>();
       army2 = new ArrayList<Creature>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void armyAssemble()
    {
        int cyberdemon = rand.nextInt(45) + 1;;
        int demon = rand.nextInt(50) + 1;;
        int human = rand.nextInt(70) + 1;;
        int elf = rand.nextInt(50) + 1;;
        
        for(int i = 0; i < cyberdemon; i++)
        {
            army2.add(new CyberDemon());
        }
        
         for(int i = 0; i < human; i++)
        {
            army1.add(new Human());
        }
        
         for(int i = 0; i < demon; i++)
        {
            army2.add(new Demon());
        }
        
         for(int i = 0; i < elf; i++)
        {
            army1.add(new Elf());
        }
        
        
    }
    
    public void warTime()
    {
        Creature c1 = null;
        Creature c2 = null; 
        
            
            do 
            {
                // if(army1.isEmpty())
                // {
                    // break;
                // }
                
                // if(army2.isEmpty())
                // {
                    // break;
                // }
                
                do
                {
                    army1.get(0).takeDamage(army2.get(0).damage());
                    army2.get(0).takeDamage(army1.get(0).damage());
                
                    if(army1.get(0).isDead())
                    {
                        army1.remove(0);
                    }
                
                    if(army2.get(0).isDead())
                    {   
                        army2.remove(0);
                    }
                    
                    // if(!(army1.isEmpty() || army2.isEmpty()))
                    // {
                        // break; 
                    // }
               
                  
                } while((army1.get(0).isAlive() && army2.get(0).isAlive()));
               
            } while(!(army1.isEmpty() && army2.isEmpty()));

        
        if(army1.isEmpty() && army2.isEmpty())
        {
            System.out.print("Both armies are down!");
        
        }
        
        else if(army2.isEmpty())
        {
             System.out.print("Army1 won!");
        
        }
    
        else if(army1.isEmpty()) 
        {
            System.out.print("Army2 won!");
        
        }
    }
}
