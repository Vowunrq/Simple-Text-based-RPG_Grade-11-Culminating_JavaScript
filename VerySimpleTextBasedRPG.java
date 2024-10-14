// The "ComSciCulm" class.

/*Program header
Title: The Revenge in Cathyr

Name: Andrew Chai

Date: Wednesday, June 23, 2021

Description: This game is a Dungeons & Dragons game. You must read everything you see in
order to understand your mission. There will be fights and dialogs with npcs. You are
free to make your own choices, but beware that the choice you make will impact the story
of your character negatively or positively. You only have one life, so whatever you do,
try to make the right decision.

This will take you a minimum of 5 minutes

*/
import java.awt.*;
import hsa.Console;
import java.applet.*;
import java.io.*;
import java.net.*;

public class VerySimpleTextBasedRPG
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	//Declarations for user, dice, etc.
	String genderSpecific, gender, gender2, gender3, Gender, Gender2, race, name, lastName, fullName, rank, dialogNum, DM;
	int f, num, num1, num2, num3, alignment;
	char user;

	DM = "<DM>";
	user = ' ';
	num = (int) (Math.random () * 2 + 1);
	num1 = (int) (Math.random () * 4 + 1);
	num2 = (int) (Math.random () * 6 + 1);
	num3 = (int) (Math.random () * 8 + 1);
	alignment = 0;
	
	//Program Header
	IntroScreen ();

	//Logging in Screen
	LoggingIn ();


	//Character design
	//Gender
	do
	{
	    c.println ("Enter your gender (male or female)");
	    genderSpecific = c.readString ();

	    if (!(genderSpecific.equals ("Male") || genderSpecific.equals ("male") || genderSpecific.equals ("Female") || genderSpecific.equals ("female")))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(genderSpecific.equals ("Male") || genderSpecific.equals ("male") || genderSpecific.equals ("Female") || genderSpecific.equals ("female")));

	//The variables will declare different words depending on your gender
	if (genderSpecific.equals ("Male") || genderSpecific.equals ("male"))
	{
	    gender = "his";
	    gender2 = "he";
	    gender3 = "him";
	    Gender = "boy";
	    Gender2 = "son";
	}
	else
	{
	    gender = "her";
	    gender2 = "she";
	    gender3 = "her";
	    Gender = "girl";
	    Gender2 = "daughter";
	}

	c.println ();

	//Class
	//Your powers and abilities, opponents, etc., will be different for all classes
	do
	{
	    c.println ("Choose class: Barbarian (highly recommended) or Mage");
	    rank = c.readString ();

	    if (!(rank.equals ("Barbarian") || rank.equals ("barbarian") || rank.equals ("Mage") || rank.equals ("mage")))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(rank.equals ("Barbarian") || rank.equals ("barbarian") || rank.equals ("Mage") || rank.equals ("mage")));

	c.println ();

	//Name
	//First Name
	c.println ("Enter your \"FIRST\" name (Fantasy-like name please)");
	name = c.readString ();
	//Second Name
	c.println ("Enter you \"LAST\" name (Fantasy-like name please)");
	lastName = c.readString ();

	fullName = "<" + name + " " + lastName + ">";

	c.clear ();

	//Rules for Dialogs and Battles
	c.println ("Rules");
	c.println ();
	c.println ("Dialogs:");
	c.println ("Your character, the DM (Dungeon\'s Master or narrator), and most npcs, will have");
	c.println ("dialogs; some dialogs involving the elements of persuasion. If you choose to");
	c.println ("persuade an npc, a coin will be flipped (2 being success and 1 being fail).");
	c.println ();
	c.println ("Battles:");
	c.println ("Depending on which class you chose earlier, you will have different");
	c.println ("ACs (Armour Class), Hp (Hit points), attacks, defends, and healing abilities.");
	c.println ("All battles will be 1 vs 1 and you and your opponent will take turns.");
	c.println ("The computer will caluclate and print everything you choose, so be sure to");
	c.println ("read them all. The battle will finish when you or your opponent has 0 lives.");
	c.println ("If the main protagonist dies, the game will be over.");
	c.println ();

	//Press the "Enter" key to continue
	do
	{
	    c.println ("Please press the \"ENTER\" key to continue");
	    user = c.getChar ();

	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 10));

	c.println ();

	c.clear ();
	Loading ();


	//BACKGROUND STORY AND MISSION
	//Introduction
	c.println ("Background Information");
	c.println ("When you close your eyes, you can still see yourself as a child, happily at play");
	c.println ("with your mother and father. When you open your eyes, however, all you see is");
	c.println ("your loving parents dead in the hands of a hooded man. The guards were sent to");
	c.println ("seek out the assassin, but no one was able to find him. After a year or so, the");
	c.println ("case was dismissed. You were furious and confused to hear this and sought");
	c.println ("to find the reason. Unfortunately, that was unsuccessful as well. Out of");
	c.println ("frustration, you left Cathyr and promised yourself never to set foot in the city");
	c.println ("ever again.");
	c.println ();

	//Press the "Enter" key to continue
	do
	{
	    c.println ("Please press the \"ENTER\" key to continue");
	    user = c.getChar ();

	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 10));

	c.setColor (Color.red);
	Font fonts = new Font ("Chiller", Font.PLAIN, 30);
	c.setFont (fonts);
	c.drawString ("Until...", 1, 300);
	c.println ();

	//Press the "Enter" key to continue
	do
	{
	    c.println ("Please press the \"ENTER\" key to continue");
	    user = c.getChar ();

	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 10));

	c.println ();
	c.println ("A month later, you settled down in the city of Maarlith and bought a small");
	c.println ("house, nearby a church. One night, you decided to visit a bar in town.");
	c.println ("As you sat down and began to drink, names that sounded very familiar caught");
	c.println ("your attention, Varfunn and Kerei, the name of your dead parents.");
	c.println ();

	//Press the "Enter" key to continue
	do
	{
	    c.println ("Please press the \"ENTER\" key to continue");
	    user = c.getChar ();

	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 10));

	delay (1000);

	c.clear ();

	//Game
	//Chapter 1
	c.println ("Chapter 1: The Start of the Hunt");
	c.println ();
	c.println ();
	delay (2000);
	c.println ("<SCOUNDREL 1>");
	c.println ("A brother of mine works as a guard of a noble family in the city of Cathyr,");
	c.println ("not far from here... Well he be more of a private guard who ain't 5 meters");
	c.println ("away from the Niefualos. One day... The Niefualos is the last name of the noble");
	c.println ("family by the way... Anyways, one day, the head of the family was having a");
	c.println ("meeting at their place; they were talking about politics or something, I forgot,");
	c.println ("but ye guys all remember the famous murder of the " + lastName + " family? Ye");
	c.println ("know that Varfunn and Kerei? Ya? Guess what, apparently the murder was planned");
	c.println ("out by... Hold on is that " + Gender + " eavesdropping on our conversation?");
	c.println ();
	c.println (DM);
	c.println ("Uh oh, they noticed your nosiness");
	c.println ();

	//Tutorial Starts
	//Coin Flip
	do
	{
	    c.println ("Press \'f\' key to flip coin");
	    f = c.getChar ();

	    if (!(f == (int) 102))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(f == (int) 102));

	c.println ("________________________________________________________________________________");
	c.println ("Dice Roll: " + dialog (num));

	//#2 succeeds and #1 fails
	if (dialog (num) == 2)
	{
	    c.println ("Success: You didn't get caught eavesdropping!");
	    c.println ("________________________________________________________________________________");
	    c.println ();
	    c.println ("<SCOUNDREL 2>");
	    c.println ("Nah, I don't think so. Cmon dude just finish what you were saying");
	    c.println ();
	    c.println ("<SCOUNDREL 1>");
	    c.println ("Ya, ya. Ok, so anyways...");
	    c.println ();
	}
	else
	{
	    c.println ("Failed: You got caught eavesdropping!");
	    c.println ("________________________________________________________________________________");
	    c.println ();
	    c.println ("<SCOUNDREL 2>");
	    c.println ("Hey you! You think you can just barge into someone else's conversation");
	    c.println ("uninvited?! I'll teach you some manners!!");
	    c.println ();
	    c.println ("<SCOUNDREL 3>");
	    c.println ("Ya, put that " + Gender + " in " + gender + " place!");
	    c.println ();
	    c.println (fullName);
	    c.println ("*Morons, I didn't barge into anything*");
	    c.println ();

	    //Battle
	    if (rank.equals ("Barbarian") || rank.equals ("barbarian"))
	    {
		BarbarianBattle ();
		c.println (DM);
		c.println ("After a long fight, the scoundrel could barely stand up. To");
		c.println ("end the fight, you grab a wooden chair and smash his face, which shatters the");
		c.println ("chair into multiple pieces. You look up and see the other two trembling");
		c.println ("in fear. Since you need to know the mastermind behind the murder of your");
		c.println ("parents, you ask the scoundrels to finish the story.");
	    }
	    else
	    {
		MageBattle ();
		c.println (DM);
		c.println ("After a long fight, the scoundrel can barely stand up. To");
		c.println ("end the fight, you cast \"Maze\" and send him into a coma. You glance at the");
		c.println ("other two and see them trembling in fear. Since you need to know the");
		c.println ("mastermind behind the murder of your parents, you ask the scoundrels to");
		c.println ("finish the story.");
	    }
	    //Victory
	    c.println ();
	    c.println ("<SCOUNDREL 3>");
	    c.println ("Y-y-ye, ye, ye, of course, whatever you say. J-Just don't hurt us. Cmon dude,");
	    c.println ("finish the story before " + gender2 + " destroys us both!");
	    c.println ();
	    c.println ("<SCOUNDREL 2>");
	    c.println ("S-s-sure, sure, alright, just let me take a breather for a moment.");
	    c.println ();
	}

	//Press the "Enter" key to continue
	do
	{
	    c.println ("Please press the \"ENTER\" key to continue");
	    user = c.getChar ();

	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 10));

	//Your mission
	c.println ();
	c.println ("<SCOUNDREL 2>");
	c.println ("The murder was planned out by two Harpers. The Harpers is a group known to bring");
	c.println ("good and justice in Faer�n. So it's kind of weird why they killed the " + lastName + "s.");
	c.println ();
	c.println ("<SCOUNDREL 1>");
	c.println ("Maybe they were corrupt people.");
	c.println ();
	c.println ("<SCOUNDREL 2>");
	c.println ("Ye, maybe, but most of them anyways. Speaking of, my brother also overheard");
	c.println ("them planning another hunt for " + name + ", the only " + Gender2 + " of the family");
	c.println ("because apparently, " + gender2 + " is still roaming around the planes of Faer�n.");
	c.println ();

	//Press the "Enter" key to continue
	do
	{
	    c.println ("Please press the \"ENTER\" key to continue");
	    user = c.getChar ();

	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 10));
	//Tutorial Ends

	//The story starts from here
	c.println ();
	c.println ("*1 HOUR LATER*");
	c.println ();
	c.println (DM);
	c.println ("After listening to the scoundrels, you have found out the names of The Harpers,");
	c.println ("Brenna, a mage, and Mirt, a paladin. You pack your things and set off to the");
	c.println ("place you once called home. As you get closer to your destination, memories");
	c.println ("that have been long forgotten rushes through your head. You try to ignore them");
	c.println ("as they could distract you from your mission. But it is difficult to do so,");
	c.println ("especially for the ones that involve your parents.");
	c.println ();

	//Press the "Enter" key to continue
	do
	{
	    c.println ("Please press the \"ENTER\" key to continue");
	    user = c.getChar ();

	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 10));

	//Encounter
	c.println ();
	c.println (DM);
	c.println ("Suddenly, you hear a loud scream in the distance. You halt to listen to it once");
	c.println ("more. After a few seconds, you hear it coming from a forest. Before you head off,");
	c.println ("questions begin to form in your head; \"What if there is a person in need of");
	c.println ("help?\", \"What if it's a trap?\", or \"Is this worth risking my life?\"");
	c.println ();
	c.println ("Please press a Following key");
	c.println ();
	c.println ("a: Head into the forest, helping people is more important than revenge");
	c.println ("b: Continue my way to Cathyr, revenge is more important than helping others");
	c.println ();

	//Choice A or B
	do
	{
	    user = c.getChar ();

	    if (!(user == (int) 97 || user == (int) 98))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 97 || user == (int) 98));

	//Choice A
	if (user == (int) 97)
	{
	    c.println ();
	    c.println ("You walk into the forest to find the person responsible for the screams.");
	    c.println ("When you found nothing and thought it was a waste of time. You see a group");
	    c.println ("of armed men and women wearing a cult robe and chasing a child. You block");
	    c.println ("their way and ask what is going on. But instead of answering, they started");
	    c.println ("to point fingers at you");
	    c.println ();
	    c.println ("<CULT PRIEST>");
	    c.println ("That " + Gender + " is protecting the holy sacrifice of Auril! Kill " + gender3 + "!");

	    if (rank.equals ("Barbarian") || rank.equals ("barbarian"))
	    {
		BarbarianBattle ();
		c.println ();
		c.println (DM);
		c.println ("The fight was long, but easy. You effortlessly killed the cult leader,");
		c.println ("and the rest retreated");
	    }
	    else
	    {
		MageBattle ();
		c.println ();
		c.println (DM);
		c.println ("The fight was long, but easy. You effortlessly killed the cult leader");
		c.println ("and the rest retreated");
	    }
	    c.println ();
	    c.println ("<CHILD>");
	    c.println ("Thank you stranger, if it wasn't for you, I would have been sacrificed for");
	    c.println ("an evil deity");
	    c.println ();
	    alignment += 1;
	}
	//Choice B
	else
	{
	    c.println ();
	    c.println ("You continue walking on the road, where it is safe, and ignore the annoying");
	    c.println ("screams. After a few minutes, the screams end followed by the loudest scream");
	    c.println ("you have ever heard");
	    c.println ();
	    alignment -= 1;
	}

	//Press the "Enter" key to continue
	do
	{
	    c.println ("Please press the \"ENTER\" key to continue");
	    user = c.getChar ();

	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 10));

	//Arrival at Cathyr
	c.println ();
	c.println (DM);
	c.println ("A week passes by and you arrive at Cathyr. At the city gates, no one was to be");
	c.println ("seen. Fortunately for you, you know the place very well and realized that there");
	c.println ("are exactly 4 guards waiting for someone to approach. You can try going through");
	c.println ("them \"stealthily\" or \"forcefully\"");
	c.println ();
	c.println ("Please press a Following key");
	c.println ();
	c.println ("a: Stealthily (flip coin), less fight, more energy for my revenge");
	c.println ("b: Forcefully, no one in this place will live for letting my parents expire");
	c.println ();

	//Choice A or B
	do
	{
	    user = c.getChar ();

	    if (!(user == (int) 97 || user == (int) 98))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 97 || user == (int) 98));

	//Choice A
	if (user == (int) 97)
	{

	    //Coin Flip
	    do
	    {
		c.println ("Press \'f\' key to flip coin");
		f = c.getChar ();

		if (!(f == (int) 102))
		{
		    c.println ();
		    c.println ("<ERROR>");
		}
	    }
	    while (!(f == (int) 102));

	    c.println ("________________________________________________________________________________");
	    c.println ("Dice Roll: " + dialog (num));

	    //Success
	    if (dialog (num) == 2)
	    {
		c.println ("Success: You're hidden!");
		c.println ("________________________________________________________________________________");
		c.println (DM);
		c.println ("After you sneak pass the guards, you went around asking the citizens about the");
		c.println ("location of the noble family: Niefualos, since that was the last place The");
		c.println ("Harpers were seen. After a few hours, you were able to find the exact location");
		c.println ();
	    }
	    //Fail
	    else
	    {
		c.println ("Failed: You failed to hide!");
		c.println ("________________________________________________________________________________");
		c.println (DM);
		c.println ("Without a choice, you go for the attack and ambush the guards, killing 3 of");
		c.println ("them.");

		//Battle
		if (rank.equals ("Barbarian") || rank.equals ("barbarian"))
		{
		    c.println ("But before you were about to do the same for the last one, the guard gets the");
		    c.println ("better of you and dodges your sword");
		    BarbarianBattle ();
		}
		else
		{
		    c.println ("But before you were about to do the same for the last one, the guard gets the");
		    c.println ("better of you and dodges your spell");
		    MageBattle ();
		}

		//Victory
		c.println ();
		c.println (DM);
		c.println ("Before you finish the guard off with a final blow, you interrogate him for the");
		c.println ("location of the noble family: Niefualos, since that was the last place The");
		c.println ("Harpers were seen. Although he resisted at first, you were able to force the");
		c.println ("information out with a brutal beating");
		c.println ();
	    }
	}
	//Choice B
	else
	{

	    //Battle
	    if (rank.equals ("Barbarian") || rank.equals ("barbarian"))
	    {
		c.println (DM);
		c.println ("You ambush the guards and kill 3 of them, but before you were about to do the");
		c.println ("same for the last one, the guard gets the better of you and dodges your sword");
		BarbarianBattle ();
	    }
	    else
	    {
		c.println (DM);
		c.println ("You ambush the guards and kill 3 of them, but before you were about to do the");
		c.println ("same for the last one, the guard gets the better of you and dodges your spell");
		MageBattle ();
	    }

	    //Victory
	    c.println ();
	    c.println (DM);
	    c.println ("Before you finish the guard off with a final blow, you interrogate him for the");
	    c.println ("location of the noble family: Niefualos, since that was the last place The");
	    c.println ("Harpers were seen. Although he resisted at first, you were able to force the");
	    c.println ("information out with a brutal beating");
	    c.println ();
	}

	//Press the "Enter" key to continue
	do
	{
	    c.println ("Please press the \"ENTER\" key to continue");
	    user = c.getChar ();

	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 10));

	c.clear ();

	//Chapter 2
	c.println ("Chapter 2: First Harper");
	c.println ();
	c.println ();
	delay (2000);
	c.println (DM);
	c.println ("*A FEW HOURS LATER*");
	c.println ();
	c.println (DM);
	c.println ("You arrive at the Niefualos estate. It is bigger than you expected and has an");
	c.println ("immense number of guards everywhere. Charging in and alerting everyone would");
	c.println ("be suicide, but you always love a challenge. Otherwise, hopping over their");
	c.println ("fence is the best option");
	c.println ();
	c.println ("Please press a Following key");
	c.println ();
	c.println ("a: Charge in from the front (5 battles), it should help me get pumped up");
	c.println ("b: Hop over the fence (flip coin), unnecessary battles are best to avoid");
	c.println ();

	//Choice A or B
	do
	{
	    user = c.getChar ();

	    if (!(user == (int) 97 || user == (int) 98))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 97 || user == (int) 98));

	//Choice A
	if (user == (int) 97)
	{
	    alignment -= 5;
	    c.println ();
	    c.println (fullName);
	    c.println ("No guts! No glory!");
	    c.println ();
	    c.println (DM);
	    c.println ("All of the guards are alerted from the scream of your battle cry and prepare");
	    c.println ("for battle");

	    //Massive Battles
	    if (rank.equals ("Barbarian") || rank.equals ("barbarian"))
	    {
		c.println ();
		c.println ("1st Battle");
		BarbarianBattle ();
		c.println ("2nd Battle");
		BarbarianBattle ();
		c.println ("3rd Battle");
		BarbarianBattle ();
		c.println ("4th Battle");
		BarbarianBattle ();
		c.println ("5th Battle");
		BarbarianBoss ();
		//Victory
		c.println (DM);
		c.println ("Wow... You're still playing?");
		c.println ("Anyways, you look around and see an ocean of blood on the guards and all over");
		c.println ("your body. Even if they were involved in the scheme of murdering your parents,");
		c.println ("only a maniac would go this far. You look up at the mansion and see two men");
		c.println ("looking down at you through a window. From the looks of it, they showed no");
		c.println ("sign of fear, but disgust... or disappointment you can't tell. But you know");
		c.println ("for a fact that they are Niefualos and Mirt.");
		c.println ();
	    }
	    else
	    {
		c.println ();
		c.println ("1st Battle");
		MageBattle ();
		c.println ("2nd Battle");
		MageBattle ();
		c.println ("3rd Battle");
		MageBattle ();
		c.println ("4th Battle");
		MageBattle ();
		c.println ("5th Battle");
		MageBoss ();
		//Victory
		c.println (DM);
		c.println ("Wow... You're still playing?");
		c.println ("Anyways, you look around and see an ocean of blood on the guards and all over");
		c.println ("your body. Even if they were involved in the scheme of murdering your parents,");
		c.println ("only a maniac would go this far. You look up at the mansion and see two men");
		c.println ("looking down at you through a window. From the looks of it, they showed no");
		c.println ("sign of fear, but disgust... or disappointment you can't tell. But you know");
		c.println ("for a fact that they are Niefualos and Mirt.");
		c.println ();
	    }
	}
	//Choice B
	else
	{

	    //Coin Flip
	    do
	    {
		c.println ("Press \'f\' key to flip coin");
		f = c.getChar ();

		if (!(f == (int) 102))
		{
		    c.println ();
		    c.println ("<ERROR>");
		}
	    }
	    while (!(f == (int) 102));

	    c.println ("________________________________________________________________________________");
	    c.println ("Dice Roll: " + dialog (num));

	    //Success
	    if (dialog (num) == 2)
	    {
		c.println ("Success: You hopped over the fence without anyone noticing!");
		c.println ("________________________________________________________________________________");
		c.println (DM);
	    }
	    //Fail
	    else
	    {
		c.println ("Failed: Someone notices you hopping over the fence!");
		c.println ("________________________________________________________________________________");
		c.println (DM);
		c.println ("One guard sees you and runs to alarm the rest. Without any hesitation, you");
		c.println ("chase her and knock her out immediately. You hide her in a bush, but it won't");
		c.println ("be long before someone sees her body. You need to act quick.");
	    }
	}

	//House of Niefualos
	c.println ("You enter the mansion of the harpers and see beautiful furnitures everywhere.");
	c.println ("Above a clean fireplace there is a blue flag with a symbol in the center; a");
	c.println ("silver harp between the horns of a crescent moon. There was something written");
	c.println ("on it, but do we have time for that?");
	c.println ();
	c.println ("Please press a Following key");
	c.println ();
	c.println ("a: Read it, I am curious");
	c.println ("b: Just go upstairs, I don't have time for this");
	c.println ();

	//Choice A or B
	do
	{
	    user = c.getChar ();

	    if (!(user == (int) 97 || user == (int) 98))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 97 || user == (int) 98));

	//Choice A
	if (user == (int) 97)
	{
	    c.println (DM);
	    c.println ("It says...");
	    c.println ();

	    //Press the "Enter" key to continue
	    do
	    {
		c.println ("Please press the \"ENTER\" key to continue");
		user = c.getChar ();

		if (!(user == (int) 10))
		{
		    c.println ();
		    c.println ("<ERROR>");
		}
	    }
	    while (!(user == (int) 10));

	    c.clear ();

	    //Elminster Aumar
	    Font Harper = new Font ("Brush Script MT", Font.PLAIN, 45);
	    c.setFont (Harper);
	    c.drawString ("A semi-secret organization dedicated to", 1, 70);
	    c.drawString ("promoting good, preserving history", 1, 110);
	    c.drawString ("(including art and music of old), and", 1, 150);
	    c.drawString ("maintaining a balance between civilization", 1, 190);
	    c.drawString ("and nature by keeping kingdoms small and", 1, 230);
	    c.drawString ("the destruction of animal and plant", 1, 270);
	    c.drawString ("life to a minimum.", 1, 310);
	    c.drawString ("-Elminster Aumar", 350, 480);

	    //Press the "Enter" key to continue
	    c.println ("Please press the \"ENTER\" key to continue");

	    do
	    {
		user = c.getChar ();

		if (!(user == (int) 10))
		{
		    c.println ();
		    c.println ("<ERROR>");
		}
	    }
	    while (!(user == (int) 10));

	    c.clear ();

	    c.println (DM);
	    c.println ("The name that is written on the flag gives you a slight chill for it is the name");
	    c.println ("of a powerful wizard that all who walk the realms know. He is famous for being");
	    c.println ("the most powerful spell caster (so far) and bringing good to the world. It seems");
	    c.println ("like Elminster is friends with the harpers, or worse, he is one. Let's try to be");
	    c.println ("cautious about his appearance");

	    if (alignment > 0)
	    {
		c.println ("This makes you rethink about The Harpers and your parents. If The Harpers");
		c.println ("are truly good, then why did they murder your parents? You know your parents");
		c.println ("were good people, right?");
	    }
	}
	//Choice A and B
	c.println ();
	c.println (DM);
	c.println ("When you arrive at the top of the staircase, you see a private guard unaware of");
	c.println ("your presence. You think he is the brother of the scoundrel telling the story in");
	c.println ("the bar. If it is him, you might be able to bring up his brother and go through");
	c.println ("him safely. If not, well then that's just embarrassing and you'll end up in a");
	c.println ("fight.");
	c.println ();
	c.println ("Please press a Following key");
	c.println ();
	c.println ("a: Bring the scoundrel up, it never hurts to try");
	c.println ("b: Just fight, I'll rather fight then be humiliated");

	//Choice A or B
	do
	{
	    user = c.getChar ();

	    if (!(user == (int) 97 || user == (int) 98))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 97 || user == (int) 98));

	//Choice A
	if (user == (int) 97)
	{

	    //Coin Flip
	    do
	    {
		c.println ("Press \'f\' key to flip coin");
		f = c.getChar ();

		if (!(f == (int) 102))
		{
		    c.println ();
		    c.println ("<ERROR>");
		}
	    }
	    while (!(f == (int) 102));

	    c.println ("________________________________________________________________________________");
	    c.println ("Dice Roll: " + dialog (num));

	    //Success
	    if (dialog (num) == 2)
	    {
		c.println ("Success: He was the brother!");
		c.println ("________________________________________________________________________________");
		c.println (fullName);
		c.println ("Ay! What's up dude!");
		c.println ();
		c.println ("<GUARD>");
		c.println ("Who art thou? How did thy get passeth the guards?");
		c.println ();

		//Press the "Enter" key to continue
		c.println ("Please press the \"ENTER\" key to continue");

		do
		{
		    user = c.getChar ();

		    if (!(user == (int) 10))
		    {
			c.println ();
			c.println ("<ERROR>");
		    }
		}
		while (!(user == (int) 10));

		c.println (fullName);
		c.println ("Chill my man! I'm your bro's friend from Maarlith, dude!");
		c.println ();
		c.println ("<GUARD>");
		c.println ("Oh, I shouldst hast noticed, thee both have a similar habit of talking.");
		c.println ("Maarlith, eh? Wherefore hast thou traveleth so far?");
		c.println ();
		c.println (fullName);
		c.println ("Actually, my man, we both came. Ye needed some kind of thang he said, I forgot");
		c.println ("what exactly, but he's at yo place right now and told me ta be yo replacement");
		c.println ();
		c.println ("<GUARD>");
		c.println ("Is that so? Weird, I rememb'r not to require anything... Oh aye! Mine own");
		c.println ("scimitar! Well then, I wouldst best be off, t's quite a miracle thy");
		c.println ("remembered such a thing. I appreciate this, I shall maketh up to thee.");
	    }
	    //Fail
	    else
	    {
		c.println ("Failed: He was not the brother!");
		c.println ("________________________________________________________________________________");
		c.println (fullName);
		c.println ("Ay! What's up dude!");
		c.println ();
		c.println ("<GUARD>");
		c.println ("Excuse me? Who are you? How did you pass the guards?");
		c.println ();
		c.println (fullName);
		c.println ("Chill my man! I'm your bro's friend from Maarlith, dude!");
		c.println ();
		c.println ("<GUARD>");
		c.println ("I don't have a brother.");
		c.println ();
		c.println (fullName);
		c.println ("Oh... oops");
		c.println ();
		c.println ("<GUARD>");
		c.println ("Stand down before someone gets hurt");

		if (rank.equals ("Barbarian") || rank.equals ("barbarian"))
		{
		    BarbarianBattle ();
		}
		else
		{
		    MageBattle ();
		}
	    }
	}
	//Choice B
	else
	{
	    c.println ("<GUARD>");
	    c.println ("Who goes there? Where are the guards!");
	    c.println ();
	    c.println (fullName);
	    c.println ("Shut up and fight");

	    if (rank.equals ("Barbarian") || rank.equals ("barbarian"))
	    {
		BarbarianBattle ();
	    }
	    else
	    {
		MageBattle ();
	    }
	}

	c.println ();
	//Press the "Enter" key to continue
	do
	{
	    c.println ("Please press the \"ENTER\" key to continue");
	    user = c.getChar ();

	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 10));

	c.clear ();

	//Success or Victory
	c.println (DM);
	c.println ("After your dealings with the guard, you go up to the door and sense a very");
	c.println ("strong aura from the room. Although you hesitate at first, you know that");
	c.println ("you came too far to go back. You dramatically slam the door open and see");
	c.println ("Mirt awaiting for your entrance.");
	c.println ();
	c.println ("<Mirt>");
	c.println ("*Hmph* You are " + name + " " + lastName + " I presume? I must admit, I am");
	c.println ("surprised to see how skillful you are. What a complete waste. *tsk* *tsk* *tsk*");
	c.println ();
	c.println (fullName);
	c.println ("Where is Niefualos?");
	c.println ();
	c.println ("<Mirt>");
	c.println ("Far from here I suppose. He's just a good noble man who helps The Harpers.");
	c.println ("Nothing more, nothing less. So don't even think about going after him.");
	c.println ("Well, that won't happen as long as I'm here.");
	c.println ();
	c.println (fullName);
	c.println ("*snicker* problem's solved");

	//Press the "Enter" key to continue
	c.println ();
	c.println ("Please press the \"ENTER\" key to continue");

	do
	{
	    user = c.getChar ();

	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 10));

	//Battle
	if (rank.equals ("Barbarian") || rank.equals ("barbarian"))
	{
	    BarbarianBoss ();
	}
	else
	{
	    MageBoss ();
	}

	//Victory
	c.println ();
	c.println (DM);
	c.println ("After multiple blows, dodges, and spell castings, the toughest fight you have");
	c.println ("fought so far, has ended with you as the victor.");
	c.println ();
	c.println ("<Mirt>");
	c.println ("*cough* *cough* I never knew... I was going to die... like this.");

	if (alignment > 0)
	{
	    c.println ("Ever since you ran away from your home, The Harpers kept a careful watch");
	    c.println ("on you. The only reason you weren't killed was because of your good and");
	    c.println ("justifying actions.");
	}

	c.println ("I know you are different from your pare-");
	c.println ();
	c.println (DM);
	c.println ("Before he says another word, you cut his life with his own blade. You knew");
	c.println ("he was going to bring up something about your parents. You don't know why");
	c.println ("you just did that. Perhaps you were too afraid to know the truth and find");
	c.println ("out that your parents weren't what you think they were.");
	c.println ("After Mirt's death, you take a glance at a table and see an invitation with");
	c.println ("the symbol of The Harpers. It reads...");

	c.println ();
	c.println ("Please press the \"ENTER\" key to continue");

	//Press the "Enter" key to continue
	do
	{
	    user = c.getChar ();

	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 10));

	c.clear ();

	//The Harpers Symbol
	c.setColor (Color.black);
	c.fillOval (480, 45, 130, 130);

	c.setColor (Color.white);
	c.fillOval (515, 62, 100, 100);

	c.setColor (Color.black);
	int[] xaxis2 = {530, 530, 550, 570, 590};
	int[] yaxis2 = {80, 90, 93, 90, 85};
	c.fillPolygon (xaxis2, yaxis2, 5);

	int[] xaxis3 = {560, 590, 600, 580};
	int[] yaxis3 = {150, 85, 85, 150};
	c.fillPolygon (xaxis3, yaxis3, 4);
	c.fillRect (560, 140, 20, 10);

	int[] xaxis4 = {530, 535, 550, 560, 560};
	int[] yaxis4 = {80, 120, 140, 140, 150};
	c.fillPolygon (xaxis4, yaxis4, 5);

	c.drawLine (535, 85, 565, 140);
	c.drawLine (540, 85, 570, 140);
	c.drawLine (545, 85, 575, 140);
	c.drawLine (550, 85, 580, 140);
	c.drawLine (555, 85, 585, 140);
	c.drawLine (560, 85, 590, 140);
	c.drawLine (565, 85, 595, 140);
	c.drawLine (570, 85, 600, 140);
	c.drawLine (575, 85, 605, 140);
	c.drawLine (580, 85, 610, 140);

	c.setColor (Color.white);
	int[] xaxis5 = {580, 600, 640};
	int[] yaxis5 = {150, 85, 150};
	c.fillPolygon (xaxis5, yaxis5, 3);

	//Private Letter
	c.setColor (Color.blue);
	Font invitation = new Font ("Edwardian Script ITC", Font.PLAIN, 45);
	c.setFont (invitation);
	c.drawString ("Brenna's Estate This Evening", 1, 110);
	c.setColor (Color.black);
	Font invitation2 = new Font ("Old English Text MT", Font.PLAIN, 25);
	c.setFont (invitation2);
	c.drawString ("To make our meeting less suspicious, there will be a gathering in", 1, 210);
	c.drawString ("my estate. More than hundreds of citizens of Cathyr will be invited", 1, 250);
	c.drawString ("to celebrate my \"birthday\". Bring the public invitation I have", 1, 290);
	c.drawString ("sent to you attached to this letter to gain access through the", 1, 330);
	c.drawString ("entrance guards. The Harpers meeting will occur shortly after my", 1, 370);
	c.drawString ("welcome speech in the room on the second floor, guarded by two", 1, 410);
	c.drawString ("security guards. Please be sure to bring this private letter and", 1, 450);
	c.drawString ("The Harpers metal. Make sure to wear something formal.", 1, 490);

	c.println ("Please press the \"ENTER\" key to continue");

	//Press the "Enter" key to continue
	do
	{
	    user = c.getChar ();

	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 10));

	c.clear ();

	//Chapter 3
	c.println ("Chapter 3: The Last Harper");
	c.println ();
	c.println ();
	delay (2000);
	c.println (DM);
	c.println ("After a long search for the requirements to attend the gathering, you obtain the");
	c.println ("symbol of Harpers, invitations, a black-white suit from Mirt's corpse, and");
	c.println ("the blade of Mirt (called Blazeguard) and head to the Brenna estate. The place");
	c.println ("is known to be one of the bigget mansions in Cathyr, but little do the citizens");
	c.println ("know, that it's one of the secret houses of The Harpers.");
	c.println ("As you walk pass a very familiar neighbourhood, you see a little girl playing");
	c.println ("in the large backyard of her parents mansion. You also see 3 servants keeping");
	c.println ("a keen eye on her just in case something is to happen. When you were just about");
	c.println ("to mind your own business and continue on your path to The Harpers, you realize");
	c.println ("that the home you had in Cathyr as a child is the exact mansion the kid was");
	c.println ("playing in.");
	c.println ();
	c.println ("Please press a Following key");
	c.println ();
	c.println ("a: Take what's mine, force them if I have to, I will not allow anyone to have");
	c.println ("anything of mine!");
	c.println ("b: Ignore them, for now");
	c.println ();

	//Encounter
	//Choice A or B
	do
	{
	    user = c.getChar ();

	    if (!(user == (int) 97 || user == (int) 98))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 97 || user == (int) 98));

	//Choice A
	if (user == (int) 97)
	{
	    c.println ();
	    c.println (DM);
	    c.println ("You enter the property of your old house and threaten everyone to leave. Lucky");
	    c.println ("for you, no one was armed, so when you unsheathed Blazeguard, everyone quietly");
	    c.println ("left with the child.");
	    alignment -= 1;
	}
	//Choice B
	else
	{
	    c.println ();
	    c.println (DM);
	}

	//Arrival
	c.println ("A few hours pass and you arrive at the Harper's \"playhouse\" just after");
	c.println ("evening. As you look up and down the mansion, you find out why it's known to be");
	c.println ("one of the largest estate in Cathyr. Just like the instructions stated in the");
	c.println ("letter, you show the entrance guards the invitation and enter the base of The");
	c.println ("Harpers.");

	//Press the "Enter" key to continue
	c.println ();
	c.println ("Please press the \"ENTER\" key to continue");
	c.println ();

	do
	{
	    user = c.getChar ();

	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 10));

	c.println ("As soon as you enter, you see beautiful chandeliers reflecting and");
	c.println ("refracting clear light everywhere with the sound of a delightful waltz music.");
	c.println ("The number of guests happen to be over a hundred, but the size of the room makes");
	c.println ("the party seem empty.");
	c.println ("The welcome speech will begin soon, so you try to get comfortable and eat a");
	c.println ("small chocolate cupcake from the food station. Although you're not a fan of junk");
	c.println ("food, the one you just ate was not half bad. You try other junk foods to fill");
	c.println ("your energy before defeating Brenna and possibly other Harpers. When you were");
	c.println ("finished, you became thirsty and went to get a drink. Suddenly, an elderly man");
	c.println ("accidentally bumps into you and spills your drink all over your suit.");
	c.println ();
	c.println ("Please press a Following key");
	c.println ();
	c.println ("a: Beat the man up, now I have to be in a wet suit the entire time!");
	c.println ("b: Forget it, it's not your suit anyways.");
	c.println ();

	//Encounter
	//Choice A or B
	do
	{
	    user = c.getChar ();

	    if (!(user == (int) 97 || user == (int) 98))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 97 || user == (int) 98));

	//Choice A
	if (user == (int) 97)
	{
	    alignment -= 1;

	    if (rank.equals ("Barbarian") || rank.equals ("barbarian"))
	    {
		c.println ();
		c.println ("You lift the man up and throw him against a wall. You hear a loud snap and");
		c.println ("assume that it's his bone cracking. Everyone in the room glares and moves away");
		c.println ("from you, keeping their distance from danger.");
	    }
	    else
	    {
		c.println ();
		c.println ("You cast a spell on him and throw him against a wall. You hear a loud snap and");
		c.println ("assume that is his bone breaking. Everyone in the room glares and moves away");
		c.println ("from you, keeping their distance from danger.");
	    }
	}
	//Choice B
	else
	{
	    c.println ();
	    c.println ("<ELDERLY MAN>");
	    c.println ("Watch it! Why do you have eyes if you're not going to use it?! Moron");
	    c.println ();
	    c.println (DM);
	    c.println ("...");
	    c.println ("Well that was rude.");
	}

	//Press the "Enter" key to continue
	c.println ();
	c.println ("Please press the \"ENTER\" key to continue");

	do
	{
	    user = c.getChar ();

	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 10));

	//Later...
	c.println ();
	c.println ("A few minutes later, you hear a woman clinking a glass cup with a silver spoon");
	c.println ("which gets everyone's attention. As she was talking, some guests were quietly");
	c.println ("heading upstairs. From this, you know that she is Brenna, a Harper and the host");
	c.println ("of this gathering. Which means that the guests heading upstairs, are Harpers");
	c.println ("as well");
	c.println ();

	//Press the "Enter" key to continue
	c.println ("Please press the \"ENTER\" key to continue");

	do
	{
	    user = c.getChar ();

	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 10));

	c.clear ();

	//Follow Harpers
	c.println ();
	c.println (DM);
	c.println ("You quietly follow The Harpers upstairs and watch them go in a room that is");
	c.println ("guarded by two guards. When everyone entered, you hand over your Harper's");
	c.println ("metal along with the private letter to the guards and follow them in. Once");
	c.println ("you set foot in the room, you saw all kinds of species, especially humans");
	c.println ("and elves, with different weapons at their side. Luckily, you don't see");
	c.println ("Elminster the wizard.");
	c.println ("A minute or so later, Brenna makes her entrance and locks the door behind her.");
	c.println ("Before you think of a way to kill her and escape safely, she murmurs");
	c.println ("something.");
	c.println ();
	c.println ("<BRENNA>");
	c.println ("Cupio, Virtus, Licet!");
	c.println ();

	//Press the "Enter" key to continue
	c.println ("Please press the \"ENTER\" key to continue");

	do
	{
	    user = c.getChar ();

	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 10));

	//Trick
	c.println ();
	c.println (DM);
	c.println ("Uh oh, you can't move. She wasn't talking giberish, she was casting an");
	c.println ("enchantment on you!");
	c.println ();
	c.println ("<BRENNA>");
	c.println ("Good evening " + name + " it's been some time since we last saw each other.");
	c.println ("You might not remember me, you were so little when it happened,...");
	c.println ();
	c.println (fullName);
	c.println ("...!");

	//Press the "Enter" key to continue
	c.println ();
	c.println ("Please press the \"ENTER\" key to continue");

	do
	{
	    user = c.getChar ();

	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 10));

	c.println ();
	c.println ("<BRENNA>");
	c.println ("...But I was the one who slayed your parents that night. I disguised myself into");
	c.println ("a male merchant your parents were supposed to meet. This helped me gain");
	c.println ("the position of becoming the herald of Harpers in Cathyr.");
	c.println ();
	c.println (fullName);
	c.println ("*struggle* Wh..Why...did you..d...do...it");
	c.println ();
	c.println ("<BRENNA>");
	c.println ("Why did I kill your parents?! This is not a time for jokes " + Gender);
	c.println ();
	c.println (fullName);
	c.println ("W...Why");
	c.println ();
	c.println ("<BRENNA>");
	c.println ("...");
	c.println ("Do you really not know? You don't know the thousands your parents have");
	c.println ("enslaved, tortured, and killed?! Well, perhaps they thought you were");
	c.println ("too young to know the truth. Fine then, listen carefully " + name);

	//Press the "Enter" key to continue
	c.println ();
	c.println ("Please press the \"ENTER\" key to continue");

	do
	{
	    user = c.getChar ();

	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 10));

	c.clear ();

	//Story time
	c.println ("In the year of 1372 DR, there was a powerful faction in Cathyr called,");
	c.println ("\"The Black Network\". Their goal was to become wealthy and powerful, but most");
	c.println ("importantly, invincible. Due to their power, everyone feared to cross them.");
	c.println ("However, there was an opposing faction called, \"The Lords' Alliance\" that");
	c.println ("wanted to ensure the safety and prosperity of cities and other settlements of");
	c.println ("Faer�n, which includes Cathyr. They almost succeeded in completely destroying");
	c.println ("The Black Network, until the leader position was passed down on to your parents.");
	c.println ("Your parents made the guild even more powerful that it took over Dambrath");
	c.println ("itself. The Black Network mercanaries to capture innocent citizens and use them");
	c.println ("as slaves or target practice. During the \"Time of Troubles\" (1358 DR ~ 1380 DR),");
	c.println ("The Harpers organization has been shattered and risen again several times. The");
	c.println ("blame goes to that half-elf Jaheira from Amn...But that's for another time.");
	c.println ();

	//Press the "Enter" key to continue
	c.println ();
	c.println ("Please press the \"ENTER\" key to continue");
	do
	{
	    user = c.getChar ();

	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 10));

	//Story time continues
	c.println ();
	c.println ("The events weakened us for a long time and we couldn't do anything against the");
	c.println ("Black Network since we had no chance of succeeding. This continued on until");
	c.println ("Drizzt Do'urden showed up. Apparantly, Elminster was too busy with his own");
	c.println ("business that he asked the famous Drow to help us out. Obviously, with him on");
	c.println ("our side, we were able to level ourselves with The Black Network. After my");
	c.println ("mission in Thay, I was assigned to come here, in Cathyr, with my fellow Harpers");
	c.println ("in Icewind Dale. The Lords' Alliance and The Harpers have allied to remove The");
	c.println ("Black Network once and for all. My team was supposed to end the lives of your");
	c.println ("parents, but our plan failed and everyone except Mirt and I died. We couldn't");
	c.println ("even pass the walls of your parents' estate actually. However, Mirt saw a");
	c.println ("merchant awaiting to enter the mansion, which gave him an idea for me");
	c.println ("to disguise myself as him and sneak in instead. After I killed your parents, I");
	c.println ("saw you trembling behind me. I knew there would be orders for someone to end");
	c.println ("your life since you can become a threat to us. But I couldn't...");
	c.println ();

	//Press the "Enter" key to continue
	c.println ("Please press the \"ENTER\" key to continue");
	do
	{
	    user = c.getChar ();

	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 10));

	c.println ();

	//3 Different Endings
	if (alignment > 0)
	{
	    c.println ("...And I am glad.");
	    c.println ("You have shown us a lot of good deeds to others, so Mirt came up with an idea");
	    c.println ("himself; he wanted to make you into a Harper. You see, The Harpers have a rule");
	    c.println ("to either eliminate the one who kills a Harper or to invite them if they are");
	    c.println ("acceptable, for their abilties can be used for good and against evil. Mirt");
	    c.println ("has sacrificed for you because he felt sorry for the loss of your parents. Even");
	    c.println ("if your parents were evil, losing your only family is extremely painful.");
	    c.println ("Everything you saw after Mirt's death were planned. The creatures in my estate");
	    c.println ("are my illusions, every single one of them. This was planned out just for you.");
	    c.println ("So, what do you say?");
	    c.println ();
	    c.println (DM);
	    c.println ("She removes her spell from you for you to say your answer.");
	    c.println ();
	    c.println ("Please press a Following key");
	    c.println ();
	    c.println ("a: Do not Accept it! I will have my revenge!!!");
	    c.println ("b: Accept it. Although they have killed my parents, they did it for a good cause");
	    c.println ();

	    //Choice A or B
	    do
	    {
		user = c.getChar ();

		if (!(user == (int) 97 || user == (int) 98))
		{
		    c.println ();
		    c.println ("<ERROR>");
		}
	    }
	    while (!(user == (int) 97 || user == (int) 98));

	    //Choice A: Real Ending
	    if (user == (int) 97)
	    {
		c.println ();
		c.println ("<BRENNA>");
		c.println ("Oh, it is most distressing that this is the course you've chosen. I remove my");
		c.println ("support and will have no further dealings with you!");
		c.println ();

		if (rank.equals ("Barbarian") || rank.equals ("barbarian"))
		{
		    BarbarianBoss ();
		}
		else
		{
		    MageBoss ();
		}

		//Victory
		c.println ();
		c.println (DM);
		c.println ("Both you and Brenna collapse on to the ground severly injured, but unlike");
		c.println ("her, you are able to move a little. You lessen your distance with Brenna");
		c.println ("and prepare to kill her with Blazeguard.");
		c.println ();
		c.println ("<BRENNA>");
		c.println ("I am disappointed in you. You could've used your power to save lives, but");
		c.println ("instead, you used it on revenge. I may have lost to you, but always remember");
		c.println ("to be on the side of good, for evil will eventually perish from this world...");
		c.println ();
		c.println (DM);
		c.println ("Brenna dies before you have the chance to kill her properly.");
		c.println ("You successfully avenged your parents and you know that they are pleased.");
		c.println ("You think you are happy as well, but something is quite wrong. She said to");
		c.println ("always be in the side of good, for evil will eventually perish from this world.");
		c.println ("Well then, problem's solved. Since cities are always teemed with evil and decay");
		c.println ("I'll give it a good shake and bring justice to all!!!!!!!!");
		c.println ();
	    }
	    //Choice B: Alternate Ending
	    else
	    {
		c.println ();
		c.println ("<BRENNA>");
		c.println ("Thank Tymora you said that! Or else it would have been a waste to buy your");
		c.println ("gadgets! Go upstairs and through the first hallway you see. Room #1109 is");
		c.println ("where you'll sleep and practice. Usually people go through training before");
		c.println ("getting a mission, but you are skilled enough to kill a Harper, so I will");
		c.println ("let you on your mission right now.");
		c.println ();
		c.println (DM);
		c.println ("Brenna takes out a small scroll and reads it out loud.");
		c.println ();
		c.println ("<BRENNA>");
		c.println ("A Harper is needed in the city of Baldur's Gate to help Abdel Adrian known");
		c.println ("as \"The Hero of Baldur's Gate\" to defeat the Shining Lady and her Crusade");
		c.println ("of evil. Well? What are you waiting for? A raise? Go! Now!");
		c.println ();
	    }
	}
	//Alternate Ending
	else
	{
	    c.println ();
	    c.println ("...And I regret it. Deeply!");
	    c.println ();
	    c.println (DM);
	    c.println ("After her long \"TED talk\", she removes all of her spells. To your surprise,");
	    c.println ("every single being in her estate were her illusions.");
	    c.println ();
	    c.println ("<BRENNA>");
	    c.println ("WE SHALL END THIS NOW!!!");
	    c.println ();

	    if (rank.equals ("Barbarian") || rank.equals ("barbarian"))
	    {
		BarbarianBoss ();
	    }
	    else
	    {
		MageBoss ();
	    }

	    //Victory
	    c.println ();
	    c.println (DM);
	    c.println ("Both you and Brenna collapse on to the ground severly injured, but unlike");
	    c.println ("her, you are able to move a little. You lessen your distance with Brenna");
	    c.println ("and prepare to kill her with Blazeguard.");
	    c.println ();
	    c.println ("<BRENNA>");
	    c.println ("I may have lost to you, but this doesn't make you victorious. If there is evil,");
	    c.println ("there is always good to defeat them. Always, always... always...");
	    c.println ();
	    c.println (DM);
	    c.println ("Brenna dies before you have the chance to kill her properly.");
	    c.println ("You successfully avenged your parents and you know that they are pleased.");
	    c.println ("You think you are happy as well, but something is quite wrong. She said good");
	    c.println ("will always be there to terminate evil such as myself. Well then, problem's");
	    c.println ("solved. I will kill every single being that has the slightest good in them.");
	    c.println ("Let's start with Elminster Aumar.");
	    c.println ();
	}
	//Ending :)

	//Press the "Enter" key to continue
	c.println ("Please press the \"ENTER\" key to continue");
	do
	{
	    user = c.getChar ();

	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
	    }
	}
	while (!(user == (int) 10));

	c.clear ();
	Loading ();

	//Thank You for Playing!
	ExitScreen ();


    } // main method


    public static void IntroScreen ()
    {
	//declaration
	char user;

	//Program Header
	Font MyFont = new Font ("Tempus sans itc", Font.PLAIN, 25);
	c.setFont (MyFont);
	c.drawString ("The Revenge in Cathyr", 210, 100);
	c.drawString ("By Andrew Chai", 245, 150);
	c.drawString ("Wednesday, June 23, 2021", 190, 200);
	c.drawString ("*This game is about 8 minutes long*", 140, 250);
	c.drawString ("Description", 0, 300);

	//Description
	Font myFont = new Font ("Tempus sans itc", Font.PLAIN, 20);
	c.setFont (myFont);
	c.drawString ("You are born in the great city of Cathyr as a child of an important Barbarian", 0, 360);
	c.drawString ("and Mage, named Varfunn and Kerei. Your family is wealthy and has a great", 0, 390);
	c.drawString ("reputation which has always been a benefit living your life.", 0, 420);
	c.setColor (Color.red);
	Font Myfont = new Font ("Chiller", Font.PLAIN, 30);
	c.setFont (Myfont);
	c.drawString ("Or so you thought...!", 0, 480);

	//Press the "Enter" key to continue
	do
	{
	    c.println ("Please press the \"ENTER\" key to continue");
	    user = c.getChar ();
	    if (!(user == (int) 10))
		c.println ("<ERROR>");
	}
	while (!(user == (int) 10));
	c.clear ();
    }


    public static void ExitScreen ()
    {
	//Thank You for Playing!
	c.setColor (Color.red);
	Font fontEnd = new Font ("Algerian", Font.PLAIN, 80);
	c.setFont (fontEnd);
	c.drawString ("D&D", 245, 80);

	c.setColor (Color.black);
	Font fontEnd2 = new Font ("Algerian", Font.PLAIN, 50);
	c.setFont (fontEnd2);
	c.drawString ("THANK YOU FOR PLAYING", 30, 150);
	c.drawString ("\"THE REVENGE IN CATHYR\"", 20, 250);

	c.drawOval (250, 300, 150, 150);
	c.fillOval (255, 350, 30, 30);
	c.fillOval (365, 350, 30, 30);
	c.drawArc (300, 350, 50, 50, 180, 180);
    }


    public static void LoggingIn ()
    {
	//Logging in Screen
	//Title
	c.setColor (Color.red);
	Font font = new Font ("Algerian", Font.PLAIN, 80);
	c.setFont (font);
	c.drawString ("D&D", 245, 80);

	c.setColor (Color.black);
	Font fnt = new Font ("Goudy stout", Font.PLAIN, 20);
	c.setFont (fnt);
	c.drawString ("The Revenge in Cathyr", 90, 130);

	//The Flag of Cathyr
	c.setColor (Color.black);
	c.drawRect (215, 200, 220, 150);
	c.drawLine (215, 350, 215, 370);
	c.drawLine (435, 350, 435, 370);
	c.drawLine (215, 370, 325, 450);
	c.drawLine (325, 450, 435, 370);

	Color col = new Color (177, 156, 217);
	c.setColor (col);
	c.fillRect (216, 201, 219, 149);

	Color colr = new Color (92, 137, 199);
	c.setColor (colr);
	int[] xaxis = {215, 325, 435};
	int[] yaxis = {370, 450, 370};
	c.fillPolygon (xaxis, yaxis, 3);
	c.fillRect (216, 351, 219, 19);

	c.setColor (Color.white);
	for (int x = 220 ; x <= 430 ; x += 20)
	{
	    c.fillStar (x, 355, 10, 10);
	}


	c.fillOval (275, 230, 100, 100);

	Color color = new Color (177, 156, 217);
	c.setColor (color);
	c.fillOval (300, 240, 90, 80);

	//extra
	Color mycolor = new Color (141, 2, 31);
	c.setColor (mycolor);
	c.fillRect (0, 0, 60, 60);
	c.fillRect (0, 440, 60, 60);
	c.fillRect (580, 0, 60, 60);
	c.fillRect (580, 440, 60, 60);
	c.fillRect (0, 0, 10, 500);
	c.fillRect (0, 0, 640, 10);
	c.fillRect (0, 490, 640, 10);
	c.fillRect (630, 0, 10, 500);

	c.setColor (Color.black);
	c.drawRect (0, 0, 60, 60);
	c.drawRect (0, 440, 60, 60);
	c.drawRect (580, 0, 60, 60);
	c.drawRect (580, 440, 60, 60);
	c.drawLine (10, 0, 10, 500);
	c.drawLine (0, 10, 640, 10);
	c.drawLine (0, 490, 640, 490);
	c.drawLine (630, 0, 630, 500);

	//Loading
	c.setColor (Color.black);
	for (int x = 0 ; x <= 430 ; x++)
	{
	    c.drawLine (x, 490, x, 500);
	    delay (3);
	}


	delay (1500);
	for (int x = 430 ; x <= 639 ; x++)
	{
	    c.drawLine (x, 490, x, 500);
	    delay (4);
	}


	delay (1500);

	c.clear ();
    }


    //Loading Screen
    public static void Loading ()
    {
	//Title
	c.setColor (Color.red);
	Font font = new Font ("Algerian", Font.PLAIN, 80);
	c.setFont (font);
	c.drawString ("D&D", 245, 80);

	c.setColor (Color.black);
	Font fnt = new Font ("Goudy stout", Font.PLAIN, 20);
	c.setFont (fnt);
	c.drawString ("The Revenge in Cathyr", 90, 130);

	//The Flag of Cathyr
	c.setColor (Color.black);
	c.drawRect (215, 200, 220, 150);
	c.drawLine (215, 350, 215, 370);
	c.drawLine (435, 350, 435, 370);
	c.drawLine (215, 370, 325, 450);
	c.drawLine (325, 450, 435, 370);

	Color col = new Color (177, 156, 217);
	c.setColor (col);
	c.fillRect (216, 201, 219, 149);

	Color colr = new Color (92, 137, 199);
	c.setColor (colr);
	int[] xaxis = {215, 325, 435};
	int[] yaxis = {370, 450, 370};
	c.fillPolygon (xaxis, yaxis, 3);
	c.fillRect (216, 351, 219, 19);

	c.setColor (Color.white);
	for (int x = 220 ; x <= 430 ; x += 20)
	{
	    c.fillStar (x, 355, 10, 10);
	}


	c.fillOval (275, 230, 100, 100);

	Color color = new Color (177, 156, 217);
	c.setColor (color);
	c.fillOval (300, 240, 90, 80);

	//extra
	Color mycolor = new Color (141, 2, 31);
	c.setColor (mycolor);
	c.fillRect (0, 0, 60, 60);
	c.fillRect (0, 440, 60, 60);
	c.fillRect (580, 0, 60, 60);
	c.fillRect (580, 440, 60, 60);
	c.fillRect (0, 0, 10, 500);
	c.fillRect (0, 0, 640, 10);
	c.fillRect (0, 490, 640, 10);
	c.fillRect (630, 0, 10, 500);

	c.setColor (Color.black);
	c.drawRect (0, 0, 60, 60);
	c.drawRect (0, 440, 60, 60);
	c.drawRect (580, 0, 60, 60);
	c.drawRect (580, 440, 60, 60);
	c.drawLine (10, 0, 10, 500);
	c.drawLine (0, 10, 640, 10);
	c.drawLine (0, 490, 640, 490);
	c.drawLine (630, 0, 630, 500);

	//Loading
	c.setColor (Color.black);
	for (int x = 0 ; x <= 639 ; x++)
	{
	    c.drawLine (x, 490, x, 500);
	    delay (3);
	}


	c.clear ();
    }


    //Delay Method
    public static void delay (int millisecs)
    {
	try
	{
	    Thread.currentThread ().sleep (millisecs);
	}


	catch (InterruptedException e)
	{
	}
    }


    //Barbarian Battle
    public static void BarbarianBattle ()
    {
	//Declaration
	String[] AttackNames = {"Blood Strike", "Magic Missile", "Careful Shot"};
	char user, userNum;
	int i, AC, Hp, dice, enemyAC, enemyHp, attack;
	double immune;

	enemyAC = (int) (Math.random () * 5 + 8);
	enemyHp = (int) (Math.random () * 2 + 2);
	attack = 1;

	user = ' ';
	AC = 16;
	Hp = 10;

	//HERO PHASE
	while (Hp > 0 && enemyHp > 0)
	{
	    AC = 17;
	    immune = 1;

	    c.println ("________________________________________________________________________________");
	    c.println ("<HERO PHASE>");

	    if (Hp <= 2)
	    {
		c.println ("Warning! Your health is very low!");
		c.println ();
	    }
	    do
	    {
		c.println ("Your Turn (press the following keys)");
		c.print ("\"a\": attack, \"d\": defence");

		if (Hp < 10)
		    c.println (", \"h\": heal");
		user = c.getChar ();

		if (!(user == (int) 97 || user == (int) 100 || user == (int) 104))
		{
		    c.println ();
		    c.println ("<ERROR>");
		}
	    }
	    while (!(user == (int) 97 || user == (int) 100 || user == (int) 104));

	    c.println ();

	    if (user == (int) 97)
	    {
		//Attack Type
		do
		{
		    c.println ();
		    c.println ("Select Attack (press the following numbers)");
		    c.println ("1. \"Charge\": 1 damage. Roll 18 (D20) or higher: +1 bonus");
		    c.println ();
		    c.println ("2. \"Twin Strike\": 3 damages. Roll dice twice if previous one fails. Roll 8 or");
		    c.println ("lower (D12): Missed");
		    c.println ("________________________________________________________________________________");
		    userNum = c.getChar ();

		    if (!(userNum == (int) 49 || userNum == (int) 50))
		    {
			c.println ();
			c.println ("<ERROR>");
		    }
		}
		while (!(userNum == (int) 49 || userNum == (int) 50));

		c.println ();

		//Charge/Twin Strike
		switch (userNum)
		{
		    case (int) 49:
			{
			    c.println ("Attack Type: Charge");
			    dice = (int) (Math.random () * 20 + 1);
			    c.println ("Enemy AC: " + enemyAC);
			    c.println ("Dice rolled: " + dice);

			    if (dice >= enemyAC)
			    {
				c.println ("Hit!");
				dice = (int) (Math.random () * 20 + 1);
				c.println ("Dice rolled: " + dice);

				if (dice >= 18)
				{
				    c.println ("2 damages!");
				    c.println ("Enemy Hp: " + (enemyHp - 2));
				    enemyHp -= 2;
				}
				else
				{
				    c.println ("1 damage!");
				    c.println ("Enemy Hp: " + (enemyHp - 1));
				    enemyHp -= 1;
				}
			    }
			    else
			    {
				c.println ("Missed!");
				c.println ("Enemy Hp: " + enemyHp);
			    }
			    break;
			}
		    case (int) 50:
			{
			    c.println ("Attack Type: Twin Strike");
			    dice = (int) (Math.random () * 20 + 1);
			    c.println ("Enemy AC: " + enemyAC);
			    c.println ("First Dice rolled: " + dice);

			    if (dice >= enemyAC)
			    {
				c.println ("Hit!");
				dice = (int) (Math.random () * (12) + 1);

				if (dice <= 8)
				{
				    c.println ("Dice rolled: " + dice);
				    c.println ("Missed!");
				    c.println ("Enemy Hp: " + enemyHp);
				}
				else
				{
				    c.println ("Dice rolled: " + dice);
				    c.println ("3 damages!");
				    c.println ("Enemy Hp: " + (enemyHp - 3));
				    enemyHp -= 3;
				}
			    }
			    else
			    {
				c.println ("Missed!");
				dice = (int) (Math.random () * 20 + 1);
				c.println ("Second Dice rolled: " + dice);

				if (dice >= enemyAC)
				{
				    c.println ("Hit!");
				    dice = (int) (Math.random () * (12) + 1);

				    if (dice <= 8)
				    {
					c.println ("Dice rolled: " + dice);
					c.println ("Missed!");
					c.println ("Enemy Hp: " + enemyHp);
				    }
				    else
				    {
					c.println ("Dice rolled: " + dice);
					c.println ("3 damages!");
					c.println ("Enemy Hp: " + (enemyHp - 3));
					enemyHp -= 3;
				    }
				}
				else
				{
				    c.println ("Missed!");
				    c.println ("Enemy Hp: " + enemyHp);
				}
			    }
			    break;
			}
		}
	    }
	    else if (user == (int) 100)
	    {
		//Defence Type
		do
		{
		    c.println ();
		    c.println ("Select Defence type (press the following numbers)");
		    c.println ("1. \"Armour of Helm\": +1 AC. 1 turn");
		    c.println ();
		    c.println ("2. \"Avoid and Evade\": Complete Immunity if dice roll is 10 (D10). 1 turn. If");
		    c.println ("not, your spell is ruined");
		    c.println ("________________________________________________________________________________");
		    userNum = c.getChar ();

		    if (!(userNum == (int) 49 || userNum == (int) 50))
		    {
			c.println ();
			c.println ("<ERROR>");
		    }
		}
		while (!(userNum == (int) 49 || userNum == (int) 50));

		c.println ();

		//Armour of Helm/Avoid and Evade
		switch (userNum)
		{
		    case (int) 49:
			{
			    c.println ("Defence Type: Armour of Helm");
			    c.println ("Your AC: " + (AC + 1));
			    AC += 1;
			    break;
			}
		    case (int) 50:
			{
			    c.println ("Defence Type: Avoid and Evade");
			    dice = (int) (Math.random () * (10) + 1);
			    c.println ("Dice roll: " + dice);

			    if (dice == 10)
			    {
				c.println ("COMPLETE IMMUNITY!");
				immune = attack * 0;
			    }
			    else
				c.println ("Spell is Ruined!");
			    break;
			}
		}
	    }
	    else
	    {
		//Heal
		c.println ();
		c.println ("Tymora's Touch: +1 Hp");
		c.println ("Hp: " + (Hp + 1));
		Hp += 1;
	    }

	    //VILLAIN PHASE
	    i = (int) (Math.random () * 3);
	    c.println ("________________________________________________________________________________");
	    c.println ("<VILLAIN PHASE>");

	    c.println ("Attack Type: " + AttackNames [i]);
	    dice = (int) (Math.random () * 20 + 1);
	    c.println ("Your AC: " + AC);
	    c.println ("Dice roll: " + dice);

	    if (dice >= AC)
	    {
		c.println ("Hit!");
		c.println ("Your Hp: " + (Hp - (int) (attack * immune)));
		Hp -= (int) (attack * immune);
	    }
	    else
	    {
		c.println ("Missed!");
		c.println ("Your Hp: " + Hp);
	    }
	}


	c.clear ();
	c.println ();

	//You Died
	if (Hp <= 0)
	{
	    Death ();
	}


	else
	{
	    c.println ();
	    c.println ("Victory!!!");
	    c.println ();
	}
    }


    //Mage Battle
    public static void MageBattle ()
    {
	//Declaration
	String[] AttackNames = {"Fatal Blow", "Burning Wand", "Snipe Aim"};
	char user, userNum;
	int i, AC, Hp, dice, enemyAC, enemyHp, attack, blind, wound, immobilize;

	enemyAC = (int) (Math.random () * 5 + 8);
	enemyHp = (int) (Math.random () * 2 + 2);
	attack = (int) (Math.random () * 2 + 1);

	user = ' ';
	AC = 14;
	Hp = 4;

	blind = 0;
	wound = 0;
	immobilize = 0;

	//HERO PHASE
	while (Hp > 0 && enemyHp > 0)
	{
	    AC = 14;

	    if (immobilize > 0)
		immobilize -= 1;

	    c.println ("________________________________________________________________________________");
	    c.println ("<HERO PHASE>");

	    if (Hp <= 2)
	    {
		c.println ("Warning! Your health is very low!");
		c.println ();
	    }
	    do
	    {
		c.println ("Your Turn (press the following keys)");
		c.print ("\"a\": attack, \"u\": utilities");

		if (Hp < 4)
		    c.println (", \"h\": heal");
		user = c.getChar ();

		if (!(user == (int) 97 || user == (int) 117 || user == (int) 104))
		{
		    c.println ();
		    c.println ("<ERROR>");
		}
	    }
	    while (!(user == (int) 97 || user == (int) 117 || user == (int) 104));

	    c.println ();

	    if (user == (int) 97)
	    {
		//Attack Type
		do
		{
		    c.println ();
		    c.println ("Select Attack (press the following numbers)");
		    c.println ("1. \"Lightning Bolt\": If dice roll is even (D8): 1 damage. If not: spell is");
		    c.println ("ruined");
		    c.println ();
		    c.println ("2. \"Fireball\": If dice roll is odd (D8): 1 damage. If not: spell is ruined");
		    c.println ();
		    c.println ("3. \"Earthquake\": If dice roll is 8 or 1 (D8): 2 damages. If not: spell is");
		    c.println ("ruined");
		    c.println ("________________________________________________________________________________");
		    userNum = c.getChar ();

		    if (!(userNum == (int) 49 || userNum == (int) 50 || userNum == (int) 51))
		    {
			c.println ();
			c.println ("<ERROR>");
		    }
		}
		while (!(userNum == (int) 49 || userNum == (int) 50 || userNum == (int) 51));

		c.println ();

		//Lightning Bolt/Fireball/Earthquake
		switch (userNum)
		{
		    case (int) 49:
			{
			    c.println ("Attack Type: Lightning Bolt");
			    dice = (int) (Math.random () * 20 + 1);
			    c.println ("Enemy AC: " + enemyAC);
			    c.println ("Dice rolled: " + dice);

			    if (dice >= enemyAC)
			    {
				c.println ("Spell casted!");
				dice = (int) (Math.random () * (8) + 1);
				c.println ("Dice rolled: " + dice);

				if (dice % 2 == 0)
				{

				    if (wound == 1)
				    {
					c.println ("Hit!");
					c.println ("2 damages!");
					c.println ("Enemy Hp: " + (enemyHp - 2));
					enemyHp -= 2;
				    }
				    else
				    {
					c.println ("Hit!");
					c.println ("1 damage!");
					c.println ("Enemy Hp: " + (enemyHp - 1));
					enemyHp -= 1;
				    }
				}
				else
				{
				    c.println ("Missed!");
				    c.println ("Enemy Hp: " + enemyHp);
				}
			    }
			    else
			    {
				c.println ("Spell is ruined!");
				c.println ("Enemy Hp: " + enemyHp);
			    }
			    break;
			}

		    case (int) 50:
			{
			    c.println ("Attack Type: Fireball");
			    dice = (int) (Math.random () * 20 + 1);
			    c.println ("Enemy AC: " + enemyAC);
			    c.println ("Dice rolled: " + dice);

			    if (dice >= enemyAC)
			    {
				c.println ("Spell casted!");
				dice = (int) (Math.random () * (8) + 1);
				c.println ("Dice rolled: " + dice);

				if (dice % 2 == 1)
				{

				    if (wound == 1)
				    {
					c.println ("Hit!");
					c.println ("2 damages!");
					c.println ("Enemy Hp: " + (enemyHp - 2));
					enemyHp -= 2;
				    }
				    else
				    {
					c.println ("Hit!");
					c.println ("1 damage!");
					c.println ("Enemy Hp: " + (enemyHp - 1));
					enemyHp -= 1;
				    }
				}
				else
				{
				    c.println ("Missed!");
				    c.println ("Enemy Hp: " + enemyHp);
				}
			    }
			    else
			    {
				c.println ("Spell is ruined!");
				c.println ("Enemy Hp: " + enemyHp);
			    }
			    break;
			}

		    case (int) 51:
			{
			    c.println ("Attack Type: Earthquake");
			    dice = (int) (Math.random () * 20 + 1);
			    c.println ("Enemy AC: " + enemyAC);
			    c.println ("Dice rolled: " + dice);

			    if (dice >= enemyAC)
			    {
				c.println ("Spell casted!");
				dice = (int) (Math.random () * (8) + 1);
				c.println ("Dice rolled: " + dice);

				if (dice == 1 || dice == 8)
				{

				    if (wound == 1)
				    {
					c.println ("Hit!");
					c.println ("3 damages!");
					c.println ("Enemy Hp: " + (enemyHp - 3));
					enemyHp -= 3;
				    }
				    else
				    {
					c.println ("Hit!");
					c.println ("2 damages!");
					c.println ("Enemy Hp: " + (enemyHp - 2));
					enemyHp -= 2;
				    }
				}
				else
				{
				    c.println ("Missed!");
				    c.println ("Enemy Hp: " + enemyHp);
				}
			    }
			    else
			    {
				c.println ("Spell is ruined!");
				c.println ("Enemy Hp: " + enemyHp);
			    }
			    break;
			}
		}
	    }
	    else if (user == (int) 117)
	    {
		//Utilities Type
		do
		{
		    c.println ();
		    c.println ("Select Utility type (press the following numbers)");
		    c.println ("1. \"Sel�ne's Glare\": Blind. PERMANENT. If dice roll is 20 (D20) opponent's");
		    c.println ("hit roll is reduced by 1. If not: spell is ruined and -1 Hp");
		    c.println ();
		    c.println ("2. \"Splinter of Rillifane\": Wound. PERMANENT. If dice roll is 20 (D20) your");
		    c.println ("physical attacks will have a +1 attack damage. If not: spell is ruined and");
		    c.println ("-2 Hp");
		    c.println ();
		    c.println ("3. \"Corellon's Curse\": Immobilize. If dice roll is 20 (D20) opponent can\'t");
		    c.println ("do anything for 2 turns. If not: spell is ruined and -3 Hp");
		    c.println ("________________________________________________________________________________");
		    userNum = c.getChar ();

		    if (!(userNum == (int) 49 || userNum == (int) 50 || userNum == (int) 51))
		    {
			c.println ();
			c.println ("<ERROR>");
		    }
		}
		while (!(userNum == (int) 49 || userNum == (int) 50 || userNum == (int) 51));

		c.println ();

		//Sel�ne's Glare/Corellon's Curse/Splinter of Rillifane
		switch (userNum)
		{
		    case (int) 49:
			{
			    c.println ("Utility Type: Sel�ne's Glare");
			    dice = (int) (Math.random () * 20 + 1);
			    c.println ("Dice rolled: " + dice);

			    if (dice == 20)
			    {
				c.println ("Hit!");
				blind = 1;
			    }
			    else
			    {
				c.println ("Spell is ruined!");
				c.println ("Your Hp: " + (Hp - 1));
				Hp -= 1;
			    }
			    break;
			}
		    case (int) 50:
			{
			    c.println ("Utility Type: Splinter of Rillifane");
			    dice = (int) (Math.random () * 20 + 1);
			    c.println ("Dice rolled: " + dice);

			    if (dice == 20)
			    {
				c.println ("Hit!");
				wound = 1;
			    }
			    else
			    {
				c.println ("Spell is ruined!");
				c.println ("Your Hp: " + (Hp - 2));
				Hp -= 2;
			    }
			    break;
			}
		    case (int) 51:
			{
			    c.println ("Utility Type: Corellon's Curse");
			    dice = (int) (Math.random () * 20 + 1);
			    c.println ("Dice rolled: " + dice);

			    if (dice == 20)
			    {
				c.println ("Hit!");
				immobilize = 3;
			    }
			    else
			    {
				c.println ("Spell is ruined!");
				c.println ("Your Hp: " + (Hp - 3));
				Hp -= 3;
			    }
			    break;
			}
		}
	    }
	    else
	    {
		//Heal Type
		do
		{
		    c.println ();
		    c.println ("Select Heal type (press the following numbers)");
		    c.println ("1. \"Bless\": Regain +1 Hp.");
		    c.println ();
		    c.println ("2. \"Immense Healing Factor\": If dice roll is 20 (D20) regain all Hp. If not:");
		    c.println ("spell is ruined");
		    c.println ("________________________________________________________________________________");
		    userNum = c.getChar ();

		    if (!(userNum == (int) 49 || userNum == (int) 50))
		    {
			c.println ();
			c.println ("<ERROR>");
		    }
		}
		while (!(userNum == (int) 49 || userNum == (int) 50));

		c.println ();

		//Bless/Immense Healing Factor
		switch (userNum)
		{
		    case (int) 49:
			{
			    c.println ("Heal Type: Bless");
			    c.println ("Hp: " + (Hp + 1));
			    Hp += 1;
			    break;
			}
		    case (int) 50:
			{
			    c.println ("Heal Type: Immense Healing Factor");
			    dice = (int) (Math.random () * 20 + 1);
			    c.println ("Dice rolled: " + dice);

			    if (dice == 20)
			    {
				Hp = 6;
				c.println ("Hp: " + Hp);
			    }
			    else
			    {
				c.println ("spell is ruined");
			    }
			    break;
			}
		}
	    }
	    //VILLAIN PHASE
	    if (immobilize > 0)
	    {
		c.println ("*Opponent is Immobilized");
	    }
	    else
	    {
		i = (int) (Math.random () * 3);
		c.println ("________________________________________________________________________________");
		c.println ("<VILLAIN PHASE>");

		c.println ("Attack Type: " + AttackNames [i]);
		dice = (int) (Math.random () * 20 + 1);

		if (blind == 1)
		    dice -= 1;

		c.println ("Your AC: " + AC);
		c.println ("Dice roll: " + dice);

		if (dice >= AC)
		{
		    c.println ("Hit!");
		    c.println ("Your Hp: " + (Hp - attack));
		    Hp -= attack;
		}
		else
		{
		    c.println ("Missed!");
		    c.println ("Your Hp: " + Hp);
		}
	    }
	}


	c.clear ();
	c.println ();

	//You Died
	if (Hp <= 0)
	{
	    Death ();
	}


	else
	{
	    c.println ();
	    c.println ("Victory!!!");
	    c.println ();
	}
    }


    //Mage Boss Battle
    public static void MageBoss ()
    {
	//Declaration
	char user, userNum;
	int AC, Hp, dice, BossAC, BAC, BossHp, BHp, blind, wound, immobilize, PhaseType, BossAttack, BossDefence;

	BossAC = (int) (Math.random () * 3 + 14);
	BossHp = (int) (Math.random () * 3 + 8);
	BAC = BossAC;
	BHp = BossHp;

	user = ' ';
	AC = 14;
	Hp = 4;

	blind = 0;
	wound = 0;
	immobilize = 0;

	//HERO PHASE
	while (Hp > 0 && BHp > 0)
	{
	    AC = 14;

	    if (immobilize > 0)
		immobilize -= 1;

	    c.println ("________________________________________________________________________________");
	    c.println ("<HERO PHASE>");

	    if (Hp <= 2)
	    {
		c.println ("Warning! Your health is very low!");
		c.println ();
	    }

	    do
	    {
		c.println ("Your Turn (press the following keys)");
		c.print ("\"a\": attack, \"u\": utilities");

		if (Hp < 4)
		    c.println (", \"h\": heal");
		user = c.getChar ();

		if (!(user == (int) 97 || user == (int) 117 || user == (int) 104))
		{
		    c.println ();
		    c.println ("<ERROR>");
		}
	    }
	    while (!(user == (int) 97 || user == (int) 117 || user == (int) 104));

	    c.println ();

	    if (user == (int) 97)
	    {
		//Attack Type
		do
		{
		    c.println ();
		    c.println ("Select Attack (press the following numbers)");
		    c.println ("1. \"Lightning Bolt\": If dice roll is even (D8): 1 damage. If not: spell is");
		    c.println ("ruined");
		    c.println ();
		    c.println ("2. \"Fireball\": If dice roll is odd (D8): 1 damage. If not: spell is ruined");
		    c.println ();
		    c.println ("3. \"Earthquake\": If dice roll is 8 or 1 (D8): 2 damages. If not: spell is");
		    c.println ("ruined");
		    c.println ("________________________________________________________________________________");
		    userNum = c.getChar ();

		    if (!(userNum == (int) 49 || userNum == (int) 50 || userNum == (int) 51))
		    {
			c.println ();
			c.println ("<ERROR>");
		    }
		}
		while (!(userNum == (int) 49 || userNum == (int) 50 || userNum == (int) 51));

		c.println ();

		//Lightning Bolt/Fireball/Earthquake
		switch (userNum)
		{
		    case (int) 49:
			{
			    c.println ("Attack Type: Lightning Bolt");
			    dice = (int) (Math.random () * 20 + 1);
			    c.println ("Boss AC: " + BAC);
			    c.println ("Dice rolled: " + dice);

			    if (dice >= BAC)
			    {
				c.println ("Spell casted!");
				dice = (int) (Math.random () * (8) + 1);
				c.println ("Dice rolled: " + dice);

				if (dice % 2 == 0)
				{

				    if (wound == 1)
				    {
					c.println ("Hit!");
					c.println ("2 damages!");
					c.println ("Boss Hp: " + (BHp - 2));
					BHp -= 2;
				    }
				    else
				    {
					c.println ("Hit!");
					c.println ("1 damage!");
					c.println ("Boss Hp: " + (BHp - 1));
					BHp -= 1;
				    }
				}
				else
				{
				    c.println ("Missed!");
				    c.println ("Boss Hp: " + BHp);
				}
			    }
			    else
			    {
				c.println ("Spell is ruined!");
				c.println ("Boss Hp: " + BHp);
			    }
			    break;
			}
		    case (int) 50:
			{
			    c.println ("Attack Type: Fireball");
			    dice = (int) (Math.random () * 20 + 1);
			    c.println ("Boss AC: " + BAC);
			    c.println ("Dice rolled: " + dice);

			    if (dice >= BAC)
			    {
				c.println ("Spell casted!");
				dice = (int) (Math.random () * (8) + 1);
				c.println ("Dice rolled: " + dice);

				if (dice % 2 == 1)
				{

				    if (wound == 1)
				    {
					c.println ("Hit!");
					c.println ("2 damages!");
					c.println ("Boss Hp: " + (BHp - 2));
					BHp -= 2;
				    }
				    else
				    {
					c.println ("Hit!");
					c.println ("1 damage!");
					c.println ("Boss Hp: " + (BHp - 1));
					BHp -= 1;
				    }
				}
				else
				{
				    c.println ("Missed");
				    c.println ("Boss Hp: " + BHp);
				}
			    }
			    else
			    {
				c.println ("Spell is ruined!");
				c.println ("Boss Hp: " + BHp);
			    }
			    break;
			}
		    case (int) 51:
			{
			    c.println ("Attack Type: Earthquake");
			    dice = (int) (Math.random () * 20 + 1);
			    c.println ("Boss AC: " + BAC);
			    c.println ("Dice rolled: " + dice);

			    if (dice >= BAC)
			    {
				c.println ("Spell Casted!");
				dice = (int) (Math.random () * (8) + 1);
				c.println ("Dice rolled: " + dice);

				if (dice == 1 || dice == 8)
				{

				    if (wound == 1)
				    {
					c.println ("Hit!");
					c.println ("3 damages!");
					c.println ("Boss Hp: " + (BHp - 3));
					BHp -= 3;
				    }
				    else
				    {
					c.println ("Hit!");
					c.println ("2 damages!");
					c.println ("Boss Hp: " + (BHp - 2));
					BHp -= 2;
				    }
				}
				else
				{
				    c.println ("Missed!");
				    c.println ("Boss Hp: " + BHp);
				}
			    }
			    else
			    {
				c.println ("Spell is ruined!");
				c.println ("Boss Hp: " + BHp);
			    }
			    break;
			}
		}
	    }
	    else if (user == (int) 117)
	    {
		//Utilities Type
		do
		{
		    c.println ();
		    c.println ("Select Utility type (press the following numbers)");
		    c.println ("1. \"Sel�ne's Glare\": Blind. PERMANENT. If dice roll is 20 (D20) opponent's");
		    c.println ("hit roll is reduced by 1. If not: spell is ruined and -1 Hp");
		    c.println ();
		    c.println ("2. \"Splinter of Rillifane\": Wound. PERMANENT. If dice roll is 20 (D20) your");
		    c.println ("physical attacks will have a +1 attack damage. If not: spell is ruined and");
		    c.println ("-2 Hp");
		    c.println ();
		    c.println ("3. \"Corellon's Curse\": Immobilize. If dice roll is 20 (D20) opponent can\'t");
		    c.println ("do anything for 2 turns. If not: spell is ruined and -3 Hp");
		    c.println ("________________________________________________________________________________");
		    userNum = c.getChar ();

		    if (!(userNum == (int) 49 || userNum == (int) 50 || userNum == (int) 51))
		    {
			c.println ();
			c.println ("<ERROR>");
		    }
		}
		while (!(userNum == (int) 49 || userNum == (int) 50 || userNum == (int) 51));

		c.println ();

		//Sel�ne's Glare/Corellon's Curse/Splinter of Rillifane
		switch (userNum)
		{
		    case (int) 49:
			{
			    c.println ("Utility Type: Sel�ne's Glare");
			    dice = (int) (Math.random () * 20 + 1);
			    c.println ("Dice rolled: " + dice);

			    if (dice == 20)
			    {
				c.println ("Hit!");
				blind = 1;
			    }
			    else
			    {
				c.println ("Spell is ruined!");
				c.println ("Your Hp: " + (Hp - 1));
				Hp -= 1;
			    }
			    break;
			}
		    case (int) 50:
			{
			    c.println ("Utility Type: Splinter of Rillifane");
			    dice = (int) (Math.random () * 20 + 1);
			    c.println ("Dice rolled: " + dice);

			    if (dice == 20)
			    {
				c.println ("Hit!");
				wound = 1;
			    }
			    else
			    {
				c.println ("Spell is ruined!");
				c.println ("Your Hp: " + (Hp - 2));
				Hp -= 2;
			    }
			    break;
			}
		    case (int) 51:
			{
			    c.println ("Utility Type: Corellon's Curse");
			    dice = (int) (Math.random () * 20 + 1);
			    c.println ("Dice rolled: " + dice);

			    if (dice == 20)
			    {
				c.println ("Hit!");
				immobilize = 3;
			    }
			    else
			    {
				c.println ("Spell is ruined!");
				c.println ("Your Hp: " + (Hp - 3));
				Hp -= 3;
			    }
			    break;
			}
		}
	    }
	    else
	    {
		//Heal Type
		do
		{
		    c.println ();
		    c.println ("Select Heal type (press the following numbers)");
		    c.println ("1. \"Bless\": Regain +1 Hp.");
		    c.println ();
		    c.println ("2. \"Immense Healing Factor\": If dice roll is 20 (D20) regain all Hp. If not:");
		    c.println ("spell is ruined");
		    c.println ("________________________________________________________________________________");
		    userNum = c.getChar ();

		    if (!(userNum == (int) 49 || userNum == (int) 50))
		    {
			c.println ();
			c.println ("<ERROR>");
		    }
		}
		while (!(userNum == (int) 49 || userNum == (int) 50));

		c.println ();

		//Bless/Immense Healing Factor
		switch (userNum)
		{
		    case (int) 49:
			{
			    c.println ("Heal Type: Bless");
			    c.println ("Hp: " + (Hp + 1));
			    Hp += 1;
			    break;
			}
		    case (int) 50:
			{
			    c.println ("Heal Type: Immense Healing Factor");
			    dice = (int) (Math.random () * 20 + 1);
			    c.println ("Dice rolled: " + dice);

			    if (dice == 20)
			    {
				Hp = 6;
				c.println ("Hp: " + Hp);
			    }
			    else
			    {
				c.println ("spell is ruined");
			    }
			    break;
			}
		}
	    }

	    //BOSS PHASE
	    BAC = BossAC;
	    BHp = BossHp;

	    if (immobilize > 0)
	    {
		c.println ("*Opponent is Immobilized");
	    }
	    else
	    {
		c.println ("________________________________________________________________________________");
		c.println ("<BOSS PHASE>");

		PhaseType = (int) (Math.random () * 3 + 1);

		if (PhaseType == 3)
		{

		    if (BHp == BHp)
			PhaseType -= 1;
		}

		if (PhaseType == 1)
		{
		    BossAttack = (int) (Math.random () * 2 + 1);

		    switch (BossAttack)
		    {
			case 1:
			    {
				c.println ("Attack Type: Brute Strike");
				dice = (int) (Math.random () * 20 + 1);
				c.println ("Your AC: " + AC);
				c.println ("Dice rolled: " + dice);

				if (dice > AC)
				{
				    c.println ("Hit!");
				    c.println ("Your Hp: " + (Hp - 1));
				    Hp -= 1;
				}
				else
				{
				    c.println ("Missed!");
				    c.println ("Your Hp: " + Hp);
				}
				break;
			    }
			case 2:
			    {
				c.println ("Attack Type: Precise Strike");
				dice = (int) (Math.random () * 20 + 1);
				c.println ("Your AC: " + AC);
				c.println ("Dice rolled: " + dice);

				if (dice > AC)
				{
				    c.println ("Hit!");
				    c.println ("Your Hp: " + (Hp - 1));
				    Hp -= 1;
				}
				else
				{
				    c.println ("Missed!");
				    dice = (int) (Math.random () * 20 + 1);
				    c.println ("Dice rolled: " + dice);

				    if (dice > AC)
				    {
					c.println ("Hit!");
					c.println ("Your Hp: " + (Hp - 1));
					Hp -= 1;
				    }
				    else
				    {
					c.println ("Missed!");
					c.println ("Your Hp: " + Hp);
				    }
				}
				break;
			    }
		    }
		}

		else if (PhaseType == 2)
		{
		    BossDefence = (int) (Math.random () * 2 + 1);

		    switch (BossDefence)
		    {
			case 1:
			    {
				c.println ("Defence Type: Shield of the Shadow Dragon");
				dice = (int) (Math.random () * 4 + 1);
				c.println ("Dice rolled: " + dice);

				if (dice > 2)
				{
				    c.println ("Boss AC: " + (BAC + 1));
				    BAC += 1;
				}
				else
				    c.println ("Spell is ruined");
				break;
			    }
			case 2:
			    {
				c.println ("Defence Type: Ankheg Armour");
				dice = (int) (Math.random () * 8 + 1);
				c.println ("Dice rolled: " + dice);

				if (dice < 2)
				{
				    c.println ("Boss AC: " + (BAC + 1));
				    BAC += 1;

				    if (BHp < BHp)
				    {
					c.println ("Boss Hp: " + (BHp + 1));
					BHp += 1;
				    }
				}
				else
				    c.println ("Spell is ruined");
				break;
			    }
		    }
		}
		else
		{
		    c.println ("Help of Lolth");
		    c.println ("Boss Hp: " + BHp);
		    BHp += 1;
		}

	    }
	}


	c.clear ();
	c.println ();
	//You Died
	if (Hp <= 0)
	{
	    Death ();
	}


	else
	{
	    c.println ();
	    c.println ("Victory!!!");
	    c.println ();
	}
    }


    //Barbarian Boss Battle
    public static void BarbarianBoss ()
    {
	//Declaration
	char user, userNum;
	int AC, Hp, dice, BossAC, BossHp, BAC, BHp, immune, PhaseType, BossAttack, BossDefence;

	BossAC = (int) (Math.random () * 3 + 13);
	BossHp = (int) (Math.random () * 4 + 5);
	BAC = BossAC;
	BHp = BossHp;

	user = ' ';
	AC = 16;
	Hp = 10;

	//HERO PHASE
	while (Hp > 0 && BossHp > 0)
	{
	    AC = 17;
	    immune = 1;

	    c.println ("________________________________________________________________________________");
	    c.println ("<HERO PHASE>");

	    if (Hp <= 2)
	    {
		c.println ("Warning! Your health is very low!");
		c.println ();
	    }
	    do
	    {
		c.println ("Your Turn (press the following keys)");
		c.print ("\"a\": attack, \"d\": defence");

		if (Hp < 10)
		    c.println (", \"h\": heal");
		user = c.getChar ();

		if (!(user == (int) 97 || user == (int) 100 || user == (int) 104))
		{
		    c.println ();
		    c.println ("<ERROR>");
		}
	    }
	    while (!(user == (int) 97 || user == (int) 100 || user == (int) 104));

	    c.println ();

	    if (user == (int) 97)
	    {
		//Attack Type
		do
		{
		    c.println ();
		    c.println ("Select Attack (press the following numbers)");
		    c.println ("1. \"Charge\": 1 damage. Roll 18 (D20) or higher: +1 bonus");
		    c.println ();
		    c.println ("2. \"Twin Strike\": 3 damages. Roll dice again, once, if previous one fails.");
		    c.println ("Roll 8 or lower (D12): Missed");
		    c.println ("________________________________________________________________________________");
		    userNum = c.getChar ();

		    if (!(userNum == (int) 49 || userNum == (int) 50))
		    {
			c.println ();
			c.println ("<ERROR>");
		    }
		}
		while (!(userNum == (int) 49 || userNum == (int) 50));

		c.println ();

		//Charge/Twin Strike
		switch (userNum)
		{
		    case (int) 49:
			{
			    c.println ("Attack Type: Charge");
			    dice = (int) (Math.random () * 20 + 1);
			    c.println ("Enemy AC: " + BossAC);
			    c.println ("Dice rolled: " + dice);

			    if (dice >= BossAC)
			    {
				c.println ("Hit!");
				dice = (int) (Math.random () * 20 + 1);
				c.println ("Dice rolled: " + dice);

				if (dice >= 18)
				{
				    c.println ("2 damages!");
				    c.println ("Enemy Hp: " + (BossHp - 2));
				    BossHp -= 2;
				}
				else
				{
				    c.println ("1 damage!");
				    c.println ("Enemy Hp: " + (BossHp - 1));
				    BossHp -= 1;
				}
			    }
			    else
			    {
				c.println ("Missed!");
				c.println ("Enemy Hp: " + BossHp);
			    }
			    break;
			}
		    case (int) 50:
			{
			    c.println ("Attack Type: Twin Strike");
			    dice = (int) (Math.random () * 20 + 1);
			    c.println ("Enemy AC: " + BossAC);
			    c.println ("First Dice rolled: " + dice);

			    if (dice >= BossAC)
			    {
				c.println ("Hit!");
				dice = (int) (Math.random () * (12) + 1);
				c.println ("Dice rolled: " + dice);

				if (dice <= 8)
				{
				    c.println ("Missed!");
				    dice = (int) (Math.random () * (12) + 1);
				    c.println ("Dice rolled: " + dice);

				    if (dice <= 8)
				    {
					c.println ("Missed!");
					c.println ("Enemy Hp: " + BossHp);
				    }
				    else
				    {
					c.println ("3 damages!");
					c.println ("Enemy Hp: " + (BossHp - 3));
					BossHp -= 3;
				    }
				}
				else
				{
				    c.println ("3 damages!");
				    c.println ("Enemy Hp: " + (BossHp - 3));
				    BossHp -= 3;
				}
			    }
			    else
			    {
				c.println ("Missed!");
				dice = (int) (Math.random () * 20 + 1);
				c.println ("Second Dice rolled: " + dice);

				if (dice >= BossAC)
				{
				    c.println ("Hit!");
				    dice = (int) (Math.random () * (12) + 1);
				    c.println ("Dice rolled: " + dice);

				    if (dice <= 8)
				    {
					c.println ("Missed!");
					c.println ("Enemy Hp: " + BossHp);
				    }
				    else
				    {
					c.println ("3 damages!");
					c.println ("Enemy Hp: " + (BossHp - 3));
					BossHp -= 3;
				    }
				}
				else
				{
				    c.println ("Missed!");
				    c.println ("Enemy Hp: " + BossHp);
				}
			    }
			    break;
			}
		}
	    }
	    else if (user == (int) 100)
	    {
		//Defence Type
		do
		{
		    c.println ();
		    c.println ("Select Defence type (press the following numbers)");
		    c.println ("1. \"Armour of Helm\": +1 AC. 1 turn");
		    c.println ();
		    c.println ("2. \"Avoid and Evade\": Complete Immunity if dice roll is 10 (D10). 1 turn. If");
		    c.println ("not, your spell is ruined");
		    c.println ("________________________________________________________________________________");
		    userNum = c.getChar ();

		    if (!(userNum == (int) 49 || userNum == (int) 50))
		    {
			c.println ();
			c.println ("<ERROR>");
		    }
		}
		while (!(userNum == (int) 49 || userNum == (int) 50));

		c.println ();

		//Armour of Helm/Avoid and Evade
		switch (userNum)
		{
		    case (int) 49:
			{
			    c.println ("Defence Type: Armour of Helm");
			    c.println ("Your AC: " + (AC + 1));
			    AC += 1;
			    break;
			}
		    case (int) 50:
			{
			    c.println ("Defence Type: Avoid and Evade");
			    dice = (int) (Math.random () * (10) + 1);
			    c.println ("Dice roll: " + dice);

			    if (dice == 10)
			    {
				c.println ("COMPLETE IMMUNITY!");
				immune = 0;
			    }
			    else
				c.println ("Spell is Ruined!");
			    break;
			}
		}
	    }
	    else
	    {
		//Heal
		c.println ();
		c.println ("Tymora's Touch: +1 Hp");
		c.println ("Hp: " + (Hp + 1));
		Hp += 1;
	    }

	    //BOSS PHASE
	    BAC = BossAC;
	    BHp = BossHp;
	    c.println ("________________________________________________________________________________");
	    c.println ("<BOSS PHASE>");

	    PhaseType = (int) (Math.random () * 3 + 1);

	    if (PhaseType == 3)
	    {

		if (BHp == BHp)
		    PhaseType -= 1;
	    }

	    if (PhaseType == 1)
	    {
		BossAttack = (int) (Math.random () * 2 + 1);

		switch (BossAttack)
		{
		    case 1:
			{
			    c.println ("Attack Type: Brute Strike");
			    dice = (int) (Math.random () * 20 + 1);
			    c.println ("Your AC: " + AC);
			    c.println ("Dice rolled: " + dice);

			    if (dice > AC)
			    {
				c.println ("Hit!");
				c.println ("Your Hp: " + (Hp - (1 * immune)));
				Hp -= (1 * immune);
			    }
			    else
			    {
				c.println ("Missed!");
				c.println ("Your Hp: " + Hp);
			    }
			    break;
			}
		    case 2:
			{
			    c.println ("Attack Type: Precise Strike");
			    dice = (int) (Math.random () * 20 + 1);
			    c.println ("Your AC: " + AC);
			    c.println ("Dice rolled: " + dice);

			    if (dice > AC)
			    {
				c.println ("Hit!");
				c.println ("Your Hp: " + (Hp - (1 * immune)));
				Hp -= (1 * immune);
			    }
			    else
			    {
				c.println ("Missed!");
				dice = (int) (Math.random () * 20 + 1);
				c.println ("Dice rolled: " + dice);

				if (dice > AC)
				{
				    c.println ("Hit!");
				    c.println ("Your Hp: " + (Hp - (1 * immune)));
				    Hp -= (1 * immune);
				}
				else
				{
				    c.println ("Missed!");
				    c.println ("Your Hp: " + Hp);
				}
			    }
			    break;
			}
		}
	    }

	    else if (PhaseType == 2)
	    {
		BossDefence = (int) (Math.random () * 2 + 1);

		switch (BossDefence)
		{
		    case 1:
			{
			    c.println ("Defence Type: Shield of the Shadow Dragon");
			    dice = (int) (Math.random () * 4 + 1);
			    c.println ("Dice rolled: " + dice);

			    if (dice > 2)
			    {
				c.println ("Boss AC: " + (BAC + 1));
				BAC += 1;
			    }
			    else
				c.println ("Spell is ruined");
			    break;
			}
		    case 2:
			{
			    c.println ("Defence Type: Ankheg Armour");
			    dice = (int) (Math.random () * 8 + 1);
			    c.println ("Dice rolled: " + dice);

			    if (dice < 2)
			    {
				c.println ("Boss AC: " + (BAC + 1));
				BAC += 1;

				if (BHp < BHp)
				{
				    c.println ("Boss Hp: " + (BHp + 1));
				    BHp += 1;
				}
			    }
			    else
				c.println ("Spell is ruined");
			    break;
			}
		}
	    }
	    else
	    {
		c.println ("Help of Lolth");
		c.println ("Boss Hp: " + BHp);
		BHp += 1;
	    }
	}


	c.clear ();
	c.println ();
	//You Died
	if (Hp <= 0)
	    Death ();
	else
	{
	    c.println ();
	    c.println ("Victory!!!");
	    c.println ();
	}
    }


    //You Died
    public static void Death ()
    {
	c.println ();
	c.setCursor (25, 1);
	c.println ("Exit to play again");
	c.setColor (Color.red);
	Font myfont = new Font ("Chiller", Font.PLAIN, 100);
	c.setFont (myfont);
	c.drawString ("Game Over", 190, 80);
	Font fontmy = new Font ("Chiller", Font.PLAIN, 30);
	c.setFont (fontmy);
	c.drawString ("You feel a slight pain in your chest. As you look down, you see the", 0, 160);
	c.drawString ("sword of your killer, thrusted into your body. You collapse on to the", 0, 190);
	c.drawString ("ground as he pulls the sword out giggling. A drop of tear comes down", 0, 220);
	c.drawString ("from your eye. As you slowly die on the wet ground of your blood, you", 0, 250);
	c.drawString ("say, \"I have failed you...\"", 0, 280);
	c.drawString ("You have failed to succeed in your revenge and now you are dead just", 0, 340);
	c.drawString ("like your parents.", 0, 370);
	delay (2147483647);
    }


    //Dialogs
    public static int dialog (int num)
    {
	int a = 1;
	int b = 2;

	if (3 % num == 1)
	{
	    return b;
	}


	else
	{
	    return a;
	}
    }
} // ComSciCulm class
