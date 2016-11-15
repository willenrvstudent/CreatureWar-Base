# CreatureWar-Base
##Fork this project from the course repository - CreatureWar-Base

###First phase

We are not setting out to implement the war just yet, just the inheritance Hierarchy.
 

**CREATURE -**
fields - (int) hitpoints (int) strength default to 10 each, can never start less than 5
*methods -* 

`public int damage() a random number between 1 and strength`

`public boolean isAlive() return true if hitpoints > 0`

There is no getter(accessor) for strength.

There is no accessor for int value of hitpoints


should add a two parameter constructor that will take a starting strength and hitpoints to store
 
**HUMAN**

>a basic creature, max str(18) max hp(30), min str(5), min hp(10)

 
**ELF** 

>a magical creature, max str(18) max hp(25), min str(5), min hp(8)

>10% chance to do magical damage (2x damage returned), over ride the damage function

 
**DEMON**

>a demonic creature, 

>5% chance to do magical damage (+50) over ride damage()

 
**CYBERDEMON**

>demonic creature with max str(40) max hp(100), min str(20), min hp(25)

 
**BALROG**

>demonic creature with max str(100) max hp(200), min str(50), min hp(80) 

>override damage() to attack TWICE each round


 
Make the inheritance hierarchy and make sure that any creature or subclass created does not violate the max value restrictions.
Make the subclass have zero parameter constructors. It is the job of the subclass constructor to only pass valid values for str and hp for that race.

Create objects of each type and write unit tests to ensure that they behave appropriately.



##second phase

This was originally  done as an assignment in the C++ iteration of the course.

Using the inheritance tree we created 

 
Goal - use polymorphic method calls

Create two arrays/Arraylists/collections of Creatures:

C++ ie: Creature * army[20];

Java ie. ArrayList<Creature> army = new ArrayList<Creature>();

 
Populate the army however you wish (manually or randomly)

`army[0] = new Human(); // new champion for the human race

army[1] = new Human(); // more average human, etc.

You could populate these in a loop and using the rand() function. 

(ie, make an arraylist with 100 creatures, when determining to add a creature generate a random number from 1 -10. 1-6 is human, 7-8 dwarf, 9-10 elf)

`

Then all that remains... **is the WAR**!

With two army collections, enter a loop that will continue until at least one of the collections are empty

If you use arrays, set two index variables, one for each army, and stay in as long as the index is within the bounds of the array. If army1 beats army 2, army2's array index increases by one.

do this until one index is greater than the number of creatures in the army. A pure battle of attrition.

 
for the battle,

`while army1[index1]-> isAlive() and army2[index2]->isAlive()`

     `army1[index1]-> takeWound(army2[index2]->getDamage());`

 `army2[index2]->takeWound(army1[index1]->getDamange());`
 
When you fall out of the main loop you will not know if you left because Army 1 beat Army2 or vice versa (or if everyone fell in battle). Be sure to issue an after action report letting me know who won.
