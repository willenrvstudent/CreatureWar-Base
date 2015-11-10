# CreatureWar-Base
Start of two phase creature war

First phase


We are not setting out to implement the war just yet, just the inheritance Hierarchy.
 
CREATURE -
fields - (int) hitpoints (int) strength default to 10 each, can never be less than 5
methods - int damage() a random number between 1 and strength
 
HUMAN
a basic creature, max str(18) max hp(30)
 
ELF 
10% chance to do magical damage (2x damage returned)
 
DEMON
5% chance to do magical damage (+50)
 
CYBERDEMON
basic DEMON
 
BALROG
Like a normal demon, but attacks TWICE each round
 
Make the inheritance hierarchy and make sure that any creature or subclass created does not violate the max value restrictions. This means that Humans have str between 5 and 18 and hitpoints between 5 and 30.

Make reasonable assignments to the max strength and hit points for the other races.
 
Create objects of each type and write unit tests to ensure that they behave appropriately.

 

second phase

This was originally  done as an assignment in the C++ iteration of the course.
Using the inheritance tree we created last week (see  Savitch Ch 14 (problem 9 - Page 658-660)),  see the sample code for damage calculations extend the program to allow for two armies to battle one another to the death.
 
Goal - use polymorphic method calls
Create two arrays/Arraylists/collections of Creatures:
C++ ie: Creature * army[20];
Java ie. ArrayList<Creature> army = new ArrayList<Creature>;
 
Populate the army however you wish (manually or randomly)
army[0] = new Human(25,20); // new champion for the human race
army[1] = new Human(12,10); // more average human, etc.
You could populate these in a loop and using the rand() function.
 
All that remains... is the WAR!
With two army collections, enter a loop that will continue until at least one of the collections are empty
If you use arrays, set two index variables, one for each army, and stay in as long as the index is within the bounds of the array. If army1 beats army 2, army2's array index increases by one.
do this until one index is greater than the number of creatures in the army. A pure battle of attrition.
 
for the battle,
while army1[index1]-> getHP > 0 and army2[index2]-> getHP > 0
     army1[index1]-> takeWound(army2[index2]->getDamage());
     army2[index2]->takeWound(army1[index1]->getDamange());
 
When you fall out of the main loop you will not know if you left because Army 1 beat Army2 or vice versa (or if everyone fell in battle). Be sure to issue an after action report letting me know who won.
